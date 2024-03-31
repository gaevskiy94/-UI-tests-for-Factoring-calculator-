package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class FactoringCalculatorPage {

    SelenideElement invoiceAmountInputField = $(By.id("D5"));
    SelenideElement advanceRateDropDownMenu = $(By.id("D6"));
    SelenideElement interestRateInputField = $(By.id("D7"));
    SelenideElement paymentTermDropDownMenu = $(By.id("D8"));
    SelenideElement commissionFeeInputField = $(By.id("D9"));
    SelenideElement calculateButton = $(By.id("calculate-factoring"));
    SelenideElement errorMessageUnderFieldInvoiceAmountText =
            $x("//ui-field[@data-wt-label='Invoice amount']//ui-hint[@type='error']");
    SelenideElement errorMessageUnderFieldInterestRateText =
            $x("//ui-field[@data-wt-label='Interest rate']//ui-hint[@type='error']");
    SelenideElement errorMessageUnderFieldCommissionFeeText =
            $x("//ui-field[@data-wt-label='Commission fee']//ui-hint[@type='error']");
    SelenideElement resultInPercentageText = $(By.id("result_perc"));
    SelenideElement resultInCurrencyText = $(By.id("result"));

    public void inputValueInFieldInvoiceAmount(String value){
        invoiceAmountInputField.setValue(value);
    }

    public void inputValueInFieldInterestRate(String value){
        interestRateInputField.setValue(value);
    }

    public void inputValueInFieldCommissionFee(String value){
        commissionFeeInputField.setValue(value);
    }

    public void clearFieldInvoiceAmount(){
        invoiceAmountInputField.clear();
    }

    public void clearFieldInterestRate(){
        interestRateInputField.clear();
    }

    public void clearFieldCommissionFee(){
        commissionFeeInputField.clear();
    }

    public void clickButtonCalculate(){
        calculateButton.click();
    }

    public void setAdvanceRate75Percents(){
        advanceRateDropDownMenu.click();
        advanceRateDropDownMenu.$$("option").get(0).click();
    }

    public void setAdvanceRate80Percents(){
        advanceRateDropDownMenu.click();
        advanceRateDropDownMenu.$$("option").get(1).click();
    }

    public void setAdvanceRate85Percents(){
        advanceRateDropDownMenu.click();
        advanceRateDropDownMenu.$$("option").get(2).click();
    }

    public void setAdvanceRate90Percents(){
        advanceRateDropDownMenu.click();
        advanceRateDropDownMenu.$$("option").get(3).click();
    }

    public void setPaymentTerm30Days(){
        paymentTermDropDownMenu.click();
        paymentTermDropDownMenu.$$("option").get(0).click();
    }

    public void setPaymentTerm60Days(){
        paymentTermDropDownMenu.click();
        paymentTermDropDownMenu.$$("option").get(1).click();
    }

    public void setPaymentTerm90Days(){
        paymentTermDropDownMenu.click();
        paymentTermDropDownMenu.$$("option").get(2).click();
    }

    public void setPaymentTerm120Days(){
        paymentTermDropDownMenu.click();
        paymentTermDropDownMenu.$$("option").get(3).click();
    }

    public boolean isErrorMessageAboutEmptyFieldInvoiceAmount(){
        return errorMessageUnderFieldInvoiceAmountText.is(text("Please fill out this field"));
    }

    public boolean isErrorMessageAboutValueLessThanPermissibleInFieldInvoiceAmount(){
        return errorMessageUnderFieldInvoiceAmountText.is(text("Value must be greater than or equal 1"));
    }

    public boolean isErrorMessageAboutManyDecimalPlacesInFieldInvoiceAmount(){
        return errorMessageUnderFieldInvoiceAmountText.is(text("Step should be 0.01"));
    }

    public boolean isErrorMessageInvalidValueInFieldInvoiceAmount(){
        return errorMessageUnderFieldInvoiceAmountText.is(text("Please enter a valid value"));
    }

    public boolean isErrorMessageAboutEmptyFieldInterestRate(){
        return errorMessageUnderFieldInterestRateText.is(text("Please fill out this field"));
    }

    public boolean isErrorMessageAboutValueLessThanPermissibleInFieldInterestRate(){
        return errorMessageUnderFieldInterestRateText.is(text("Value must be greater than or equal 0"));
    }

    public boolean isErrorMessageAboutValueGreaterThanPermissibleInFieldInterestRate(){
        return errorMessageUnderFieldInterestRateText.is(text("Value must be less than or equal 20"));
    }

    public boolean isErrorMessageAboutManyDecimalPlacesInFieldInterestRate(){
        return errorMessageUnderFieldInterestRateText.is(text("Step should be 0.01"));
    }

    public boolean isErrorMessageInvalidValueInFieldInterestRate(){
        return errorMessageUnderFieldInterestRateText.is(text("Please enter a valid value"));
    }
    public boolean isErrorMessageAboutEmptyFieldCommissionFee(){
        return errorMessageUnderFieldCommissionFeeText.is(text("Please fill out this field"));
    }

    public boolean isErrorMessageAboutValueLessThanPermissibleInCommissionFee(){
        return errorMessageUnderFieldCommissionFeeText.is(text("Value must be greater than or equal 0"));
    }

    public boolean isErrorMessageAboutValueGreaterThanPermissibleInFieldCommissionFee(){
        return errorMessageUnderFieldCommissionFeeText.is(text("Value must be less than or equal 100"));
    }

    public boolean isErrorMessageAboutManyDecimalPlacesInFieldCommissionFee(){
        return errorMessageUnderFieldCommissionFeeText.is(text("Step should be 0.01"));
    }

    public boolean isErrorMessageInvalidValueInFieldCommissionFee(){
        return errorMessageUnderFieldCommissionFeeText.is(text("Please enter a valid value"));
    }

}
