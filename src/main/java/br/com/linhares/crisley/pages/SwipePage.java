package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

public class SwipePage extends BasePage {

    public String obterTextoEsquerda(){
        return obterTexto(By.xpath("(//android.widget.TextView)[1]"));
    }
}
