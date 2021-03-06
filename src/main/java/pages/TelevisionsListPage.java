package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.List;

public class TelevisionsListPage {

    public TelevisionsListPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    public WebElement searchField;

    @FindBy(xpath = "//span[text()='Все фильтры']/..")
    public WebElement filters;

    @FindBy(xpath = "//div[contains(@id,'product')]//a[@title] [contains(@class,'theme')]")
    public WebElement listProducts;

    @FindBy(xpath = "//li[contains(@class,'suggest2-rich-item i-bem suggest2-rich-item_interact_link suggest2-rich-item_type_mo')]")
    public WebElement dropDownProduct;

    @FindBy(xpath = "//div/span//button[contains(@role,'listbox')]")
    public WebElement show48ListBox;

    @FindBy(xpath = "//span[text()='Показывать по 12']")
    public WebElement show12;

    public void selectDropDownElement(String itemName) {
        BaseSteps.getDriver()
                .findElement(By.xpath("//b[contains(text(),'"+itemName+"')]")).click();
    }

    public List<WebElement> getElements(){
        List<WebElement> list =  BaseSteps.getDriver().findElements(By.xpath("//div[contains(@id,'product')]//a[@title] [contains(@class,'theme')]"));
        return list;
    }

    public void waitLinksClickable(){
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 5, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(listProducts));
    }
}
