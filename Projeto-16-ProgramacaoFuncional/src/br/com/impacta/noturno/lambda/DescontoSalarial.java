package br.com.impacta.noturno.lambda;

public class DescontoSalarial {

  public static void main(String[] args) {

    double[] salariosBrutos = { 1350, 4320.15, 8235.25,
        2500.55, 1830, 850.26, 3614.29, 12500 };
    
    double[] salariosLiquidos =
        DoubleArrayUtils.transformaValores(salariosBrutos,
            s -> s - (s * 10 / 100));

    /* Imprime da maneira tradicional */
//    for (double salario : salariosLiquidos) {
//      System.out.println(salario);
//    }

    /* Imprime com expressao lambda */
    DoubleArrayUtils.processaValores(salariosLiquidos,
        s -> System.out.println(s));
  }
}
