package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class SBResumoPage extends BasePage {

    public void excluirMovimentacao(String descricao){
        clicarPorTexto("ATUALIZAR");
        swipeElement(getDriver().findElement
                (By.xpath("//*[@text='"+descricao+"']/..")), 0.9, 0.1);
        clicarPorTexto("Del");
    }

}
