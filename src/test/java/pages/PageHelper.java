package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageHelper {
    public WebDriver driver;
    private MainGooglePage mainGooglePage;
    public  CalculatorPage calculatorPage;
    public static final String BASE_URL = "https://www.google.com/";

    public PageHelper(WebDriver driver) {
        this.driver = driver;
        this.mainGooglePage = new MainGooglePage();
        this.calculatorPage = new CalculatorPage();
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }

    public void openGoogle(){
        driver.get(BASE_URL);
    }

    public void openCalculator(){
        mainGooglePage.openCalculatorPage(driver);
    }

    public String calculate(){
        return calculatorPage.getResultCalculate(driver);
    }

    public String getMemory(){
        return calculatorPage.getMemory(driver);
    }
}
