package ProyectoDespegar.ProyectoDespegar.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ProyectoDespegar.ProyectoDespegar.driver.DriverFactory;


public class DespegarTest {
	
		
	@Test(description = "Validar que la busqueda de alojamiento en Despegar funciona")
	
	public void ValidarAlojamientoDespegar() throws Exception {  
		
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
	    driver.get("https://www.despegar.com.ar");
	    
	    WebElement botonAlojamiento = driver.findElement(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']"));  
	    Assert.assertTrue(botonAlojamiento.isDisplayed(), "Error");  
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']")));
	    botonAlojamiento.click();
	    
	    WebElement botonDestino = driver.findElement(By.cssSelector(".input-container .input-tag[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
	    botonDestino.click();
	    botonDestino.sendKeys("Córdoba, Córdoba, Argentina");	    
	    botonDestino.sendKeys(Keys.CONTROL);
	    Thread.sleep(1000);
	    botonDestino.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    
	    WebElement fecha = driver.findElement(By.cssSelector(".input-container .input-tag[placeholder='Entrada']"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".input-container .input-tag[placeholder='Entrada']")));
	    fecha.click();
	    
	    WebElement botonFechaEntrada = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-today"));
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-today")));
	    botonFechaEntrada.click();
	    
	    WebElement botonFechaSalida = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-selected + div"));
	    wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-selected + div")));
	    botonFechaSalida.click();
	    
	    WebElement botonAplicar = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text")));
	    botonAplicar.click();
	    
	    WebElement botonHabitaciones = driver.findElement(By.cssSelector("div.sbox5-box-container div.sbox5-3-double-input"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-box-container div.sbox5-3-double-input")));
	    botonHabitaciones.click();
	    
	    WebElement botonAgregarUnAdulto = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(1) button.steppers-icon-right"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(1) button.steppers-icon-right")));
	    botonAgregarUnAdulto.click();
	    
	    WebElement botonAgregarMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right")));
	    botonAgregarMenor.click();
	    
	    WebElement cboBoxEdadDelMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select")));
	    cboBoxEdadDelMenor.click();
	    
	    WebElement edadDelMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select>option.select-option:nth-child(3)"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select>option.select-option:nth-child(3)")));
	    edadDelMenor.click();
	    
	    WebElement botonAplicarHabitacion = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)")));
	    botonAplicarHabitacion.click();
	    
	    WebElement botonBuscar = driver.findElement(By.cssSelector("div#searchbox-sbox-box-hotels button"));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#searchbox-sbox-box-hotels button")));
	    botonBuscar.click();
	    
	    WebElement verPrimerResultado = driver.findElement(By.cssSelector(".pricebox-action"));
	    Assert.assertTrue(verPrimerResultado.isDisplayed(), "Error");
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pricebox-action")));
	    verPrimerResultado.click();
	    System.out.println("Busqueda finalizada con éxito");
	    Thread.sleep(1000);
	    driver.close();
		
	}

}
