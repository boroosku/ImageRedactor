module com.boroosku.imageredactor {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires com.google.gson;
    requires opencv;


    opens com.boroosku.imageredactor to javafx.fxml;
    exports com.boroosku.imageredactor;
}