package chainofresponsability;

public class AcaoAssinarContrato implements Acao{
  private static AcaoAssinarContrato acaoAssinarContrato = new AcaoAssinarContrato();

  private AcaoAssinarContrato() {};

  public static AcaoAssinarContrato getAcaoAssinarContrato() {
    return acaoAssinarContrato;
  }
}
