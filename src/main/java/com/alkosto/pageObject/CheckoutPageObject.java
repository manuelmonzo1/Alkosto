package com.alkosto.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CheckoutPageObject extends PageObject {


    private By txtCorreo = By.xpath("(//div/a[@href='/checkout/multi/delivery-method/choose']/div)[2]");

    public By getTxtCorreo() {
        return txtCorreo;
    }

    private By inputCorreo = By.xpath("//input[@id='j_username']");

    public By getInputCorreo() {
        return inputCorreo;
    }

    private By btnContinuar = By.xpath("(//button[@type='submit'])[1]");

    public By getBtnContinuar() {
        return btnContinuar;
    }
}
