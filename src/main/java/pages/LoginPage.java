package pages;

import core.PageBase;
import org.openqa.selenium.By;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;
import static helpers.Waiter.waitFor;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class LoginPage extends PageBase {

    private static final String TITLE = "Вхід – облікові записи Google";
    private static final By emailInput = get("LoginPage.emailInput");
    private static final By nextButton = get("LoginPage.nextButton");
    private static final By passwordInput = get("LoginPage.passwordInput");
    private static final By nextPswrdButton = get("LoginPage.nextPswrdButton");

    private final static String EMAIL = "forstudy319@gmail.com";
    private final static String PASSWORD = "study2020EPAM";

    public static void login() {
        findElement(emailInput).sendKeys(EMAIL);
        waitFor(elementToBeClickable(nextButton));
        findElement(nextButton).click();
        findElement(passwordInput).sendKeys(PASSWORD);
        waitFor(elementToBeClickable(nextPswrdButton));
        findElement(nextPswrdButton).click();
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }
}

