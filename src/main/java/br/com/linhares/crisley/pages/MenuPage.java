package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.DSL;

public class MenuPage {

    private DSL dsl = new DSL();

    public void acessarFormulario(){
        dsl.clicarPorTexto("Formulário");
    }
}
