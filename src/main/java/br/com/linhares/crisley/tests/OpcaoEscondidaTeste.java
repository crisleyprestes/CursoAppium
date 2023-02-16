package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class OpcaoEscondidaTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();

    @Test
    public void deveEncontrarOpcaoEscondida(){
        menu.scrollTela(0.9, 0.1);
        menu.clicarPorTexto("Opção bem escondida");
        Assert.assertEquals("Você achou essa opção", menu.obterMensagemAlerta());
        menu.clicarPorTexto("OK");
    }
}
