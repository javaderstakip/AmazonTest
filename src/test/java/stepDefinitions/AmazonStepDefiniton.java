package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AmazonPage;
import util.DriverFactory;

public class AmazonStepDefiniton {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPage amazonPage = new AmazonPage(driver);

    @Given("user is on home page")
    public void userIsOnHomePage() {
        AmazonPage.homePage();
    }

    @When("click accept cookies")
    public void clickAcceptCookies() {
        AmazonPage.acceptCookies();
    }

    @And("click the search button")
    public void clickTheSearchButton() {
        AmazonPage.clickSearchButton();
    }

    @And("write product name")
    public void writeProductName() {
        AmazonPage.writeProductName();
    }

    @And("click search button")
    public void clickSearchButton() {
        AmazonPage.clickSearch();
    }

    @And("filter for Shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPage.filterForShippedByAmazon();
    }

    @And("filter for Appel")
    public void filterForAppel() {
        AmazonPage.filterForAppel();
    }

    @And("click the first product")
    public void clickTheFirstProduct() {
        AmazonPage.clickFirstProduct();
    }

    @And("add to cart")
    public void addToCart() {
        AmazonPage.addCart();
    }

    @Then("check at cart page")
    public void checkAtCartPage() {
        AmazonPage.checkCart();
    }
}
