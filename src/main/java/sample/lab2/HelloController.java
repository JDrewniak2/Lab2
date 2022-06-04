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

        String promienw = promien.getText();
        String wysokoscw = wysokosc.getText();
        String gruboscw = grubosc.getText();

        double calanierdzewna = 0;
        double calastalowa = 0;
        double wagastalowa = 7.85d; // waga blachy z internetu m^2
        double nierdzewnawaga = 8; // waga blachy z internetu m^2
        double dpromienw = Double.parseDouble(promienw);
        double dwysokoscw = Double.parseDouble(wysokoscw);
        double dgruboscw = Double.parseDouble(gruboscw);

//        if (dpromienw <= 0 || dwysokoscw <= 0 || dgruboscw <= 0) {
//            System.out.println("Błąd");
//            return;
//        }
        double poleb = 2 * 3.14 * dpromienw * dwysokoscw;
        double polep = 2 * 3.14 * dpromienw * dpromienw;
        double polec = poleb + polep;
        String ilemetrow = Double.toString(polec / 10000);
        calastalowa = (polec / 10000) * dgruboscw * wagastalowa;
        calanierdzewna = (polec / 10000) * dgruboscw * nierdzewnawaga;
        String ilemetrowS = Double.toString(calastalowa);
        String ilemetrowN = Double.toString(calanierdzewna);


        System.out.println("Do stworzenia walca stalowego potrzeba będzie " + ilemetrow + " metrów kwadratowych materiału, waży ona " + ilemetrowS + " kg");
        System.out.println("Do stworzenia walca stalowego nierdzewnego potrzeba będzie " + ilemetrow + " metrów kwadratowych materiału, waży ona " + ilemetrowN + " kg");

    }
}