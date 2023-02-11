package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.DSL;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormularioPage {

    private DSL dsl = new DSL();

    public void clicarCheck(){
        dsl.clicar(By.className("android.widget.CheckBox"));
    }

    public void clicarSwitch(){
        dsl.clicar(MobileBy.AccessibilityId("switch"));
    }

    public void escreverNome(String nome){
        dsl.escrever(MobileBy.AccessibilityId("nome"), nome);
    }

    public boolean isCheckMarcado(){
        return dsl.isCheckMarcado(By.className("android.widget.CheckBox"));
    }

    public boolean isSwitchMarcado(){
        return dsl.isCheckMarcado(MobileBy.AccessibilityId("switch"));
    }

    public String obterNome(){
        return dsl.obterTexto(MobileBy.AccessibilityId("nome"));
    }

    public String obterValorCombo(){
        return dsl.obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
    }

    public void salvar(){
        dsl.clicarPorTexto("SALVAR");
    }

    public void selecionarCombo(String valor){
        dsl.selecionarCombo(MobileBy.AccessibilityId("console"), valor);
    }

    public String validarStatusCheckbox(){
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
    }

    public String validarConsoleCadastrado(){
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
    }

    public String validarNomeCadastrado(){
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
    }

    public String validarStatusSwitch(){
        return dsl.obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
    }
}
