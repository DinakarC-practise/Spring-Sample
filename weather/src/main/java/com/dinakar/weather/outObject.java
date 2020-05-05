package com.dinakar.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class outObject {

    private String date;
    private String time;
    private String sunriseTime;
    private String sunsetTime;
    private String temperatureHighTime;
    private String temperatureLowTime;
    private Float temperature;
    private Float temperatureHigh;
    private Float temperatureLow;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSunriseTime() {
        return sunriseTime;
    }

    public void setSunriseTime(String sunriseTime) {
        this.sunriseTime = sunriseTime;
    }

    public String getSunsetTime() {
        return sunsetTime;
    }

    public void setSunsetTime(String sunsetTime) {
        this.sunsetTime = sunsetTime;
    }

    public String getTemperatureHighTime() {
        return temperatureHighTime;
    }

    public void setTemperatureHighTime(String temperatureHighTime) {
        this.temperatureHighTime = temperatureHighTime;
    }

    public String getTemperatureLowTime() {
        return temperatureLowTime;
    }

    public void setTemperatureLowTime(String temperatureLowTime) {
        this.temperatureLowTime = temperatureLowTime;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getTemperatureHigh() {
        return temperatureHigh;
    }

    public void setTemperatureHigh(Float temperatureHigh) {
        this.temperatureHigh = temperatureHigh;
    }

    public Float getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(Float temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    @Override
    public String toString() {
        return "outObject{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", sunriseTime='" + sunriseTime + '\'' +
                ", sunsetTime='" + sunsetTime + '\'' +
                ", temperatureHighTime='" + temperatureHighTime + '\'' +
                ", temperatureLowTime='" + temperatureLowTime + '\'' +
                ", temperature=" + temperature +
                ", temperatureHigh=" + temperatureHigh +
                ", temperatureLow=" + temperatureLow +
                '}';
    }
}