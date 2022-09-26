package _03_Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;


public class _01_A101_Pom extends Parent{
    public _01_A101_Pom() {
        PageFactory.initElements(GWD.getDriver(),this);
    }
    WebElement myElement;

    @FindBy(xpath = "//button[text()='Kabul Et']")
    private WebElement cookies;
    @FindBy(css = "[loading='lazy']")
    private WebElement a101;
    @FindBy(xpath = "//a[@title='GİYİM & AKSESUAR']")
    private WebElement giyimaksesuar;
    @FindBy(xpath = "//a[contains(@title,'Kadın İç Giyim')]//following::a[7]")
    private WebElement dizalticorap;
    @FindBy(xpath = "//h3[contains(text(),'Penti Kadın 50 Denye Pantolon Çorabı Siyah')]")
    private WebElement penticorap;
    @FindBy(xpath = "//*[text()='SİYAH']")
    private WebElement siyah;
    @FindBy(xpath = "//button//following::button[5]")
    private WebElement sepeteEkle;
    @FindBy(linkText = "Sepeti Görüntüle")
    private WebElement sepetiGoruntule;
    @FindBy(linkText = "Sepeti Onayla")
    private WebElement sepetiOnayla;
    @FindBy(partialLinkText = "ÜYE OLMADAN")
    private WebElement uyeOlmadan;
    @FindBy(name = "user_email")
    private WebElement userEmail;
    @FindBy(xpath = "//following::button[6]")
    private WebElement devamEt;
    @FindBy(css = "a[title='Yeni adres oluştur']")
    private WebElement newAddress;
    @FindBy(css = "input[placeholder='Ev adresim, iş adresim vb.']")
    private WebElement addressTitle;
    @FindBy(css = "input[name='first_name']")
    private WebElement name;
    @FindBy(css = "input[name='last_name")
    private WebElement lastName;
    @FindBy(css = "input[name='phone_number']")
    private WebElement phoneNumber;
    @FindBy(css = "select[name='city")
    private WebElement city;
    @FindBy(css = "select[name='township']")
    private WebElement township;
    @FindBy(css = "select[name='district']")
    private WebElement district;
    @FindBy(css = "textarea[name='line']")
    private WebElement textArea;
    @FindBy(xpath = "//div//button[contains(text(),'KAYDET')]")
    private WebElement save;
    @FindBy(xpath = "//input[@value='333']/..//div")
    private WebElement radio;
    @FindBy(xpath = "//button[contains(text(),'Kaydet ve Devam Et')]")
    private WebElement saveAndGo;
    @FindBy(xpath = "//div[contains(text(),'Kart ile ödeme')]")
    private WebElement assertKart;



    public void ClickPom(String strElement) {
        switch (strElement){
            case "cookies":myElement=cookies;break;
            case "a101":myElement=a101;break;
            case "sepetiGoruntule":myElement=sepetiGoruntule;break;
            case "newAddress":myElement=newAddress;break;
            case "dizalticorap":myElement=dizalticorap;break;
            case "saveAndGo":myElement=saveAndGo;break;
            case "penticorap":myElement=penticorap;break;
            case "sepeteEkle":myElement=sepeteEkle;break;
            case "sepetiOnayla":myElement=sepetiOnayla;break;
            case "uyeOlmadan":myElement=uyeOlmadan;break;
            case "devamEt":myElement=devamEt;break;
            case "save":myElement=save;break;
            case "radio":myElement=radio;break;


        }
        ClickParent(myElement);
    }
    public void MoveToElementPom(String strElement){
        switch (strElement){
            case "giyimaksesuar":myElement=giyimaksesuar;break;
        }
        MoveToElementParent(myElement);
    }
    public void MoveAndClickToElementPom(String  strElement){
        switch (strElement){
            case "dizalticorap":myElement=dizalticorap;break;
        }
        MoveAndClickToElementParent(myElement);
    }
    public void VerifyToElementPom(String strElement,String text){
        switch (strElement){
            case "siyah":myElement=siyah;break;
            case "assertKart":myElement=assertKart;break;
        }
        VerifyToElementParent(myElement,text);
    }
    public void SendKeysToElementPom(String strElement,String text){
        switch (strElement){
            case "userEmail":myElement=userEmail;break;
            case "addressTitle":myElement=addressTitle;break;
            case "name":myElement=name;break;
            case "lastName":myElement=lastName;break;
            case "phoneNumber":myElement=phoneNumber;break;
            case "textArea":myElement=textArea;break;
        }
        SendKeysParent(myElement, text);
    }
    public void selectToElementOnThePom(String strElement,String OptionValue,String propertyName,String childCount){
        switch (strElement){
            case "city":myElement=city;break;
            case "township":myElement=township;break;
            case "district":myElement=district;break;
        }
        int optionvalue=Integer.parseInt(OptionValue);
    selectToElementOnTheParent(myElement,optionvalue,propertyName,childCount);
    }

}
