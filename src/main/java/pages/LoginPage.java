package pages;

import core.PageBase;
import org.openqa.selenium.By;

import static core.Locators.get;
import static core.WebDriverContainer.findElement;

public class LoginPage extends PageBase {

    private static final String TITLE = "Вхід – облікові записи Google";
    private static By emailInput = get("LoginPage.emailInput");
    private static By nextButton = get("LoginPage.nextButton");
    private static By passwordInput = get("LoginPage.passwordInput");
    private static By nextPswrdButton = get("LoginPage.nextPswrdButton");

    private final static String EMAIL = "forstudy319@gmail.com";
    private final static String PASSWORD = "study2020EPAM";

    public static void login() {
        findElement(emailInput).sendKeys(EMAIL);
        findElement(nextButton).click();
        findElement(passwordInput).sendKeys(PASSWORD);
        findElement(nextPswrdButton).click();
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }
}

