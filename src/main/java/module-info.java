module com.example.tryapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tryapp to javafx.fxml;
    exports com.example.tryapp;
}