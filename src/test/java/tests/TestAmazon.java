//package tests;
//
//import org.testng.annotations.Test;
//
//public class TestAmazon extends TestInit {
//
//    @Test
//    public void runGoodle() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com.ua/");
//        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("amazon\n");
//        driver.findElements(By.xpath("//div[@class='tF2Cxc']")).get(0).click();
//        driver.findElement(By.xpath("//img[@alt='Electronics']")).click();
//    }
//}