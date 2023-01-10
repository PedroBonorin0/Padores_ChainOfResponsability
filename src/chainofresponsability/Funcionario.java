package chainofresponsability;

import java.util.ArrayList;

public abstract class Funcionario {
  protected ArrayList listaAcoes = new ArrayList();
  private Funcionario superior;

  public Funcionario getSuperior() {
    return superior;
  }

  public void setSuperior(Funcionario superior) {
    this.superior = superior;
  }

  public abstract String getDescricaoCargo();

  public String realizarAcao(AcaoRealizada acaoRealizada) {
    if (listaAcoes.contains(acaoRealizada.getAcao())) {
      return getDescricaoCargo();
    }
    else {
      if (superior != null) {
        return superior.realizarAcao(acaoRealizada);
      }
      else
      {
        return "Sem Ação Realizada";
      }
    }
  }

}
