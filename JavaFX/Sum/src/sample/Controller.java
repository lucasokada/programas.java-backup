package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Button btSum;

    @FXML
    private Label labelResult;

    @FXML
    public void onBtSumAction()
    {
        try{
            double num1 = Double.parseDouble(txtNumber1.getText());
            double num2 = Double.parseDouble(txtNumber2.getText());
            double sum = num1 + num2;
            labelResult.setText(String.format("%.2f", sum));

        }catch(NumberFormatException e){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText(e.getMessage());
            alert.setHeaderText("Error");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //metodo que é executado quando o controlador é criado
        //URL = caminho da tela; ResourceBundle = recursos que podem ser usados
        int max = 10;

        Constraints.setTextFieldDouble(txtNumber1);
        Constraints.setTextFieldDouble(txtNumber2);
        Constraints.setTextFieldInteger(txtNumber1);
        Constraints.setTextFieldInteger(txtNumber2);
        Constraints.setTextFieldMaxLenght(txtNumber1, max);
        Constraints.setTextFieldMaxLenght(txtNumber2, max);
    }
}
