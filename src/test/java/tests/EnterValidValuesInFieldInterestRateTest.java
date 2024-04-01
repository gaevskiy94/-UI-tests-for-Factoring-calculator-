package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.FactoringCalculatorPage;

public class EnterValidValuesInFieldInterestRateTest extends BaseTest{


    @Test()
    @Parameters({"minValueForFieldInterestRate"})
    public void EnterMinValueInFieldInterestRateTest(String minValueForFieldInterestRate){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInterestRate(minValueForFieldInterestRate);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldInterestRate();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test()
    @Parameters({"numericTwoDecimalPlacesForFieldInterestRate"})
    public void EnterNumericTwoDecimalPlacesInFieldInterestRateTest(
            String numericTwoDecimalPlacesForFieldInterestRate){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInterestRate(numericTwoDecimalPlacesForFieldInterestRate);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldInterestRate();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }

    @Test()
    @Parameters({"maxValueForFieldInterestRate"})
    public void EnterMaxValueInFieldInterestRateTest(String maxValueForFieldInterestRate){
        FactoringCalculatorPage factoringCalculatorPage = new FactoringCalculatorPage();

        factoringCalculatorPage.inputValueInFieldInterestRate(maxValueForFieldInterestRate);
        factoringCalculatorPage.checkNoErrorMessageUnderFieldInterestRate();

        factoringCalculatorPage.clickButtonCalculate();
        Assert.assertTrue(factoringCalculatorPage.isCalculationMade());
    }
}
