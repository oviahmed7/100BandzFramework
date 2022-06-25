package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DownloadPage extends base.CommonAPI {
    private final Logger LOG = (Logger) LoggerFactory.getLogger(DownloadPage.class);


    //findby
    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[1]/div[1]/section/div[2]/p[1]/a")
    private WebElement carbonTab;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[1]/div[2]/section/div[2]/p[1]/a")
    private WebElement swedishlanguage;

    @FindBy(xpath = "//a[contains(text(),'Account Sidebar (2x, 3x, 4x)')]")
    private WebElement accountsidebar;

    @FindBy(xpath = "//a[contains(text(),'Tempalte Organic For Opencart')]")
    private WebElement Tempalteorganiceforopencart;

    @FindBy(xpath = "//a[contains(text(),'Themes viplusdotnet')]")
    private WebElement Themesviplusdotnet;


    //assertions locators
    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement Carbontabtitle;

    @FindBy (xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement swedishlanguagetitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement accountsidebartitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement Tempaltetitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement Themestitle;


    public DownloadPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //methods
    public void clickCarbonTab() {
        click(carbonTab);
        LOG.info("Click on Carbon Tab Image was successful");
    }

    public void clickSwedishLanguage() {
        click(swedishlanguage);
        LOG.info("Click on Carbon Tab Image was successful");

    }

    public void clickAccountSidebar() {
        click(accountsidebar);
        LOG.info("Click on Carbon Tab Image was successful");
    }

    public void clickTempalteOrganiceForOpencart() {
        click(Tempalteorganiceforopencart);
        LOG.info("Click on Carbon Tab Image was successful");

    }

    public void clickthemesviplusdotnet() {
        click(Themesviplusdotnet);
        LOG.info("Click on Carbon Tab Image was successful");

    }


    public String carbontabtitle(){return getElementText(Carbontabtitle);}
    public String swedishlanguagetitle(){return getElementText(swedishlanguagetitle);}
    public String accounsidebartitle(){return getElementText(accountsidebartitle);}
    public String Tempaltetitle(){return getElementText(Tempaltetitle);}
    public String Themestitle(){return getElementText(Themestitle);}
}





