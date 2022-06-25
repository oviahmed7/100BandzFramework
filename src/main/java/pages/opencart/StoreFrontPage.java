package pages.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StoreFrontPage extends base.CommonAPI {


    private final Logger LOG = (Logger) LoggerFactory.getLogger(StoreFrontPage.class);

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/form/div/div[2]/div[1]/h4/a")
    private WebElement macbook;



    public StoreFrontPage(WebDriver driver) {
        PageFactory.initElements(driver, this);}

    public void macbook(){
        click(macbook);
    }
}
