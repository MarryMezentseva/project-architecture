import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTest {

    @Test
    public void searchTest() {
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        String searchText = "Selenide";

        open("https://www.google.com");

        $(By.name("q")).sendKeys(searchText);
        $(By.name("q")).sendKeys(Keys.ENTER);
        $(" h3.LC20lb.DKV0Md span").shouldHave(Condition.text(searchText));
    }
}