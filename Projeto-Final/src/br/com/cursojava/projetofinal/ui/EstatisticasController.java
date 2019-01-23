package br.com.cursojava.projetofinal.ui;

import br.com.cursojava.projetofinal.dao.DAOException;
import br.com.cursojava.projetofinal.dao.FuncionarioDAO;
import br.com.cursojava.projetofinal.model.ResumoSalarial;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class EstatisticasController {

  @FXML
  private TextArea txtResumo;

  @FXML
  private Label lblMensagem;

  @FXML
  void initialize() {
    
    try {

      FuncionarioDAO dao = new FuncionarioDAO();
      ResumoSalarial resumo = dao.findResumo();
      
      StringBuilder builder = new StringBuilder();
      
      builder.append("Maior Salário: ");
      builder.append(String.format("%,.2f", resumo.getMaiorSalario()));
      builder.append("\n");
      
      builder.append("Menor Salário: ");
      builder.append(String.format("%,.2f", resumo.getMenorSalario()));
      builder.append("\n");
      
      builder.append("Média Salarial: ");
      builder.append(String.format("%,.2f", resumo.getMediaSalarial()));
      builder.append("\n");
      
      builder.append("Total de salários: ");
      builder.append(String.format("%,.2f", resumo.getTotalSalario()));
      
      txtResumo.setText(builder.toString());

    } catch (DAOException e) {
      lblMensagem.setText(e.getMessage());
      e.printStackTrace();
    }
  }
}
