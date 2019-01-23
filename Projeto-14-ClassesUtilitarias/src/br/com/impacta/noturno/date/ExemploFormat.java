package br.com.impacta.noturno.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploFormat {

  public static void main(String[] args) {
    
    Date agora = new Date();

    SimpleDateFormat mascara =
        new SimpleDateFormat(
            "EEEE, dd 'de' MMMM 'de' yyyy");
    
    System.out.println(
        mascara.format(agora));
  }
}
