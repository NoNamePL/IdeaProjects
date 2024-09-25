package saint.org.weatherwidget.weatherwidget.FileData;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileData {
    @JsonProperty("lat")
    public double lat;
    @JsonProperty("lon")
    public double lon;
    @JsonProperty("appid")
    public String appid;
    @JsonProperty("access_key")
    public String access_key;

}


