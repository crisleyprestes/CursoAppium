package br.com.linhares.crisley.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class BasePage {

    public boolean aguardarPresencaElemento(By by){
        new WebDriverWait(getDriver(), SleepTime.DEZ_SEG).until(ExpectedConditions.presenceOfElementLocated(by));
        return true;
    }

    public void clicar(By by){
        getDriver().findElement(by).click();
    }

    public void clicarPorTexto(String texto){
        clicar(By.xpath("//*[@text='"+texto+"']"));
    }

    public void escrever(By by, String texto){
        getDriver().findElement(by).sendKeys(texto);
    }

    public boolean existeElementoPorTexto(String texto){
        List<MobileElement> elementos = getDriver().findElements(By.xpath("//*[@text='"+texto+"']"));
        return elementos.size() > 0;
    }

    public boolean isCheckMarcado(By by){
        return getDriver().findElement(by).getAttribute("checked").equals("true");
    }

    public String obterMensagemAlerta(){
        return obterTexto(By.id("android:id/message"));
    }

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public String obterTituloAlerta(){
        return obterTexto(By.id("android:id/alertTitle"));
    }

    public void scroll(double inicio, double fim){
        Dimension size = getDriver().manage().window().getSize();

        int x = size.width/2;
        int start_y = (int) (size.height * inicio);
        int end_y = (int) (size.height * fim);

        new TouchAction(getDriver())
                .press(x, start_y)
                .waitAction(Duration.ofMillis(500))
                .moveTo(x, end_y)
                .release()
                .perform();
    }

    public void selecionarCombo(By by, String valor){
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }

    public void swipe (double inicio, double fim){
        Dimension size = getDriver().manage().window().getSize();

        int y = size.height/2;
        int start_x = (int) (size.width * inicio);
        int end_x = (int) (size.width * fim);

        new TouchAction(getDriver())
                .press(start_x, y)
                .waitAction(Duration.ofMillis(500))
                .moveTo(end_x, y)
                .release()
                .perform();
    }

    public void tap(int x, int y){
        new TouchAction(getDriver()).tap(x, y).perform();
    }
}
