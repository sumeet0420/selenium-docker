package docker.learning.tests;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class BaseTest {

    protected WebDriver driver;

    @BeforeTest
    public void setupDriver(ITestContext ctx) throws MalformedURLException, InterruptedException {
        Thread.sleep(4000);
        String host = Optional.ofNullable(System.getProperty("HUB_HOST"))
                .orElse("http://172.17.60.81:4444/wd/hub");
        System.out.println("host: "+host);
        String testName = ctx.getCurrentXmlTest().getName();
        //Setting up capabilities to be used
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("name", testName);
        dc.setCapability(CapabilityType.PLATFORM_NAME, Platform.ANY);
        dc.setCapability(CapabilityType.BROWSER_NAME, BrowserType.FIREFOX);
        final URL url = new URL("http://" + host + ":4444/wd/hub");
        System.out.println("url: "+url);
        this.driver = new RemoteWebDriver(url, dc);
        driver.manage().window().maximize();
        System.out.println(dc.getCapability(CapabilityType.PLATFORM_NAME));
    }

    @AfterTest
    public void quitDriver(){
        this.driver.quit();
    }

}