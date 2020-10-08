package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.yandex.qatools.allure.annotations.Step;

import static com.codeborne.selenide.Selenide.$;
import static org.testng.FileAssert.fail;

public class GoogleSearchPage {

    @Step("Search for {0} on Google")
    public static void search(String searchText) {
        $(By.name("q")).sendKeys(searchText);
        $(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Step("Cause test failure")
    public static void causeFailure() {
        fail();
    }

    @Step("Cause test to be broken")
    public static void causeBrokenTest() {
        $("gjnupoyet[vc744").click();
    }
}
