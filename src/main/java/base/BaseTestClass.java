package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTestClass {
    @BeforeMethod
    public void setUp(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        open("https://www.google.com");
    }
}
