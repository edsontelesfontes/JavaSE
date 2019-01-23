package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExemploQuery {

  public static void main(String[] args) {
    
    try {
      
      /* Abre a conexao */
      Connection cn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/impacta",
          "root", " ");

      /* Realiza a consulta */
      Statement st = cn.createStatement();
      ResultSet rs = st.executeQuery(
          "SELECT func_name, func_rmnt_val " +
          "FROM tab_func ORDER BY func_name");

      while (rs.next()) {
        System.out.printf("%-10s %,12.2f%n",
            rs.getString("func_name"),
            rs.getDouble("func_rmnt_val"));
      }

      /* Fecha os recursos utilizados */
      rs.close();
      st.close();
      cn.close();
      
    } catch (SQLException e) {
      System.out.println("Ocorreu uma falha");
      e.printStackTrace();
    }
  }
}
