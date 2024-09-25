package saint.org.weatherwidget.weatherwidget.ParseWeather;


import com.fasterxml.jackson.databind.ObjectMapper;
import saint.org.weatherwidget.weatherwidget.FileData.FileData;
import saint.org.weatherwidget.weatherwidget.WeatherDate.WeatherDate;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ParseWeather {

    private WeatherDate weather;

    public ParseWeather() throws IOException {

        String notFullUrl = "https://api.openweathermap.org/data/2.5/forecast?lat=%f&lon=%f&appid=%s";
        // get date log file and past it to url
        FileData data = getDatas();
        String fullUrl = String.format(notFullUrl, data.getLat(), data.getLon(), data.getAppid());
        // get weather json request
        weather = getWeather(fullUrl);

//        System.out.println(weather.getCity().getName());

    }

    public static FileData getDatas() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        // read file
        File file = new File("src/main/resources/saint/org/weatherwidget/weatherwidget/logfile.json");

        StringBuilder result = new StringBuilder();
        try (java.util.Scanner scanner = new java.util.Scanner(file)) {
            while (scanner.hasNextLine()) {
                result.append(scanner.nextLine()).append("\n");
            }
        }
        System.out.println(result);

        FileData fileData = mapper.readValue(result.toString(), FileData.class);
        return fileData;
    }

    public WeatherDate getWeather(String fullUrl) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        URL url = new URL(fullUrl);
        HttpURLConnection con =  (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }
//        while(in.readLine()!=null) {
//            response.append(in.readLine()).append("\n");
//        }

        in.close();

        System.out.println("response: " + response.toString());

        WeatherDate weather = mapper.readValue(response.toString(),WeatherDate.class);

        return weather;
    }

    public WeatherDate getWeather() {
        return weather;
    }

}
