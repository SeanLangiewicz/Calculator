module seanlangiewicz.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens seanlangiewicz.calculator to javafx.fxml;
    exports seanlangiewicz.calculator;
    exports view_controllers;
    opens view_controllers to javafx.fxml;
}