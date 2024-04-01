package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class SelectingDifferentAdvanceRateTest extends BaseTest{

    @Test
    public void selectAdvanceRate75PercentsTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.setAdvanceRate75Percents();
        factoringCalculatorPage.checkSelectedAdvanceRate75Percents();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void selectAdvanceRate80PercentsTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.setAdvanceRate80Percents();
        factoringCalculatorPage.checkSelectedAdvanceRate80Percents();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void selectAdvanceRate85PercentsTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.setAdvanceRate85Percents();
        factoringCalculatorPage.checkSelectedAdvanceRate85Percents();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
