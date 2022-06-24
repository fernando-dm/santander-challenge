package com.hackerrank.weather.service;

import com.hackerrank.weather.model.Weather;
import com.hackerrank.weather.repository.WeatherDao;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WeatherService {
    private final WeatherDao weatherDao;

    public WeatherService(WeatherDao weather) {
        this.weatherDao = weather;
    }

    public Weather add(Weather weather) {
        return weatherDao.createWeather(weather);
    }

    public List<Weather> getAllWeathers() {
        return weatherDao.selectAllWeathers();
    }

    public List<Weather> getWeatherBy(Date date) {
        return weatherDao.selectWeatherBy(date);
    }

    public List<Weather> getWeatherBy(String val) {
        return weatherDao.selectWeatherBy(val);
    }
}
