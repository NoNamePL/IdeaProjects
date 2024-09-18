package saint.org.weatherwidget.weatherwidget.WeatherDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class city {
    public int id;
    public String name;
    public coord coord;
    public String country;
    public int population;
    public int timezone;
    public int sunrise;
    public int sunset;
}
