package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainGooglePage {

    public CalculatorPage openCalculatorPage(WebDriver driver){
//        driver.findElement(By.name("q")).sendKeys("calculator");
        driver.findElement(By.name("q")).sendKeys("калькулятор");
        driver.findElement(By.name("btnK")).click();
        return new CalculatorPage();
    }

}
