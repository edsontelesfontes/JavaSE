package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.stream.Stream;

import br.com.cursojava.model.Estudante;

public class ExercicioStream {

  public static void main(String[] args) {
    
    /*
     * Cria uma lista
     * (poderia ser qualquer collection)
     */
    ArrayList<Estudante> lista =
        new ArrayList<>();
    
    /* Preenche a lista */
    lista.add(new Estudante("Joana",   8.5,  8.5));
    lista.add(new Estudante("Antônio", 6  ,  9));
    lista.add(new Estudante("Mariana", 7.5,  5));
    lista.add(new Estudante("Ricardo", 7  ,  6));
    lista.add(new Estudante("Gustavo", 9.5, 10));
    
    /* Calcula e assinala a media de todos */
    lista.forEach(e -> e.setMedia(
        (e.getNotaMatematica() +
            e.getNotaPortugues()) / 2));
    
    /* Cria o stream (manipulador de dados) */
    Stream<Estudante> stream = lista.stream();
    
    stream.filter(e -> e.getMedia() >= 7)
          .forEach(e -> System.out.println(
              e.getNome() + ": " +
              e.getMedia()));
  }
}
