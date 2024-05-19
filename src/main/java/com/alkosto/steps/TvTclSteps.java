package com.alkosto.steps;

import com.alkosto.Utils.Scroll;
import com.alkosto.pageObject.TvTclPageObject;
import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class TvTclSteps extends PageObject {

    @Page
    private TvTclPageObject tvTclPageObject;

    @Page
    private Scroll scroll;


    @Step("Validacion Producto")
    public void validarProduct(){
        scroll.scrollBy(0,500);
        Assert.verify(tvTclPageObject.getDriver().findElement(tvTclPageObject.getTxtTitulo()).isDisplayed(),"TV TCL 32 Pulgadas 81 cm 32S5400AF FHD LED Smart TV Android");

    }

    @Step("Seleccionar Carrito")
    public void seleccionarCarrito(){
        tvTclPageObject.getDriver().findElement(tvTclPageObject.getBtnCarrito()).click();
    }

    @Step("ir al Carrito y pagar")
    public void carritoPagar(){
        tvTclPageObject.getDriver().findElement(tvTclPageObject.getLinkCarritoTvT()).click();
    }

    @Step("Validar Cantidad")
    public void cantidad(){
        Assert.verify(tvTclPageObject.getDriver().findElement(tvTclPageObject.getValidarCantidad()).isDisplayed(),"1");
    }
}
