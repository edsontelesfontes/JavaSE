package br.com.cursojava.projetofinal.ui;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.model.Cargo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroCargoController {

  @FXML
  private TextField txtNome;

  @FXML
  private Label lblMensagem;

  @FXML
  void salvarOnAction(ActionEvent event) {

    try {

      /* Realiza as validações da tela. */
      if (!isValid()) {
        return;
      }
      
      /* Coleta as informacoes de tela criando um VO */
      Cargo cargo = new Cargo();
      cargo.setNome(txtNome.getText());
      
      /* Envia os dados para o DAO gravar */
      CargoDAO dao = new CargoDAO();
      dao.save(cargo);
      
      limparOnAction(event);
      lblMensagem.setText("Gravado com sucesso.");

    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }

  @FXML
  void limparOnAction(ActionEvent event) {
    txtNome.setText("");
    lblMensagem.setText("");
  }
  
  private boolean isValid() {
    if (txtNome.getText().equals("")) {
      lblMensagem.setText(
        "O nome do cargo é obrigatório.");
      return false;
    }
    
    if (txtNome.getText().length() > 20) {
      lblMensagem.setText(
        "O nome do cargo deve possuir no " +
        "máximo 20 caracteres.");
      return false;
    }
    
    return true;
  }
}
