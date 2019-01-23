package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploConexao {

  public static void main(String[] args) {
    
    try {

      /* Abre a conexao */
      Connection cn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306",
        null, null);
      
      System.out.println("Conexao aberta!!!");
      
      /* Fecha a conexao */
      cn.close();

    } catch (SQLException e) {
      System.out.println("Falha ao conectar.");
      e.printStackTrace();
    }
  }
}
