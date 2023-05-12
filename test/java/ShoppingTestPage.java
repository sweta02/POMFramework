import Base.BasePage;
import Pages.ShoppingCart;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.Properties;

public class ShoppingTestPage {

    WebDriver driver;
    BasePage basePage=new BasePage();
    Properties prop = new Properties();
    ShoppingCart shoppingCart;

    @Test(priority = 1)
    public void openBrowser() throws FileNotFoundException {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngin = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngin);
        driver.get(prop.getProperty("url"));
        shoppingCart = new ShoppingCart(driver);

    }
    @Test(priority = 2)
    public void addtoCart(){
        shoppingCart.clickOnElectronic();
        shoppingCart.clickOnCell();
        shoppingCart.clickOnNokia();
        shoppingCart.clickOnCart();
        shoppingCart.clickOnShopping();
        shoppingCart.clickOnTerms();
        shoppingCart.clickOncheckout();

    }
    @Test(priority = 3)

    public void closeBrowser() throws InterruptedException {

        Thread.sleep(1000);
        driver.close();
    }

}
