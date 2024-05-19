package com.alkosto.pageObject;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.openqa.selenium.By.xpath;

public class HomePageObject extends PageObject {

    @FindBy(xpath = "(//a[@href='/my-account'])[1]")
    private WebElement miCuenta;

    public WebElement getMiCuenta() {
        return miCuenta;
    }

    @FindBy(xpath = "(//a[@href='/login']/i)[1]")
    private WebElement botonInicioSesion;
    public void hacerClicEnBotonInicioSesion() {
        botonInicioSesion.click();
    }


}
