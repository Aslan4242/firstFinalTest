package steps;

import pages.MarketMainPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketMainSteps {


    @Step("выбран пункт меню \"(.*)\"$")
     void stepSelectMenu() {
        new MarketMainPage().selectMenuItem();
    }
}
