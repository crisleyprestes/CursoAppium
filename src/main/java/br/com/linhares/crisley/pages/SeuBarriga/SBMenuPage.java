package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;

public class SBMenuPage extends BasePage {

    public void acessarContas(){
        clicarPorTexto("CONTAS");
    }

    public void acessarHome(){
        clicarPorTexto("HOME");
    }

    public void acessarMovimentacoes(){
        clicarPorTexto("MOV...");
    }

    public void acessarResumo(){
        clicarPorTexto("RESUMO");
    }

}
