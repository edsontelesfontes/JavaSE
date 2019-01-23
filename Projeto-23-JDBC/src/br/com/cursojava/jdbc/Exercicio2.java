package br.com.cursojava.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Exercicio2 {

  public static void main(String[] args) {
    
    try {
      
      /* Abre a conexao */
      Connection cn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/impacta",
        "root", " ");
      
      /* Prepara a query */
      PreparedStatement ps = cn.prepareStatement(
        "SELECT func_name, func_rmnt_val " +
        "FROM tab_func WHERE func_name LIKE ?");

      /* Solicita que o usuario digite um nome */
      System.out.print("Digite um nome: ");
      Scanner sc = new Scanner(System.in);
      String pedaco = sc.nextLine();
      
      /* Preenche o parametro de busca */
      ps.setString(1, pedaco);

      /* Executa a query na base de dados */
      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        System.out.printf("%-20s %,12.2f%n",
            rs.getString("func_name"),
            rs.getDouble("func_rmnt_val"));
      }
      
      /* Fecha os recursos */
      rs.close();
      ps.close();
      cn.close();
      
    } catch (SQLException e) {
      System.out.println("Falha ao realizar busca.");
      e.printStackTrace();
    }
  }
}
