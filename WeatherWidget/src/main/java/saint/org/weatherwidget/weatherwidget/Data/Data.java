package saint.org.weatherwidget.weatherwidget.Data;


public class Data {
    private double lat,lon;
    private String appid;

//    public Date(double lat, double lon, String appid) {
//        this.lat = lat;
//        this.lon = lon;
//        this.appid = appid;
//    }

    // getters and setters
    public double getLat() {return lat;}
    public double getLon() {return lon;}
    public String getAppid() {return appid;}

//    private void fullDates() throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        File file = new File("logfile.json");
//        Date date = mapper.readValue(file, Date.class);
//
//    }
}

