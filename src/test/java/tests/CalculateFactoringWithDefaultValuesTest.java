package tests;

import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class CalculateFactoringWithDefaultValuesTest extends BaseTest{

    @Test
    public void DefaultValuesTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.clickButtonCalculate();
    }
}
