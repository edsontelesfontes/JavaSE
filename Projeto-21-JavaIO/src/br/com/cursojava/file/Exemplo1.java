package br.com.cursojava.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplo1 {

  public static void main(String[] args) {
    
    File arquivo = new File(
        "C:\\Users\\svieira\\Desktop" +
        "\\1-Java-Programmer-8\\Pdf" +
        "\\01.Capitulo01.pdf");
    
    long dataLong = arquivo.lastModified();
    Date data = new Date(dataLong);
    SimpleDateFormat mascara =
        new SimpleDateFormat("dd/MM HH:mm");
    
    System.out.println(mascara.format(data));
  }
}
