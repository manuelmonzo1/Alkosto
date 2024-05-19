package com.alkosto.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class SmarPageObject extends PageObject {

    private By linkSmat = By.xpath("//h3[@data-id=\"6973230611343\"]");

    public By getLinkSmat() {
        return linkSmat;
    }



}
