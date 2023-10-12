package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class AmazonPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By acceptCookies = By.cssSelector("#sp-cc-accept");
    static By clickSearch = By.cssSelector("#twotabsearchtextbox");
    public AmazonPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void homePage() {
    }

    public static void acceptCookies() {
        elementHelper.click(acceptCookies);
    }

    public static void clickSearchButton() {
        elementHelper.click(clickSearch);
    }

    public static void writeProductName() {
    }

    public static void clickSearch() {
    }

    public static void filterForShippedByAmazon() {
    }

    public static void filterForAppel() {
    }

    public static void clickFirstProduct() {
    }

    public static void addCart() {
    }

    public static void checkCart() {
    }
}
