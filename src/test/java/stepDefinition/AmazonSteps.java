package stepDefinition;

import pages.AmazonPage;
import util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {
    WebDriver driver = DriverFactory.getDriver();
    AmazonPage amazonPages = new AmazonPage(driver);
    @Given("User is on homepage")
    public void userIsOnHomepage() {
        AmazonPage.HomePage();
    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {
        AmazonPage.acceptCookie();
    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AmazonPage.clickSearch();
    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPage.writeProduct();
    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPage.searchButton();
    }

    @When("Filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPage.filterAmazon();
    }

    @When("Filter for Apple")
    public void filterForApple() {
        AmazonPage.filterApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPage.firstProduct();
    }

    @When("Add to Cart")
    public void addToCart() {
        AmazonPage.addCart();
    }

    @When("Check at cart page")
    public void checkAtCartPage() {
        AmazonPage.checkCart();
    }
}