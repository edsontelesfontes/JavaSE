public class Motorista extends Funcionario {

  private String placaAutomovel;
  private String cnh;

  public Motorista(String nome,
      String sobrenome,
      String cargo, double salario,
      String cnh) {
    super(nome, sobrenome, cargo, salario);
    this.cnh = cnh;
  }
  
  public String getPlacaAutomovel() {
    return placaAutomovel;
  }

  public void setPlacaAutomovel(String placaAutomovel) {
    this.placaAutomovel = placaAutomovel;
  }

  public String getCnh() {
    return cnh;
  }

  public void setCnh(String cnh) {
    this.cnh = cnh;
  }
  
  public String toString() {
    return super.toString() + " - Placa " +
        getPlacaAutomovel();
  }
}
