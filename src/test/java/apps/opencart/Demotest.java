package apps.opencart;

import pages.opencart.*;

import org.testng.annotations.Test;

public class Demotest extends base.CommonAPI {

    @Test
    public void storeFront() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.storefront();
    }

    @Test
    public void administration() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.Adminstration();
    }

    @Test
    public void officialDocumentation() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setOfficialDocumentation();
    }

     @Test
    public void contactus() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setContactus();

    }

    @Test
    public void showcase() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setShowcase();

    }

    @Test
    public void aboutus() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setAboutus();
    }

   @Test
    public void communityforum() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setCommunityforum();
    }
    @Test
    public void dedicatedsupport() {
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setDedicatedsupport();
    }

    @Test
    public void subscribeNewsLetter(){
        HomePage homepage = new HomePage(getDriver());
        DemoPage demopage = new DemoPage(getDriver());
        homepage.demo();
        demopage.setEmailFieldInput("12345@gmail.com");
        demopage.setEmailFieldBttn();


    }
}
