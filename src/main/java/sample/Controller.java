package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Label textField;
    public Button btn;

    public void onPress(ActionEvent actionEvent) {
        textField.setText("Кнопка то робит!!!!");
    }

    public void onPressBtn2(ActionEvent actionEvent) {
        btn.setText("Не ко мне пожалуйста");
    }
}
