package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.projetofinal.model.Cargo;
import br.com.cursojava.projetofinal.model.Funcionario;
import br.com.cursojava.projetofinal.model.ResumoSalarial;
// HERDA CONEXÂO DA CLASSE ABSTRACDAO
public class FuncionarioDAO extends AbstractDAO {

	//MÈTODO DE SALVAR FUNCIONARIO
  public void save(Funcionario funcionario)
      throws DAOException {
    
    Connection cn = null;
    PreparedStatement ps = null;
    
    try {
      
      cn = getConnection();
      ps = cn.prepareStatement(
        "INSERT INTO tab_func " +
        "(func_name, func_rmnt_val, role_code) " +
        "VALUES (?, ?, ?)");
      
      ps.setString(1, funcionario.getNome());
      ps.setDouble(2, funcionario.getSalario());
      ps.setInt(3, funcionario.getCargoId());
      ps.executeUpdate();
      
    } catch (SQLException e) {
      throw new DAOException(
        "Não foi possível salvar o funcionário", e);
    } finally {
      closeResources(cn, ps, null);
    }
  }
 
  //METODO DE DELETAR O FUNCIONARIO
  public void delete(Integer id) throws DAOException {
	  Connection cn = null;
	  PreparedStatement ps = null;
	  
	  
	  try {
		cn = getConnection();
		ps = cn.prepareStatement("delete from tab_func where func_code=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
		
		
	} catch (SQLException e) {
		throw new DAOException("Falha na remoção de funcionário", e);
	}
	  finally {
		closeResources(cn, ps, null);
	}
  }
  
  //METODO DE PROCURAR FUNCIONARIO SEM PARAMETROS
  public List<Funcionario> findAll() throws DAOException  {
	  
	  Connection cn = null;
	  Statement st = null;
	  ResultSet rs = null;
	  
	  try {
		  cn = getConnection();
		  st = cn.createStatement();
		  rs = st.executeQuery("SELECT *" +
			        "FROM tab_func");
		  
		  /*Cria Uma Lista Vazia*/
		  List<Funcionario> funcionarioLista = new ArrayList<>();
		  
		  /*Popula a lista de funcionario*/
		  while(rs.next()) {
			  Funcionario funcionario = new Funcionario();
			  funcionario.setId(rs.getInt("func_code"));
			  funcionario.setNome(rs.getString("func_name"));
			  funcionario.setSalario(rs.getDouble("func_rmnt_val"));
			  funcionarioLista.add(funcionario);
		  }
		  
		  
		  return funcionarioLista;
		  
	} catch (SQLException e) {
	    throw new DAOException(
	            "Falha ao obter lista de funcionarios.", e);
	} finally {
		closeResources(cn, st, rs);
	}
  }
  
  //METODO PROCURA FUNCIONARIO COM PARAMETRO STRING NOME
  public List<Funcionario> findByName(String nome) throws DAOException{
	  Connection cn = null;
	  PreparedStatement ps = null;
	  ResultSet rs = null;
	  
	  try {
		  cn = getConnection();
		  
		  ps = cn.prepareStatement( "SELECT func_code, func_name, func_rmnt_val FROM tab_func WHERE func_name LIKE ?");
		 /*Passagem de parametro nome com like*/
		  ps.setString(1,nome + '%');
		  
		  rs = ps.executeQuery();
		  
		  /*Cria Uma Lista Vazia*/
		  List<Funcionario> funcionarioLista = new ArrayList<>();
		  
		  /*Popula a lista de funcionario*/
		  while(rs.next()) {
			  Funcionario funcionario = new Funcionario();
			  funcionario.setId(rs.getInt("func_code"));
			  funcionario.setNome(rs.getString("func_name"));
			  funcionario.setSalario(rs.getDouble("func_rmnt_val"));
			  funcionarioLista.add(funcionario);
		  }
		  
		  return funcionarioLista;
		  
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		closeResources(cn, ps, rs);
	}
	return null;
	
	  
	  
  }
  
  
  public ResumoSalarial findResumo()
      throws DAOException {
    
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    
    try {

      cn = getConnection();
      st = cn.createStatement();
      rs = st.executeQuery(
          "SELECT " +
          "  MAX(func_rmnt_val) maior, " +
          "  MIN(func_rmnt_val) menor, " +
          "  AVG(func_rmnt_val) media, " +
          "  SUM(func_rmnt_val) total  " +
          "FROM tab_func;");

      ResumoSalarial resumo = null;

      if (rs.next()) {
        resumo = new ResumoSalarial();
        resumo.setMaiorSalario(rs.getDouble("maior"));
        resumo.setMenorSalario(rs.getDouble("menor"));
        resumo.setMediaSalarial(rs.getDouble("media"));
        resumo.setTotalSalario(rs.getDouble("total"));
      }
      
      return resumo;
      
    } catch (SQLException e) {
      throw new DAOException(
        "Falha ao obter dados estatisticos", e);
    } finally {
      closeResources(cn, st, rs);
    }
  }
}
