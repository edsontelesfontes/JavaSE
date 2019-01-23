
public class ExercicioPrimo {

  public static void main(String[] args) {
    
    int numero = 235;
    int divisoes = 0;
    
    for (int i = 1; i <= numero; i++) {
      
      /* verifique se o m�dulo entre a
       * vari�vel numero e a vari�vel i �
       * igual a 0 */
      if (numero % i == 0) {
        divisoes++;
      }
    }
    
    if (divisoes <= 2) {
      System.out.println("O numero � primo");
    } else {
      System.out.println("O numero n�o � primo");
    }
  }
}
