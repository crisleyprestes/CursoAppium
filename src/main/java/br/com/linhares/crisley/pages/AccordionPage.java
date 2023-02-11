package br.com.linhares.crisley.pages;

import br.com.linhares.crisley.appium.core.BasePage;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static br.com.linhares.crisley.appium.core.DriverFactory.getDriver;

public class AccordionPage extends BasePage {

    public void clicarOpcaoUm(){
        clicarPorTexto("Opção 1");
    }

    public String obterTextoOpcaoUm(){
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return obterTexto(By.xpath(
                "//*[@text='Opção 1']/../..//following-sibling::android.view.ViewGroup//" +
                        "android.widget.TextView"));
    }
}
