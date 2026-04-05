module com.example.project6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project6 to javafx.fxml;
    exports com.example.project6;
}