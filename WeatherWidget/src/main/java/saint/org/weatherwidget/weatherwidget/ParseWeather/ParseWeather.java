package saint.org.weatherwidget.weatherwidget.ParseWeather;

import saint.org.weatherwidget.weatherwidget.Data.*;

import java.io.IOException;

public class ParseWeather {
    String notFullUrl = "https://api.openweathermap.org/data/2.5/forecast?lat=%,d&lon=%,d&appid=%s";
    Data data = getDatas.getDatas();
    String fullUrl = String.format(notFullUrl, data.getLat(), data.getLon(), data.getAppid());


    public ParseWeather() throws IOException {
    }
}