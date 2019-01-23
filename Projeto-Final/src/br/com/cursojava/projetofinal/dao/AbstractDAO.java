package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractDAO {

  protected Connection getConnection()
      throws SQLException {
    
    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/impacta?noAccessToProcedureBodies=true",
      "root", "");
    
    return cn;
  }
  
  protected void closeResources(Connection cn,
      Statement ps, ResultSet rs) {
  
    if (rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        System.err.println("ResultSet não encerrado.");
      }
    }
    
    if (ps != null) {
      try {
        ps.close();
      } catch (SQLException e) {
        System.err.println("Statement não encerrado.");
      }
    }
  
    if (cn != null) {
      try {
        cn.close();
      } catch (SQLException e) {
        System.err.println("Conexão não encerrada.");
      }
    }
  }

}
