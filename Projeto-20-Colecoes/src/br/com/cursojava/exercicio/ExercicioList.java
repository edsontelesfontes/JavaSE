package br.com.cursojava.exercicio;

import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.controller.FuncionarioController;
import br.com.cursojava.model.Funcionario;
import javafx.application.Application;
import javafx.stage.Stage;

public class ExercicioList extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  public void start(Stage stage)
      throws Exception {
    
    /* Instancia uma lista */
    List<Funcionario> funcList =
        new ArrayList<>();
    
    /* Tenta obter o primeiro funcionario */
    Funcionario func = FuncionarioController
        .showInputFuncionario();
    
    while (func != null) {
      
      /* Adiciona o funcionario na lista */
      funcList.add(func);
      
      /* Tenta obter mais um funcionario */
      func = FuncionarioController
          .showInputFuncionario();
    }

    /* Exibe os dados coletados */
    System.out.println("Lista de funcionarios");
    System.out.println("=====================");
    
    double totalSalario = 0;
    double totalIdade = 0;
    
    for (Funcionario f : funcList) {

      System.out.println(
          f.getNome() + " - " +
          f.getIdade() + " - " +
          f.getSalario());
      
      totalSalario += f.getSalario();
      totalIdade += f.getIdade();
    }
    
    /* Calcula a media de idades */
    totalIdade /= funcList.size();
    
    /* Exibe os dados totalizados */
    System.out.println();
    System.out.println(
        "Total de funcionarios: " +
        funcList.size());
    System.out.println(
        "Total de salários    : " +
        totalSalario);
    System.out.println(
        "Média de idade       : " +
        totalIdade);
  }
}
