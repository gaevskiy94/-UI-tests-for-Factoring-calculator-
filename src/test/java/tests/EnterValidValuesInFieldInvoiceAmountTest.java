package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterValidValuesInFieldInvoiceAmountTest extends BaseTest{

    @Test(priority = 1)
    @Parameters({"minValueForFieldInvoiceAmount"})
    public void EnterMinValueInFieldInvoiceAmountTest(String minValueForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(minValueForFieldInvoiceAmount);
        factoringCalculatorPage.CheckNoErrorMessageUnderFieldInvoiceAmount();

        factoringCalculatorPage.clickButtonCalculate();

        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test(priority = 2)
    @Parameters({"maxValueForFieldInvoiceAmount"})
    public void EnterMaxValueInFieldInvoiceAmountTest(String maxValueForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(maxValueForFieldInvoiceAmount);
        factoringCalculatorPage.CheckNoErrorMessageUnderFieldInvoiceAmount();

        factoringCalculatorPage.clickButtonCalculate();

        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
