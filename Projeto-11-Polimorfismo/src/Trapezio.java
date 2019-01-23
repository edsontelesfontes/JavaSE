public class Trapezio extends FiguraGeometrica {

  private double base;
  private double teto;
  private double altura;

  public Trapezio(double b, double t, double a) {
    base = b;
    teto = t;
    altura = a;
  }
  
  public double getBase() {
    return base;
  }

  public void setBase(double base) {
    this.base = base;
  }

  public double getTeto() {
    return teto;
  }

  public void setTeto(double teto) {
    this.teto = teto;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public double getArea() {
    return (base + teto) * altura / 2;
  }

  public String getNome() {
    return "trapézio";
  }
}
