package apps.opencart;
import pages.opencart.*;

import org.testng.annotations.Test;

public class RegisterTest extends base.CommonAPI{

    @Test
    public void logintest() {
        HomePage homepage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        homepage.registerLink();
        registerPage.setUsernameinput("Ovi6");
        registerPage.setFirstnameinput("ovi");
        registerPage.setLastnamenameinput("Ahmed");
        registerPage.emailInput("Ovi7@gmail.com");
        registerPage.setRegisterpasswordinput("12345");
        registerPage.setRegisterbutton();
    }




}
