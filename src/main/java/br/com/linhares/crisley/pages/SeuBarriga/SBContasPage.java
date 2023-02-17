package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SBContasPage extends BasePage {

    public void excluir(){
        clicarPorTexto("EXCLUIR");
    }

    public void selecionarConta(String nomeConta){
        cliqueLongo(nomeConta);
    }

    public void setConta(String nomeConta){
        escrever(By.xpath("//*[@text='Conta']"), nomeConta);
    }

    public void salvar(){
        clicarPorTexto("SALVAR");
    }
}
