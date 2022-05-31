import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Despegar {
	
	@Test(description = "Validar que la busqueda de alojamiento en Despegar funciona")
	public void ValidarAlojamientoDespegar() throws Exception {  
		System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.despegar.com.ar");
	    WebElement botonAlojamiento = driver.findElement(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']"));  
	    Assert.assertTrue(botonAlojamiento.isDisplayed(), "Error");  
	    botonAlojamiento.click();
	    Thread.sleep(1000);
	    WebElement botonDestino = driver.findElement(By.cssSelector(".input-container .input-tag[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
	    botonDestino.click();
	    botonDestino.sendKeys("Córdoba, Córdoba, Argentina");	    
	    botonDestino.sendKeys(Keys.CONTROL);
	    Thread.sleep(1000);
	    botonDestino.sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    WebElement fecha = driver.findElement(By.cssSelector(".input-container .input-tag[placeholder='Entrada']"));
	    fecha.click();
	    Thread.sleep(1000);
	    WebElement botonFechaEntrada = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-today"));
	    botonFechaEntrada.click();
	    Thread.sleep(1000);
	    WebElement botonFechaSalida = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-selected + div"));
	    botonFechaSalida.click();
	    Thread.sleep(1000);
	    WebElement botonAplicar = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text"));
	    botonAplicar.click();
	    Thread.sleep(1000);
	    WebElement botonHabitaciones = driver.findElement(By.cssSelector("div.sbox5-box-container div.sbox5-3-double-input"));
	    botonHabitaciones.click();
	    Thread.sleep(1000);
	    WebElement botonAgregarUnAdulto = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(1) button.steppers-icon-right"));
	    botonAgregarUnAdulto.click();
	    Thread.sleep(1000);
	    WebElement botonAgregarMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right"));
	    botonAgregarMenor.click();
	    Thread.sleep(1000);
	    WebElement cboBoxEdadDelMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select"));
	    cboBoxEdadDelMenor.click();
	    Thread.sleep(1000);
	    WebElement edadDelMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select>option.select-option:nth-child(3)"));
	    edadDelMenor.click();
	    Thread.sleep(1000);
	    WebElement botonAplicarHabitacion = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)"));
	    botonAplicarHabitacion.click();
	    Thread.sleep(1000);
	    WebElement botonBuscar = driver.findElement(By.cssSelector("div#searchbox-sbox-box-hotels button"));
	    botonBuscar.click();
	    Thread.sleep(2000);
	    WebElement verPrimerResultado = driver.findElement(By.cssSelector(".pricebox-action"));
	    Assert.assertTrue(verPrimerResultado.isDisplayed(), "Error");
	    verPrimerResultado.click();
	    Thread.sleep(1000);
	    System.out.println("Busqueda finalizada con éxito");
	    Thread.sleep(1000);
	    driver.close();
	}

}
