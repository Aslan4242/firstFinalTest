package steps;

import pages.ElectronicPage;
import pages.MarketMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {

    @Step("выбран пункт меню 'Телевизоры'")
    void stepSelectMenu() {
        new ElectronicPage().selectMenuItem();
    }
}
