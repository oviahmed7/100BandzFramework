package apps.opencart;

import pages.opencart.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import utility.ExcelReader;

import java.util.List;

public class SearchTest extends base.CommonAPI{
   //@Test
    public void searchFacebook() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setSearchfield("facebook");
        marketplacePage.setSearchbutton();
        String expectedtitle = "Featured";
        Assert.assertEquals(expectedtitle, marketplacePage.Featured());
        }

   @Test
    public void searchSquare() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setSearchfield("square");
        marketplacePage.setSearchbutton();
        String expectedtitle = "Featured";
        Assert.assertEquals(expectedtitle, marketplacePage.Featured());
    }
    @Test
    public void searchTikTok() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setSearchfield("tiktok");
        marketplacePage.setSearchbutton();
        String expectedtitle = "Featured";
        Assert.assertEquals(expectedtitle, marketplacePage.Featured());
    }
    @Test
    public void searchCrypto() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setSearchfield("crypto");
        marketplacePage.setSearchbutton();
        String expectedtitle = "Featured";
        Assert.assertEquals(expectedtitle, marketplacePage.Featured());
    }

    @Test
    public void searchFeaturesWithExcelReader(){
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        ExcelReader excelReader = new ExcelReader(currentDir + "/data/SearchFeatures.xlsx");
        List<String> features = excelReader.getEntireColumnForGivenHeader("Sheet1", "Features");
        for (String feature:features ) {
            marketplacePage.setSearchfield(feature);
            marketplacePage.setSearchbutton();
            marketplacePage.clearSearch();
        }

    }
}
