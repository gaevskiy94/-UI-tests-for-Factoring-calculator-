package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

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

}
