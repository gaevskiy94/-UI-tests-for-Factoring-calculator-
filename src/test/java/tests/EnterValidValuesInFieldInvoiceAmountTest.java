package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterValidValuesInFieldInvoiceAmountTest extends BaseTest{

    @Test()
    @Parameters({"minValueForFieldInvoiceAmount"})
    public void EnterMinValueInFieldInvoiceAmountTest(String minValueForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(minValueForFieldInvoiceAmount);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldInvoiceAmount();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test()
    @Parameters({"numericTwoDecimalPlacesForFieldInvoiceAmount"})
    public void EnterNumericTwoDecimalPlacesInFieldInvoiceAmountTest(
            String numericTwoDecimalPlacesForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(numericTwoDecimalPlacesForFieldInvoiceAmount);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldInvoiceAmount();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test()
    @Parameters({"maxValueForFieldInvoiceAmount"})
    public void EnterMaxValueInFieldInvoiceAmountTest(String maxValueForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(maxValueForFieldInvoiceAmount);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldInvoiceAmount();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
