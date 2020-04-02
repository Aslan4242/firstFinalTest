package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage {

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//a[contains(@href,'televizory')]")
    WebElement television;

    public void selectMenuItem() {
        television.click();
    }
}
