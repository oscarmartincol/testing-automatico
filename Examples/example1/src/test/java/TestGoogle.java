import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
    public WebDriver driver;


    @Test
    public void test_1() {
        driver = new ChromeDriver(); // open browser
        driver.get("https://google.com");   // navigate to google.com

        driver.getTitle(); // "Google"

        WebElement searchBox = driver.findElement(By.name("q")); // locate search box
        WebElement searchButtom = driver.findElement(By.name("btnK")); // locate search button

        searchBox.sendKeys("Selenium"); // enter text "Selenium" into search box
        searchBox.sendKeys(Keys.ENTER); // press ENTER key
        //searchButtom.click();

        searchBox = driver.findElement(By.name("q"));  // locate search box again
        searchBox.getAttribute("value"); //"Selenium"  // get text from search box

        driver.quit(); // close browser
    }
}