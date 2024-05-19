package com.alkosto.pageObject;



import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class OptionsPageObject extends PageObject {

    private final By txtmesaje = By.xpath("(//span[@class='foundTitle'])[1]/b");
    public By getTxtmesaje() {
        return txtmesaje;
    }

}
