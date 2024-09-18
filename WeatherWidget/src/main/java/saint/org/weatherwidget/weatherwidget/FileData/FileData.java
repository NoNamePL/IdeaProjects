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
}
//    public Data(double lat, double lon, String appid) {
//        this.lat = lat;
//        this.lon = lon;
//        this.appid = appid;
//    }
//
//    public Data(){
//        lat=0;
//        lon=0;
//        appid="your_api_key";
//    }
//    public Data(String appid) {
//        this.appid = appid;
//        lat=0;
//        lon=0;
//    }
//    public Data(double lat, double lon) {
//        this.lat = lat;
//        this.lon = lon;
//        appid="your_api_key";
//    }
//
//    public Data(double lat) {
//        this.lat = lat;
//        this.lon = 0;
//        appid="your_api_key";
//    }
//
//    public Data(String appid, double lat) {
//        this.appid = appid;
//        this.lat = lat;
//        this.lon = 0;
//    }
//
//    public Data(double lat, String appid) {
//        this.appid = appid;
//        this.lat = lat;
//        this.lon = 0;
//    }
//
//    // getters and setters
//    public double getLat() {return lat;}
//    public double getLon() {return lon;}
//    public String getAppid() {return appid;}
//
//    public void setLat(double lat) {this.lat = lat;}
//    public void setLon(double lon) {this.lon = lon;}
//    public void setAppid(String appid) {this.appid = appid;}
//    private void fullDates() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        File file = new File("logfile.json");
//        Date date = mapper.readValue(file, Date.class);
//
//    }
//}

