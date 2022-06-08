package ProyectoDespegar.ProyectoDespegar.pages;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DespegarPage {
	
	private WebDriver driver = null;
    private WebDriverWait wait = null;
    
    
    @FindBy(css = ".header-products-container [href='//www.despegar.com.ar/hoteles/']")
    private WebElement botonAlojamiento;
    
    @FindBy(css = ".input-container .input-tag[placeholder='Ingresá una ciudad, alojamiento o punto de interés']")
    private WebElement botonDestino;
    
    @FindBy(css = ".input-container .input-tag[placeholder='Entrada']")
    private WebElement fecha;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.calendar-container div.-today")
    private WebElement botonFechaEntrada;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.calendar-container div.-selected + div")
    private WebElement botonFechaSalida;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text")
    private WebElement botonAplicar;
    
    @FindBy(css = "div.sbox5-box-container div.sbox5-3-double-input")
    private WebElement botonHabitaciones;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(1) button.steppers-icon-right")
    private WebElement botonAgregarUnAdulto;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right")
    private WebElement botonAgregarMenor;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select")
    private WebElement cboBoxEdadDelMenor;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select>option.select-option:nth-child(3)")
    private WebElement edadDelMenor;
    
    @FindBy(css = "div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)")
    private WebElement botonAplicarHabitacion;
    
    @FindBy(css = "div#searchbox-sbox-box-hotels button")
    private WebElement botonBuscar;
    
    @FindBy(css = ".pricebox-action")
    private WebElement verPrimerResultado;
    
    
    
	
    public DespegarPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        PageFactory.initElements(driver, this);
    }
    
    public WebDriverWait wait(WebElement locator) {
		return this.wait(locator);
	}
		
	//@Test(description = "Validar que la busqueda de alojamiento en Despegar funciona")
	
	//public void ValidarAlojamientoDespegar() {  
		
		//System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");  
		//WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//driver.manage().window().maximize();
	    //driver.get("https://www.despegar.com.ar");
	    
	    //WebElement botonAlojamiento = driver.findElement(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']"));  
	    //Assert.assertTrue(botonAlojamiento.isDisplayed(), "Error");  
	    
		
		//wait.until(ExpectedConditions.elementToBeClickable(botonAlojamiento));
	    //botonAlojamiento.click();
	    
	//}
	public void IngresarDestino(String text) throws Exception{    
		
		wait.until(ExpectedConditions.elementToBeClickable(botonDestino));
        botonDestino.click();
        botonDestino.sendKeys("Córdoba, Córdoba, Argentina");
        Thread.sleep(1000);
        botonDestino.sendKeys(Keys.CONTROL);
        //wait.until(ExpectedConditions.elementToBeClickable(botonDestino));
        botonDestino.sendKeys(Keys.ENTER);
		
		
		//wait.until(ExpectedConditions.elementToBeClickable(botonDestino));
	    //WebElement botonDestino = driver.findElement(By.cssSelector(".input-container .input-tag[placeholder='Ingresá una ciudad, alojamiento o punto de interés']"));
	    //botonDestino.click();
	    //botonDestino.sendKeys("Córdoba, Córdoba, Argentina");	    
	    //botonDestino.sendKeys(Keys.CONTROL);
	    //Thread.sleep(1000);
	    //botonDestino.sendKeys(Keys.ENTER);
	    //Thread.sleep(1000);
	}
	
	public void FechasAlojamiento() {
		
		wait.until(ExpectedConditions.elementToBeClickable(fecha));
	    //WebElement fecha = driver.findElement(By.cssSelector(".input-container .input-tag[placeholder='Entrada']"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".input-container .input-tag[placeholder='Entrada']")));
	    fecha.click();
	    //Thread.sleep(5000);
	}
	
	public void FechaDeIngreso() {
	    
		wait.until(ExpectedConditions.elementToBeClickable(botonFechaEntrada));
	    //WebElement botonFechaEntrada = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-today"));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-today")));
	    botonFechaEntrada.click();
	    //Thread.sleep(5000);
	}
	
	public void FechaDeSalida() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonFechaSalida));
	    //WebElement botonFechaSalida = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-selected + div"));
	    //wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-container div.-selected + div")));
	    botonFechaSalida.click();
	    //Thread.sleep(5000);
	}
	
	public void AplicarFechas() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonAplicar));
	    //WebElement botonAplicar = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.calendar-footer em.btn-text")));
	    botonAplicar.click();
	    //Thread.sleep(5000);
	}
	
	public void IngresarHabitaciones() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonHabitaciones));
	    //WebElement botonHabitaciones = driver.findElement(By.cssSelector("div.sbox5-box-container div.sbox5-3-double-input"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-box-container div.sbox5-3-double-input")));
	    botonHabitaciones.click();
	    //Thread.sleep(5000);
	}
	
	public void AgregarAdulto() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonAgregarUnAdulto));
	    //WebElement botonAgregarUnAdulto = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(1) button.steppers-icon-right"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(1) button.steppers-icon-right")));
	    botonAgregarUnAdulto.click();
	    //Thread.sleep(5000);
	}
	
	public void AgregarMenor() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonAgregarMenor));
	    //WebElement botonAgregarMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(2) button.steppers-icon-right")));
	    botonAgregarMenor.click();
	    //Thread.sleep(5000);
	}
	
	public void EdadDelMenor() {
		
		wait.until(ExpectedConditions.elementToBeClickable(cboBoxEdadDelMenor));
	    //WebElement cboBoxEdadDelMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select")));
	    cboBoxEdadDelMenor.click();
	    //Thread.sleep(5000);
	}
	
	public void IngresarEdadDelMenor() {
		
		wait.until(ExpectedConditions.elementToBeClickable(edadDelMenor));
	    //WebElement edadDelMenor = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select>option.select-option:nth-child(3)"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__distribution_container>div:nth-child(3)  div.select-container>select.select>option.select-option:nth-child(3)")));
	    edadDelMenor.click();
	    //Thread.sleep(5000);
	}
	
	public void AplicarHabitaciones() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonAplicarHabitacion));
	    //WebElement botonAplicarHabitacion = driver.findElement(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.sbox5-floating-tooltip-opened div.stepper__room__footer>a:nth-child(1)")));
	    botonAplicarHabitacion.click();
	    //Thread.sleep(5000);
	}
	
	public DespegarResultados BuscarAlojamiento() {
		
		wait.until(ExpectedConditions.elementToBeClickable(botonBuscar));
	    //WebElement botonBuscar = driver.findElement(By.cssSelector("div#searchbox-sbox-box-hotels button"));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#searchbox-sbox-box-hotels button")));
	    botonBuscar.click();
	    return new DespegarResultados(this.driver);
	    //Thread.sleep(5000);
	}
	
	public void PrimerResultado() {
		
		wait.until(ExpectedConditions.elementToBeClickable(verPrimerResultado));
	    //WebElement verPrimerResultado = driver.findElement(By.cssSelector(".pricebox-action"));
	    //Assert.assertTrue(verPrimerResultado.isDisplayed(), "Error");
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pricebox-action")));
	    verPrimerResultado.click();
	    //System.out.println("Busqueda finalizada con éxito");
	    //Thread.sleep(1000);
	}
	    //driver.close();
		


}
