import core.TestBase;
import org.testng.annotations.Test;
import pages.GmailPage;
import pages.GoogleHomePage;
import pages.LoginPage;

public class GMailTest extends TestBase {

    @Test
    public void gmailTest() {
        GoogleHomePage.clickSignInButton();
        LoginPage.shouldAppear();
        LoginPage.login();
        GoogleHomePage.shouldAppear();
        GoogleHomePage.goToGmail();
        GmailPage.shouldAppear();
        GmailPage.assertNumberOfEmails(3);
    }
}
