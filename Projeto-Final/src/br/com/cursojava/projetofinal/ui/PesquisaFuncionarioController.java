package br.com.cursojava.projetofinal.ui;

import java.util.List;

import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.model.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

public class PesquisaFuncionarioController {
	int takeID;
    @FXML
    private TextField txtNomeFuncionario;

    @FXML
    private TableView<Funcionario> tabFuncionario;

    @FXML
    private TableColumn<Funcionario, Integer> codID;

    @FXML
    private TableColumn<Funcionario, String> colFuncName;

    @FXML
    private TableColumn<Funcionario, Double> colSal;

    @FXML
    private Label lblMensagem;
    
    @FXML
    void btnDeletar(ActionEvent event) {
    	    	
    	try {
    	//Pega o ID do funcionario selecionado no grid
    		int takeID = tabFuncionario.getSelectionModel().getSelectedItem().getId();
    	
    	
    		FuncionarioDAO dao = new FuncionarioDAO();
		//Faz o delete do funcionario por meio do ID, chamando o método delete presente no funcionário DAO.
    		dao.delete(takeID);
    		
    	//Faz o refresh do GRID
			procurarOnAction(event);
			
		//Mostra que o funcionário foi removido
			lblMensagem.setText("Funcionário removido com sucesso !");
		} catch (DAOException e) {
			lblMensagem.setText("Falha ao remover funcionário !");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    @FXML
    void initialize() {
        /*
         * Configura os atributos a serem exibidos
         * nas colunas
         */
    	
    	codID.setCellValueFactory(
    	        new PropertyValueFactory<>("id"));
    	colFuncName.setCellValueFactory(
    	        new PropertyValueFactory<>("nome"));
    	colSal.setCellValueFactory(
    	        new PropertyValueFactory<>("salario"));
    }
    
    @FXML
    void procurarOnAction(ActionEvent event) { 
    	
    	try {
    		
    		tabFuncionario.getItems().clear();
    		
    		FuncionarioDAO dao = new FuncionarioDAO();
    	
    		
    		/*VERIFICA O TXT NOME FUNCIONARIO PARA VÊ SE ESTÀ VAZIO OU COM ALGUM DADO DE ENTRA */
    		if(txtNomeFuncionario.getText().equals("")) {
    		
    		
    		List<Funcionario> listaSemParametro = dao.findAll();
    			
    			tabFuncionario.getItems().addAll(listaSemParametro);
    		}
    		else {
    			List<Funcionario> listaComParametro = dao.findByName(txtNomeFuncionario.getText());
    			
    			tabFuncionario.getItems().addAll(listaComParametro);
    			
    		}
			
		} catch (DAOException e) {
			   lblMensagem.setText(e.getMessage());
			      e.printStackTrace();
		}
    	
    }

}
