package br.com.cursojava.projetofinal.ui;

import java.util.List;

import br.com.cursojava.projetofinal.dao.CargoDAO;
import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.model.Cargo;
import br.com.cursojava.projetofinal.model.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroFuncionarioController {

  @FXML
  private ComboBox<Cargo> cmbCargo;

  @FXML
  private TextField txtNome;

  @FXML
  private TextField txtSalario;

  @FXML
  private Label lblMensagem;

  @FXML
  void initialize() {
    
    try {

      /* Cargo fake */
      Cargo cargoFake = new Cargo();
      cargoFake.setId(0);
      cargoFake.setNome("[Escolha um cargo]");
      
      /* Adiciona um item e o seleciona */
      cmbCargo.getItems().add(cargoFake);
      cmbCargo.getSelectionModel().select(0);
      
      /* Obtem a lista de cargos do banco */
      CargoDAO dao = new CargoDAO();
      List<Cargo> lista = dao.findAll();
      cmbCargo.getItems().addAll(lista);

    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }
  
  @FXML
  void salvarOnAction(ActionEvent event) {

    try {

      Funcionario func = new Funcionario();
      
      /* Assinala o nome */
      func.setNome(txtNome.getText());
      
      /* Assinala o id do cargo selecionado no combo */
      func.setCargoId(cmbCargo.getValue().getId());
      
      /* Assinala o salario */
      double salario = Double.parseDouble(
          txtSalario.getText());
      func.setSalario(salario);
      
      /* Salva o funcionario na base */
      FuncionarioDAO dao = new FuncionarioDAO();
      dao.save(func);
      
      limparOnAction(event);
      lblMensagem.setText("Cadastrado com sucesso.");

    } catch (NumberFormatException e) {
      lblMensagem.setText("Salário inválido.");
      e.printStackTrace();
    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }

  @FXML
  void limparOnAction(ActionEvent event) {
    txtNome.setText("");
    cmbCargo.getSelectionModel().select(0);
    txtSalario.setText("");
    lblMensagem.setText("");
  }
}
