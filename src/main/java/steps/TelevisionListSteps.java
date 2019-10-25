package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.TelevisionsListPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.List;


public class TelevisionListSteps {
    TelevisionsListPage televisionsListPage = new TelevisionsListPage();

    @Step("нажата кнопка \"(.*)\"$")
    void stepSelectAllFilters(String itemName) {
        BaseSteps.getDriver().findElement(By.xpath("//span[text()='"+itemName+"']/..")).click();
    }

    @Step("выбрано значение 'Показывать по 12'")
    void stepShow12() {
        televisionsListPage.show48ListBox.click();
        televisionsListPage.show12.click();
    }

    @Step("получение элементов на странице 12")
    public List<WebElement> StepGetElements() {
        List<WebElement> list = televisionsListPage.getElements();
        return list;
    }

    @Step("ожидание появления списка элементов на странице")
    public void waitLinksClickable() {
        televisionsListPage.waitLinksClickable();

    }
    @Step("вводится в поисковую строку первый элемент из списка")
    public void StepFillSearchField() {
        List<WebElement> list = televisionsListPage.getElements();
        String firstElement = list.get(0).getText().substring(10);
        televisionsListPage.searchField.sendKeys(firstElement);
    }

    @Step("выбирается элемент из выпадающего списка")
    public void StepChooseFromDropDownList() {
        List<WebElement> list = televisionsListPage.getElements();
        String firstElement = list.get(0).getText().toLowerCase().substring(10);
        televisionsListPage.selectDropDownElement(firstElement);
    }
}
