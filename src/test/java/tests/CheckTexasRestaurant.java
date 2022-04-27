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
        sleep(4);
        Assert.assertTrue(homePage.texasRestauran().isDisplayed());
    }

    @Test
    public void TestTexasRestaura() {
        goToEatStreet();
        HomePage homePage = new HomePage(driver);
        homePage.getSearchField().sendKeys("Texas City, TX, USA");
        sleep(2);
        homePage.getClickOnTexas().click();
        sleep(4);
        sleep(2);
        Assert.assertTrue(homePage.texasRestauran().isDisplayed());
    }

}






