package ProyectoDespegar.ProyectoDespegar.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DespegarResultados {
	
	private WebDriver driver = null;

    @FindBy(css = "div.results-items-wrapper div.results-cluster-container:nth-child(1) button>em")
    private WebElement inputSeleccionar;
    @FindBy(css = "div.message-header")
    private WebElement noHotelMessage;

    public DespegarResultados(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    public DespegarHotelPage seleccionarHotel() {
        inputSeleccionar.click();

        return new DespegarHotelPage(this.driver);
    }

    public boolean hotelExist() {
        try{
            inputSeleccionar.isDisplayed();
            return true;
        }catch (Exception e){
            Reporter.log("No se encontró la búsqueda");
            return false;
        }
    }

    public boolean noHotelsMessageIsVisible() {
        return noHotelMessage.isDisplayed();
    }
	

}
