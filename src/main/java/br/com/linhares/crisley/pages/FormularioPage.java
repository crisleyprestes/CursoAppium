package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class FormularioPage extends BasePage{

    public void clicarCheck(){
        clicar(By.className("android.widget.CheckBox"));
    }

    public void clicarHoraEMinuto(String hora, String minuto){
        clicar(MobileBy.AccessibilityId(""+hora+""));
        clicar(MobileBy.AccessibilityId(""+minuto+""));
    }

    public void clicarSeekBar(double posicao){
        int delta = 43;
        MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
        int y = seek.getLocation().y + (seek.getSize().height / 2);
        int x = (int) ((seek.getLocation().x + delta) + ((seek.getSize().width - 2 * delta) * posicao));
        tap(x, y);

    }

    public void clicarSwitch(){
        clicar(MobileBy.AccessibilityId("switch"));
    }

    public void escreverNome(String nome){
        escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public boolean isCheckMarcado(){
        return isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado(){
        return isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public String obterNome(){
        return obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public String obterValorCombo(){
        return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void salvar(){
        clicarPorTexto("SALVAR");
    }

    public void salvarDemorado(){
        clicarPorTexto("SALVAR DEMORADO");
    }

    public void selecionarCombo(String valor){
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String validarStatusCheckbox(){
        aguardarPresencaElemento(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
    }

    public String validarConsoleCadastrado(){
        aguardarPresencaElemento(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
    }

    public String validarNomeCadastrado(){
        aguardarPresencaElemento(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
    }

    public String validarSlider(){
        aguardarPresencaElemento(By.xpath("//android.widget.TextView[starts-with(@text,'Slider:')]"));
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Slider:')]"));
    }

    public String validarStatusSwitch(){
        aguardarPresencaElemento(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
    }
}
