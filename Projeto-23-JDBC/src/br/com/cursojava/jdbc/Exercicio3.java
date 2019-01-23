package br.com.cursojava.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3 {

  public static void main(String[] args) {
    
    try {

      /* Abre a conexao */
      Connection cn = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/impacta?noAccessToProcedureBodies=true",
        "root", " ");

      /* Prepara a chamada da procedure */
      CallableStatement cs = cn.prepareCall(
          "{ call prc_numero_extenso(?, ?) }");

      /* Solicita que o usuario digite um numero */
      System.out.println("Digite um número inteiro:");
      Scanner sc = new Scanner(System.in);
      int numero = sc.nextInt();

      /* Preenche o parametro da procedure */
      cs.setInt(1, numero);
      
      /* Registra o parametro de saida */
      cs.registerOutParameter(2, Types.VARCHAR);
      
      /* Executa e resgata o valor de saida */
      cs.executeUpdate();
      String retorno = cs.getString(2);
      
      /* Exibe o resultado. */
      System.out.println(retorno);
      
      /* Fecha os recursos utilizados */
      cs.close();
      cn.close();
      
    } catch (InputMismatchException e) {
      System.out.println(
        "O valor informado nao e numerico");
    } catch (SQLException e) {
      System.out.println(
        "Falha ao executar procedure");
      e.printStackTrace();
    }
  }
}
