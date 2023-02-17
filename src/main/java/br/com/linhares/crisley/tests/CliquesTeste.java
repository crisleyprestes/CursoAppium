package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.CliquesPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CliquesTeste extends BaseTeste {

    private CliquesPage cliques = new CliquesPage();
    private MenuPage menu = new MenuPage();

    @Before
    public void setup(){
        menu.acessarCliques();
    }

    @Test
    public void deveRealizarCliqueLongo(){
        cliques.cliqueLongo("Clique Longo");
        Assert.assertEquals("Clique Longo", cliques.obterTextoCampo());
    }

    @Test
    public void deveRealizarCliqueDuplo(){
        cliques.clicarPorTexto("Clique duplo");
        cliques.clicarPorTexto("Clique duplo");
        Assert.assertEquals("Duplo Clique", cliques.obterTextoCampo());
    }
}
