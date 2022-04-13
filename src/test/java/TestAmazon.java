import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome{

@Test
    public void runGoodle(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com.ua/");
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("youtube");
    }
}
