package stepDefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utilities.Driver;

import java.util.List;

public class NumberOfRoomsStepDeph {





    @Then("^verify if number of rooms equals (\\d+)$")
    public void verify_if_number_of_rooms_equals(int rooms) {
        List <WebElement> roomlist = Driver.getDriver().findElements(By.xpath("//div[@class='c-hotel-sheet-room__content-image']"));
        int numberofrooms=roomlist.size();
        Assert.assertEquals(numberofrooms,rooms);
    }

}
