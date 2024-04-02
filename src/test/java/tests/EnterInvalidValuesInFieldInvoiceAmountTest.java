package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterInvalidValuesInFieldInvoiceAmountTest extends BaseTest{

    @Test
    @Parameters({"negativeNumberForFieldInvoiceAmount"})
    public void enterNegativeNumberInFieldInvoiceAmountTest(String negativeNumberForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(negativeNumberForFieldInvoiceAmount);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutValueLessThanPermissibleInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberThreeDecimalPlacesForFieldInvoiceAmount"})
    public void enterNumberThreeDecimalPlacesInFieldInvoiceAmountTest(
            String numberThreeDecimalPlacesForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(numberThreeDecimalPlacesForFieldInvoiceAmount);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutManyDecimalPlacesInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberLessThanMinValidForFieldInvoiceAmount"})
    public void enterNumberLessThanMinValidInFieldInvoiceAmountTest(
            String numberLessThanMinValidForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(numberLessThanMinValidForFieldInvoiceAmount);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutValueLessThanPermissibleInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberGreaterThanMaxValidForFieldInvoiceAmount"})
    public void enterNumberGreaterThanMaxValidInFieldInvoiceAmountTest(
            String numberGreaterThanMaxValidForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(numberGreaterThanMaxValidForFieldInvoiceAmount);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageInvalidValueInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"maxValidNumberThreeDecimalPlacesForFieldInvoiceAmount"})
    public void enterMaxValidNumberThreeDecimalPlacesInFieldInvoiceAmountTest(
            String maxValidNumberThreeDecimalPlacesForFieldInvoiceAmount){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInvoiceAmount(maxValidNumberThreeDecimalPlacesForFieldInvoiceAmount);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutManyDecimalPlacesInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void enterLiteralValuesInFieldInvoiceAmountTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        Assert.assertFalse(factoringCalculatorPage.isAbilityEnterLiteralValuesInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void enterSpecialSymbolsValuesInFieldInvoiceAmountTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        // all symbols, but symbols "." ", "and "-"
        Assert.assertFalse(factoringCalculatorPage.isAbilityEnterSpecialSymbolsInFieldInvoiceAmount());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }
}
