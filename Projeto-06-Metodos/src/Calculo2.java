
public class Calculo2 {

  public static void main(String[] args) {
    
    int result;

    result = soma(37, 81);
    System.out.println(result);

    result = soma(920, 628, 14, 1021);
    System.out.println(result);

    result = soma(90, 67, 185, 29, 10, 4);
    System.out.println(result);
  }

  static int soma(int... valores) {
    
    int total = 0;
    
    for (int item : valores) {
      total += item;
    }
    
    return total;
  }
}






