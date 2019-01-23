
public class CalculadoraArquivo extends
    ExibidorNoArquivo implements Calculadora {

  public void exibeSoma(double valor1,
      double valor2) {
    imprimeNoArquivo(valor1 + valor2);
  }

  public void exibeSubtracao(double valor1,
      double valor2) {
    imprimeNoArquivo(valor1 - valor2);
  }

  public void exibeMultiplicacao(double valor1,
      double valor2) {
    imprimeNoArquivo(valor1 * valor2);
  }

  public void exibeDivisao(double valor1,
      double valor2) {
    imprimeNoArquivo(valor1 / valor2);
  }
}
