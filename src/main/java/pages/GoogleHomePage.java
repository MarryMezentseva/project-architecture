package pages;

import core.PageBase;
import org.openqa.selenium.By;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;
import static helpers.Waiter.waitFor;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class GoogleHomePage extends PageBase {

    private static final String TITLE = "Вхід – облікові записи Google";
    private static final By signInButton = get("GoogleHomePage.signInButton");
    private static final By gmailButton = get("GoogleHomePage.gmailButton");

    public static void clickSignInButton() {
        waitFor(elementToBeClickable(signInButton));
        findElement(signInButton).click();
    }

    public static void goToGmail() {
        waitFor(elementToBeClickable(gmailButton));
        findElement(gmailButton).click();
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }
}
