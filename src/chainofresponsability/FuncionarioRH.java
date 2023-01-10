package chainofresponsability;

public class FuncionarioRH extends Funcionario{
  public FuncionarioRH(Funcionario superior) {
    listaAcoes.add(AcaoDemitirFuncionario.getAcaoDemitirFuncionario());
    setSuperior(superior);
  }

  public String getDescricaoCargo() {
    return "RH";
  }
}
