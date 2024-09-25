package saint.org.weatherwidget.weatherwidget.Cur;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import saint.org.weatherwidget.weatherwidget.FileData.FileData;
import saint.org.weatherwidget.weatherwidget.ParseWeather.ParseWeather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Currency;

@Setter
@Getter
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cur {

    private boolean success;
    private String terms;
    private String privacy;
    private double result;

    public static Cur getCurCurrency(String fullUrl) throws IOException {

        ObjectMapper map = new ObjectMapper();

        // Full url string
        FileData logfile = ParseWeather.getDatas();
        fullUrl = String.format(fullUrl, logfile.getAccess_key());


        URL url = new URL(fullUrl);
        HttpURLConnection con =  (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();
        while ((inputLine = in.readLine()) != null){
            response.append(inputLine);
        }

        in.close();


        try {
            Cur cur = map.readValue(response.toString(), Cur.class);
            return cur;
        } catch (Exception e) {
            System.out.println("Error parsing JSON: " + e.getMessage());
            return null;
        }
    }

}