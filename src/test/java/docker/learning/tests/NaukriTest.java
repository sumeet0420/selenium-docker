package docker.learning.tests;

import org.testng.annotations.Test;

public class NaukriTest extends BaseTest{

    @Test
    public void naukri() {
        driver.get("https://www.naukri.com/");
        driver.getWindowHandles().stream().limit(2).forEach(window->{
            System.out.printf("On Window title --->%s and handle -->%s%n",driver.switchTo().window(window).getTitle(),
                    driver.getWindowHandle());
        });
        System.out.println("after execution --->"+driver.getTitle());
        System.out.println("*".repeat(50));
        driver.getWindowHandles().forEach(window ->
                System.out.printf("On Window title --->%s and handle -->%s%n",
                driver.switchTo().window(window).getTitle(), driver.getWindowHandle()));
    }
}
