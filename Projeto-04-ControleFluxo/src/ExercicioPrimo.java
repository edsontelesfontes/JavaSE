
public class ExercicioPrimo {

  public static void main(String[] args) {
    
    int numero = 235;
    int divisoes = 0;
    
    for (int i = 1; i <= numero; i++) {
      
      /* verifique se o módulo entre a
       * variável numero e a variável i é
       * igual a 0 */
      if (numero % i == 0) {
        divisoes++;
      }
    }
    
    if (divisoes <= 2) {
      System.out.println("O numero é primo");
    } else {
      System.out.println("O numero não é primo");
    }
  }
}
