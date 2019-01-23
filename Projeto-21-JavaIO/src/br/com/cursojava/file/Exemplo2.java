package br.com.cursojava.file;

import java.io.File;

public class Exemplo2 {

  public static void main(String[] args) {
    
    File pastaBase = new File(
        "C:\\Users\\svieira\\Desktop" +
        "\\1-Java-Programmer-8\\Pdf");
    
    File[] arquivoArray =
        pastaBase.listFiles();
    
    System.out.println("Conteúdo do diretório:");
    System.out.println();
    
    for (File arquivo : arquivoArray) {
      System.out.printf("%-26s %,12d bytes\n",
          arquivo.getName(),
          arquivo.length());
    }
  }
}









