package br.com.linhares.crisley.pages.SeuBarriga;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SBHomePage extends BasePage {

    public void resetar(){
        clicarPorTexto("RESET");
        aguardarPresencaElemento(By.xpath("//*[@text='Dados resetados com sucesso!']"));
    }

    public void atualizarTela(){
        esperar(2000);
        scroll(0.2, 0.9);
    }

    public String verificarSaldo(String conta){
        return obterTexto(By.xpath
                ("//*[@text='"+conta+"']/following-sibling::android.widget.TextView"));
    }
}
