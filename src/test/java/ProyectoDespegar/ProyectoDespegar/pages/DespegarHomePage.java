package ProyectoDespegar.ProyectoDespegar.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DespegarHomePage {
	
	@FindBy(css = "div.header-products-container>ul>li>a[title='Alojamientos']")
    private WebElement botonAlojamiento;
    @FindBy(css = "div.header-products-container ul li")
    private List<WebElement> listaBotones;

    private WebDriver driver = null;

    public DespegarHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public DespegarPage goToAlojamientos() {
        botonAlojamiento.click();

        return new DespegarPage(this.driver);
    }

    public List<WebElement> getButtonsList() {
        return listaBotones;
    }

}
