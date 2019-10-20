package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FiltersPage extends BasePage {

    public FiltersPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//input[contains(@name,'glf-pricefrom-var')]")
    public WebElement minSumField;

    @FindBy(xpath = "//label[text()='LG']")
    public WebElement LGCheckBox;

    @FindBy(xpath = "//label[text()='Samsung']")
    public WebElement samsungCheckBox;

    @FindBy(xpath = "//a[contains(@class,'button button_s')]")
    public WebElement showButton;

    public void fillMinSumField(String value) {
        fillField(minSumField, value);
    }

    public void selectCheckBox(String checkBoxName){
        switch (checkBoxName){
            case  "LG":
                selectCheckBox(LGCheckBox);
                break;
            case  "Samsung":
                selectCheckBox(samsungCheckBox);
                break;
            default:  throw new AssertionError("Поле '"+checkBoxName+"' не объявлено на странице");
        }
    }


}
