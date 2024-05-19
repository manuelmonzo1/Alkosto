package com.alkosto.Utils;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scroll extends PageObject {

    ///Ajuste

    public void scrollBy(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(arguments[0], arguments[1])", x, y);
    }

}
