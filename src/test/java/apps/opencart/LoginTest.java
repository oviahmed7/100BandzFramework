package apps.opencart;

import pages.opencart.*;

import org.testng.Assert;

public class LoginTest extends base.CommonAPI {

    //@Test
    public void logintest() {
        HomePage homepage = new HomePage(getDriver());
        homepage.clickloginlink();
        homepage.emailInput("Ovi.ahmed@Hotmail.com");
        homepage.passwordInput("Ovi1");
        homepage.loginButton();
        String expectedtitle= "Setup PIN for your account";
        Assert.assertEquals(expectedtitle,homepage.setuppin());
    }

  //@Test
    public void accountpage() {
        HomePage homepage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homepage.clickloginlink();
        homepage.emailInput("Ovi.ahmed@Hotmail.com");
        homepage.passwordInput("Ovi1");
        homepage.loginButton();
        loginPage.setAccountbutton();
        String expectedtitle= "Edit My Information";
        Assert.assertEquals(expectedtitle,loginPage.accountheader());
    }
}


