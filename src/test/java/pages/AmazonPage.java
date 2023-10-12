//package pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import util.ElementHelper;
//
//public class AmazonPage {
//    static WebDriver driver;
//    static ElementHelper elementHelper;
//    WebDriverWait wait;
//
//    static By acceptCookies = By.cssSelector("#sp-cc-accept");
//    static By clickSearch = By.cssSelector("#twotabsearchtextbox");
//    public AmazonPage(WebDriver driver){
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, 10);
//        this.elementHelper = new ElementHelper(driver);
//    }
//
//    public static void homePage() {
//    }
//
//    public static void acceptCookies() {
//        elementHelper.click(acceptCookies);
//    }
//
//    public static void clickSearchButton() {
//        elementHelper.click(clickSearch);
//    }
//
//    public static void writeProductName() {
//    }
//
//    public static void clickSearch() {
//    }
//
//    public static void filterForShippedByAmazon() {
//    }
//
//    public static void filterForAppel() {
//    }
//
//    public static void clickFirstProduct() {
//    }
//
//    public static void addCart() {
//    }
//
//    public static void checkCart() {
//    }
//}

package pages;

import util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searchButton = By.id("nav-search-submit-button");
    static By amazonFilter = By.xpath("//span[contains(text(),'Fulfilled by Amazon')]");
    static By appleFilter = By.cssSelector("body > div:nth-child(1) > div:nth-child(28) > div:nth-child(12) > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > span:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(4) > ul:nth-child(2) > li:nth-child(1) > span:nth-child(1) > a:nth-child(1) > span:nth-child(2)");
    static By firstProduct =By.cssSelector("img[alt='Apple AirPods (2.Nesil) ve Kablolu Şarj Kutusu']");
    static By add = By.id("add-to-cart-button");
    static By back = By.id("attach-close_sideSheet-link");
    static By cart = By.cssSelector("#nav-cart-count");
    static By check = By.cssSelector(".a-truncate-cut");



    public AmazonPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage() {
    }

    public static void acceptCookie() {
        elementHelper.click(accept);
    }

    public static void clickSearch() {
        elementHelper.click(search);
    }

    public static void writeProduct() {
        elementHelper.sendKey(search,"airpods");
    }

    public static void searchButton() {
        elementHelper.click(searchButton);
    }

    public static void filterAmazon() {
        elementHelper.click(amazonFilter);
    }
    public static void filterApple() {
        elementHelper.click(appleFilter);
    }
    public static void firstProduct() {
        elementHelper.click(firstProduct);
    }
    public static void addCart() {
        elementHelper.click(add);
        elementHelper.click(back);
        elementHelper.click(cart);
    }
    public static void checkCart() {
        elementHelper.checkVisible(check);
    }
}
