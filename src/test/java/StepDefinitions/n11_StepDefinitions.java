package StepDefinitions;

import Pages.DialogContent;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class n11_StepDefinitions {
    DialogContent dc=new DialogContent();
    Parent parent=new Parent();

    @Given("Websitesine git")
    public void websitesineGit() {
        GWD.getDriver().get("https://www.n11.com/");
        GWD.getDriver().manage().window().maximize();
    }

    @Given("Hesabına giriş yap")
    public void hesabınaGirişYap() {
        dc.findAndClick("girisYap");
        dc.findAndSend("email","ispanya92@outlook.com");
        dc.findAndSend("password","husnu303522");
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
        dc.findAndClick("beniUnutma");
        dc.findAndClick("girisYap2");
        parent.hesabimVerify();
    }

    @When("Elektronik üzerine mause yi götür")
    public void elektronikÜzerineMauseYiGötür() {
        GWD.Bekle();
        dc.hoverOver();
    }

    @When("Telefon Aksesuarları bölümüne tıkla")
    public void telefonAksesuarlarıBölümüneTıkla() {
        dc.TelAksesuarTıkla();
    }

    @When("Apple seç")
    public void appleSeç() {
        dc.findAndClick("Apple");

    }

    @When("Model seç")
    public void modelSeç() {
        dc.findAndSend("modelAra","Iphone 14");
        dc.modelTikla();
    }


    @When("Renk Kırmızı seç")
    public void renkKırmızıSeç() {
        dc.findAndSend("renkAra","Kırmızı");
        dc.kirmiziTikla();
    }

    @When("Çıkan ürünlerden ilkine tıkla")
    public void çıkanÜrünlerdenIlkineTıkla() {
        dc.btnBasket();
        dc.findAndClick("kirmizi2");
    }

    @When("SepeteEkleye tıkla")
    public void sepeteekleyeTıkla() {
        dc.findAndClick("gb256");
        dc.findAndClick("sepeteEkle");
        parent.baskeyVerify();
    }

    @When("Sepetime Tıkla")
    public void sepetimeTıkla() {
        dc.findAndClick("sepeteTikla");
    }

    @Then("Ürünün geldiğini doğrulayın")
    public void ürününGeldiğiniDoğrulayın() {
        dc.verifyText("sepetiDogrula","Apple iPhone 14 256 GB (Apple Türkiye Garantili)");

    }



}
