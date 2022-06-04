package sample.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    public Button bntMain;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    int clickCounter = 0;

    public void onBntAction(ActionEvent actionEvent) {
    System.out.println("Klinknietcie nr "+ ++clickCounter);
    if (clickCounter == 1)
        bntMain.setText("I jeszcze raz");
    }
}