package br.com.impacta.noturno.jar;

import br.com.impacta.noticiario.Noticiario;
import br.com.impacta.noticiario.TipoNoticia;

public class Exemplo1 {

  public static void main(String[] args) {

    Noticiario notic =
        new Noticiario(TipoNoticia.TECNOLOGIA);
    System.out.println(notic.getNoticia());
  }
}
