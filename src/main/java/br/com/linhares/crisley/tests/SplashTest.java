package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.MenuPage;
import br.com.linhares.crisley.pages.SplashPage;
import org.junit.Assert;
import org.junit.Test;

public class SplashTest extends BaseTest {

    private MenuPage menu = new MenuPage();
    private SplashPage splash = new SplashPage();

    @Test
    public void deveAguardarSplashSumir(){
        menu.acessarSplash();
        splash.isTelaSplashVisivel();
        splash.aguardarSplashSumir();
        Assert.assertTrue(menu.existeElementoPorTexto("Formulário"));
    }
}
