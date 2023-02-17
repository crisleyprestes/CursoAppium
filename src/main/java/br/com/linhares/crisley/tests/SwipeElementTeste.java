package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.MenuPage;
import br.com.linhares.crisley.pages.SwipeListPage;
import org.junit.Assert;
import org.junit.Test;

public class SwipeElementTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private SwipeListPage swipe = new SwipeListPage();

    @Test
    public void deveResolverNossoDesafio(){
        menu.acessarSwipeList();
        swipe.swipeElementRight("Opção 1");
        swipe.clicarBotaoMais();
        Assert.assertTrue(swipe.existeElementoPorTexto("Opção 1 (+)"));
        swipe.swipeElementRight("Opção 4");
        swipe.clicarPorTexto("(-)");
        Assert.assertTrue(swipe.existeElementoPorTexto("Opção 4 (-)"));
        swipe.swipeElementLeft("Opção 5 (-)");
        Assert.assertTrue(swipe.existeElementoPorTexto("Opção 5"));
    }
}
