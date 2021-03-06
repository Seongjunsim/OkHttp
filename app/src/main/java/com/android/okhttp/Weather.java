package com.android.okhttp;

public class Weather {
    private String country;
    private String weather;
    private String temperature;

    public String getCountry() {
        return country;
    }

    public String getWeather() {
        return weather;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public Weather(String country, String weather, String temperature) {
        this.country = country;
        this.weather = weather;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "country='" + country + '\'' +
                ", weather='" + weather + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }
}
