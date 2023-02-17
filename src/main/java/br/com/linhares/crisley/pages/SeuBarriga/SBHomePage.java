package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SBHomePage extends BasePage {

    public void resetar(){
        clicarPorTexto("RESET");
        aguardarPresencaElemento(By.xpath("//*[@text='Dados resetados com sucesso!']"));
    }
}
