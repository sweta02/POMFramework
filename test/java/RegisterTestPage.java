import Base.BasePage;
import Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.Properties;

public class RegisterTestPage {
    WebDriver driver;
    BasePage basePage;
    Properties prop = new Properties();
    RegisterPage registerPage;

    @Test(priority = 1)
    public void openBrowser() throws FileNotFoundException {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }
    @Test(priority = 2)
    public void registerTest() {
        registerPage.clickOnRegisterLink();
    }
    @Test(priority = 3)
    public void doRegisterTest(){
        //registerPage.getPageTitle();
        registerPage.doRegister(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("birthDate"),
                prop.getProperty("birthMonth"),prop.getProperty("birthYear"),prop.getProperty("email"),
                prop.getProperty("companyName"),prop.getProperty("passWord"), prop.getProperty("confirmPass"));
   }
   @Test(priority = 4)
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
   }
}

