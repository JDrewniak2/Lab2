package sample.lab2;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Button bntMain;
    public TextField promien;
    public TextField wysokosc;
    public TextField grubosc;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    int clickCounter = 0;

    public void onBntAction(ActionEvent actionEvent) {

        String promienw =promien.getText();
        String wysokoscw =wysokosc.getText();
        String gruboscw =grubosc.getText();

    System.out.println(promienw);
    System.out.println(wysokoscw);
    System.out.println(gruboscw);

    }
}