package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class CheckTexasRestaurant extends TestInit {

    @Test
    public void TestTexasRestaurant() {
        goToEatStreet();
        HomePage homePage = new HomePage(driver);
        homePage.getSearchField().sendKeys("Texas City, TX, USA");
        sleep(2);
        homePage.getClickOnTexas().click();
        sleep(3);
        Assert.assertTrue(homePage.texasRestauran().isDisplayed());
    }

    @Test
    public void newTestTexasRestaurant() {
        goToEatStreet();
        HomePage homePage = new HomePage(driver);
        homePage.getSearchField().sendKeys("Texas City, TX, USA");
        sleep(2);
        homePage.getClickOnTexas().click();
        sleep(3);
        Assert.assertTrue(homePage.texasRestauran().isDisplayed());
    }

    @Test
    public void newnewTestTexasRestaurant() {
        goToEatStreet();
        HomePage homePage = new HomePage(driver);
        homePage.getSearchField().sendKeys("Texas City, TX, USA");
        sleep(2);
        homePage.getClickOnTexas().click();
        sleep(3);
        Assert.assertTrue(homePage.texasRestauran().isDisplayed());
    }
}





