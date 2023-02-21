package br.com.linhares.crisley.appium.core;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
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

    public void cliqueLongo(String nome){
        new TouchAction<>(getDriver())
                .longPress(PointOption.point
                        (getDriver().findElement(By.xpath("//*[@text='"+nome+"']")).getCenter()))
                .release()
                .perform();
    }

    public void entrarContextoWeb(){
        getDriver().context((String) getDriver().getContextHandles().toArray()[1]);
    }

    public void sairContextoWeb(){
        getDriver().context((String) getDriver().getContextHandles().toArray()[0]);
    }

    public void escrever(By by, String texto){
        getDriver().findElement(by).sendKeys(texto);
    }

    public void esperar (long tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

        new TouchAction<>(getDriver())
                .press(PointOption.point(new Point(x, start_y)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(new Point(x, end_y)))
                .release()
                .perform();
    }

    public void scrollDown(){
        scroll(0.9, 0.1);
    }

    public void scrollUp(){
        scroll(0.1, 0.9);
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

        new TouchAction<>(getDriver())
                .press(PointOption.point(new Point(start_x, y)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(new Point(end_x, y)))
                .release()
                .perform();
    }

    public void swipeElement (MobileElement element, double inicio, double fim){
        int y = element.getLocation().y + (element.getSize().height/2);
        int start_x = (int) (element.getSize().width * inicio);
        int end_x = (int) (element.getSize().width * fim);

        new TouchAction<>(getDriver())
                .press(PointOption.point(new Point(start_x, y)))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
                .moveTo(PointOption.point(end_x, y))
                .release()
                .perform();
    }

    public void swipeLeft(){
        swipe(0.1, 0.9);
    }

    public void swipeRight(){
        swipe(0.9, 0.1);
    }

    public void tap(int x, int y){
        new TouchAction<>(getDriver())
                .tap(PointOption.point(new Point(x,y)))
                .perform();
    }
}
