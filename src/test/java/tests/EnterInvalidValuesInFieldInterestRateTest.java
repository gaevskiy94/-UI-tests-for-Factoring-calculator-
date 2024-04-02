package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterInvalidValuesInFieldInterestRateTest extends BaseTest{

    @Test
    @Parameters({"numberLessThanMinValidForFieldInterestRate"})
    public void enterNumberLessThanMinValidInFieldInterestRateTest(
            String numberLessThanMinValidForFieldInterestRate) {
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInterestRate(numberLessThanMinValidForFieldInterestRate);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutValueLessThanPermissibleInFieldInterestRate());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberThreeDecimalPlacesForFieldInterestRate"})
    public void enterNumberThreeDecimalPlacesInFieldInterestRateTest(
            String numberThreeDecimalPlacesForFieldInterestRate){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInterestRate(numberThreeDecimalPlacesForFieldInterestRate);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutManyDecimalPlacesInFieldInterestRate());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberGreaterThanMaxValidForFieldInterestRate"})
    public void enterNumberGreaterThanMaxValidInFieldInterestRateTest(
            String numberGreaterThanMaxValidForFieldInterestRate){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInterestRate(numberGreaterThanMaxValidForFieldInterestRate);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutValueGreaterThanPermissibleInFieldInterestRate());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void enterLiteralValuesInFieldInterestRateTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        Assert.assertFalse(factoringCalculatorPage.isAbilityEnterLiteralValuesInFieldInterestRate());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void enterSpecialSymbolsValuesInFieldInterestRateTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        // all symbols, but symbols "." ", "and "-"
        Assert.assertFalse(factoringCalculatorPage.isAbilityEnterSpecialSymbolsInFieldInterestRate());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }
}
