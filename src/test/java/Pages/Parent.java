package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {
    public void sendKeysFunction(WebElement element,String value){
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void clickFunction(WebElement element){
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void waitUntilVisible(WebElement element){
        WebDriverWait wait =new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitUntilClickable(WebElement element){
        WebDriverWait wait =new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element); //  -> (true)
        GWD.getDriver().switchTo().window(GWD.getDriver().getWindowHandle());
    }

    public void verifyContainsText(WebElement element,String text){
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().contains(text.toLowerCase()));
    }

    public void baskeyVerify(){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Ürün sepetinize eklendi']")));
    }

    public void hesabimVerify(){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(),Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Hesabım']")));
    }





    //------------------------SCROLLER-----------------------//
   // JavascriptExecutor js= (JavascriptExecutor)driver;
   // js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); --> Sayfayı en aşağıya indirir.

    // JavascriptExecutor js= (JavascriptExecutor)driver;
    // js.executeScript("window.scrollTo(document.body.scrollHeight, 0)"); --> Sayfayı en yukarı cıkarır.

}

