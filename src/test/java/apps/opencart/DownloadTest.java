package apps.opencart;

import pages.opencart.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DownloadTest extends base.CommonAPI {

    @Test
    public void carbonTabDownload() {
        HomePage homepage = new HomePage(getDriver());
        DownloadPage downloadPage = new DownloadPage(getDriver());
        homepage.download();
        downloadPage.clickCarbonTab();
        String expectedtitle = "Carbon Tab";
        Assert.assertEquals(expectedtitle,downloadPage.carbontabtitle());
    }

    @Test
    public void swedishlanguage() {
        HomePage homepage = new HomePage(getDriver());
        DownloadPage downloadPage = new DownloadPage(getDriver());
        homepage.download();
        downloadPage.clickSwedishLanguage();
        String expectedtitle ="Swedish Language";
        Assert.assertEquals(expectedtitle,downloadPage.swedishlanguagetitle());
    }

   @Test
    public void accountsidebar() {
        HomePage homepage = new HomePage(getDriver());
        DownloadPage downloadPage = new DownloadPage(getDriver());
        homepage.download();
        downloadPage.clickAccountSidebar();
        String expectedtitle ="Account Sidebar (2x, 3x, 4x)";
        Assert.assertEquals(expectedtitle,downloadPage.accounsidebartitle());
    }

   @Test
    public void tempalteorganicforopencart() {
        HomePage homepage = new HomePage(getDriver());
        DownloadPage downloadPage = new DownloadPage(getDriver());
        homepage.download();
        downloadPage.clickTempalteOrganiceForOpencart();
        String expectedtitle ="Tempalte Organic For Opencart";
        Assert.assertEquals(expectedtitle,downloadPage.Tempaltetitle());
    }

    @Test
    public void Themesviplusdotnet() {
        HomePage homepage = new HomePage(getDriver());
        DownloadPage downloadPage = new DownloadPage(getDriver());
        homepage.download();
        downloadPage.clickthemesviplusdotnet();
        String expectedtitle ="Themes viplusdotnet";
        Assert.assertEquals(expectedtitle,downloadPage.Themestitle());
    }
}
