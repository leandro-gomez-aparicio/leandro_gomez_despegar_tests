package ProyectoDespegar.ProyectoDespegar.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class DriverFactory {
	
	private enum browsers {CHROME};
	
	public static WebDriver LevantarBrowser(WebDriver driver, String browserName, String URL) {

		switch (browsers.valueOf(browserName)) {
		case CHROME:
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\leo-8\\eclipse-workspace\\ProyectoDespegar\\src\\resources\\Recursos\\chromedriver.exe");
			Reporter.log("open Chrome");
			driver = new ChromeDriver();
			break;
		}
		
		default:
        {
            Reporter.log("No se selecciono un navegador correcto, se abre Chrome por defecto");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\leo-8\\eclipse-workspace\\ProyectoDespegar\\src\\resources\\Recursos\\chromedriver.exe");
            Reporter.log("Abrir Navegador Chrome");
            driver = new ChromeDriver();
            break;
        }
			
		}
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		return driver;
		
	}
	

}
