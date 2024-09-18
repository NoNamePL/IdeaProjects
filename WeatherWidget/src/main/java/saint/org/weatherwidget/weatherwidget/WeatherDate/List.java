package saint.org.weatherwidget.weatherwidget.WeatherDate;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class List {
    public int dt;
    public main main;
    public ArrayList<weather> weather;
    public clouds clouds;
    public wind wind;
    public int visibility;
    public double pop;
    public rain rain;
    public sys sys;
    public String dt_txt;
}
