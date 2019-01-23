
public class DataUtil {

  public static void main(String[] args) {
    exibeSaudacao(17);
    exibeSaudacao(10);
    exibeSaudacao(23);
    exibeSaudacao(8);
    exibeSaudacao(12);
  }

  static void exibeSaudacao(int hora) {
    
    if (hora < 12) {
      System.out.println("Bom dia");
    } else if (hora < 18) {
      System.out.println("Boa tarde");
    } else {
      System.out.println("Boa noite");
    }
  }
}
