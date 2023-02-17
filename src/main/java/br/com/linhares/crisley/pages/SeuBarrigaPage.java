package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SeuBarrigaPage extends BasePage {

    public void login(String email, String senha){
        escrever(By.xpath("//*[@text='Nome']"), email);
        escrever(By.xpath("//*[@text='Senha']"), senha);
        clicarPorTexto("ENTRAR");
        aguardarPresencaElemento(By.xpath("//*[@text='HOME']"));
    }
}
