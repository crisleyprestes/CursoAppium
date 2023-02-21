package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;

public class SBMenuPage extends BasePage {

    public void acessarContas(){
        clicarPorTexto("Contas");
    }

    public void acessarHome(){
        clicarPorTexto("Home");
    }

    public void acessarMovimentacoes(){
        clicarPorTexto("Mov...");
    }

    public void acessarResumo(){
        clicarPorTexto("Resumo");
    }

}
