package chainofresponsability;

public class FuncionarioGerente extends Funcionario{
  public FuncionarioGerente(Funcionario superior) {
    listaAcoes.add(AcaoAssinarFerias.getAcaoAssinarFerias());
    setSuperior(superior);
  }

  public String getDescricaoCargo() {
    return "Gerente";
  }
}
