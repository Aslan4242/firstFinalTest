package steps;

import pages.FiltersPage;
import pages.TelevisionsListPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {

    @Step("выбрана мнимальная сумма '20000'")
    void stepSelectMinSum(String value) {
        new FiltersPage().fillMinSumField(value);
    }

    @Step("выбраны производители 'LG' и 'Sasmung'")
    void stepSelectCheckBox(String checkBoxName) {
        new FiltersPage().selectCheckBox(checkBoxName);
    }

    @Step("нажата кнопка 'Показать пдходящие'")
    void stepSelectConfurmButton() {
        new FiltersPage().showButton.click();
    }

}
