package Pages;

import Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {

    WebDriver driver;
    Utils utils;

    By electroniclink = By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a");
    By cellphone = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img");
    By nokialink = By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img");
    By addtocart = By.id("add-to-cart-button-20");
    By shoppingcart = By.className("cart-label");
    By termslink = By.id("termsofservice");
    By checkout = By.id("checkout");

    //Constructor

    public ShoppingCart(WebDriver driver){
       this.driver = driver;
       utils = new Utils(driver);
    }

    //Page Actions
    public void clickOnElectronic() {
        utils.doClick(electroniclink);
    }
    public void clickOnCell() {
        utils.doClick(cellphone);
    }
    public void clickOnNokia() {
        utils.doClick(nokialink);
    }
    public void clickOnCart() {
        utils.doClick(addtocart);
    }
    public void clickOnShopping() {
        utils.doClick(shoppingcart);
    }
    public void clickOnTerms() {
        utils.doClick(termslink);
    }
    public void clickOncheckout(){
        utils.doClick(checkout);
    }

}
