package saint.org.weatherwidget.weatherwidget.Data;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class getDatas {
    public static Data getDatas() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("logfile.json");

        Data data = mapper.readValue(file, Data.class);
        return data;
    }
}
