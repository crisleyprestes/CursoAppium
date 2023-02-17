package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.DragAndDropPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Test;

public class DragAndDropTeste extends BaseTeste {

    private DragAndDropPage dragAndDrop = new DragAndDropPage();
    private MenuPage menu = new MenuPage();
    private String[] estadoInicial = new String[]{"Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,",
            "e arraste para", "qualquer local desejado."};
    private String[] estadoIntermediario = new String[]{"é uma lista", "Drag em Drop!", "Faça um clique longo,",
            "e arraste para", "Esta", "qualquer local desejado."};
    private String[] estadoFinal = new String[]{"Faça um clique longo,", "é uma lista", "Drag em Drop!",
            "e arraste para", "Esta", "qualquer local desejado."};

    @Test
    public void deveEfetuarDragAndDrop(){
        menu.acessarDragAndDrop();
        Assert.assertArrayEquals(estadoInicial, dragAndDrop.obterLista());
        dragAndDrop.arrastar("Esta", "e arraste para");
        Assert.assertArrayEquals(estadoIntermediario, dragAndDrop.obterLista());
        dragAndDrop.arrastar("Faça um clique longo,", "é uma lista");
        Assert.assertArrayEquals(estadoFinal, dragAndDrop.obterLista());
    }
}
