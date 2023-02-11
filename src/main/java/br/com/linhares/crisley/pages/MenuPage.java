package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;

public class MenuPage extends BasePage {

    public void acessarAbas(){
        clicarPorTexto("Abas");
    }

    public void acessarAlertas(){
        clicarPorTexto("Alertas");
    }

    public void acessarFormulario(){
        clicarPorTexto("Formulário");
    }

    public void acessarSplash(){
        clicarPorTexto("Splash");
    }
}
