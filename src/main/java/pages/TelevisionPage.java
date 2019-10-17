package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionPage {

    @FindBy(xpath = "//a[contains(@href,'televizory')]")
    WebElement television;

}
