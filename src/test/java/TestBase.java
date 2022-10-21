import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.PageHelper;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;
    public PageHelper pageHelper;

    @BeforeTest
    public void beforeInit(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        pageHelper = new PageHelper(driver);
    }

    @AfterTest
    public void close(){
        driver.close();
        driver.quit();
    }
}
