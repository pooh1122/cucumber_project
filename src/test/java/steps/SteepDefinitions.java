package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.HomePage;
import utils.BrowserManager;
import utils.QAProps;
import utils.TestDataReader;

import java.util.HashMap;

public class SteepDefinitions {

    private WebDriver driver;
    HomePage homePage;
    String url;
    HashMap<String, String> data;
    Scenario scenario;
    public SteepDefinitions(BrowserManager browserManager){
        this.driver = browserManager.getDriver();
    }

    @Before(order = 1)
    public void before(Scenario scenario){
        this.scenario = scenario;
    }

    @Given("the user navigates to the home page")
    public void the_user_navigates_to_the_home_page() {
        // Write code here that turns the phrase above into concrete actions
        //driver.get("https://www.amazon.in");
        url = QAProps.getValue("url");
        driver.get(url);
        System.out.println(1/0);
        data = TestDataReader.getData(scenario.getName());
    }
    @When("the user enter a product name")
    public void the_user_enter_a_product_name() {
        // Write code here that turns the phrase above into concrete actions
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys(data.get("TypeValue"));
        homePage.getSearchBox().sendKeys(Keys.ENTER);
    }
    @Then("the product result should be displayed")
    public void the_product_result_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        String text = homePage.getSearchResult().getText();
        Assert.assertEquals(text, data.get("TypeValue"));
    }

    @And("User enters {string} and {string}")
    public void userEntersAnd(String arg0, String arg1) {

    }

    @Given("User is on Home Page")
    public void userIsOnHomePage() {
    }

    @When("User Navigate to Login Page")
    public void userNavigateToLoginPage() {
    }

    @Then("Message displayed Login Successfully")
    public void messageDisplayedLoginSuccessfully() {
    }

    @Given("User is logged in")
    public void userIsLoggedIn() {
        System.out.println("from background");
    }
}
