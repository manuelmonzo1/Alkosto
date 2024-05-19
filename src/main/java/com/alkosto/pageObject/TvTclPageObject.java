package com.alkosto.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class TvTclPageObject extends PageObject {

    private By txtTitulo = By.xpath("(//div[@class=\"new-container__header__title\"])[1]");

    public By getTxtTitulo() {
        return txtTitulo;
    }


}
