module sample.lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.lab2 to javafx.fxml;
    exports sample.lab2;
}