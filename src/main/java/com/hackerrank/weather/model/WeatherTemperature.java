//package com.hackerrank.weather.model;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//public class WeatherTemperature {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    private Double temperature;
//
//    public WeatherTemperature(Integer id, Double temperatures) {
//        this.id = id;
//        this.temperature = temperatures;
//    }
//
//    public WeatherTemperature() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public Double getTemperatures() {
//
//        return this.temperature;
//    }
//
//    public void setTemperatures(Double temperatures) {
//        this.temperature = temperatures;
//    }
//}
