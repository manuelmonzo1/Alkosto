package com.alkosto.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class CartPageObject extends PageObject {

    private By btnPagar = By.xpath("//div/button[@href='/cart/checkout']");

    public By getBtnPagar() {
        return btnPagar;
    }


}
