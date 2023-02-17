package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class SwipeListPage extends BasePage {

    public void swipeElementLeft(String opcao){
        swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
    }

    public void swipeElementRight(String opcao){
        swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
    }

    public void clicarBotaoMais(){
        MobileElement botao = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
        new TouchAction(getDriver())
                .tap(botao, -50, 0)
                .perform();
    }
}