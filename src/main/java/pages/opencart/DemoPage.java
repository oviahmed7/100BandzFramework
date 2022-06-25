
package pages.opencart;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

    public class DemoPage extends CommonAPI {
    private final Logger LOG = (Logger) LoggerFactory.getLogger(HomePage.class);

    @FindBy(xpath = "//header/nav[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")
    private WebElement demo;

    @FindBy (xpath = "//body/div[@id='cms-demo']/div[2]/div[1]/div[1]/div[1]/a[1]")
    private WebElement stroefront;

    @FindBy(xpath = "//body/div[@id='cms-demo']/div[2]/div[1]/div[2]/div[1]/a[1]/span[1]")
    private WebElement adminstration;

    @FindBy(xpath = "//*[@id=\"cms-demo\"]/div[2]/div/div[3]/div/a")
    private WebElement officialDocumentation;

    @FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[2]/section[1]/ul[1]/li[1]/a[1]")
    private WebElement contactus;

    @FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[2]/a[1]")
    private WebElement showcase;

    @FindBy (xpath = "//a[contains(text(),'About Us')]")
    private WebElement aboutus;

    @FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[3]/section[1]/ul[1]/li[1]/a[1]")
    private WebElement communityforum;

    @FindBy (xpath = "//a[contains(text(),'Dedicated Support')]")
    private WebElement dedicatedsupport;

    @FindBy (xpath = "//*[@id=\"newsletter\"]/div/input")
    private WebElement emailField;
    @FindBy(xpath = "//*[@id=\"newsletter\"]/div/div/button")
    private WebElement emailFieldBttn;



        public DemoPage(WebDriver driver) {PageFactory.initElements(driver, this);
        }

    public void storefront (){
        click(stroefront);
        LOG.info("Successfully able to navigate");
    }

    public void Adminstration (){
        click(adminstration);
        LOG.info("Successfully able to navigate");
    }

    public void setOfficialDocumentation (){
        click(officialDocumentation);
        LOG.info("Successfully able to click");
    }
    public void setContactus(){
        click(contactus);
        LOG.info("Successfully able to click");
    }
    public void setShowcase(){
        click(showcase);
        LOG.info("Successfully able to click");
    }

    public void setAboutus(){
        click(aboutus);
        LOG.info("Successfully able to click");

    }

    public void setCommunityforum(){
        click(communityforum);
        LOG.info("Successfully able to click");
    }

    public void setDedicatedsupport(){
        click(dedicatedsupport);
        LOG.info("Successfully able to click");

    }

    public void setEmailFieldInput(String item){
        type(emailField, item);
        LOG.info("Successfully able to click on email button");
    }
    public void setEmailFieldBttn(){
        click(emailFieldBttn);
        LOG.info("Successfully able to click on email button");
    }



}
