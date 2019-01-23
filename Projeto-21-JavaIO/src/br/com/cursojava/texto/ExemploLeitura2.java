package br.com.cursojava.texto;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ExemploLeitura2 {

  public static void main(String[] args) {
    
    try {

      Reader arq = new FileReader(
          "C:\\Users\\svieira\\Desktop" +
          "\\1-Java-Programmer-Noturno" +
          "\\Capitulo15\\lusiadas.txt");
      
      char[] buffer = new char[5000];
      int lidos = 0;
      
      while ((lidos = arq.read(buffer)) > 0) {
        String texto =
            new String(buffer, 0, lidos);
        System.out.print(texto);
      }

      arq.close();
      
    } catch (IOException e) {
      System.out.println(
          "Falha ao abrir o arquivo");
    }
  }
}
