package saint.org.weatherwidget.weatherwidget;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import saint.org.weatherwidget.weatherwidget.ParseWeather.ParseWeather;
import saint.org.weatherwidget.weatherwidget.WeatherDate.WeatherDate;


public class HelloController {
    @FXML
    public Label currentTempLab;

    @FXML
    public LineChart<String,Number> lineChart;
    @FXML

    public ImageView weatherImage;
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

        double temp = 0;
        String time = "";
        ParseWeather parse = null;

        // clear lineChart
        lineChart.getData().clear();

        welcomeText.setText("Welcome to JavaFX Application!");

        // create list of points for lineChart
        Series<String, Number> series = new Series<String, Number>();

        // pare date from open weather

        try {
            parse = new ParseWeather();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // get temperature from api and add it to lineChart data
        WeatherDate weather = parse.getWeather();
        for(int i = 0;i < 10;i++) {
            temp = weather.getList().get(i).getMain().getTemp_min() - 273.15;
            time = weather.getList().get(i).getDt_txt();

            time = time.substring(time.indexOf(' '));

            series.getData().add(new XYChart.Data<String, Number>(time, temp));
        }


        // set current temp into the label
        double currentTemp = weather.getList().getFirst().getMain().getTemp_min() - 273.15;
        currentTempLab.setText(String.valueOf(currentTemp));


        // set image to weatherImage
        try {
            Image img = new Image(getClass().getResourceAsStream("/img/cloudy.png"));
            weatherImage.setImage(img);
        } catch (Exception e) {
            System.out.println("Error is here");
            e.printStackTrace();
        }


//        series.getData().add(new XYChart.Data<String, Number>("00:00", temp));
//        series.getData().add(new XYChart.Data<String, Number>("01:00", 17));
//        series.getData().add(new XYChart.Data<String, Number>("02:00", 20));
//        series.getData().add(new XYChart.Data<String, Number>("03:00", 25));
//        series.getData().add(new XYChart.Data<String, Number>("04:00", 30));
//        series.getData().add(new XYChart.Data<String, Number>("05:00", 24));

        series.setName("Number of temperatures");

        lineChart.getData().add(series);

    }

//    @FXML
//    public void visualizeGrafico() {
//
//        // Create a new Axes
//        xAxis = new CategoryAxis();
//        yAxis = new NumberAxis();
//
//
//        // Set xAxis's name
//        xAxis.setLabel("Time");
//
//        // Set yAxis's name
//        yAxis.setLabel("Temperature");
//
//        // Creating the chart
//        lineChart = new LineChart<String, Number>(xAxis, yAxis);
//
//        // Defining a series
//        Series series = new Series();
//
//        series.setName("Temperature");
//        series.getData().add(new XYChart.Data("00:00",20));
//        series.getData().add(new XYChart.Data("01:00",26));
//        series.getData().add(new XYChart.Data("02:00",24));
//
//
//        lineChart.setMaxWidth(200);
//        lineChart.setMaxHeight(200);
//
//        lineChart.getData().add(series);
//
//
//    }
}