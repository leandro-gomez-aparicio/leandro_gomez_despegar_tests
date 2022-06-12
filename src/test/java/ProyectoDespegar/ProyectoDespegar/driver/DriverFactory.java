package ProyectoDespegar.ProyectoDespegar.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

public class DriverFactory {
	
	private enum browsers {CHROME, EDGE};
	
	public static WebDriver LevantarBrowser(WebDriver driver, String browserName, String URL) {

		switch (browsers.valueOf(browserName)) {
		case CHROME:
		{
			System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
			Reporter.log("open Chrome");
			driver = new ChromeDriver();
			break;
		}
		
		//case EDGE:
        //{
        //    System.setProperty("webdriver.edge.driver", "");
        //    Reporter.log("Abrir Navegador Edge");
        //    driver = new EdgeDriver();
        //    break;
        //}
		
		default:
        {
            Reporter.log("No se selecciono un navegador correcto, se abre Chrome por defecto");
            System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
            Reporter.log("Abrir Navegador Chrome");
            driver = new ChromeDriver();
            break;
        }
			
		}
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		return driver;
		
	}
	public static void CloseBrowser(WebDriver driver) {
        driver.quit();
    }
	

}
