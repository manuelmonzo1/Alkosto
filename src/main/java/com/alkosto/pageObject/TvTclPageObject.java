package com.alkosto.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class TvTclPageObject extends PageObject {

    private By txtTitulo = By.xpath("(//div[@class='new-container__header__title'])[1]");

    public By getTxtTitulo() {
        return txtTitulo;
    }

    private By btnCarrito = By.xpath("(//button[@id='addToCartButton'])[1]");

    public By getBtnCarrito() {
        return btnCarrito;
    }

    private By linkCarritoTvT = By.xpath("(//a[@href='/cart'])[3]");

    public By getLinkCarritoTvT() {
        return linkCarritoTvT;
    }

    private By validarCantidad = By.xpath("//select[@size='1']");

    public By getValidarCantidad() {
        return validarCantidad;
    }
}
