package br.com.cursojava.texto;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExemploLeitura1 {

  public static void main(String[] args) {
    
    try {

      Reader arq = new FileReader(
          "C:\\Users\\svieira\\Desktop" +
          "\\1-Java-Programmer-Noturno" +
          "\\Capitulo15\\lusiadas.txt");
      
      while (arq.ready()) {
        System.out.print((char) arq.read());
      }
      
      arq.close();
      
    } catch (IOException e) {
      System.out.println(
          "Falha ao abrir o arquivo");
    }
  }
}
