package com.alkosto.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class EmailVerificationPageObject extends PageObject {


    @FindBy(xpath = "//div/input[@id='js-login-email']")
    private WebElement digitarCorreo;

    public void correo() {
        digitarCorreo.sendKeys("manuel.1286@hotmail.com");
    }

    @FindBy(xpath= "//button[@id='js-login-continue']")
    private WebElement btnContinuar;

    public void clickContinuar(){
        btnContinuar.click();
    }
}
