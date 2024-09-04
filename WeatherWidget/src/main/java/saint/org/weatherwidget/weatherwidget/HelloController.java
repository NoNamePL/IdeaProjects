package saint.org.weatherwidget.weatherwidget;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;


public class HelloController {
    @FXML
    public Label temperature;

    @FXML
    public LineChart<String,Number> lineChart;
    @FXML
    private CategoryAxis xAxis;
    @FXML
    private NumberAxis yAxis;
    @FXML
    private Pane panelView;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        lineChart.getData().clear();

        welcomeText.setText("Welcome to JavaFX Application!");

        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        series.getData().add(new XYChart.Data<String,Number>("00:00",22));
        series.getData().add(new XYChart.Data<String,Number>("01:00",17));
        series.getData().add(new XYChart.Data<String,Number>("02:00",20));
        series.getData().add(new XYChart.Data<String,Number>("03:00",25));
        series.getData().add(new XYChart.Data<String,Number>("04:00",30));
        series.getData().add(new XYChart.Data<String,Number>("05:00",24));

        series.setName("Number of temperatures");

        lineChart.getData().add(series);

    }

    @FXML
    public void visualizeGrafico() {

        // Create a new Axes
        xAxis = new CategoryAxis();
        yAxis = new NumberAxis();


        // Set xAxis's name
        xAxis.setLabel("Time");

        // Set yAxis's name
        yAxis.setLabel("Temperature");

        // Creating the chart
        lineChart = new LineChart<String, Number>(xAxis, yAxis);

        // Defining a series
        Series series = new Series();

        series.setName("Temperature");
        series.getData().add(new XYChart.Data("00:00",20));
        series.getData().add(new XYChart.Data("01:00",26));
        series.getData().add(new XYChart.Data("02:00",24));


        lineChart.setMaxWidth(200);
        lineChart.setMaxHeight(200);

        lineChart.getData().add(series);


    }
}