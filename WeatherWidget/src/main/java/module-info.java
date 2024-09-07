module saint.org.weatherwidget.weatherwidget {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens saint.org.weatherwidget.weatherwidget to javafx.fxml;
    exports saint.org.weatherwidget.weatherwidget;
}