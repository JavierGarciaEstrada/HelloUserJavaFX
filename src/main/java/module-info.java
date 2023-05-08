module com.example.hellouser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellouser to javafx.fxml;
    exports com.example.hellouser;
}