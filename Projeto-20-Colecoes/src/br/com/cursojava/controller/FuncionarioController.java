package br.com.cursojava.controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;

import br.com.cursojava.model.Funcionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Uma simples caixa de dialogo utilizada para a entrada de dados de um {@link Funcionario}.
 * @author sandro.vieira
 * @version 1.0, 27 de set de 2016 - sandro.vieira - Implementacao.
 */
public class FuncionarioController {
    
    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtSalario;

    @FXML
    private TextField txtIdade;

    @FXML
    private Label lblMensagem;

    private Stage stage;
    private Funcionario funcionario;

    /**
     * Exibe uma janela para entrada de dados de um funcionario.
     * @return Instancia de {@link Funcionario} com seus atributos preenchidos ou
     *         <b><code>null</code></b> quando usuario clicar em Cancelar ou Fechar.
     */
    public static Funcionario showInputFuncionario() {

        try {

            FXMLLoader loader = new FXMLLoader(FuncionarioController.class.getResource("/resource/Funcionario.fxml"));
            Parent parent = loader.load();
            Stage stage = new Stage();

            FuncionarioController controller = (FuncionarioController) loader.getController();
            controller.stage = stage;

            stage.setScene(new Scene(parent));
            stage.setResizable(false);
            stage.setTitle("Funcionário");
            stage.showAndWait();

            return controller.funcionario;

        } catch (IOException ioe) {
            throw new RuntimeException("Nao foi possivel carregar o template da tela de funcionarios", ioe);
        }
    }

    /**
     * Responde ao clique no botao Ok
     * @param event
     */
    @FXML
    void okOnAction(ActionEvent event) {

        int idade;
        double salario;

        /* Verifica se o usuario digitou um nome */
        if (txtNome.getText().equals("")) {
            lblMensagem.setText("O nome do funcionário é obrigatório");
            return;
        }

        /* Verifica se o usuario digitou uma idade valida */
        try {
            DecimalFormat mascara = new DecimalFormat("#,##0");
            idade = mascara.parse(txtIdade.getText()).intValue();
        } catch (ParseException e) {
            lblMensagem.setText("Idade inválida");
            return;
        }

        /* Verifica se o usuario digitou um salario valido */
        try {
            DecimalFormat mascara = new DecimalFormat("#,##0.00");
            salario = mascara.parse(txtSalario.getText()).doubleValue();
        } catch (ParseException e) {
            lblMensagem.setText("Salário inválido");
            return;
        }

        funcionario = new Funcionario();
        funcionario.setNome(txtNome.getText());
        funcionario.setIdade(idade);
        funcionario.setSalario(salario);

        stage.close();
    }

    /**
     * Responde ao clique no botao Cancelar
     * @param event
     */
    @FXML
    void cancelarOnAction(ActionEvent event) {
        funcionario = null;
        stage.close();
    }
}
