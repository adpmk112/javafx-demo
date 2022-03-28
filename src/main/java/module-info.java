module com.example.javafxdemo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.commons.io;


    opens com.example.javafxdemo to javafx.fxml;
    exports com.example.javafxdemo;
}