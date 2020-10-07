package core;

import static core.WebDriverContainer.getDriver;
import static org.testng.Assert.assertEquals;

public class PageBase {
    protected static void shouldAppear(String title) {
        assertEquals(getDriver().getTitle(), title);
    }
}
