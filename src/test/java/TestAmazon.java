import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestAmazon extends TestInit {

//    @Test
//    public void runGoodle(){
//    WebDriverManager.chromedriver().setup();
//    WebDriver driver = new ChromeDriver();
//    driver.get("https://www.google.com.ua/");
//    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon\n");
//    driver.findElements(By.xpath("//div[@class='tF2Cxc']")).get(0).click();
//    JavascriptExecutor jse = (JavascriptExecutor)driver;
//    jse.executeScript("scrollBy(0,250)");
//    driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
//    jse.executeScript("scrollBy(0,250)");
//      }




    @Test
    public void Runrun() {
        WebDriverManager.chromedriver();
      goToGoogle();

    }

    }