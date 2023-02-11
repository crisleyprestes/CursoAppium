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
        //acessar menu splash
        menu.acessarSplash();

        //verificar que o splash está sendo exibido
        splash.isTelaSplashVisivel();

        //aguardar a saída do splash
        splash.aguardarSplashSumir();

        //verificar que o formulário está aparecendo
        Assert.assertTrue(menu.existeElementoPorTexto("Formulário"));
    }
}
