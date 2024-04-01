package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class CalculateFactoringWithDefaultValuesTest extends BaseTest{

    @Test
    public void defaultValuesTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
