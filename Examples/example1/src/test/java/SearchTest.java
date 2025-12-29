import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchTest {

    public WebDriver driver; 
    public WebDriverWait wait;  

     @BeforeEach
    public void preconditions() throws InterruptedException{
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.setup();
        searchPage.url("http://testing.ctd.academy/");
    }
    @Test
    public void BusquedaExitosa_Uruguay() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver, wait);

        searchPage.escribirBusqueda("Punta del este");
        searchPage.clickBuscar();

        searchPage.resultadoBusqueda();
    }

    @Test
    public void BusquedaExitosa_Grecia() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver, wait);

        searchPage.escribirBusqueda("Paros");
        searchPage.clickBuscar();

        searchPage.resultadoBusqueda();
    }

    @AfterEach
    public void close() {
        SearchPage searchPage = new SearchPage(driver, wait);
        searchPage.close();
    }

    /*@Test
    public void BusquedaExitosa() throws InterruptedException {
        driver = new ChromeDriver(); // open browser
        driver.manage().window().maximize(); // maximize window

        driver.get("http://testing.ctd.academy/");   // navigate to google.com
        Thread.sleep(1000); // wait for 1 second

        WebElement searchBox = driver.findElement(By.id("ciudad")); // locate search box
        searchBox.sendKeys("Punta del este"); // enter text "Selenium" into search box
        searchBox.sendKeys(Keys.ENTER); // press ENTER key
        Thread.sleep(1000); // wait for 1 second
    
        WebElement searchButtom = driver.findElement(By.name("btnK")); // locate search button
        searchButtom.click(); // click on search button
        Thread.sleep(1000); // wait for 1 second

        WebElement searchOk = driver.findElement(By.xpath("xpathExpression")); // locate search results container
        String busquedaCorrecta = searchOk.getText(); // get text from search results
        System.out.println(busquedaCorrecta); // print search results text

        driver.quit(); // close browser
    }*/




}
