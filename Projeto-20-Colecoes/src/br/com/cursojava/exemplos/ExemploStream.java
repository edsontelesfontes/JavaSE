package br.com.cursojava.exemplos;

import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

import br.com.cursojava.model.Cliente;

public class ExemploStream {

  public static void main(String[] args) {
    
    Collection<Cliente> colec =
        new LinkedList<>();

    colec.add(new Cliente("Manuel", "Rua 5",
        "1234-5678"));
    colec.add(new Cliente("Ricardo",
        "Av. Central, 23", "3248-9674"));
    colec.add(new Cliente("Joaquim", "Rua 35",
        "4697-3258"));
    colec.add(new Cliente("Maria",
        "Alameda XV", "96324-5621"));
    
    Stream<Cliente> stream = colec.stream();
    
    stream.sorted(Comparator.comparing(
                            c -> c.getNome()))
          .filter(c -> c.getNome().startsWith("M"))
          .forEach(c -> System.out.println(
                            c.getNome() + " - " + c.getTelefone()));
  }
}
