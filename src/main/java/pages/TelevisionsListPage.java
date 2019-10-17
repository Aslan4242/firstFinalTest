package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsListPage {

    @FindBy(xpath = "//input[contains(@id,'header-search')]")
    WebElement searchField;

    @FindBy(xpath = "//a[contains(@href,'filters')]")
    WebElement filters;

    @FindBy(xpath = "//div[contains(@id,'product')]")
    WebElement listProducts;

    @FindBy(xpath = "//li[contains(@class,'suggest2-rich-item i-bem suggest2-rich-item_interact_link suggest2-rich-item_type_mo')]")
    WebElement dropDownProduct;

    public void selectMenuItem(String itemName) {
        dropDownProduct.findElement(By.xpath("//b[text()='" + itemName +"']")).click();

    }




}
