package com.alkosto.Utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Hover extends PageObject{


      public void hoverSobreElemento(WebElement elementoParaDesplazar) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(elementoParaDesplazar).build().perform();
    }

}
