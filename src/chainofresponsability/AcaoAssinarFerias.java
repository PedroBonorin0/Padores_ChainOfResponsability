package chainofresponsability;

public class AcaoAssinarFerias implements Acao{
  private static AcaoAssinarFerias acaoAssinarFerias = new AcaoAssinarFerias();

  private AcaoAssinarFerias() {};

  public static AcaoAssinarFerias getAcaoAssinarFerias() {
    return acaoAssinarFerias;
  }

}
