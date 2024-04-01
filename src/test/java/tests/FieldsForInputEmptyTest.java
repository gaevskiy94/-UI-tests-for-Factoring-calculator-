package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class FieldsForInputEmptyTest extends BaseTest{

    @Test
    public void fieldInvoiceAmountTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.clearFieldInvoiceAmount();
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutEmptyFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void fieldInterestRateTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.clearFieldInterestRate();
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutEmptyFieldInterestRate());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void fieldInvoiceCommissionFee(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.clearFieldCommissionFee();
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutEmptyFieldCommissionFee());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }
}
