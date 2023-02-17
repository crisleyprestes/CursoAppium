package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class MenuPage extends BasePage {

    public void acessarAbas(){
        clicarPorTexto("Abas");
    }

    public void acessarAccordion(){
        clicarPorTexto("Accordion");
    }

    public void acessarAlertas(){
        clicarPorTexto("Alertas");
    }

    public void acessarCliques(){
        clicarPorTexto("Cliques");
    }

    public void acessarFormulario(){
        clicarPorTexto("Formulário");
    }

    public void acessarSplash(){
        clicarPorTexto("Splash");
    }

    public void acessarSwipe(){
        aguardarPresencaElemento(By.xpath("//*[@text='Formulário']"));
        scrollDown();
        clicarPorTexto("Swipe");
    }

    public void acessarSwipeList(){
        aguardarPresencaElemento(By.xpath("//*[@text='Formulário']"));
        scrollDown();
        clicarPorTexto("Swipe List");
    }

    public void scrollTela(){
        aguardarPresencaElemento(By.xpath("//*[@text='Formulário']"));
        scrollDown();
    }
}
