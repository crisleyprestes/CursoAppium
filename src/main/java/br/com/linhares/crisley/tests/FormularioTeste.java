package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.appium.core.DriverFactory;
import br.com.linhares.crisley.pages.FormularioPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class FormularioTeste extends BaseTest{

    private FormularioPage formulario = new FormularioPage();
    private MenuPage menu = new MenuPage();

    @Before
    public void inicializarAppium(){
        menu.acessarFormulario();
    }

    @Test
    public void devePreencherCampoTexto(){
        formulario.escreverNome("Crisley");
        Assert.assertEquals("Crisley", formulario.obterNome());
    }

    @Test
    public void deveInteragirComCombo(){
        formulario.selecionarCombo("Nintendo Switch");
        Assert.assertEquals("Nintendo Switch", formulario.obterValorCombo());
    }

    @Test
    public void deveInteragirComSwitchCheckbox(){
        Assert.assertFalse(formulario.isCheckMarcado());
        Assert.assertTrue(formulario.isSwitchMarcado());
        formulario.clicarCheck();
        formulario.clicarSwitch();
        Assert.assertTrue(formulario.isCheckMarcado());
        Assert.assertFalse(formulario.isSwitchMarcado());
    }

    @Test
    public void deveRealizarCadastro(){
        formulario.escreverNome("Crisley");
        formulario.clicarCheck();
        formulario.clicarSwitch();
        formulario.selecionarCombo("Nintendo Switch");
        formulario.salvar();
        Assert.assertEquals("Nome: Crisley", formulario.validarNomeCadastrado());
        Assert.assertEquals("Console: switch", formulario.validarConsoleCadastrado());
        Assert.assertTrue(formulario.validarStatusSwitch().endsWith("Off"));
        Assert.assertTrue(formulario.validarStatusCheckbox().endsWith("Marcado"));
    }

    @Test
    public void deveRealizarCadastroDemorado(){
        formulario.escreverNome("Crisley");
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        formulario.salvarDemorado();
        //esperar(10000);
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: Crisley']")));
        Assert.assertEquals("Nome: Crisley", formulario.validarNomeCadastrado());
    }
}