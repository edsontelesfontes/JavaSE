package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Exercicio1 {

  public static void main(String[] args) {

    try {

      /* Abre a conexao */
      Connection cn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/impacta",
        "root", " ");

      /* Prepara a instrucao para inclusao */
      PreparedStatement ps = cn.prepareStatement(
        "INSERT INTO tab_role (role_name) VALUES (?)");

      /* Coleta o primeiro nome de cargo */
      System.out.println("Digite nomes de cargos:");
      Scanner sc = new Scanner(System.in);
      String nomeCargo = sc.nextLine();

      while (isValid(nomeCargo)) {
        
        /* Grava no banco */
        ps.setString(1, nomeCargo);
        ps.executeUpdate();
        
        /* Coleta mais um nome de cargo */
        nomeCargo = sc.nextLine();
      }
      
      /* Fecha os recursos utilizados */
      ps.close();
      cn.close();

    } catch (SQLException e) {
      System.out.println("Falha ao acessar o BD.");
      e.printStackTrace();
    }
  }
  
  static boolean isValid(String nome) {
    
    /* Valida se eh vazio */
    if (nome.equals("")) {
      System.out.println(
          "Campo vazio. Cadastro abortado.");
      return false;
    }
    
    /* Valida se eh muito grande */
    if (nome.length() > 20) {
      System.out.println(
          "Campo muito grande. Cadastro abortado.");
      return false;
    }
    
    return true;
  }
}
