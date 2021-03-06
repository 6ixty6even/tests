package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckTexasRestaurant extends TestInit {

    @Test
    public void TestTexasRestaurant() {
        goToEatStreet();
        HomePage homePage = new HomePage(driver);
        homePage.getSearchInput().sendKeys("Texas City, TX, USA");
        sleep(2);
        homePage.getClickOnNameTexasRestaurans().click();
        sleep(3);

        Assert.assertTrue(homePage.getClickOnTexasRestauran().isDisplayed());
    }
}