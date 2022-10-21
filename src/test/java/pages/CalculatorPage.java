package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPage {

    public String getResultCalculate(WebDriver driver) {
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click(); // 1
        driver.findElement(By.xpath("//div[@jsname='YovRWb']")).click(); // *
        driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click(); // 2
        driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click(); // -
        driver.findElement(By.xpath("//div[@jsname='KN1kY']")).click(); // 3
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click(); // +
        driver.findElement(By.xpath("//div[@jsname='N10B9']")).click(); // 1

        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click(); // =
        String text = driver.findElement(By.xpath("//span[@id='cwos']")).getText();
        return text;
    }

    public String getMemory(WebDriver driver) {
        String text = driver.findElement(By.xpath("//span[@jsname='ubtiRe']")).getText();
        return text;
    }

}
