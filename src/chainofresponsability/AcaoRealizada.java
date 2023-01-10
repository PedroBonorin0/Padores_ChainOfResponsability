package chainofresponsability;

public class AcaoRealizada {
  private Acao acao;

  public AcaoRealizada(Acao acao) {
    this.acao = acao;
  }

  public Acao getAcao() {
    return acao;
  }

  public void setAcao(Acao acao) {
    this.acao = acao;
  }

}
