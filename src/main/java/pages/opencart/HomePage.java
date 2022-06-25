package pages.opencart;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HomePage extends CommonAPI {
    private final Logger LOG = (Logger) LoggerFactory.getLogger(HomePage.class);

    //All the FindBy goes here
    @FindBy(xpath = "//header/nav[1]/div[1]/div[2]/div[1]/a[1]")
    private WebElement loginlink;

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement emailinput;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement passwordinput;

    @FindBy(xpath = "//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]")
    private WebElement loginbutton;

    @FindBy(xpath = "//*[@id=\"account-pin\"]/div[2]/div/div[1]/h3")
    private WebElement setupPin;

    @FindBy(xpath = "//*[@id=\"navbar-collapse-header\"]/ul/li[3]/a")
    private WebElement marketplacelink;


    //xpath for register button
    @FindBy(xpath = "//header/nav[1]/div[1]/div[2]/div[1]/a[2]")
    private WebElement registerlink;

//demo
    @FindBy(xpath = "//header/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    private WebElement demo;

    //downloads
    @FindBy(xpath ="//*[@id=\"navbar-collapse-header\"]/ul/li[5]/a")
    private WebElement downloadBttn;







    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //All the method creation goes here
    public void clickloginlink() {
        click(loginlink);
        LOG.info("Click on login link is successful");
    }

    public void emailInput(String input) {
        type(emailinput, input);
        LOG.info("Able to type in email field  successfully");

    }

    public void passwordInput(String input) {
        type(passwordinput, input);
        LOG.info("Able to type in email field  successfully");

    }

    public void loginButton() {
        click(loginbutton);
        LOG.info("Able to click on login field successfully");

    }


    public void registerLink() {
        click(registerlink);
        LOG.info("Able to click on register link successfully");
    }


    public void marketplacebutton() {
        click(marketplacelink);
        LOG.info("Able to click on marketplace successfully");

    }
    public void demo(){
        click(demo);
        LOG.info("Able to click on button successfully");
    }

    public void download(){
        click(downloadBttn);
        LOG.info("Able to click on button successfully");
    }

    public String setuppin() {return getElementText(setupPin);}



}



