package docker.learning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CustomExpectedConditions  {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        Wait<WebDriver> webDriverWait = new WebDriverWait(chromeDriver, 2);
        webDriverWait.until( __ -> titleStartsWith(""));
        webDriverWait.until(webDriver -> ExpectedConditions.titleContains("hello"));
        Wait<WebDriver> wait = new FluentWait<>(chromeDriver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class)
                .withMessage(()->"Timeout Exception..");
        wait.until(driver -> ExpectedConditions.urlMatches(""));
        //chromeDriver.manage().timeouts().implicitlyWait()
    }

    public static ExpectedCondition<Boolean> titleStartsWith(final String title) {
        return driver -> driver.getTitle().startsWith("hello");
    }
}