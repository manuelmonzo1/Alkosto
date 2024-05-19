package com.alkosto.steps;

import com.alkosto.pageObject.EmailVerificationPageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class EmailVerificationSteps extends PageObject {

    @Page
    private EmailVerificationPageObject emailVerification;

    @Step("ingresar correo")
    public void digitarCorreo(){
        emailVerification.correo();
    }

    @Step("click continuar")
    public void clickContinuar(){
        emailVerification.clickContinuar();
    }

}
