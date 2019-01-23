
public class Cap11_Lab1 {

  public static void main(String[] args) {
    
    int[] array = { 256, 12, 918, 4510,
        45, 1973, 918, 74, 888 };

    if (array.length == 0) {
      System.out.println("Array vazio.");
      return;
    }

    int maior = array[0];
    
    for (int i = 1; i < array.length; i++) {
      if (array[i] > maior) {
        maior = array[i];
      }
    }
    
    System.out.println(
        "O maior número é: " + maior);
  }
}
