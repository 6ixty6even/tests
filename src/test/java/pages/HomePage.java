package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField() {
        return driver.findElement(By.xpath("//input[@placeholder='Enter Your Address']"));
    }

    public WebElement getClickOnTexas() {
        return driver.findElement(By.xpath("//li[@val='Texas City, TX, USA']"));
    }

    public WebElement texasRestauran() {
        return driver.findElement(By.xpath("//a[@href='/houston-tx/restaurants/texas-pizza-houston']"));
    }
}
