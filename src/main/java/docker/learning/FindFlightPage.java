package docker.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindFlightPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "reserveFlights")
    private WebElement firstSubmitBtn;

    @FindBy(name = "buyFlights")
    private WebElement secondSubmitBtn;

    public FindFlightPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
        new WebDriverWait(driver, 20).until(chromeDriver -> chromeDriver
                .getTitle().startsWith("Hello1"));
    }

    public void submitFindFlightPage(){
        this.firstSubmitBtn.click();
        this.wait.until(driver->ExpectedConditions.elementToBeClickable(this.firstSubmitBtn));
    }

    public void goToFlightConfirmationPage(){
        this.wait.until(driver->ExpectedConditions.elementToBeClickable(this.secondSubmitBtn));
        this.secondSubmitBtn.click();
    }

}