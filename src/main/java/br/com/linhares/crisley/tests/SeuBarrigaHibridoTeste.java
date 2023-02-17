package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.MenuPage;
import br.com.linhares.crisley.pages.SeuBarrigaHibridoPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class SeuBarrigaHibridoTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private SeuBarrigaHibridoPage seuBarriga = new SeuBarrigaHibridoPage();

    @Test
    public void deveFazerLogin(){
        menu.acessarSeuBarrigaHibrido();
        seuBarriga.setEmail("crisley@email.com");
        seuBarriga.setSenha("123456");
        seuBarriga.entrar();
        Assert.assertEquals("Bem vindo, Crisley!", seuBarriga.getMensagemSucesso());
    }

    @After
    public void tearDown(){
        seuBarriga.sairContextoWeb();
    }
}
