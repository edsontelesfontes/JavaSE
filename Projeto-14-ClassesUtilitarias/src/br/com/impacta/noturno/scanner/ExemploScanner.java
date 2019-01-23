package br.com.impacta.noturno.scanner;

import java.util.Scanner;

public class ExemploScanner {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    
    System.out.print("Digite sua idade: ");
    int idade = Integer.parseInt(sc.nextLine());
    
    System.out.printf(
      "Parabéns %s pelos seus %d anos de vida",
      nome, idade);
  }
}
