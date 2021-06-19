/*Crear un método con un nombre a seleccionar
Acceder a Netflix: https://www.netflix.com/uy/  --
Mostrar los elementos h1 y h2 que hay en el sitio --
Refrescar la página --
Mostrar el texto de los botones que se encuentran en la página --
Mostrar la cantidad de elementos div que contiene el sitio --
Obtener y mostrar el título de la página --
Mostrar la cantidad de elementos de tipos link*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Ejercicio14 {

    @Test
    public void netflix(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.netflix.com");

        List<WebElement> listaH1 = driver.findElements(By.tagName("h1"));
        System.out.println("La cantidad de H1 es: " + listaH1.size());
        System.out.println("Elementos H1: ");
        for (WebElement elementoH1: listaH1){
            System.out.println(elementoH1.getText());
        }
        System.out.println(" ***** ***** ***** *****");

        List<WebElement> listaH2 = driver.findElements(By.tagName("h2"));
        System.out.println("La cantidad de H2 es: " + listaH1.size());
        System.out.println("Elementos H2: ");
        for (WebElement elementoH2: listaH2){
            System.out.println(elementoH2.getText());
        }

        driver.navigate().refresh();

        System.out.println(" ***** ***** ***** *****");

        List<WebElement>btnElements = driver.findElements(By.tagName("button"));
        System.out.println("La página contiene " + btnElements.size() + " botones");
        for(WebElement btn: btnElements){
            System.out.println("Botón " + btn.getText());
        }

        System.out.println(" ***** ***** ***** *****");

        List<WebElement> divElements = driver.findElements(By.tagName("div"));
        System.out.println("La cantidad de divs es "+ divElements.size());

        System.out.println(" ***** ***** ***** *****");

        System.out.println("El titulo es " + driver.getTitle());

        System.out.println(" ***** ***** ***** *****");

        List<WebElement>linksElements = driver.findElements(By.tagName("a"));
        for(WebElement link: linksElements){
            System.out.println("link: " + link.getText());
        }

    }
}
