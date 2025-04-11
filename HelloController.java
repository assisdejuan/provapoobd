
package com.example.gerenciarTarefas;

import com.example.gerenciarTarefas.models.Contato;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;

public class HelloController {

    @FXML
    private TextField titulo;

    @FXML
    private TextField descricao;

    @FXML
    private TextField prioridade;

    @FXML
    private TextField tarefa1;

    @FXML
    private TextField tarefa2;

    @FXML
    private TextArea tarefa3;

    @FXML
    protected void handleForm() {
        Contato contato = new Contato();

        contato.setTitulo(titulo.getText());
        contato.setDescricao(descricao.getText());
        contato.setPrioridade(prioridade.getText());
        contato.setTarefa1(tarefa1.parseLong(telefone.getText()));
        contato.setTarefa2(tarefa2.getText());
        contato.setTarefa3(tarefa3.getText());

        showAlert(concluida);
        limparCampos();
    }

    private void showAlert(Contato concluida){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Tarefas");
        alert.setHeaderText("Tarefas salvas");
        alert.setContentText("As tarefas: \n " + contato.toString() + "\n" + "foram salvas");
        System.out.println("Aqui");
        alert.showAndWait();

    }

    private void limparCampos(){
        titulo.clear();
        descricao.clear();
        prioridade.clear();
        tarefa1.clear();
        tarefa2.clear();
        tarefa3.clear();
    }
}
