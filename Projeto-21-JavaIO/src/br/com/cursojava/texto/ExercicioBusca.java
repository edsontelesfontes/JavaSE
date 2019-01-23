package br.com.cursojava.texto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExercicioBusca {

  private static final String NOME_ARQUIVO =
      "temp\\lusiadas.txt";

  public static void main(String[] args) {
    
    try {
      System.out.print(
          "Digite o texto a ser procurando: ");
      
      /* Coleta a palavra digitada pelo usuário */
      Scanner sc = new Scanner(System.in);
      String palavra = sc.nextLine();
      System.out.println();
  
      /* Abre o arquivo para leitura por linha */
      BufferedReader texto =
          new BufferedReader(new FileReader(
              NOME_ARQUIVO));
      
      int linha = 0;
      
      while (texto.ready()) {

        String frase = texto.readLine();
        linha++;
        
        if (frase.contains(palavra)) {
          System.out.println(linha +
              ": " + frase);
        }
      }
      
      System.out.println();
      System.out.println(
          "Busca concluída com sucesso.");
      
      texto.close();
      
    } catch (IOException e) {
      System.out.println(
          "Falha ao ler arquivo: " +
          e.getMessage());
      e.printStackTrace();
    }
  }
}
