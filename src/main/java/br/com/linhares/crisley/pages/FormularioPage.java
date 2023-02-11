package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormularioPage extends BasePage{

    public void clicarCheck(){
        clicar(By.className("android.widget.CheckBox"));
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

    public void selecionarCombo(String valor){
        selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String validarStatusCheckbox(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
    }

    public String validarConsoleCadastrado(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
    }

    public String validarNomeCadastrado(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
    }

    public String validarStatusSwitch(){
        return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
    }
}
