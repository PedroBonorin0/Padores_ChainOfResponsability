package chainofresponsability;

public class AcaoPagarSalario implements Acao{
  private static AcaoPagarSalario acaoPagarSalario = new AcaoPagarSalario();

  private AcaoPagarSalario() {};

  public static AcaoPagarSalario getAcaoPagarSalario() {
    return acaoPagarSalario;
  }


}
