package steps;

import pages.TelevisionPage;
import ru.yandex.qatools.allure.annotations.Step;

public class TelevisionSteps {

    TelevisionPage televisionPage = new TelevisionPage();
    @Step("получено название товара")
    public String getLabelText() {
     return televisionPage.ElementLabel.getText();

    }
}
