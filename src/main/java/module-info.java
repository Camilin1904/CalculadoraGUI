module com.calculator {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.calculator to javafx.fxml;
    exports com.calculator;
}
