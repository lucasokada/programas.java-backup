package sample;

import javafx.scene.control.TextField;

public class Constraints {

    public static void setTextFieldInteger(TextField txt)
    {
        txt.textProperty().addListener((obs, oldValue, newValue) -> { //observanble(obs): referencia para o controle, valor antigo e novo valor
            if(newValue != null && !newValue.matches("\\d*")){ //matches("\\d*" -> expressao regular para um numero inteiro
                txt.setText(oldValue);
            }
        }); // Listener é uma funçao que sera executada cquando o controle sofrer alguma alteraçao
    } //fuçao aceita modificaçao apenas de digitos, senao, volta-se o valor de inicio

    public static void setTextFieldMaxLenght(TextField txt, int maxLenght)
    {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && newValue.length() > maxLenght){
                txt.setText(oldValue);
            }
        });
    } //verifica se o tamanho do valor é maior que o maximo, se for, o valor é setado com o valor antigo

    public static void setTextFieldDouble(TextField txt)
    {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if(newValue != null && newValue.matches("\\d*([\\.]\\d*)?")){ //expressao regular de um double
                txt.setText(oldValue);
            }
        });
    } // verificaçao de numero double com uma expressao regular
}
