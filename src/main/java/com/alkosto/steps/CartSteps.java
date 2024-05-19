package com.alkosto.steps;

import com.alkosto.Utils.Hover;
import com.alkosto.Utils.Scroll;
import com.alkosto.pageObject.CartPageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CartSteps extends PageObject {

    @Page
    private CartPageObject cartPageObject;

    @Page
    private Scroll scroll;

    @Step("Ir a Pagar")
   public void pagar(){
        scroll.scrollBy(0,20);
        cartPageObject.getDriver().findElement(cartPageObject.getBtnPagar()).click();

    }





}
