package com.hackerrank.weather.repository;

import com.hackerrank.weather.model.Weather;
import org.springframework.stereotype.Repository;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class WeatherInMemoryRepository implements WeatherDao {

    private final List<Weather> weatherList;

    public WeatherInMemoryRepository(java.util.List<Weather> weatherList) {
        this.weatherList = weatherList;
    }

    @Override
    public List<Weather> selectWeatherBy(int id) {
        return null;
    }

    @Override
    public List<Weather> selectWeatherBy(String city) {
        return weatherList.stream()
                .filter(weather -> weather.getCity().equalsIgnoreCase(city))
                .sorted((o1, o2) -> o1.getId())
                .collect(Collectors.toList());
    }

    @Override
    public List<Weather> selectSortWeatherBy(String city) {
        return null;

    }

    @Override
    public List<Weather> selectWeatherBy(Date date) {
        return weatherList.stream()
                .filter(weather -> weather.getDate().equals(date))
                .sorted((o1, o2) -> o1.getId())
                .collect(Collectors.toList());
    }

    @Override
    public List<Weather> selectAllWeathers() {
        return weatherList.stream()
                .sorted((o1, o2) -> o1.getId())
                .collect(Collectors.toList());
    }

    @Override
    public List<Weather> selectWeatherSortByDate() {
        return weatherList.stream()
                .sorted(Comparator.comparing(Weather::getDate))
                .collect(Collectors.toList());
    }

    @Override
    public Weather createWeather(Weather weather) {
        weatherList.add(weather);
        return weather;
    }

}
