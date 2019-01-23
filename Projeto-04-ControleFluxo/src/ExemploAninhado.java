public class ExemploAninhado {

  public static void main(String[] args) {
    for (int contador = 0; contador < 100; contador++) {
      if (contador % 3 == 0) {
        System.out.println("Tabuada de " + contador);
        int x = 1;
        while (x <= 10) {
          System.out.println(contador * x);
        }
      } else {
        System.out.println(contador + " não é múltiplo de 3");
      }
    }
  }
}
