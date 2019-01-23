package br.com.cursojava.projetofinal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.cursojava.projetofinal.model.Cargo;

public class CargoDAO extends AbstractDAO {

	
	//METODO SALVAR CARGO
  public void save(Cargo cargo) throws DAOException {

    Connection cn = null;
    PreparedStatement ps = null;
    
    try {
      
      cn = getConnection();
      ps = cn.prepareStatement(
        "INSERT INTO tab_role (role_name) VALUES (?)");
      
      ps.setString(1, cargo.getNome());
      ps.executeUpdate();
      
    } catch (SQLException e) {
      throw new DAOException(
        "Não foi possível salvar o cargo", e);
    } finally {
      closeResources(cn, ps, null);
    }
  }
 
  //METODO DELETAR CARGO
  public void delete(Integer id) throws DAOException{
	  Connection cn = null;
	  PreparedStatement ps = null;
	  
	  try {
		cn = getConnection();
		ps = cn.prepareStatement("DELETE FROM tab_role WHERE role_code=?");
		ps.setInt(1, id);
		ps.executeUpdate();
		ps.close();
	} catch (SQLException e) {
		throw new DAOException("Falha ao deletar cargo", e);
		
	}finally {
		closeResources(cn, ps, null);
	}
	  
  }
  
  
  //METODO PROCURAR TODOS OS CARGOS
  public List<Cargo> findAll() throws DAOException {
    
    Connection cn = null;
    Statement st = null;
    ResultSet rs = null;
    
    try {
      
      cn = getConnection();
      st = cn.createStatement();
      rs = st.executeQuery(
        "SELECT role_code, role_name " +
        "FROM tab_role ORDER BY role_code");
      
      /* Cria uma lista vazia */
      List<Cargo> cargoLista = new ArrayList<>();
      
      /* Popula a lista com cargos */
      while (rs.next()) {
        Cargo cargo = new Cargo();
        cargo.setId(rs.getInt("role_code"));
        cargo.setNome(rs.getString("role_name"));
        cargoLista.add(cargo);
      }
      
      return cargoLista;
      
    } catch (SQLException e) {
      throw new DAOException(
        "Falha ao obter lista de cargos.", e);
    } finally {
      closeResources(cn, st, rs);
    }
  }
  
  
  //METODO PARA PROCURAR CARGO ATRAVES DA PASSAGEM DE PARAMETRO DO TIPO STRING 
  public List<Cargo> findByName(String nome) throws DAOException {
    
    Connection cn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      
      cn = getConnection();
      ps = cn.prepareStatement(
        "SELECT role_code, role_name " +
        "FROM tab_role WHERE role_name LIKE ? " +
        "ORDER BY role_name");
      
      /*
       * Preenche o criterio de busca com 
       * o nome recebido da classe controladora
       */
      ps.setString(1, nome);
      
      /* Executa a busca */
      rs = ps.executeQuery();

      /* Cria uma lista vazia */
      List<Cargo> cargoLista = new ArrayList<>();
      
      /* Popula a lista de cargos */
      while (rs.next()) {
        Cargo cargo = new Cargo();
        cargo.setId(rs.getInt("role_code"));
        cargo.setNome(rs.getString("role_name"));
        cargoLista.add(cargo);
      }
      
      return cargoLista;
      
    } catch (SQLException e) {
      throw new DAOException(
        "Falha ao obter lista de cargos.", e);
    } finally {
      closeResources(cn, ps, rs);
    }
  }
}
