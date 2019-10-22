package steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ScenarioSteps {
        MainSteps mainSteps = new MainSteps();
        MarketMainSteps marketMainSteps = new MarketMainSteps();
        ElectronicSteps electronicSteps = new ElectronicSteps();
        TelevisionListSteps televisionListSteps = new TelevisionListSteps();
        FilterSteps filterSteps = new FilterSteps();
        TelevisionSteps televisionSteps = new TelevisionSteps();
        String elementName;

        @When("^выбран пункт меню \"(.*)\"$")
        public void stepSelectMainMenu(String menuItem){
                mainSteps.stepSelectMenu(menuItem);
        }

        @When("выбрана категория 'Электроника'")
        public void stepSelectCategory(){
                marketMainSteps.stepSelectMenu();
        }

        @When("выбрана подкатегория - 'Телевизоры'")
        public void stepSelectSubCategory(){
                electronicSteps.stepSelectMenu();
        }

        @Then("выбирается пункт 'Все фильтры'")
        public void stepSelectMoreFilters(){
                televisionListSteps.stepSelectAllFilters();
        }
        @Then("^выбирается минимальная сумма \"(.*)\"$")
        public void stepSelectMinSum(String minSum){
                filterSteps.stepSelectMinSum(minSum);
        }
        @Then("^выбираются производители:")
        public void stepSelectCompany(List<String> list){
                for (String company: list  ) {
                        filterSteps.stepSelectCheckBox(company);
                }

        }
        @When("нажимается кнопка 'Применить'")
        public void stepSubmit(){
                filterSteps.stepSelectConfurmButton();
        }
        @Then("выбирается 12 товаров на странице")
        public void stepSelectTwelve(){
                televisionListSteps.stepShow12();
        }
        @Then("проверяется, что элементов на странице 12")
        public void StepCheckElements(){
                try {
                        Thread.sleep(5000);
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
                List<WebElement> list =  televisionListSteps.StepGetElements();
                assertEquals("Количество элементов на странице не равно 12",12, list.size());
                elementName = list.get(0).getText();
        }
        @When("вводится название товара в поисковую строку")
        public void stepFillSerchField(){
                televisionListSteps.StepFillSearchField();
        }
        @Then("выбирается соответствующий товар из выпадающего списка")
        public void stepSelectElement(){
                televisionListSteps.StepChooseFromDropDownList();
        }
        @Then("проверяется, что выбранный товар соответствует запомненному значению")
        public void StepCheckElement() {
                String currentElement = televisionSteps.getLabelText();
                assertEquals("Выбранный товар не соответствует запомненному значению",elementName, currentElement);
        }
}
