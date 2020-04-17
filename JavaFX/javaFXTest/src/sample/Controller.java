package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

public class Controller { //classe responsavel por controlar a tela

    @FXML
    private Button button1; //atributo correspondente ao objeto na tela. No caso, o botao

    @FXML
    public void setButton1Action()
    {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Information Dialog");
        alert.setHeaderText("Message");''
        alert.setContentText("Great Message");

        alert.showAndWait();


    }
}
