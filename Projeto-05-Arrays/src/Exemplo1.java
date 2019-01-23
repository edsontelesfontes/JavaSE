
public class Exemplo1 {

  public static void main(String[] args) {
    
    String[] nome = { "Álvaro", "Pedro",
        "Orlando", "Silvio", "Rômulo" };
    
    /* Exemplo 1 */
//    for (int i = 0; i < nome.length; i++) {
//      System.out.println(nome[i]);
//    }

    /* Exemplo 2 (de tras pra frente) */
//    for (int i = nome.length - 1; i >= 0 ; i--) {
//      System.out.println(nome[i]);
//    }

    /* Exemplo 3 (for-each) */
    for (String item : nome) {
      System.out.println(item);
    }
  }
}
