package com.alkosto.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OptionsTvPageObject extends PageObject {

    @FindBy(xpath = "//a[@href='/tv-video/c/BI_TVVI_ALKOS']")
    private WebElement limkTv;

    public WebElement getLimkTv() {
        return limkTv;
    }

    private By linkPulgadas =  By.xpath("//a[@href='/tv-video/televisores/c/BI_120_ALKOS?q=%3Arelevance%3Atamano-pantalla-tv-pulgadas%3Amenos+de+32%27+pulgadas#']");

    public By getLinkPulgadas() {
        return linkPulgadas;
    }


}
