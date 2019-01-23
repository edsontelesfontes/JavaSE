package br.com.cursojava.projetofinal.ui;

import java.util.List;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.model.Cargo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class PesquisaCargoController {

  @FXML
  private TextField txtNomeCargo;

  @FXML
  private TableView<Cargo> tabCargo;

  @FXML
  private TableColumn<Cargo, String> colNome;

  @FXML
  private TableColumn<Cargo, Integer> colId;

  @FXML
  private Label lblMensagem;

  @FXML
  void initialize() {
    /*
     * Configura os atributos a serem exibidos
     * nas colunas
     */
    colId.setCellValueFactory(
        new PropertyValueFactory<>("id"));
    colNome.setCellValueFactory(
        new PropertyValueFactory<>("nome"));
  }
  

  @FXML
  void btnDelete(ActionEvent event) {

	  try {
		  int takeID = tabCargo.getSelectionModel().getSelectedItem().getId();
		  CargoDAO dao = new CargoDAO();
		  dao.delete(takeID);
		  
		  	lblMensagem.setText("Cargo deletado com sucesso !");
		  	
		  	procurarOnAction(event);
	} catch (DAOException e) {
		lblMensagem.setText("Falha ao deletar cargo !");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }

  @FXML
  void procurarOnAction(ActionEvent event) {

    try {

      /* Limpa o grid */
      tabCargo.getItems().clear();
      
      /* Pesquisa os cargos na base de dados */
      CargoDAO dao = new CargoDAO();
      
      
     if(txtNomeCargo.getText().equals("")) {
    	List<Cargo> listaSemParametro = dao.findAll(); 
    
    	  /* Preenche o grid com os cargos sem parametros de busca */
    	tabCargo.getItems().addAll(listaSemParametro);
    	
    	   /*mostra quantos resultados foram obtidos através da busca por cargos*/
    	 lblMensagem.setText("Todos os "+ listaSemParametro.size()+" Cargo(s)");
    	
     } else {

    	 List<Cargo> lista = dao.findByName(
          txtNomeCargo.getText());
      
    	 /* Preenche o grid com os cargos encontrados */
    	 tabCargo.getItems().addAll(lista);
      
    	 /*mostra quantos resultados foram obtidos através da busca por cargos*/
    	 if(lista.size() == 0 ) {
    		 lblMensagem.setText("Nenhum cargo foi encontrado");}
    	 else {
    		 lblMensagem.setText("Busca Concluida !\nForam encontrados "+ lista.size()+" Cargo(s)");
    	 }
      
     }
  
     
    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }
}





