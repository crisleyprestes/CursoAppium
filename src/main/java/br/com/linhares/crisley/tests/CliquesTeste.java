package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.CliquesPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class CliquesTeste extends BaseTest {

    private CliquesPage cliques = new CliquesPage();
    private MenuPage menu = new MenuPage();

    @Test
    public void deveRealizarCliqueLongo(){
        menu.acessarCliques();
        cliques.cliqueLongo();
        Assert.assertEquals("Clique Longo", cliques.obterTextoCampo());
    }
}
