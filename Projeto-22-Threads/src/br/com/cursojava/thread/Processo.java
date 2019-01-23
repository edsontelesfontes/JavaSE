package br.com.cursojava.thread;

public class Processo extends Thread {

  public void run() {
    
    try {
    
      for (int i = 0; i < 300; i++) {
        System.out.println(
            "Executando a thread " +
            Thread.currentThread().getName());
        Thread.sleep(100);
      }
      
    } catch (InterruptedException e) {
      System.out.println(
          "Processo interrompido");
    }
  }
}
