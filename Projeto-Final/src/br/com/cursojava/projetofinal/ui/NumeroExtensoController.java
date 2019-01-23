package br.com.cursojava.projetofinal.ui;

import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.GenericDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class NumeroExtensoController {

  @FXML
  private TextArea txtDescricao;

  @FXML
  private TextField txtNumero;

  @FXML
  private Label lblMensagem;

  @FXML
  void numeroOnKeyReleased(KeyEvent event) {

    try {

      /*
       * Coleta o valor digitado
       * e converte para numero
       */
      int numero = Integer.parseInt(
          txtNumero.getText());
      
      /* Executa a procedure e obtem o resultado */
      GenericDAO dao = new GenericDAO();
      String result = dao.executeExtenso(numero);
      
      /* Exibe o resultado na caixa de texto */
      txtDescricao.setText(result);

    } catch (NumberFormatException e) {

      lblMensagem.setText("Numero invalido.");
      e.printStackTrace();

    } catch (DAOException e) {

      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }
}
