package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {

  public MainPage() {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//button[contains(@id,'didomi-notice-agree-button')]")
  public WebElement cookies_agree_botton;

  @FindBy(xpath = "//input[@id='mbe-destination-input']")
  public WebElement search_box;

  @FindBy(xpath = "//li[@class='item default']")
  public WebElement madrid_option;


  @FindBy (id="mbe-dates-select")
  public WebElement select_dates;

  @FindBy (xpath="//li[@d='2021/10/25']")
  public WebElement entry_date;

  @FindBy (xpath="//li[@d='2021/10/27']")
  public WebElement exit_date;

  @FindBy (id= "mbe-search-button")
  public WebElement search_button;

}
