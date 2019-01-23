package br.com.cursojava.texto;

import java.io.IOException;
import java.io.PrintWriter;

public class ExemploGravacao1 {

  public static void main(String[] args) {
    
    try {

      PrintWriter out = new PrintWriter(
          "C:\\Users\\svieira\\Desktop" +
          "\\dir\\carta.txt");
      
      out.println("Minha terra tem palmeiras");
      out.println("Onde canta o sabiá");
      out.println("As aves que aqui gorjeiam");
      out.println("Não gorjeiam como lá.");
      out.close();
      
      System.out.println(
          "Texto gravado com sucesso.");

    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
