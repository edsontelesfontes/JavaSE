
public class ExecutaFiguras {

  public static void main(String[] args) {
    
    FiguraGeometrica[] listaFiguras = {
      new Quadrado(4),
      new Triangulo(3, 4),
      new Trapezio(3, 2, 1.5),
      new Quadrado(6.5),
      new Trapezio(8, 2.5, 1),
      new Circulo(2),
      new Quadrado(4.7),
      new Triangulo(6.5, 10)
    };

    int qtdQuad = 0;
    
    for (FiguraGeometrica figura : listaFiguras) {

      System.out.println("Area do " +
          figura.getNome() + ": " +
          figura.getArea());
      
      if (figura instanceof Quadrado) {
        qtdQuad++;
      }
    }
    
    System.out.println();
    System.out.println(
        "Total de quadrados: " + qtdQuad);
  }
}
