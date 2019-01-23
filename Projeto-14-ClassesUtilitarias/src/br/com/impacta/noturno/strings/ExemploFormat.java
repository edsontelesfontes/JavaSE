package br.com.impacta.noturno.strings;

public class ExemploFormat {

  public static void main(String[] args) {
    
    String frase = String.format(
        "Valor a receber: %,.2f", 1270.5);
    System.out.println(frase);
    
    /* Formata e imprime de uma so vez */
    System.out.printf(
        "Valor a receber: %,.2f%n", 1270.5);
  }
}
