package Pages;
import Utilities.GWD;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.Key;

public class DialogContent extends Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(css = "a[title='Elektronik'] >:nth-child(2)")
    private WebElement Elektronik;

    @FindBy(xpath = "//span[text()='Telefon & Aksesuarları']")
    private WebElement TelefonAksesuarlari;

    @FindBy(xpath = "(//a[text()='Apple'])[2]")
    private WebElement Apple;

    @FindBy(xpath = "//*[text()='Iphone 14']")
    private WebElement Iphone14;

    @FindBy(xpath = "//input[@placeholder='Model Ara']")
    private WebElement modelAra;

    @FindBy(css = "input[placeholder='Renk Ara']")
    private WebElement renkAra;

    @FindBy(xpath = "//*[@data-background='FF0000']")
    private WebElement kirmizi;

    @FindBy(xpath = "(//span[@class='btnBasket'])[2]")
    private WebElement btnBasket;

    @FindBy(xpath = "(//*[text()='Kırmızı'])[2]")
    private WebElement kirmizi2;

    @FindBy(xpath = "(//*[text()='256 GB'])[2]")
    private WebElement gb256;

    @FindBy(xpath = "//*[text()='Sepete Ekle']")
    private WebElement sepeteEkle;

    @FindBy(css = "i[class='iconsBasketWhite']")
    private WebElement sepeteTikla;

    @FindBy(css = "//a[text()='Apple iPhone 14 256 GB (Apple Türkiye Garantili)']")
    private WebElement sepetiDogrula;

    @FindBy(xpath = "//*[text()='Giriş Yap']")
    private WebElement girisYap;

    @FindBy(xpath = "(//div[@class='inputField '])[1]//input")
    private WebElement email;

    @FindBy(xpath = "(//div[@class='inputField '])[2]//input")
    private WebElement password;

    @FindBy(xpath = "//label[@class='rememberMe']")
    private WebElement beniUnutma;

    @FindBy(xpath = "(//*[text()='Giriş Yap'])[2]")
    private WebElement girisYap2;





    WebElement myElement;

    public void findAndClick(String element) {
        switch (element) {
            case "Apple":myElement=Apple;break;
            case "kirmizi":myElement=kirmizi;break;
            case "btnBasket":myElement=btnBasket;break;
            case "kirmizi2":myElement=kirmizi2;break;
            case "gb256":myElement=gb256;break;
            case "sepeteEkle":myElement=sepeteEkle;break;
            case "sepeteTikla":myElement=sepeteTikla;break;
            case "girisYap":myElement=girisYap;break;
            case "beniUnutma":myElement=beniUnutma;break;
            case "girisYap2":myElement=girisYap2;break;


        }
        clickFunction(myElement);
    }


    public void findAndSend(String element,String value){
        switch (element){
            case "modelAra":myElement=modelAra;break;
            case "renkAra":myElement=renkAra;break;
            case "email":myElement=email;break;
            case "password":myElement=password;break;



        }
        sendKeysFunction(myElement,value);
    }

    public void verifyText(String element, String text){
        switch (element){
            case "sepetiDogrula":myElement=sepetiDogrula;break;




        }
        verifyContainsText(myElement,text);
    }

    public void hoverOver(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(Elektronik).build().perform();
    }
    public void TelAksesuarTıkla(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(TelefonAksesuarlari).click().build().perform();
    }
    public void modelTikla(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(Iphone14).click().build().perform();
    }
    public void kirmiziTikla(){
        Actions actions=new Actions(GWD.getDriver());
        actions.moveToElement(kirmizi).click().build().perform();
    }
    public void btnBasket() {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(btnBasket).click().build().perform();
    }
    public void GirisYap2() {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(girisYap2).click().build().perform();
    }



}
