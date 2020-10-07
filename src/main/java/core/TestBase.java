package core;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static core.WebDriverContainer.*;

public class TestBase {

    @BeforeTest
    public void setup() {
        setDriver(WebDriverContainer.Driver.Chrome);

        open("https://www.google.com");
    }

    @AfterTest
    public void tearDown() {
        quit();
    }
}
