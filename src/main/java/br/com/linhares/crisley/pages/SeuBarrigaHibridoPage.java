package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SeuBarrigaHibridoPage extends BasePage {


    public void entrar(){
        clicar(By.xpath("//*[@type='submit']"));
    }

    public String getMensagemSucesso(){
        aguardarPresencaElemento(By.xpath("//*[@role='alert']"));
        return obterTexto(By.xpath("//*[@role='alert']"));
    }

    public void setEmail(String email){
        aguardarPresencaElemento(By.id("email"));
        escrever(By.id("email"), email);
    }

    public void setSenha(String senha){
        aguardarPresencaElemento(By.id("senha"));
        escrever(By.id("senha"), senha);
    }
}
