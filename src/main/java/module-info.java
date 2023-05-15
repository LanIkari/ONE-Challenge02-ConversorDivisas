module com.one.challenge02 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires eu.hansolo.tilesfx;

    opens com.one.challenge02 to javafx.fxml;
    exports com.one.challenge02;
}