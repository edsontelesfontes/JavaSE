package br.com.cursojava.projetofinal;

import java.text.DecimalFormat;
import java.text.ParseException;

public class Utils {

  private static final DecimalFormat DECIMAL_FORMAT =
      new DecimalFormat("#,##0.00");
  
  public static boolean isNumber(String text) {
    try {
      DECIMAL_FORMAT.parse(text);
      return true;
    } catch (ParseException e) {
      return false;
    }
  }
  
  public static double stringToDouble(String text) {
    try {
      return DECIMAL_FORMAT.parse(text).doubleValue();
    } catch (ParseException e) {
      return 0;
    }
  }

  public static String doubleToString(double valor) {
    return DECIMAL_FORMAT.format(valor);
  }
}
