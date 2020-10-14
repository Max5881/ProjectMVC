package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {

    @FXML
    private Label labelHello;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtEmail;

    @FXML
    public void pressButton(ActionEvent event) {
        String str = txtName.getText();
         String str1 = txtEmail.getText();
         if (!str.isEmpty()&& !str1.isEmpty()){
             labelHello.setText("Вы зарегистрированны");
         }
         if (!str.isEmpty()&&str1.isEmpty()){
             labelHello.setText("Введите Email");
         }
         if (str.isEmpty()&&!str1.isEmpty()){
             labelHello.setText("Введите Имя");
         }
         if (str.isEmpty()&&str1.isEmpty()){
             labelHello.setText("Введите Имя и Email");
         }

    }

}
