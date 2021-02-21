package docker.learning.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class HelloActions extends BaseTest {

    @Test
    public void test() {
        driver.get("https://sumeet0420.github.io");
        By by1 = By.xpath("(//tr/td)[2]");
        By by2 = By.xpath("//input");
        driver.findElement(new ByChained(by1, by2)).click();
        driver.quit();
        new FluentWait<>(driver).ignoreAll(List.of(NullPointerException.class, NoSuchElementException.class));
    }

    @Test @Ignore
    public void testFrames() throws InterruptedException {
        driver.get("file:///F:/dev/github%20pages/index.html");
        driver.switchTo().frame("iframe_b");
        System.out.println(driver.findElement(By.tagName("b")).getText());
        driver.switchTo().defaultContent();
        By by1 = By.xpath("(//tr/td)[2]");
        By by2 = By.xpath("//input");
        driver.findElement(new ByChained(by1, by2)).click();
        TimeUnit.SECONDS.sleep(10);
        driver.switchTo().parentFrame();
    }
}
