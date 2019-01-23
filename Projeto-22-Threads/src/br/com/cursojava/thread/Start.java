package br.com.cursojava.thread;

public class Start {

  public static void main(String[] args) {

    try {
      
      System.out.println("Iniciando processo...");
      /* Inicia o processo em paralelo */
      Thread p = new Processo();
      p.start();
      
      System.out.println("Aguardando processo....");
      p.join();
      
      System.out.println("O processo foi terminado");
      
    } catch (InterruptedException e) {
      System.out.println(
          "Aplicacao interrompida");
    }
  }
}
