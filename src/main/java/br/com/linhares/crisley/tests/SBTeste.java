package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.*;
import br.com.linhares.crisley.pages.SeuBarriga.SBContasPage;
import br.com.linhares.crisley.pages.SeuBarriga.SBHomePage;
import br.com.linhares.crisley.pages.SeuBarriga.SBLoginPage;
import br.com.linhares.crisley.pages.SeuBarriga.SBMenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SBTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private SBContasPage contas = new SBContasPage();
    private SBHomePage home = new SBHomePage();
    private SBLoginPage login = new SBLoginPage();
    private SBMenuPage sbMenu = new SBMenuPage();

    @Before
    public void setUp(){
        menu.acessarSeuBarrigaNativo();
        login.login("crisley@email.com", "123456");
        home.resetar();
    }

    @Test
    public void deveInserirContaComSucesso(){
        sbMenu.acessarContas();
        contas.setConta("Conta de Teste");
        contas.salvar();
        Assert.assertTrue(contas.existeElementoPorTexto("Conta adicionada com sucesso"));
        Assert.assertTrue(contas.existeElementoPorTexto("Conta de Teste"));
    }
}
