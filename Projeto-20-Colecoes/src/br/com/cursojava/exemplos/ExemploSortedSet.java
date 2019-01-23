package br.com.cursojava.exemplos;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

import br.com.cursojava.model.Cliente;

public class ExemploSortedSet {

  public static void main(String[] args) {
    
    /* Criterio de comparacao por nome */
    Comparator<Cliente> comp = Comparator.comparing(
        c -> c.getNome());
    
    /* Adiciona a comparacao por telefone */
    comp = comp.thenComparing(Comparator.comparing(
        c -> c.getTelefone()));
    
    /* Cria o conjunto com o criterio especificado */
    SortedSet<Cliente> conjunto =
        new TreeSet<>(comp);

    conjunto.add(new Cliente("Joao", "Rua X",
        "6781-9874"));
    conjunto.add(new Cliente("Maria",
        "Rodovia X, 123", "9991-2068"));
    conjunto.add(new Cliente("Manuel",
        "Av. Lagos", "4532-7125"));
    conjunto.add(new Cliente("Joaquim",
        "Rua Borges", "7945-0257"));
    conjunto.add(new Cliente("Maria",
        "Estrada B, 345", "7801-2068"));
    conjunto.add(new Cliente("Manuel",
        "Av. 8", "1234-5678"));

    for (Cliente c : conjunto) {
      System.out.println(c.getNome() + " - " +
          c.getTelefone());
    }
  }
}
