package br.com.impacta.noturno.math;

public class ExercicioPotencia {

  public static void main(String[] args) {
    
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {

        /* Exemplo printf */
        System.out.printf(
            "%d elevado a %d = %,.0f\n",
            i, j, Math.pow(i, j));

        /* Exemplo com println */
//        System.out.println(
//            i + " elevado a " + j + " = " +
//            Math.pow(i, j));
      }
    }
  }
}
