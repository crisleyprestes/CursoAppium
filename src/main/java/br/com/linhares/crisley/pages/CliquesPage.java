package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class CliquesPage extends BasePage {

    public String obterTextoCampo(){
        return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }
}
