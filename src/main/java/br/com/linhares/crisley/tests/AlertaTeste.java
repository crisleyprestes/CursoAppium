package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.AlertaPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlertaTeste extends BaseTest {

    private AlertaPage alerta = new AlertaPage();
    private MenuPage menu = new MenuPage();

    @Before
    public void setup(){
        menu.acessarAlertas();
    }

    @Test
    public void deveConfirmarAlerta(){
        alerta.clicarAlertaConfirm();
        Assert.assertEquals("Info", alerta.obterTituloAlerta());
        Assert.assertEquals("Confirma a operação?", alerta.obterMensagemAlerta());
        alerta.confirmar();
        Assert.assertEquals("Info", alerta.obterTituloAlerta());
        Assert.assertEquals("Confirmado", alerta.obterMensagemAlerta());
        alerta.sair();
    }

    @Test
    public void deveClicarForaAlerta(){
        alerta.clicarAlertaSimples();
        alerta.clicarForaCaixa();
        Assert.assertFalse(alerta.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
    }
}
