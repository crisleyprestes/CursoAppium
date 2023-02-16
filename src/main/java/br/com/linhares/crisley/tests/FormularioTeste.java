package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTest;
import br.com.linhares.crisley.pages.FormularioPage;
import br.com.linhares.crisley.pages.MenuPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FormularioTeste extends BaseTest{

    private FormularioPage formulario = new FormularioPage();
    private MenuPage menu = new MenuPage();

    @Before
    public void setup(){
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
        formulario.salvarDemorado();
        Assert.assertEquals("Nome: Crisley", formulario.validarNomeCadastrado());
    }

    @Test
    public void deveAlterarData(){
        formulario.clicarPorTexto("01/01/2000");
        formulario.clicarPorTexto("20");
        formulario.clicarPorTexto("OK");
        Assert.assertTrue(formulario.existeElementoPorTexto("20/2/2000"));
    }

    @Test
    public void deveAlterarHora(){
        formulario.clicarPorTexto("06:00");
        formulario.clicarHoraEMinuto("10", "40");
        formulario.clicarPorTexto("OK");
        Assert.assertTrue(formulario.existeElementoPorTexto("10:40"));
    }

    @Test
    public void deveInteragirComSeekBar(){
        formulario.clicarSeekBar(0.67);
        formulario.salvar();
        Assert.assertTrue(formulario.validarSlider().endsWith("67"));
    }
}