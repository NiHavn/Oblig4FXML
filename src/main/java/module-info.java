module com.example.oblig4fxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oblig4fxml to javafx.fxml;
    exports com.example.oblig4fxml;
}