package com.alkosto.steps;

import com.alkosto.pageObject.SmarPageObject;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SmarSteps extends PageObject {

    @Page
    private SmarPageObject smarPageObject;

    @Step("Selecionar TV")
    public void selecTV(){
        smarPageObject.getDriver().findElement(smarPageObject.getLinkSmat()).click();
    }



}
