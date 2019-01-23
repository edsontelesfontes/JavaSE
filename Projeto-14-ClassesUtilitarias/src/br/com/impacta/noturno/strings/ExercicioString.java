package br.com.impacta.noturno.strings;

public class ExercicioString {

  public static void main(String[] args) {
    
    String frase = "    Java é divertido    ";
    
    System.out.println(frase.trim()
                            .toUpperCase()
                            .concat("!!!"));
  }
}
