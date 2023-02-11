package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.AccordionPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class AccordionTeste extends BaseTest {

    private AccordionPage accordion = new AccordionPage();
    private MenuPage menu = new MenuPage();

    @Test
    public void deveInteragirComAccordion(){
        menu.acessarAccordion();
        accordion.clicarOpcaoUm();
        Assert.assertEquals("Esta é a descrição da opção 1", accordion.obterTextoOpcaoUm());
    }
}
