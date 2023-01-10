package chainofresponsability;

public class AcaoDemitirFuncionario implements Acao{
  private static AcaoDemitirFuncionario acaoDemitirFuncionario = new AcaoDemitirFuncionario();

  private AcaoDemitirFuncionario() {};

  public static AcaoDemitirFuncionario getAcaoDemitirFuncionario() {
    return acaoDemitirFuncionario;
  }


}
