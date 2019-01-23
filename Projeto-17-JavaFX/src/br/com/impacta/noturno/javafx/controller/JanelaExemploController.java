package br.com.impacta.noturno.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class JanelaExemploController {

  @FXML
  private RadioButton radOpcao1;

  @FXML
  private RadioButton radOpcao2;

  @FXML
  private TextField txtResultado;

  @FXML
  private TextField txtNome;

  @FXML
  private ToggleGroup opcoes;

  public void initialize() {
    txtNome.setText("Ola, Mundo!");
  }
}
