package chainofresponsability;

public class FuncionarioSocio extends Funcionario{
  public FuncionarioSocio(Funcionario superior) {
    listaAcoes.add(AcaoAssinarContrato.getAcaoAssinarContrato());
    setSuperior(superior);
  }

  public String getDescricaoCargo() {
    return "Sócio";
  }
}
