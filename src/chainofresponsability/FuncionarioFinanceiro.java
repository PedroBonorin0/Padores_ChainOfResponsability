package chainofresponsability;

public class FuncionarioFinanceiro extends Funcionario{
  public FuncionarioFinanceiro(Funcionario superior) {
    listaAcoes.add(AcaoPagarSalario.getAcaoPagarSalario());
    setSuperior(superior);
  }

  public String getDescricaoCargo() {
    return "Financeiro";
  }
}
