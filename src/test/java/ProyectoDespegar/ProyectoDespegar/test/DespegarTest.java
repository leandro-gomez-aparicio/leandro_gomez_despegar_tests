package ProyectoDespegar.ProyectoDespegar.test;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProyectoDespegar.ProyectoDespegar.driver.DriverFactory;
import ProyectoDespegar.ProyectoDespegar.pages.DespegarHomePage;
import ProyectoDespegar.ProyectoDespegar.pages.DespegarHotelPage;
import ProyectoDespegar.ProyectoDespegar.pages.DespegarPage;
import ProyectoDespegar.ProyectoDespegar.pages.DespegarResultados;

@Test(description = "Validar que la busqueda de alojamiento en Despegar funciona")

public class DespegarTest {
	
	WebDriver driver;

	@BeforeMethod(alwaysRun = true)
    public void initTest(ITestContext context) {
		
        String navegadorSuite = context.getCurrentXmlTest().getParameter("Navegador");
        String navegador = navegadorSuite != null ? navegadorSuite : "CHROME";

        String URL = "https://www.despegar.com.ar";

        driver = DriverFactory.LevantarBrowser(driver, navegador, URL);
	}
	
	
	
	@DataProvider(name="lugar")
    public Object[][] lugaresProvider() {
        return new Object[][] {{"Cordoba"}, {"Misiones"}};
    }
	
	
	@Test(groups={"Navegar"}, description = "testear funcionalidad Modificar", dataProvider = "lugar")
    public void navegarHotel(String destino) throws Exception {

        DespegarHomePage homePage = new DespegarHomePage(driver);

        DespegarPage alojamientosPage = homePage.goToAlojamientos();

        alojamientosPage.IngresarDestino(destino);
        
        alojamientosPage.FechasAlojamiento();

        alojamientosPage.FechaDeIngreso();

        alojamientosPage.FechaDeSalida();
        
        alojamientosPage.AplicarFechas();
        
        alojamientosPage.IngresarHabitaciones();

        alojamientosPage.AgregarAdulto();

        alojamientosPage.AgregarMenor();
        
        alojamientosPage.EdadDelMenor();
        
        alojamientosPage.IngresarEdadDelMenor();
        
        alojamientosPage.AplicarHabitaciones();

        DespegarResultados resultados = alojamientosPage.BuscarAlojamiento();

        if(resultados.hotelExist()) {

            DespegarHotelPage hotel = resultados.seleccionarHotel();


            Assert.assertTrue(hotel.modificarMenuIsOpen(), "El menu no se abre");

        }else {
     
            Assert.assertTrue(resultados.noHotelsMessageIsVisible(), "error");
        }
	}
	
	
    @AfterMethod(alwaysRun = true)
    public void cerrarSesion() {
        DriverFactory.CloseBrowser(driver);
    }
}
