package docker.learning.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class HelloActions extends BaseTest{

    @Test
    public void test() {
        driver.get("https://sumeet0420.github.io");
        By by1 = By.xpath("(//tr/td)[2]");
        By by2 = By.xpath("//input");
        driver.findElement(new ByChained(by1, by2)).click();
        driver.quit();
        new FluentWait<>(driver).ignoreAll(List.of(NullPointerException.class, NoSuchElementException.class));
    }
}
