package br.com.cursojava.exemplos;

import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.model.Cliente;

public class ExemploList {

  public static void main(String[] args) {

    List<Cliente> lista = new ArrayList<>();

    lista.add(new Cliente("João", "Rua X",
        "6781-9874"));
    lista.add(new Cliente("Manuel",
        "Av. Lagos", "4532-7125"));
    lista.add(new Cliente("Joaquim",
        "Rua Borges", "7945-0257"));
    lista.add(2, new Cliente("Maria",
        "Estrada B, 345", "7801-2068"));

    Cliente c = lista.get(1);
    System.out.println("Cliente 1: " +
        c.getNome());

//    lista.remove(2);
    System.out.println("Total de clientes: " +
        lista.size());

    System.out.println();

    /* Varre a lista de clientes */
//    lista.forEach(
//        x -> System.out.println(x.getNome()));

    /* Varre com o for tradicional */
    for (int i = 0; i < lista.size(); i++) {
      System.out.println(i + " - " +
          lista.get(i).getNome());
    }
  }
}
