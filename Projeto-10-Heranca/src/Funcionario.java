public class Funcionario {

  private String nome;
  private String sobrenome;
  private String cargo;
  private double salario;

  public Funcionario(String nome,
      String sobrenome,
      String cargo, double salario) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cargo = cargo;
    this.salario = salario;
  }
  
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }
  
  public String toString() {
    String temp = getNome() + " " +
        getSobrenome() + " - " +
        getCargo() + " - " + getSalario();
    return temp;
  }
}
