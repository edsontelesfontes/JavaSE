package br.com.impacta.noturno.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemploCalendar {

  public static void main(String[] args) {
    
    Calendar c1 = Calendar.getInstance();
    c1.add(Calendar.DAY_OF_MONTH, 90);

    SimpleDateFormat mascara =
        new SimpleDateFormat("dd/MM/yyyy");
    
    Date d = c1.getTime();
    System.out.println(mascara.format(d));
  }
}
