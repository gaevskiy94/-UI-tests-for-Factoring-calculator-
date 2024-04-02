package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterInvalidValuesInFieldCommissionFeeTest extends BaseTest{

    @Test
    @Parameters({"numberLessThanMinValidForFieldCommissionFee"})
    public void enterNumberLessThanMinValidInFieldCommissionFeeTest(
            String numberLessThanMinValidForFieldCommissionFee) {
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldCommissionFee(numberLessThanMinValidForFieldCommissionFee);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutValueLessThanPermissibleInFieldCommissionFee());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberThreeDecimalPlacesForFieldCommissionFee"})
    public void enterNumberThreeDecimalPlacesInFieldCommissionFeeTest(
            String numberThreeDecimalPlacesForFieldCommissionFee){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldCommissionFee(numberThreeDecimalPlacesForFieldCommissionFee);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutManyDecimalPlacesInFieldCommissionFee());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    @Parameters({"numberGreaterThanMaxValidForFieldCommissionFee"})
    public void enterNumberGreaterThanMaxValidInFieldCommissionFeeTest(
            String numberGreaterThanMaxValidForFieldCommissionFee){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldCommissionFee(numberGreaterThanMaxValidForFieldCommissionFee);
        Assert.assertTrue(factoringCalculatorPage.isErrorMessageAboutValueGreaterThanPermissibleInFieldCommissionFee());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void enterLiteralValuesInFieldCommissionFeeTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        Assert.assertFalse(factoringCalculatorPage.isAbilityEnterLiteralValuesInFieldCommissionFee());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }

    @Test
    public void enterSpecialSymbolsValuesInFieldCommissionFeeTest(){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        // all symbols, but symbols "." ", "and "-"
        Assert.assertFalse(factoringCalculatorPage.isAbilityEnterSpecialSymbolsInFieldCommissionFee());

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertFalse(factoringCalculatorPage.isCalculationMade());
    }
}
