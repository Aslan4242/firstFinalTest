package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketMainPage {

    @FindBy(xpath = "//a[contains(@href,'elektronika')]")
    WebElement electronic;

}
