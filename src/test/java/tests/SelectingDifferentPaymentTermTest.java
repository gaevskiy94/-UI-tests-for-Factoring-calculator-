package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class SelectingDifferentPaymentTermTest extends BaseTest{

    @Test
    public void selectPaymentTerm60DaysTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.setPaymentTerm60Days();
        factoringCalculatorPage.checkSelectPaymentTerm60Days();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void selectPaymentTerm90DaysTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.setPaymentTerm90Days();
        factoringCalculatorPage.checkSelectPaymentTerm90Days();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void selectPaymentTerm120DaysTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.setPaymentTerm120Days();
        factoringCalculatorPage.checkSelectPaymentTerm120Days();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
