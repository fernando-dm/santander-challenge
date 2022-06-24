package com.hackerrank.weather.controller;

import com.hackerrank.weather.model.Weather;
import com.hackerrank.weather.service.WeatherService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class WeatherApiRestController {

    WeatherService weatherService;

    public WeatherApiRestController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping("/weather")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity add(@RequestBody Weather weather) {
        Weather newRecord = weatherService.add(weather);
        return new ResponseEntity(newRecord, HttpStatus.CREATED);
    }

    @GetMapping("/weather")
    public ResponseEntity<List<Weather>> getAllWeather(
            @RequestParam(required = false)
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
                    Date date,
            @RequestParam(required = false)
                    String city,
            @RequestParam(required = false)
                    String sort
    ) {
        if (date != null)
            return ResponseEntity.ok(weatherService.getWeatherBy(date));

        if (city != null)
            return ResponseEntity.ok(weatherService.getWeatherBy(city));

        return ResponseEntity.ok(weatherService.getAllWeathers());

    }


}
