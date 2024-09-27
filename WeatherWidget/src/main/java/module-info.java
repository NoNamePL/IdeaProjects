module saint.org.weatherwidget.weatherwidget {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    exports saint.org.weatherwidget.weatherwidget.FileData;
    exports saint.org.weatherwidget.weatherwidget.WeatherDate;
    exports saint.org.weatherwidget.weatherwidget.Cur;
    requires static lombok;
    requires com.google.gson;


    opens saint.org.weatherwidget.weatherwidget to javafx.fxml;
    exports saint.org.weatherwidget.weatherwidget;
    exports saint.org.weatherwidget.weatherwidget.Controllers;
    opens saint.org.weatherwidget.weatherwidget.Controllers to javafx.fxml;
}