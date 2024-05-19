package com.alkosto.steps;

import com.alkosto.Utils.Hover;
import com.alkosto.pageObject.HomePageObject;
import com.alkosto.pageObject.OptionsPageObject;
import jxl.common.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.WebElement;

public class OptionsSteps extends PageObject {

    @Page
    private OptionsPageObject optionsPage;

    @Page
    private Hover hover;

    @Step("Validacion")
    public void optionsms(){
        Assert.verify(optionsPage.getDriver().findElement(optionsPage.getTxtmesaje()).isDisplayed(),"¡Listo, encontramos tu cuenta!");
    }

}
