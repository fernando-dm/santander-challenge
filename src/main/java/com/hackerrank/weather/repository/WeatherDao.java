package com.hackerrank.weather.repository;

import com.hackerrank.weather.model.Weather;

import java.util.Date;
import java.util.List;

public interface WeatherDao {

    Weather createWeather(Weather weather);

    List<Weather>  selectWeatherBy(int id);

    List<Weather>  selectWeatherBy(String city);

    List<Weather>  selectSortWeatherBy(String city);

    List<Weather>  selectWeatherBy(Date date);

    List<Weather> selectAllWeathers();

    List<Weather> selectWeatherSortByDate();
}
