package br.com.linhares.crisley.appium.core;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    public String obterTexto(By by){
        return getDriver().findElement(by).getText();
    }

    public void selecionarCombo(By by, String valor){
        getDriver().findElement(by).click();
        clicarPorTexto(valor);
    }
}
