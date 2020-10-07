package pages;

import core.PageBase;
import org.openqa.selenium.By;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;

public class GoogleHomePage extends PageBase {

    private static final String TITLE = "Вхід – облікові записи Google";
    private static By signInButton = get("GoogleHomePage.signInButton");
    private static By gmailButton = get("GoogleHomePage.gmailButton");

    public static void clickSignInButton() {
        findElement(signInButton).click();
    }

    public static void goToGmail() {
        findElement(gmailButton).click();
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }
}
