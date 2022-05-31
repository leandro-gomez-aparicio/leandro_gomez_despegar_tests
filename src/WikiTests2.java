import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTests2 {
	
	@Test(description = "Validar elementos en Wikipedia")
	public void ValidarElementosWikipedia() throws Exception {  
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");  
		WebDriver driver = new ChromeDriver();
	    driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
	    WebElement tituloBienvenidos = driver.findElement(By.xpath("//* [@title='Wikipedia:Bienvenidos']"));  
	    System.out.println("Texto encontrado "+ tituloBienvenidos.getText());  
	    Assert.assertEquals(tituloBienvenidos.getText(), "Bienvenidos");
	    Thread.sleep(2000);
	    WebElement searchInput = driver.findElement(By.cssSelector(".main-box.main-box-responsive-image .main-footer .mw-ui-button"));  
	    Assert.assertTrue(searchInput.isDisplayed(), "Error");
	    searchInput.click();
	    Thread.sleep(2000);
	    WebElement tituloResultado = driver.findElement(By.id("firstHeading"));  
	    System.out.println("Texto encontrado "+ tituloResultado.getText());  
	    Assert.assertEquals(tituloResultado.getText(), "Gustav Holst");
	    String currentURL=driver.getCurrentUrl();
	    System.out.println(currentURL);
	    Assert.assertEquals(currentURL, "https://es.wikipedia.org/wiki/Gustav_Holst");
	    driver.close();
	}

}
