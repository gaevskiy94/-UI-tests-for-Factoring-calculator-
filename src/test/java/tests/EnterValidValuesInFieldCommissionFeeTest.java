package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterValidValuesInFieldCommissionFeeTest extends BaseTest{

    @Test()
    @Parameters({"minValueForFieldCommissionFee"})
    public void enterMinValueInFieldCommissionFee(String minValueForFieldCommissionFee){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldCommissionFee(minValueForFieldCommissionFee);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldCommissionFee();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test()
    @Parameters({"numericTwoDecimalPlacesForFieldCommissionFee"})
    public void enterNumericTwoDecimalPlacesInFieldCommissionFeeTest(
            String numericTwoDecimalPlacesForFieldCommissionFee){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldCommissionFee(numericTwoDecimalPlacesForFieldCommissionFee);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldCommissionFee();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test()
    @Parameters({"maxValueForFieldCommissionFee"})
    public void enterMaxValueInFieldCommissionFeeTest(String maxValueForFieldCommissionFee){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldCommissionFee(maxValueForFieldCommissionFee);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldCommissionFee();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
