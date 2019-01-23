
public class Calculo1 {

  public static void main(String[] args) {
    
    int result;

    result = soma(37, 81);
    System.out.println(result);

    result = soma(920, 628, 14, 1021);
    System.out.println(result);

    result = soma(90, 67, 185, 29, 10, 4);
    System.out.println(result);
  }

  static int soma(int val1, int val2) {
    int total = val1 + val2;
    return total;
  }

  static int soma(int val1, int val2,
      int val3, int val4) {
    int total = val1 + val2 + val3 + val4;
    return total;
  }

  static int soma(int val1, int val2,
      int val3, int val4, int val5, int val6) {
    int total = val1 + val2 + val3 + val4 +
        val5 + val6;
    return total;
  }
}
