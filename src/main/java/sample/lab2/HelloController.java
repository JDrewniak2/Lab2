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

        double dpromienw = Double.parseDouble(promienw);
        double dwysokoscw = Double.parseDouble(wysokoscw);
        double dgruboscw = Double.parseDouble(gruboscw);

   if(dpromienw <= 0 || dwysokoscw <= 0 || dgruboscw <= 0){
       System.out.printf("Test");
    }
}
}