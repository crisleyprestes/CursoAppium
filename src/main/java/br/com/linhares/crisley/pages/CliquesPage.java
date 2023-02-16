package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class CliquesPage extends BasePage {

    public void cliqueLongo(){
        new TouchAction(getDriver()).longPress(getDriver().findElement(
                By.xpath("//*[@text='Clique Longo']"))).perform();
    }

    public String obterTextoCampo(){
        return getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
    }
}
