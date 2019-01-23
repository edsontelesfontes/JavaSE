package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploStatement {

  public static void main(String[] args) {
    
    try {

      Connection cn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/impacta",
        "root", " ");
      
      Statement st = cn.createStatement();
      st.executeUpdate(
        "INSERT INTO tab_role (role_name) VALUES ('Padeiro')");
      
      System.out.println("Incluido com sucesso.");
      
      st.close();
      cn.close();

    } catch (SQLException e) {
      System.out.println("Falha ao conectar.");
      e.printStackTrace();
    }
  }
}
