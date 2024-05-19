package com.alkosto.steps;

import com.alkosto.pageObject.CheckoutPageObject;
import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CheckoutSteps extends PageObject {

    @Page
    private CheckoutPageObject checkoutPageObject;

    @Step("Validar texto Escribe tu correo para iniciar la compra")
    public void correo(){
        Assert.verify(getDriver().findElement(checkoutPageObject.getTxtCorreo()).isDisplayed(),"Escribe tu correo para iniciar la compra");

    }

    @Step("Digite Correo")
    public void digiteCorreo(){
        checkoutPageObject.getDriver().findElement(checkoutPageObject.getInputCorreo()).clear();
        checkoutPageObject.getDriver().findElement(checkoutPageObject.getInputCorreo()).sendKeys("manuel.1286@hotmail.com");
    }

    @Step("Click boton Continuar")
    public void btnContinuar(){
        checkoutPageObject.getDriver().findElement(checkoutPageObject.getBtnContinuar()).click();

    }

}
