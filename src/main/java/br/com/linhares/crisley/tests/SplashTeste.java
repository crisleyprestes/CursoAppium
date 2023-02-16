package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.MenuPage;
import br.com.linhares.crisley.pages.SplashPage;
import org.junit.Assert;
import org.junit.Test;

public class SplashTeste extends BaseTeste {

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
