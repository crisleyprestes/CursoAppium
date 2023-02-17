package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.MenuPage;
import br.com.linhares.crisley.pages.SwipePage;
import org.junit.Assert;
import org.junit.Test;

public class SwipeTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private SwipePage swipe = new SwipePage();

    @Test
    public void deveRealizarSwipe(){
        menu.acessarSwipe();
        Assert.assertTrue(swipe.existeElementoPorTexto("Mova a tela para"));
        Assert.assertTrue(swipe.existeElementoPorTexto("a esquerda"));
        swipe.swipeRight();
        Assert.assertTrue(swipe.existeElementoPorTexto("E veja se"));
        Assert.assertTrue(swipe.existeElementoPorTexto("você consegue"));
        swipe.clicarPorTexto("›");
        Assert.assertTrue(swipe.existeElementoPorTexto("Chegar até o fim!"));
        swipe.swipeLeft();
        swipe.clicarPorTexto("‹");
        Assert.assertTrue(swipe.existeElementoPorTexto("Mova a tela para"));
        Assert.assertTrue(swipe.existeElementoPorTexto("a esquerda"));
    }
}
