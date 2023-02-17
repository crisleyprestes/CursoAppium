package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SBMovimentacoesPage extends BasePage {

    public void salvar(){
        clicarPorTexto("SALVAR");
    }

    public void setConta(String nomeConta){
        selecionarCombo(By.xpath("//*[@text='Selecione uma conta...']"), nomeConta);
    }

    public void setDescricao(String descricao){
        escrever(By.xpath("//*[@text='Descrição']"), descricao);
    }

    public void setInteressado(String interessado){
        escrever(By.xpath("//*[@text='Interessado']"), interessado);
    }

    public void setValor(String valor){
        escrever(By.xpath("//*[@text='Valor']"), valor);
    }
}
