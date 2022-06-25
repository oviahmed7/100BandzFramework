package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import java.util.logging.Logger;

public class LoginPage extends base.CommonAPI{
    private final Logger LOG = (Logger) LoggerFactory.getLogger(LoginPage.class);

    @FindBy(xpath = "//*[@id=\"input-email\"]")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"input-password\"]")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]")
    private WebElement loginbutton;

    @FindBy(xpath = "//*[@id=\"short-cut\"]/div[1]/div[1]/div/div[2]/h4/a")
    private WebElement accountbutton;
    @FindBy(xpath = "Edit My Information")
    private WebElement accountheader;



    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void typeEmail(String item) {
        type(email, item);
        LOG.info("Typing in username is successful");
    }

    public void typePassword(String item) {
        type(password, item);
        LOG.info("Typing in password is successful");
    }
    public void clicklogginbtn() {
        click(loginbutton);
        LOG.info("clicking on login button is successful");
    }
    public void setAccountbutton(){
        click(accountbutton);
        LOG.info("clicking on account details was successful");
    }

    public String accountheader() {
        return getElementText(accountheader);
    }

}



