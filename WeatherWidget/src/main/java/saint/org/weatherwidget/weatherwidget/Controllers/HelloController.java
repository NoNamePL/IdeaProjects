package saint.org.weatherwidget.weatherwidget.Controllers;

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
import saint.org.weatherwidget.weatherwidget.Cur.Cur;
import saint.org.weatherwidget.weatherwidget.FileData.FileData;
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
            // get temp
            temp = weather.getList().get(i).getMain().getTemp_min() - 273.15;
            //convert to int
            int intTemp = (int)Math.round(temp);

            // get time and convert it to readable form
            time = weather.getList().get(i).getDt_txt();
            time = time.substring(time.indexOf(' '));

            series.getData().add(new XYChart.Data<String, Number>(time, intTemp));
        }


        // set current temp into the label
        double currentTemp = weather.getList().getFirst().getMain().getTemp_min() - 273.15;
        currentTempLab.setText(String.valueOf(currentTemp));

        System.out.println(weather.getList().getFirst().getWeather().getFirst().getMain());

        // set image to weatherImage
        Image img = null;

        switch (weather.getList().getFirst().getWeather().getFirst().getMain()) {
            case "Clouds":
                img = new Image(getClass().getResourceAsStream("/saint/org/weatherwidget/weatherwidget/img/cloudy.png"));
                weatherImage.setImage(img);
                break;
            case "Clear":
                img = new Image(getClass().getResourceAsStream("/saint/org/weatherwidget/weatherwidget/img/clear.png"));
                weatherImage.setImage(img);
                break;
            case "Rain":
                img = new Image(getClass().getResourceAsStream("/saint/org/weatherwidget/weatherwidget/img/rain.png"));
                weatherImage.setImage(img);
                break;
            case "Snow":
                img = new Image(getClass().getResourceAsStream("/saint/org/weatherwidget/weatherwidget/img/snow.png"));
                weatherImage.setImage(img);
                break;
            case "Storm":
                img = new Image(getClass().getResourceAsStream("/saint/org/weatherwidget/weatherwidget/img/storm.png"));
                weatherImage.setImage(img);
                break;
        }

        Cur dollars = Cur.getCurCurrency("https://api.currencylayer.com/convert?access_key=&from=USD&to=RUB&amount=100");
        System.out.println(cur.getDollar().toString());

        series.setName("Number of temperatures");

        lineChart.getData().add(series);

    }
}