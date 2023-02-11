package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.AlertaPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class AlertaTeste extends BaseTest {

    private AlertaPage alerta = new AlertaPage();
    private MenuPage menu = new MenuPage();

    @Test
    public void deveConfirmarAlerta(){
        menu.acessarAlertas();
        alerta.clicarAlertaConfirm();
        Assert.assertEquals("Info", alerta.obterTituloAlerta());
        Assert.assertEquals("Confirma a operação?", alerta.obterMensagemAlerta());
        alerta.confirmar();
        Assert.assertEquals("Info", alerta.obterTituloAlerta());
        Assert.assertEquals("Confirmado", alerta.obterMensagemAlerta());
        alerta.sair();
    }
}
