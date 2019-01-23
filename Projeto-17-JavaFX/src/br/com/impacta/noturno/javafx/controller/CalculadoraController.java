package br.com.impacta.noturno.javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculadoraController {

  @FXML
  private TextField txtValor1;

  @FXML
  private TextField txtValor2;

  @FXML
  private TextField txtResultado;

  @FXML
  void somaOnAction(ActionEvent event) {

    /* Coleta os valores */
    String temp1 = txtValor1.getText();
    String temp2 = txtValor2.getText();
    
    /* Converte os valores para double */
    double val1 = Double.parseDouble(temp1);
    double val2 = Double.parseDouble(temp2);
    
    /* Realiza a operacao */
    double result = val1 + val2;
    
    /* Exibe o resultado na tela */
    txtResultado.setText(result + "");
  }

  @FXML
  void subtraiOnAction(ActionEvent event) {

    /* Coleta os valores */
    String temp1 = txtValor1.getText();
    String temp2 = txtValor2.getText();
    
    /* Converte os valores para double */
    double val1 = Double.parseDouble(temp1);
    double val2 = Double.parseDouble(temp2);
    
    /* Realiza a operacao */
    double result = val1 - val2;
    
    /* Exibe o resultado na tela */
    txtResultado.setText(result + "");
  }

  @FXML
  void multiplicaOnAction(ActionEvent event) {

    /* Coleta os valores */
    String temp1 = txtValor1.getText();
    String temp2 = txtValor2.getText();
    
    /* Converte os valores para double */
    double val1 = Double.parseDouble(temp1);
    double val2 = Double.parseDouble(temp2);
    
    /* Realiza a operacao */
    double result = val1 * val2;
    
    /* Exibe o resultado na tela */
    txtResultado.setText(result + "");
  }

  @FXML
  void divideOnAction(ActionEvent event) {

    /* Coleta os valores */
    String temp1 = txtValor1.getText();
    String temp2 = txtValor2.getText();
    
    /* Converte os valores para double */
    double val1 = Double.parseDouble(temp1);
    double val2 = Double.parseDouble(temp2);
    
    /* Realiza a operacao */
    double result = val1 / val2;
    
    /* Exibe o resultado na tela */
    txtResultado.setText(result + "");
  }
}
