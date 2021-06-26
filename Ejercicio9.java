package Practico10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ejercicio9 {

    public WebDriver getDriver(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    @Test
    public void registrationFacebookTest() throws InterruptedException {
        WebDriver driver = getDriver("https://www.facebook.com");
        driver.findElement(By.linkText("Crear cuenta nueva")).click();

        Thread.sleep(3000);

        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("reg_email__")).sendKeys("test@test.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("test@test.com");
        driver.findElement(By.id("password_step_input")).sendKeys("23456789");

        WebElement elementDay = driver.findElement(By.id("day"));
        Select daySelect = new Select(elementDay);
        daySelect.selectByIndex(26);

        WebElement elementMonth = driver.findElement(By.id("month"));
        Select monthSelect = new Select(elementMonth);
        monthSelect.selectByValue("6");

        WebElement elementYear = driver.findElement(By.id("year"));
        Select yearSelect = new Select(elementYear);
        yearSelect.selectByValue("1980");

        WebElement maleGenderRadioButton = driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
        maleGenderRadioButton.click();


    }
}
