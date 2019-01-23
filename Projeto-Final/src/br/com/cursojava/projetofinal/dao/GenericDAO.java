package br.com.cursojava.projetofinal.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class GenericDAO extends AbstractDAO {

  public String executeExtenso(int numero)
      throws DAOException {

    Connection cn = null;
    CallableStatement cs = null;
    
    try {
      
      /* Abre a conexao */
      cn = getConnection();
      
      /* Prepara a chamada da procedure */
      cs = cn.prepareCall(
        "{ call prc_numero_extenso(?, ?) }");
      
      /* Preenche o parametro de entrada */
      cs.setInt(1, numero);
      
      /* Registro o parametro de saida */
      cs.registerOutParameter(2, Types.VARCHAR);
      
      /* Executa a procedure */
      cs.executeUpdate();
      
      /* Obtem o valor do parametro de saida */
      return cs.getString(2);
      
    } catch (SQLException e) {
      throw new DAOException(
        "Falha ao executar procedure", e);
    } finally {
      closeResources(cn, cs, null);
    }
  }
}
