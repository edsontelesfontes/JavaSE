package br.com.cursojava.exemplos;

import java.util.Collection;
import java.util.HashSet;

import br.com.cursojava.model.Produto;

public class ExemploCollection {

  public static void main(String[] args) {
    
    /* Cria uma colecao do tipo hashset */
    Collection<Produto> colecaox =
        new HashSet<>();
    
    /* Adiciona um produto */
    Produto p1 = new Produto(1012,
        "Cerveja em lata");
    colecaox.add(p1);
    
    /* Adiciona outro produto */
    Produto p2 = new Produto(1050,
        "Biscoito recheado");
    colecaox.add(p2);
    
    /* Adiciona mais um produto */
    colecaox.add(new Produto(2034,
        "Sabão em pó"));
    
    /* Adiciona outro */
    colecaox.add(new Produto(39,
        "Pacote de espetinho"));

//    for (Produto p : colecaox) {
//      System.out.println(p.getNome());
//    }
    
    colecaox.forEach(
        p -> System.out.println(p.getNome()));
    
    System.out.println("Quantidade: " +
        colecaox.size());
  }
}
