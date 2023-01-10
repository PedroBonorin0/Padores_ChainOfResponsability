package test;

import chainofresponsability.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
  FuncionarioSocio socio;
  FuncionarioGerente gerente;
  FuncionarioFinanceiro financeiro;
  FuncionarioRH rh;

  @BeforeEach
  void setUp() {
    socio = new FuncionarioSocio(null);
    gerente = new FuncionarioGerente(socio);
    financeiro = new FuncionarioFinanceiro(gerente);
    rh = new FuncionarioRH(gerente);
  }

  @Test
  void deveRetornarRHParaDemissao() {
    assertEquals("RH", rh.realizarAcao(new AcaoRealizada(AcaoDemitirFuncionario.getAcaoDemitirFuncionario())));
  }

  @Test
  void deveRetornarFinanceiroParaPagamento() {
    assertEquals("Financeiro", financeiro.realizarAcao(new AcaoRealizada(AcaoPagarSalario.getAcaoPagarSalario())));
  }

  @Test
  void deveRetornarGerenteParaAssinarFerias() {
    assertEquals("Gerente", gerente.realizarAcao(new AcaoRealizada(AcaoAssinarFerias.getAcaoAssinarFerias())));
  }

  @Test
  void deveRetornarSocioParaAssinarContrato() {
    assertEquals("Sócio", socio.realizarAcao(new AcaoRealizada(AcaoAssinarContrato.getAcaoAssinarContrato())));
  }

  @Test
  void deveRetornarSemAssinaturaParaPagarFuncionario() {
    assertEquals("Sem Ação Realizada", rh.realizarAcao(new AcaoRealizada(AcaoPagarSalario.getAcaoPagarSalario())));
  }
}
