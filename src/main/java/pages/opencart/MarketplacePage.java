package pages.opencart;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarketplacePage extends CommonAPI {


    private final Logger LOG = (Logger) LoggerFactory.getLogger(opencartpages.MarketplacePage.class);

    //FeaturedMarketplace Locators




    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[1]/section/div[2]/p[1]/a")
    private WebElement facebook;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[2]/section/div[2]/p[1]/a")
    private WebElement tiktok;

    @FindBy(xpath = "//a[contains(text(),'Accept Bitcoin and other 70+ Crypto Payments')]")
    private WebElement coingate;

    @FindBy(xpath = "//a[contains(text(),'Official Clearpay Extension Plug-In')]")
    private WebElement clearpay;

    @FindBy(xpath = "//a[contains(text(),'Official Afterpay Extension Plug-in')]")
    private WebElement afterpay;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[3]/div[3]/section/div[2]/p[1]/a")
    private WebElement square;

    @FindBy(xpath = "//a[contains(text(),'Visual Designer PRO (The First Page Builder for..')]")
    private WebElement visual;

    @FindBy(xpath = "//a[contains(text(),'SEO module PRO - All in one SEO extensions')]")
    private WebElement seo;

    @FindBy(xpath = "//a[contains(text(),'AJAX Quick Checkout PRO (One Page Checkout, Fast..')]")
    private WebElement ajax;

    @FindBy(xpath = "//a[contains(text(),'OCLMS - Opencart Learning Management System Module')]")
    private WebElement oclms;

    @FindBy(xpath = "//*[@id=\"extension-search\"]/div/input[1]")
    private WebElement searchfield;

    @FindBy(xpath = " //*[@id=\"button-search\"]")
    private WebElement searchbutton;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[5]/div[1]/section/div[2]/p[1]/a")
    private WebElement bitcoinpayment;

    @FindBy (xpath = "//a[contains(text(),'Product Reviews Pro')]")
    private WebElement productreview;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[7]/div[2]/section/div[2]/p[1]/a")
    private WebElement pointofsale;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[7]/div[3]/section/div[2]/p[1]/a")
    private WebElement youtube;

    @FindBy (xpath = "//*[@id=\"extension-list\"]/div[2]/div[1]/section/div[2]/p[1]/a")
    private WebElement multiseller;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[2]/section/div[2]/p[1]/a")
    private WebElement aramex;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[3]/section/div[2]/p[1]/a")
    private WebElement Msmmarket;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[3]/div[1]/section/div[2]/p[1]/a")
    private WebElement dailydeals;

    @FindBy(xpath = "//legend[contains(text(),'Please choose a payment method below')]")
    private WebElement paymentmethod;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[3]/div[2]/section/div[2]/p[1]/a")
    private WebElement gatepayment;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[3]/div[3]/section/div[2]/p[1]/a")
    private WebElement cloneproduct;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[4]/div[3]/section/div[2]/p[1]/a")
    private WebElement avalara;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[4]/div[1]/section/div[2]/p[1]/a")
    private WebElement booking;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[4]/div[2]/section/div[2]/p[1]/a")
    private WebElement Mailtamplet;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[5]/div[1]/section/div[2]/p[1]/a")
    private WebElement webtoprint;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[5]/div[2]/section/div[2]/p[1]/a")
    private WebElement orderpopup;

    @FindBy (xpath = "//*[@id=\"extension-list\"]/div[5]/div[3]/section/div[2]/p[1]/a")
    private WebElement mobileapp;

    @FindBy (xpath = "//*[@id=\"extension-list\"]/div[6]/div[1]/section/div[2]/p[1]/a")
    private WebElement uspsshipping;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[6]/div[2]/section/div[2]/p[1]/a")
    private  WebElement mobilenumber;

    @FindBy(xpath ="//*[@id=\"extension-list\"]/div[6]/div[3]/section/div[2]/p[1]/a")
    private WebElement uspsstampsby;

    @FindBy(xpath ="//*[@id=\"extension-list\"]/div[2]/div[1]/section/div[2]/p[1]/a")
    private WebElement asg;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[9]/div[2]/section/div[2]/p[1]/a")
    private WebElement sociallike;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[9]/div[3]/section/div[2]/p[1]/a")
    private WebElement blogfree;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[10]/div[1]/section/div[2]/p[1]/a")
    private  WebElement excelfree;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[3]/section/div[2]/p[1]/a")
    private WebElement cookie;

    @FindBy(xpath = "//a[contains(text(),'Subcategory Image Module')]")
    private WebElement imagemodule;

    @FindBy(xpath = "//div[contains(text(),'TMD OpenCart Buy Bulk Products List Extension Over')]")
    private WebElement bulk;

    @FindBy(xpath = "//a[contains(text(),'Opencart New Fashion Theme')]")
    private WebElement fashion;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[5]/div[2]/section/div[2]/p[1]/a")
    private WebElement responsive;

    @FindBy(xpath = "//a[contains(text(),'Platinum Jewellery - Responsive Opencart Theme')]")
    private  WebElement jewellery;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[5]/div[1]/section/div[2]/p[1]/a")
    private WebElement cma;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[1]/section/div[2]/p[1]/a")
    private WebElement socialquick;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[7]/div[1]/section/div[2]/p[1]/a")
    private WebElement googlemarketing;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[7]/div[2]/section/div[2]/p[1]/a")
    private WebElement updateanddelete;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[6]/div[3]/section/div[2]/p[1]/a")
    private WebElement whatsapp;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[6]/div[2]/section/div[2]/p[1]/a")
    private WebElement barion;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[2]/section/div[2]/p[1]/a")
    private WebElement socialsignup;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[1]/section/div[2]/p[1]/a")
    private WebElement gst;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/div[2]/div[2]/section/div[2]/p[1]/a")
    private WebElement upc;

   @FindBy(xpath = "//a[contains(text(),'OC Ultra Theme - OpenCart 3x')]")
   private WebElement oc;

   @FindBy(xpath = "//a[contains(text(),'Nice Theme for OpenCart 3')]")
   private WebElement nicetheme;

   @FindBy(xpath = "//a[contains(text(),'Romanian language pack for opencart 3.x & 4.0')]")
   private WebElement rom;

   @FindBy(xpath = "//a[contains(text(),'OpenCart Flipkart Connector')]")
   private WebElement flipkart;

   @FindBy(xpath = "//a[contains(text(),'Opencart eBay Connector')]")
   private WebElement ebay;

   @FindBy(xpath = "//a[contains(text(),'Opencart Multi Currency Extension')]")
   private WebElement currency;

   @FindBy(xpath = "//a[contains(text(),'Opencart Move to Wishlist')]")
   private WebElement wishlist;

   @FindBy(xpath = "//a[contains(text(),'OpenCart Mobile Emoji Push Notification')]")
   private WebElement emoji;

   @FindBy(xpath = "//a[contains(text(),'Opencart Mobile App Builder for Android & iP..')]")
   private WebElement appbuilder;

   @FindBy(xpath = "//h3[contains(text(),'Opencart Marketplace Single Seller Checkout')]")
   private WebElement ssc;

   @FindBy(xpath = "//a[contains(text(),'Seo Mega Pack')]")
   private WebElement mega;






    ///assertions locators


    @FindBy(xpath = "//h3[contains(text(),'Seo Mega Pack')]")
    private WebElement megatitle;

    @FindBy(xpath = "//h3[contains(text(),'Opencart Marketplace Single Seller Checkout')]")
    private WebElement ssctitle;

    @FindBy(xpath ="//h3[contains(text(),'Opencart Mobile App Builder for Android & iPhone')]" )
    private WebElement appbuildertitle;



    @FindBy(xpath = "//h3[contains(text(),'OpenCart Mobile Emoji Push Notification')]")
    private WebElement emojititle;



    @FindBy(xpath = "//h3[contains(text(),'Opencart Move to Wishlist')]")
    private WebElement wishlisttitle;


    @FindBy(xpath = "//h3[contains(text(),'Opencart Multi Currency Extension')]")
    private WebElement currencytitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement ebaytitle;

    @FindBy(xpath = "//h3[contains(text(),'OpenCart Flipkart Connector')]")
    private WebElement flipkarttitle;

    @FindBy(xpath = "//h3[contains(text(),'Romanian language pack for opencart 3.x & 4.0')]")
    private  WebElement romtitle;

    @FindBy(xpath ="//h3[contains(text(),'Nice Theme for OpenCart 3')]")
    private WebElement nicethemetitle;

    @FindBy(xpath = "//h3[contains(text(),'OC Ultra Theme - OpenCart 3x')]")
    private WebElement octitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement upctitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement gsttitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement socialsignuptitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement bariontitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement whatsapptitle;

    @FindBy (xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement updateanddeletetitle;


    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement googlemarketingtitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private  WebElement socialquicktitle;

    @FindBy(xpath = "//h3[contains(text(),'CMA (Category, Manufacturer, Attributes) FILTER')]")
    private WebElement cmatitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement jewellerytitle;

    @FindBy(xpath = "//h3[contains(text(),'Classified- Responsive Opencart Theme')]")
    private WebElement responsivetitle;

    @FindBy(xpath = "//h3[contains(text(),'Opencart New Fashion Theme')]")
    private WebElement fashiontitle;

    @FindBy(xpath = "//h3[contains(text(),'Buy Bulk Products')]")
    private WebElement bulktitle;


    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement imagemoduletitle;

    @FindBy(xpath = "//h3[contains(text(),'Cookie Consent')]")
    private WebElement cookietitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement excelfreetitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement blogfreetitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement socialliketitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement asgtitle;

    @FindBy (xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement uspsstampsbytitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement mobilenumbertitle;

    @FindBy (xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement uspsshippingtitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement mobileapptitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement orderpopuptitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement webtoprinttitle;

    @FindBy(xpath = "//h3[contains(text(),'OpenCart Mail Template')]")
    private WebElement Mailtamplettitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement bookingtitle;

    @FindBy(xpath ="//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement avalaratitle;


    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement facebooktitle;

    @FindBy(xpath = "//h3[contains(text(),'TikTok for OpenCart')]")
    private WebElement tiktoktitle;

    @FindBy(xpath = "//h3[contains(text(),'Accept Bitcoin and other 70+ Crypto Payments')]")
    private WebElement coingatetitle;

    @FindBy(xpath = "//h3[contains(text(),'Official Clearpay Extension Plug-In')]")
    private WebElement clearplaytitle;

    @FindBy(xpath = "//h3[contains(text(),'Official Afterpay Extension Plug-in')]")
    private WebElement afterpaytitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement squaretitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement visualtitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement seotitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement ajaxtitle;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/h3[1]")
    private WebElement oclmstitle;

    @FindBy(xpath = "//*[@id=\"extension-list\"]/h3")
    private WebElement Featured;

    @FindBy(xpath = "//h3[contains(text(),'Bitcoin Payments by OpenNode')]")
    private WebElement Bitcoinpaymenttitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement producttitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement pointtitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement youtubetitle;

    @FindBy(xpath ="//*[@id=\"marketplace-extension-info\"]/div[2]/h3" )
    private WebElement multisellertitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement aramextitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement Msmmarkettitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement Dailydealstitle;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement gatepaymenttitle;

    @FindBy(xpath = "//button[@id='button-purchase']")
    private WebElement buyButton;

    @FindBy(xpath = "//*[@id=\"marketplace-extension-info\"]/div[2]/h3")
    private WebElement clonetitle;



    ///page clicks
    @FindBy(xpath = "//*[@id=\"marketplace-extension\"]/div[2]/div/div[2]/nav/ul/li[3]/a")
    private  WebElement marketplacepage3;

    @FindBy(xpath = "//*[@id=\"marketplace-extension\"]/div[2]/div/div[2]/nav/ul/li[4]/a")
    private WebElement getMarketplacepage4;



    public MarketplacePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    // --------


    //methods
    public void setFacebook() {
        click(facebook);
        LOG.info("Click is successful");

    }

    public void setTiktok() {
        click(tiktok);
        LOG.info("Click is successful");
    }

    public void setCoingate() {
        click(coingate);
        LOG.info("Click is successful");
    }

    public void setClearpay() {
        click(clearpay);
        LOG.info("Click is successful");
    }

    public void setAfterpay() {
        click(afterpay);
        LOG.info("Click is successful");
    }

    public void setSquare() {
        click(square);
        LOG.info("Click is successful");
    }

    public void setVisual() {
        click(visual);
        LOG.info("Click is successful");
    }

    public void setSeo() {
        click(seo);
        LOG.info("Click is successful");
    }

    public void setAjax() {
        click(ajax);
        LOG.info("Click is successful");
    }

    public void setOclms() {
        click(oclms);
        LOG.info("Click is successful");


    }
    public void setBitcoinpayment(){
        click(bitcoinpayment);
            LOG.info("click is successful");

}
public void setProductreview(){
        click(productreview);
        LOG.info("click is successful");
}
public void setPointofsale(){
        click(pointofsale);
        LOG.info("click is successful");
}
public void setYoutube(){
        click(youtube);
        LOG.info("click is successful");
}
public void setMultiseller(){
        click(multiseller);
        LOG.info("click is successful");
}
public void setAramex(){
        click(aramex);
        LOG.info("click is successful");
}
public void setMsmmarket(){
        click(Msmmarket);
        LOG.info("click is successful");
}
public void setDailydeals(){
        click(dailydeals);
        LOG.info(("click is successful"));
}
public void setGatepayment(){
        click(gatepayment);
        LOG.info("click is successful");

}

public void clickBuyButton(){
        click(buyButton);
        LOG.info("Buy button click successful");
}

public void setCloneproduct(){
        click(cloneproduct);
        LOG.info("click is successful");
}
public void setAvalara(){
        click(avalara);
        LOG.info("click is successful");
}
public void setBooking(){
        click(booking);
        LOG.info("click is successful");
}
public void setMailtamplet(){
        click(Mailtamplet);
        LOG.info("click is successful");
    }

    public void setWebtoprint(){
        click(webtoprint);
        LOG.info("click is successful");
    }
    public void setOrderpopup(){
        click(orderpopup);
        LOG.info("click is successful");
    }
    public void setMobileapp(){
        click(mobileapp);
        LOG.info("click is successful");
    }
public void setUspsshipping(){
        click(uspsshipping);
        LOG.info("click is successful");
}
public void setMobilenumber(){
        click(mobilenumber);
        LOG.info("click is successful");
}
public void setUspsstampsby(){
        click(uspsstampsby);
        LOG.info("click is successful ");

}
public void setAsg(){
        click(asg);
        LOG.info("click is successful");
}

public void setSociallike(){
        click(sociallike);
        LOG.info("click is successful");
}
public void setBlogfree(){
        click(blogfree);
        LOG.info("click is successful");
}

public void setExcelfree(){
        click(excelfree);
        LOG.info("click is successful");
}

public void setCookie(){
        click(cookie);
        LOG.info("click is successful");
}



    public void ClickMarketplacepage3(){
        click(marketplacepage3);
        LOG.info("click on marketplace page 3 was successful");
    }

    public void clearSearch(){
        clear(searchfield);
    }

    public void setImagemodule(){
        click(imagemodule);
        LOG.info("click is successful");
    }
    public void setBulk(){
        click(bulk);
        LOG.info("click is successful");
    }

    public void setFashion(){
        click(fashion);
        LOG.info("click is successful");
    }

    public void setResponsive(){
        click(responsive);
        LOG.info("click is successful");
    }
    public  void  setJewellery(){
        click(jewellery);
        LOG.info("click is successful ");
    }
    public void  setCma(){
        click(cma);
        LOG.info("click is successful");
    }
    public void socialquick(){
        click(socialquick);
        LOG.info("click is successful");
    }

    public void setGooglemarketing(){
        click(googlemarketing);
        LOG.info("click is successful");
    }
    public void setUpdateanddelete(){
        click(updateanddelete);
        LOG.info("click is successful");
    }
    public void setWhatsapp(){
        click(whatsapp);
        LOG.info("click is successful");
    }
    public void setBarion(){
        click(barion);
        LOG.info("click is successful");
    }
    public void setSocialsignup(){
        click(socialsignup);
        LOG.info("click is successful ");
    }
    public void ClickMarketplacepage4() {
        click(getMarketplacepage4);
        LOG.info("click on marketplace page 4 was successful");
    }

    public void setGst(){
        click(gst);
        LOG.info("click is successful");
    }

    public void setUpc(){
        click(upc);
        LOG.info("click is successful");
    }

    public void setOc(){
        click(oc);
        LOG.info("click is successful ");
    }

    public void setNicetheme(){
        click(nicetheme);
        LOG.info("click is successful ");
    }

    public void setRom(){
        click(rom);
        LOG.info("click is successful ");
    }
    public void setFlipkart(){
        click(flipkart);
        LOG.info("click is successful ");

    }
    public void setEbay(){
        click(ebay);
        LOG.info("click is successful ");

    }
    public void setCurrency() {
        click(currency);
        LOG.info("click is successful ");
    }
    public void setWishlist() {
        click(wishlist);
        LOG.info("click is successful ");
    }
    public void setEmoji() {
        click(emoji);
        LOG.info("click is successful ");
    }


    public void setAppbuilder() {
        click(appbuilder);
        LOG.info("click is successful ");
    }
    public void setSsc() {
        click(ssc);
        LOG.info("click is successful ");
    }

    public void setMega() {
        click(mega);
        LOG.info("click is successful ");
    }




    public void setSearchfield(String input){type(searchfield,input);}
    public void setSearchbutton(){click(searchbutton);}

    public String facebooktitle() {return getElementText(facebooktitle);}
    public String tiktoktitle() {return getElementText(tiktoktitle);}
    public String coingatetitle() { return getElementText(coingatetitle);}
    public String clearpaytitle() { return getElementText(clearplaytitle);}
    public String afterpaytitle() {return getElementText(afterpaytitle);}
    public String squaretitle() {return getElementText(squaretitle);}
    public String visualtitle (){return getElementText(visualtitle);}
    public String seotitle (){return  getElementText(seotitle);}
    public  String ajaxtitle () {return getElementText(ajaxtitle);}
    public  String oclmstitle () {return getElementText(oclmstitle);}
    public String Featured() {return getElementText(Featured);}
    public String bitcoinpaymenttitle(){return getElementText(Bitcoinpaymenttitle);}
    public String producttitle(){return getElementText(producttitle);}
    public String pointtitle(){return getElementText(pointtitle);}
    public String youtubetitle(){return getElementText(youtubetitle);}
    public String multisellertitle(){return getElementText(multisellertitle);}
    public String aramextitle(){return getElementText(aramextitle);}
    public String Msmmarkettitle(){return getElementText(Msmmarkettitle);}
    public String Dailydealstitle(){return getElementText(Dailydealstitle);}
    public String gatepaymenttitle(){return getElementText(gatepaymenttitle);}
    public String paymenttitle(){return getElementText(paymentmethod);}
    public String clonetitle(){return getElementText(clonetitle);}
    public String avalaratitle(){return getElementText(avalaratitle);}
    public String bookingtitle (){return getElementText(bookingtitle);}
    public String Mailtamplettitle(){return getElementText(Mailtamplet);}
    public String webtoprintitle(){return getElementText(webtoprinttitle);}
    public String orderpopuptitle(){return getElementText(orderpopuptitle);}
    public String mobileapptitle(){return getElementText(mobileapptitle);}
    public String uspsshippingtitle(){return getElementText(uspsshippingtitle);}
    public String mobilenumbertitle(){return getElementText(mobilenumbertitle);}
    public String uspsstampsbytitle(){return getElementText(uspsstampsbytitle);}
    public String asgtitle(){return getElementText(asgtitle);}
    public String socialliketitle(){return getElementText(socialliketitle);}
    public String blogfreetitle(){return getElementText(blogfreetitle);}
    public String excelfreetitle(){return getElementText(excelfreetitle);}
    public String cookietitle(){return getElementText(cookietitle);}
    public String imagemoduletitle(){return getElementText(imagemoduletitle);}
    public String bulktitle(){return getElementText(bulktitle);}
    public String fashiontitle(){return getElementText(fashiontitle);}
    public String responsivetitle(){return getElementText(responsivetitle);}
    public String jewellerytitle (){return getElementText(jewellerytitle);}
    public  String cmatitle(){return getElementText(cmatitle);}
    public String socialquicktitle(){return getElementText(socialliketitle);}
    public String googlemarketingtitle(){return getElementText(googlemarketingtitle);}
    public String updateanddeletetitle(){return getElementText(updateanddeletetitle);}
    public String whatsapptitle(){return getElementText(whatsapptitle);}
    public  String bariontitle(){return getElementText(bariontitle);}
    public  String socialsignuptitle(){return getElementText(socialsignuptitle);}
    public String gsttitle(){return getElementText(gsttitle);}
    public  String upctitle(){return getElementText(upctitle);}
    public String octitle(){return getElementText(octitle);}
    public String nicethemetitle(){return getElementText(nicethemetitle);}
    public String romtitle(){return getElementText(romtitle);}
    public String flipkarttitle(){return getElementText(flipkarttitle);}
    public String ebaytitle(){return getElementText(ebaytitle);}
    public String currencytitle(){return getElementText(currencytitle);}
    public  String wishlisttitle(){return getElementText(wishlisttitle);}
    public  String emojititle(){return getElementText(emojititle);}
    public String appbuildertitle(){return getElementText(appbuildertitle);}
    public String ssctitle(){return getElementText(ssctitle);}
    public String megatitle(){return getElementText(megatitle);}





























}

