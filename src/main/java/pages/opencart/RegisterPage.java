package pages.opencart;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegisterPage extends CommonAPI{

        private final Logger LOG = (Logger) LoggerFactory.getLogger(opencartpages.RegisterPage.class);

//registerform fields
    @FindBy(xpath = "//input[@id='input-username']")
    private WebElement usernameinput;

    @FindBy(xpath = "//input[@id='input-firstname']")
    private WebElement firstnameinput;

    @FindBy (xpath = "//input[@id='input-lastname']")
    private  WebElement lastnameinput;

    @FindBy (xpath = "//input[@id='input-email']")
    private WebElement registeremailinput;

    @FindBy (xpath = "//select[@id='input-country']")
    private WebElement countryinput;

    @FindBy (xpath = "//input[@id='input-password']")
    private WebElement registerpasswordinput;

    @FindBy(xpath = "//body/div[@id='account-register']/div[@id='register']/div[1]/div[1]/form[1]/div[7]/button[1]")
    private WebElement registerbutton;

    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public  void setUsernameinput(String input){
        type(usernameinput,input);
    }
    public  void setFirstnameinput(String input){
        type(firstnameinput,input);
    }

    public  void setLastnamenameinput(String input){
        type(lastnameinput,input);
        LOG.info("Able to type on last name field successfully");
    }

    public  void emailInput(String input){
        type(registeremailinput,input);
        LOG.info("Able to type in email input successfully");
    }


    public void setRegisterpasswordinput (String input){
        type(registerpasswordinput,input);
        LOG.info("Able to type on register field successfully");
    }

    public void setRegisterbutton (){
        click(registerbutton);
        LOG.info("Able to click on Register button successfully");


    }

}
