
public class Cap6_Lab1 {

  public static void main(String[] args) {
    
    Funcionario f1 = new Funcionario();
    f1.setNome("João");
    f1.setSobrenome("Pedro");
    f1.setCargo("Programador");
    f1.setSalario(4200.15);
    
    Funcionario f2 = new Funcionario();
    f2.setNome("Manuel");
    f2.setSobrenome("Antunes");
    f2.setCargo("Padeiro");
    f2.setSalario(2800.45);
    
    Funcionario f3 = new Funcionario();
    f3.setNome("Maria");
    f3.setSobrenome("Aparecida");
    f3.setCargo("Secretária");
    f3.setSalario(2500);

    System.out.println(f1.getNome() + " " +
        f1.getSobrenome() + " - " + 
        f1.getCargo() + " - " +
        f1.getSalario());

    System.out.println(f2.getNome() + " " +
        f2.getSobrenome() + " - " +
        f2.getCargo() + " - " +
        f2.getSalario());

    System.out.println(f3.getNome() + " " +
        f3.getSobrenome() + " - " +
        f3.getCargo() + " - " +
        f3.getSalario());
  }
}
