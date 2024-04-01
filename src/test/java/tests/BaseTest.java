package tests;

import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    SelenideElement acceptCookiesButton =
            $x("//button[@class='button ui-cookie-consent__accept-button']");

    @BeforeMethod
    public  void setUp(){
        open("https://www.swedbank.lt/business/finance/trade/factoring?language=ENG");
        acceptCookies();
    }

    public void acceptCookies(){
        if (acceptCookiesButton.is(clickable)) acceptCookiesButton.click();

    }
}
