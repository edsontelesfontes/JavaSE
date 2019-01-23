
public class CalculaFiguras {

  public static void main(String[] args) {
    
    FiguraGeometrica f;
    
    f = new Triangulo(4, 6);
    System.out.println(f.getArea());

    f = new Circulo(2.5);
    System.out.println(f.getArea());

    f = new Quadrado(2);
    System.out.println(f.getArea());
  }
}
