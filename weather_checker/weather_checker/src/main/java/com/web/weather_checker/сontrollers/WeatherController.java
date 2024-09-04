package com.web.weather_checker.сontrollers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class WeatherController {

    @GetMapping("/")
    public String getWeather(){
        return "index.html";
    }

}
