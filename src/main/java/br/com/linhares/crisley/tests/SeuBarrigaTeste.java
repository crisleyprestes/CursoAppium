package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.MenuPage;
import br.com.linhares.crisley.pages.SeuBarrigaPage;
import org.junit.Before;
import org.junit.Test;

public class SeuBarrigaTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private SeuBarrigaPage seuBarriga = new SeuBarrigaPage();

    @Before
    public void setUp(){
        menu.acessarSeuBarrigaNativo();
        seuBarriga.login("crisley@email.com", "123456");
    }

    @Test
    public void test(){

    }
}
