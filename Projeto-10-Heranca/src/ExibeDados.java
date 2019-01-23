
public class ExibeDados {

  public static void main(String[] args) {

    Motorista m = new Motorista("Manuel",
      "Antunes", "Taxista", 7400.45,
      "123.456.890");
    m.setPlacaAutomovel("ABC-1234");
    
    System.out.println(m);
  }
}
