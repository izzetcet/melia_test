package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.SelectYuorHotelPage;
import utilities.ConfigReader;
import utilities.Driver;


public class FindMadridStepDeph {

    MainPage mainPage=new MainPage();
    SelectYuorHotelPage selectYuorHotelPage = new SelectYuorHotelPage();

    @Given("^open the webpage$")
    public void open_the_webpage() {
    Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @And("^click cookies agree button$")
    public void click_cookies_agree_button() {
    mainPage.cookies_agree_botton.click();
    }

    @When("^send \"(.*?)\" in the search box$")
    public void send_in_the_search_box(String city) {
    mainPage.search_box.sendKeys(city);
    }
    @And("^click select dates$")
    public void click_select_dates() {
    mainPage.select_dates.click();
    }

    @When("^select date of enter and date of exit$")
    public void select_date_of_enter_and_date_of_exit()  {
    mainPage.entry_date.click();
    mainPage.exit_date.click();
    }

    @When("^Click buscar botton$")
    public void click_buscar_botton() {
    mainPage.search_button.click();
    }

    @Then("^verify text is displayed$")
    public void verify_text_is_isplayed() {
    Assert.assertTrue(selectYuorHotelPage.select_your_hotel_text.isDisplayed());
    }
}
