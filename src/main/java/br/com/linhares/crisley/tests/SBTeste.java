package br.com.linhares.crisley.tests;

import br.com.linhares.crisley.appium.core.BaseTeste;
import br.com.linhares.crisley.pages.*;
import br.com.linhares.crisley.pages.SeuBarriga.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SBTeste extends BaseTeste {

    private MenuPage menu = new MenuPage();
    private SBContasPage contas = new SBContasPage();
    private SBHomePage home = new SBHomePage();
    private SBLoginPage login = new SBLoginPage();
    private SBMenuPage sbMenu = new SBMenuPage();
    private SBMovimentacoesPage movimentacoes = new SBMovimentacoesPage();
    private SBResumoPage resumo = new SBResumoPage();

    @Before
    public void setUp(){
        menu.acessarSeuBarrigaNativo();
        login.login("crisley@email.com", "123456");
        home.resetar();
    }

    @Test
    public void deveInserirContaComSucesso(){
        sbMenu.acessarContas();
        contas.setConta("Conta de Teste");
        contas.salvar();
        Assert.assertTrue(contas.existeElementoPorTexto("Conta adicionada com sucesso"));
        Assert.assertTrue(contas.existeElementoPorTexto("Conta de Teste"));
    }

    @Test
    public void deveExcluirConta(){
        sbMenu.acessarContas();
        contas.selecionarConta("Conta mesmo nome");
        contas.excluir();
        Assert.assertTrue(contas.existeElementoPorTexto("Conta excluída com sucesso"));
        Assert.assertFalse(contas.existeElementoPorTexto("Conta mesmo nome"));
    }

    @Test
    public void deveValidarInclusaoMovimentacao(){
        sbMenu.acessarMovimentacoes();
        movimentacoes.salvar();
        Assert.assertTrue(movimentacoes.existeElementoPorTexto("Descrição é um campo obrigatório"));
        movimentacoes.setDescricao("Movimentação de Teste");
        movimentacoes.salvar();
        Assert.assertTrue(movimentacoes.existeElementoPorTexto("Interessado é um campo obrigatório"));
        movimentacoes.setInteressado("Crisley Linhares");
        movimentacoes.salvar();
        Assert.assertTrue(movimentacoes.existeElementoPorTexto("Valor é um campo obrigatório"));
        movimentacoes.setValor("300,00");
        movimentacoes.salvar();
        Assert.assertTrue(movimentacoes.existeElementoPorTexto("Conta é um campo obrigatório"));
        movimentacoes.setConta("Conta para movimentacoes");
        movimentacoes.salvar();
        Assert.assertTrue(movimentacoes.existeElementoPorTexto("Movimentação cadastrada com sucesso"));
    }

    @Test
    public void deveAtualizarSaldoAoExcluirMovimentacao(){
        Assert.assertEquals("534.00", home.verificarSaldo("Conta para saldo"));
        sbMenu.acessarResumo();
        resumo.excluirMovimentacao("Movimentacao 3, calculo saldo");
        Assert.assertTrue(resumo.existeElementoPorTexto("Movimentação removida com sucesso!"));
        sbMenu.acessarHome();
        home.atualizarTela();
        Assert.assertEquals("-1000.00", home.verificarSaldo("Conta para saldo"));
    }
}
