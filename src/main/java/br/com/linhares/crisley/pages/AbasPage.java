package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;

public class AbasPage extends BasePage {

    public void acessarAbaDois(){
        clicarPorTexto("Aba 2");
    }

    public boolean isAbaDois(){
        return existeElementoPorTexto("Este é o conteúdo da Aba 2");
    }

    public boolean isAbaUm(){
        return existeElementoPorTexto("Este é o conteúdo da Aba 1");
    }
}
