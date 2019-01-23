
public class CalculadoraPopup extends
    ExibidorEmPopup implements Calculadora {

  public void exibeSoma(double valor1,
      double valor2) {
    imprimeEmPopup(valor1 + valor2);
  }

  public void exibeSubtracao(double valor1,
      double valor2) {
    imprimeEmPopup(valor1 - valor2);
  }

  public void exibeMultiplicacao(double valor1,
      double valor2) {
    imprimeEmPopup(valor1 * valor2);
  }

  public void exibeDivisao(double valor1,
      double valor2) {
    imprimeEmPopup(valor1 / valor2);
  }
}
