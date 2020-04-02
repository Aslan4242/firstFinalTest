package steps;

import pages.FiltersPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {
    FiltersPage filtersPage = new FiltersPage();

    @Step("выбрана мнимальная сумма '20000'")
    void stepSelectMinSum(String value) {
        filtersPage.fillMinSumField(value);
    }

    @Step("выбраны производители")
    void stepSelectCheckBox(String checkBoxName) {
        filtersPage.selectCheckBox(checkBoxName);
    }

    @Step("нажата кнопка 'Показать пдходящие'")
    void stepSelectConfurmButton() {
        filtersPage.showButton.click();
    }
}
