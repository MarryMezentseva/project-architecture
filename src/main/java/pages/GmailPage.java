package pages;

import core.PageBase;
import org.openqa.selenium.By;

import static core.Locators.get;
import static core.WebDriverContainer.findElements;
import static org.testng.Assert.assertEquals;

public class GmailPage extends PageBase {

    private static final By emailLinks = get("GmailPage.emailLinks");

    private static final String TITLE = "Inbox (1) - forstudy319@gmail.com - Gmail";

    public static void assertNumberOfEmails(int number) {
        assertEquals(findElements(emailLinks).size(), number);
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }
}