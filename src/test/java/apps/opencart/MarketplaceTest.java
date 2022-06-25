package apps.opencart;


import pages.opencart.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MarketplaceTest extends base.CommonAPI {

           @Test
     public void facebook() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setFacebook();
         String expectedtitle = "Facebook for OpenCart";
         Assert.assertEquals(expectedtitle, marketplacePage.facebooktitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void tiktok() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setTiktok();
         String expectedtitle = "TikTok for OpenCart";
         Assert.assertEquals(expectedtitle, marketplacePage.tiktoktitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void coingate() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setCoingate();
         String expectedtitle = "Accept Bitcoin and other 70+ Crypto Payments";
         Assert.assertEquals(expectedtitle, marketplacePage.coingatetitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void clearpay() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setClearpay();
         String expectedtitle = "Official Clearpay Extension Plug-In";
         Assert.assertEquals(expectedtitle, marketplacePage.clearpaytitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
     public void afterpay() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setAfterpay();
         String expectedtitle = "Official Afterpay Extension Plug-in";
         Assert.assertEquals(expectedtitle, marketplacePage.afterpaytitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void square() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setSquare();
         String expectedtitle = "Square Payments - OpenCart Integration";
         Assert.assertEquals(expectedtitle, marketplacePage.squaretitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }


     @Test
     public void visual() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setVisual();
         String expectedtitle = "Visual Designer PRO (The First Page Builder for Opencart)";
         Assert.assertEquals(expectedtitle, marketplacePage.visualtitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());


     }

     @Test
     public void seo() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setSeo();
         String expectedtitle = "SEO module PRO - All in one SEO extensions";
         Assert.assertEquals(expectedtitle, marketplacePage.seotitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());


     }

     @Test
     public void ajax() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setAjax();
         String expectedtitle = "AJAX Quick Checkout PRO (One Page Checkout, Fast Checkout)";
         Assert.assertEquals(expectedtitle, marketplacePage.ajaxtitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());


     }

     @Test
     public void oclms() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setOclms();
         String expectedtitle = "OCLMS - Opencart Learning Management System Module";
         Assert.assertEquals(expectedtitle, marketplacePage.oclmstitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
     public void bitcoin() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setBitcoinpayment();
         String expectedtitle = "Bitcoin Payments by OpenNode";
         Assert.assertEquals(expectedtitle, marketplacePage.bitcoinpaymenttitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());


     }

     @Test
     public void product() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setProductreview();
         String expectedtitle = "Product Reviews Pro";
         Assert.assertEquals(expectedtitle, marketplacePage.producttitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void pointofsale() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setPointofsale();
         String expectedtitle = "Opencart Point Of Sale";
         Assert.assertEquals(expectedtitle, marketplacePage.pointtitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
     public void youtube() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setPointofsale();
         String expectedtitle = "Product Youtube video (Multilanguage ) (1.5.x , 2.x & 3.x)";
         Assert.assertEquals(expectedtitle, marketplacePage.youtubetitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());


     }

     @Test
     public void multiseller() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setMultiseller();
         String expectedtitle = "Opencart Multi Seller Marketplace Canada Post Shipping";
         Assert.assertEquals(expectedtitle, marketplacePage.multisellertitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void aramex() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setAramex();
         String expectedtitle = "Opencart Multi Seller Marketplace Aramex Shipping";
         Assert.assertEquals(expectedtitle, marketplacePage.aramextitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void Msmmarket() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setMsmmarket();
         String expectedtitle = "Opencart Multi Seller Marketplace Advertisement System";
         Assert.assertEquals(expectedtitle, marketplacePage.Msmmarkettitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
     public void Dailydeals() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setDailydeals();
         String expectedtitle = "Opencart Multi Seller Daily Deals";
         Assert.assertEquals(expectedtitle, marketplacePage.Dailydealstitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void gatepayment() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setGatepayment();
         String expectedtitle = "Opencart Mangopay Payment Gateway";
         Assert.assertEquals(expectedtitle, marketplacePage.gatepaymenttitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void clonepruduct() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setCloneproduct();
         String expectedtitle = "Opencart Multi Seller Clone Product";
         Assert.assertEquals(expectedtitle, marketplacePage.clonetitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void Avalara() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setAvalara();
         String expectedtitle = "Opencart Multi Seller Avalara Extension";
         Assert.assertEquals(expectedtitle, marketplacePage.avalaratitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void booking() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setBooking();
         String expectedtitle = "Opencart Multi Seller Booking and Reservation";
         Assert.assertEquals(expectedtitle, marketplacePage.bookingtitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
     public void Mailtamplet() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setMailtamplet();
         String expectedtitle = "OpenCart Mail Template";
         Assert.assertEquals(expectedtitle, marketplacePage.Mailtamplettitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());


     }

     @Test
     public void Webtoprint() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setWebtoprint();
         String expectedtitle = "OpenCart Multi Seller Web To Print";
         Assert.assertEquals(expectedtitle, marketplacePage.webtoprintitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
     public void orderpopup() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setOrderpopup();
         String expectedtitle = "OpenCart Live Sales Order Pop-up Notification";
         Assert.assertEquals(expectedtitle, marketplacePage.orderpopuptitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void mobileapp() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setMobileapp();
         String expectedtitle = "Opencart Multi Seller Mobile App";
         Assert.assertEquals(expectedtitle, marketplacePage.mobileapptitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void uspsshipping() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setUspsshipping();
         String expectedtitle = "Opencart Multi Seller Marketplace USPS Shipping Management";
         Assert.assertEquals(expectedtitle, marketplacePage.uspsshippingtitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void mobilenumber() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setMobilenumber();
         String expectedtitle = "OpenCart Login By Mobile Number";
         Assert.assertEquals(expectedtitle, marketplacePage.mobilenumbertitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());
     }

     @Test
     public void uspsstampsby() {
         HomePage homepage = new HomePage(getDriver());
         MarketplacePage marketplacePage = new MarketplacePage(getDriver());
         homepage.marketplacebutton();
         marketplacePage.setUspsstampsby();
         String expectedtitle = "Opencart Multi Seller Marketplace USPS by stamps.com";
         Assert.assertEquals(expectedtitle, marketplacePage.uspsstampsbytitle());
         marketplacePage.clickBuyButton();
         String expectedText = "Please choose a payment method below";
         Assert.assertEquals(expectedText, marketplacePage.paymenttitle());

     }

     @Test
    public void asg() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setAsg();
        String expectedtitle = "ASG Popup Window";
        Assert.assertEquals(expectedtitle, marketplacePage.asgtitle());
        //fail

    }

     @Test
    public void sociallike() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setSociallike();
        String expectedtitle = "Social Like FREE (Google+, LinkedIn)";
        Assert.assertEquals(expectedtitle, marketplacePage.socialliketitle());


    }

     @Test
    public void blogfree() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setBlogfree();
        String expectedtitle = "Blog Module FREE";
        Assert.assertEquals(expectedtitle, marketplacePage.blogfreetitle());

    }

    @Test
    public void excelfree() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.setExcelfree();
        String expectedtitle = "Export-Import to Excel FREE";
        Assert.assertEquals(expectedtitle, marketplacePage.excelfreetitle());
    }

    @Test
    public void cookie() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setCookie();
        waitFor(3);
//       String expectedtitle = "Cookie Consent";
        //Assert.assertEquals(expectedtitle, marketplacePage.cookietitle());
        //marketplacePage.clickBuyButton();
        //waitFor(3);
        //String expectedUrl = "https://www.opencart.com/index.php?route=account/login";
        //Assert.assertEquals(expectedUrl, getUrlLink());


    }

    @Test
    public void imagemodule() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setImagemodule();
        String expectedtitle = "Subcategory Image Module";
        Assert.assertEquals(expectedtitle, marketplacePage.imagemoduletitle());

    }

    @Test
    public void bulk() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setBulk();
        String expectedtitle = "Buy Bulk Products";
        Assert.assertEquals(expectedtitle, marketplacePage.bulktitle());
    }

    @Test
    public void fashion() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setFashion();
        String expectedtitle = "Opencart New Fashion Theme";
        Assert.assertEquals(expectedtitle, marketplacePage.fashiontitle());
    }

    @Test
    public void responsive() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setResponsive();
        String expectedtitle = "Classified- Responsive Opencart Theme";
        Assert.assertEquals(expectedtitle, marketplacePage.responsivetitle());
    }

    @Test
    public void Jewellery() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setJewellery();
        String expectedtitle = "Platinum Jewellery - Responsive Opencart Theme";
        Assert.assertEquals(expectedtitle, marketplacePage.jewellerytitle());

    }

    @Test
    public void cma() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setCma();
        String expectedtitle = "CMA (Category, Manufacturer, Attributes) FILTER";
        Assert.assertEquals(expectedtitle, marketplacePage.cmatitle());
    }

    @Test
    public void socialquick() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.socialquick();
        String expectedtitle = "Advance Social Quick Login/ Signup";
        Assert.assertEquals(expectedtitle, marketplacePage.socialquicktitle());

    }

     @Test
    public void googlemarketing() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setGooglemarketing();
        String expectedtitle = "Google Marketing Tools (1.5.x , 2.x & 3.x)";
        Assert.assertEquals(expectedtitle, marketplacePage.googlemarketingtitle());
    }

     @Test
    public void updateanddelete() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setUpdateanddelete();
        String expectedtitle = "Order Status update and delete";
        Assert.assertEquals(expectedtitle, marketplacePage.updateanddeletetitle());
    }

    @Test
    public void whatsapp() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setWhatsapp();
        String expectedtitle = "Chat Purchase Button | Whatsapp, Messenger, etc [Advanced]";
        Assert.assertEquals(expectedtitle, marketplacePage.whatsapptitle());
    }

    @Test
    public void barion() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setBarion();
        String expectedtitle = "Barion Fizetési mód / Barion Payment (Hu, Sk, Cz, Eng, De)";
        Assert.assertEquals(expectedtitle, marketplacePage.bariontitle());
    }
    @Test
    public void socialsignup() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage3();
        marketplacePage.setSocialsignup();
        String expectedtitle = "Advance Social Login/ Signup | Facebook Login";
        Assert.assertEquals(expectedtitle, marketplacePage.socialsignuptitle());


    }

     @Test
    public void gst() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setGst();
        String expectedtitle = "GST (Goods and Services Tax) Exclude";
        Assert.assertEquals(expectedtitle, marketplacePage.gsttitle());
    }

    @Test
    public void upc() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setUpc();
        String expectedtitle = "Product Option UPC";
        Assert.assertEquals(expectedtitle, marketplacePage.upctitle());

    }

    @Test

    public void oc() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setOc();
        String expectedtitle = "OC Ultra Theme - OpenCart 3x";
        Assert.assertEquals(expectedtitle, marketplacePage.octitle());

    }

   @Test

    public void nicetheme() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setNicetheme();
        String expectedtitle = "Nice Theme for OpenCart 3";
        Assert.assertEquals(expectedtitle, marketplacePage.nicethemetitle());

    }

    @Test

    public void rom() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setRom();
        String expectedtitle = "Romanian language pack for opencart 3.x & 4.0";
        Assert.assertEquals(expectedtitle, marketplacePage.romtitle());
     }
    @Test
    public void flipkart() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setFlipkart();
        String expectedtitle = "OpenCart Flipkart Connector";
        Assert.assertEquals(expectedtitle, marketplacePage.flipkarttitle());
    }

     @Test
    public void ebay() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setEbay();
        String expectedtitle = "Opencart eBay Connector";
        Assert.assertEquals(expectedtitle, marketplacePage.ebaytitle());
    }

    @Test
    public void currency() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setCurrency();
        String expectedtitle = "Opencart Multi Currency Extension";
        Assert.assertEquals(expectedtitle, marketplacePage.currencytitle());
    }

    @Test
    public void wishlist() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setWishlist();
        String expectedtitle = "Opencart Move to Wishlist";
        Assert.assertEquals(expectedtitle, marketplacePage.wishlisttitle());
    }

     @Test
    public void emoji() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setEmoji();
        String expectedtitle = "OpenCart Mobile Emoji Push Notification";
        Assert.assertEquals(expectedtitle, marketplacePage.emojititle());
    }

    @Test
    public void appbuilder() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setAppbuilder();
        String expectedtitle = "Opencart Mobile App Builder for Android & iPhone";
        Assert.assertEquals(expectedtitle, marketplacePage.appbuildertitle());
    }

    //@Test
    public void ssc() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setSsc();
        String expectedtitle = "Opencart Marketplace Single Seller Checkout";
        Assert.assertEquals(expectedtitle, marketplacePage.ssctitle());

    }



    @Test
    public void mega() {
        HomePage homepage = new HomePage(getDriver());
        MarketplacePage marketplacePage = new MarketplacePage(getDriver());
        homepage.marketplacebutton();
        marketplacePage.ClickMarketplacepage4();
        marketplacePage.setMega();
        String expectedtitle = "Seo Mega Pack";
        Assert.assertEquals(expectedtitle, marketplacePage.megatitle());

    }
}

