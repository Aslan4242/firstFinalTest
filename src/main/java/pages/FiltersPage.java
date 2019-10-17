package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FiltersPage {

    @FindBy(xpath = "//input[contains(@name,'glf-pricefrom-var')]")
    WebElement minSumField;

    @FindBy(xpath = "//label[text()='LG']")
    WebElement LGCheckBox;

    @FindBy(xpath = "//label[text()='Samsung']")
    WebElement samsungCheckBox;

    @FindBy(xpath = "//a[contains(@class,'button button_s')]")
    WebElement showButton;




}
