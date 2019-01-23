
public class Cap6_Lab1 {

  public static void main(String[] args) {
    
//    /* Criando array da maneira tradicional */
//    Funcionario[] funcList = new Funcionario[3];
//
//    funcList[0] = new Funcionario("João",
//        "Pedro", "Programador", 4200.15);
//    
//    funcList[1] = new Funcionario(
//      "Manuel", "Antunes", "Padeiro", 2800.45);
//    
//    funcList[2] = new Funcionario("Maria",
//      "Aparecida", "Secretária", 2500);

    /* Criando array da maneira direta */
    Funcionario[] funcList = {
      new Funcionario("João", "Pedro", "Programador", 4200.15),
      new Funcionario("Manuel", "Antunes", "Padeiro", 2800.45),
      new Funcionario("Maria", "Aparecida", "Secretária", 2500)
    };
    
//    /* For tradicional */
//    for (int i = 0; i < funcList.length; i++) {
//      System.out.println(funcList[i].getDados());
//    }
    
    /* For each */
    for (Funcionario item : funcList) {
      System.out.println(item.getDados());
    }
  }
}
