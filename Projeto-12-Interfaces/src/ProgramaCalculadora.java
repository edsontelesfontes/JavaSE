
public class ProgramaCalculadora {

  public static void main(String[] args) {
    
    Calculadora[] calcArray = {
        new CalculadoraTela(),
        new CalculadoraPopup(),
        new CalculadoraArquivo()
    };

    for (int i = 0; i < calcArray.length; i++) {
      calcArray[i].exibeSubtracao(125, 42);
    }
    
//    for (Calculadora calc : calcArray) {
//      calc.exibeMultiplicacao(27, 13);
//    }
  }
}
