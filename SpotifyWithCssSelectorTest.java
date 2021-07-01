package Practico11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SpotifyWithCssSelectorTest {
    String url = "https://www.spotify.com/uy/signup/";

    public WebDriver getDriver(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        return driver;
    }

    @Test
    public void spotifyByPlaceHolderTest() {
        WebDriver driver = getDriver(url);
        driver.findElement(By.cssSelector("[placeholder='Introduce tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[placeholder='Vuelve a introducir tu correo electrónico.']")).sendKeys("testing@test.com");
        driver.findElement(By.cssSelector("[placeholder='Crea una contraseña.']")).sendKeys("prueba123");
        driver.findElement(By.cssSelector("[placeholder='Introduce un nombre de perfil.']")).sendKeys("jdellaceca");
        driver.findElement(By.cssSelector("[placeholder='DD']")).sendKeys("13");
        WebElement elementoMeses = driver.findElement(By.cssSelector("[name = 'month']"));
        Select mesesSelect = new Select(elementoMeses);
        mesesSelect.selectByVisibleText("Marzo");
        driver.findElement(By.cssSelector("[placeholder='AAAA']")).sendKeys("1996");
        driver.findElement(By.cssSelector("[for='gender_option_female']")).click();
        driver.findElement(By.cssSelector("[for='marketing-opt-checkbox']")).click();

        //WebElement emailError = driver.findElement(By.cssSelector("[aria-label='Indicador de error']"));
       // System.out.println("---->" + emailError.getText());
    }
}
