package com.alkosto.steps;

import com.alkosto.Utils.Hover;
import com.alkosto.Utils.Scroll;
import com.alkosto.pageObject.OptionsTvPageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;

public class OptionsTvSteps extends PageObject {

    @Page
    private OptionsTvPageObject optionsTvPageObject;

    @Page
    private Hover hover;

    @Page
    private Scroll scrollBy;

    @Step("El usuario abre la url")
    public void openUrl(){
        optionsTvPageObject.openUrl("https://www.alkosto.com/");
    }

    @Step("Seleccion tv")
    public void seleccionarTV(){
        hover.hoverSobreElemento(optionsTvPageObject.getLimkTv());
    }

    @Step("Click TV")
    public void pulgadasTV(){
        optionsTvPageObject.getDriver().findElement(optionsTvPageObject.getLinkPulgadas()).click();

    }

    @Step("Scroll")
    public void scrollBy(){
        scrollBy.scrollBy();
    }

}
