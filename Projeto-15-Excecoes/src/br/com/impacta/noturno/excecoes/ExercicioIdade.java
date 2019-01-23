package br.com.impacta.noturno.excecoes;

import java.util.Scanner;

public class ExercicioIdade {

  public static void main(String[] args) {

    int ano = -1;
    
    do {
      try {
  
        Scanner sc = new Scanner(System.in);
  
        System.out.print(
            "Digite o ano de nascimento: ");
        String anoStr = sc.nextLine();
        ano = Integer.parseInt(anoStr);
  
        int idade = 2017 - ano;
  
        System.out.printf(
            "Parabens pelos seus %d anos\n", idade);
        
      } catch (NumberFormatException e) {
        System.out.println(
            "Valor digitado inválido");
      }
    } while (ano != 0);
  }
}
