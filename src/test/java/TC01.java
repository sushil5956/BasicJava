import com.driver.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TC01 extends DriverManager {

    // @Test
    public void checkScrrenshot() throws IOException {
        // WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        FileUtils.copyFile(file, new File("C:\\Study\\Sushil\\Java\\BasicJava\\inputFiles\\screen.png"));
        RestAssured.given().auth().basic("admin", "admin").get();
        driver.quit();
    }

    @Test
    public  void testMethod001(){
        WebElement ele = driver.findElement(By.xpath(""));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
        wait.until(d -> ele.isDisplayed());

        Wait<WebDriver> wait2 =
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(2))
                        .pollingEvery(Duration.ofMillis(300))
                        .ignoring(ElementNotInteractableException.class);

        wait2.until(
                d -> {
                    ele.sendKeys("Displayed");
                    return true;
                });
    }
}
