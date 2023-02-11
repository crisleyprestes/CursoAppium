package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.pages.AbasPage;
import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class AbasTeste extends BaseTest {

    private AbasPage abas = new AbasPage();
    private MenuPage menu = new MenuPage();

    @Test
    public void deveInteragirComAbas(){
        menu.acessarAbas();
        Assert.assertTrue(abas.isAbaUm());
        abas.acessarAbaDois();
        Assert.assertTrue(abas.isAbaDois());
    }
}
