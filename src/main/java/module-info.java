module com.example.rabmobilecourt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.rabmobilecourt to javafx.fxml;
    exports com.example.rabmobilecourt;
}