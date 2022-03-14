package prePostConditions;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import utils.TestUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public WebDriver driver;

    @BeforeSuite
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(Config.getUrl());
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @AfterSuite
    public void tearDown(){
        TestUtils.sleep(2000);
        driver.quit();
    }
}