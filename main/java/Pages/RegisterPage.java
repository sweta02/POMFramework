package Pages;

import Utilities.Constant;
import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;

    //1. Create your page object/object repository in the form of By Locators for Registration
    By registerLink = By.className("ico-register");
    By Gender = By.xpath("//*[@id=\"gender-male\"]");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By birthDate = By.name("DateOfBirthDay");
    By birthMonth = By.name("DateOfBirthMonth");
    By birthYear = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By companyName = By.id("Company");
    By passWord = By.id("Password");
    By confirmPass = By.id("ConfirmPassword");
    By registerButton = By.xpath("//*[@id=\"register-button\"]");

    //2. Create constructor of page class
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);
    }
    //3. Page Actions
    public void clickOnRegisterLink(){
        utils.doClick(registerLink);
    }
////    public String getPageTitle() {
////        return utils.waitForTitlePresent(5, Constant.REGISTER_PAGE_TITLE);
//    }


    public void doRegister(String Firstname, String Lastname,String dateofdate, String dateofmonth,
                           String dateofyear,String Email,String CompName, String Password, String ConfirmPass) {
        utils.doClick(Gender);
        utils.doSendKey(firstName, Firstname);
        utils.doSendKey(lastName, Lastname);
        utils.doSendKey(birthDate,dateofdate);
        utils.doSendKey(birthMonth, dateofmonth);
        utils.doSendKey(birthYear,dateofyear);
        utils.doSendKey(email, Email);
        utils.doSendKey(companyName, CompName);
        utils.doSendKey(passWord, Password);
        utils.doSendKey(confirmPass, ConfirmPass);
        utils.doClick(registerButton);
    }

    }

