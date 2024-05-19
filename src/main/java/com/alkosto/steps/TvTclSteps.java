package com.alkosto.steps;

import com.alkosto.pageObject.TvTclPageObject;
import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class TvTclSteps extends PageObject {

    @Page
    private TvTclPageObject tvTclPageObject;


    @Step("Validacion Producto")
    public void validarProduct(){
        Assert.verify(tvTclPageObject.getDriver().findElement(tvTclPageObject.getTxtTitulo()).isDisplayed(),"TV TCL 32 Pulgadas 81 cm 32S5400AF FHD LED Smart TV Android");

    }



}
