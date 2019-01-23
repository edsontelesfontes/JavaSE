package br.com.impacta.noturno.date;

import java.util.Calendar;

public class ExercicioNatal {

  public static void main(String[] args) {
    
    Calendar hoje = Calendar.getInstance();
    Calendar natal = Calendar.getInstance();
    
    /* Aponta para o dia de natal */
    natal.set(Calendar.DAY_OF_MONTH, 25);
    natal.set(Calendar.MONTH, 11);
    
    long diferenca = natal.getTimeInMillis()
                   - hoje.getTimeInMillis();
    
    /* Transforma em segundos */
    diferenca /= 1000;
    
    /* Transforma em minutos */
    diferenca /= 60;
    
    /* Transforma em horas */
    diferenca /= 60;
    
    /* Transforma em dias */
    diferenca /= 24;
    
    System.out.printf(
        "Faltam %d dias para o natal",
        diferenca);
  }
}
