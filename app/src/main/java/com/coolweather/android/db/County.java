package com.coolweather.android.db;

class County {
    int id;
    String countyName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherld() {
        return weatherld;
    }

    public void setWeatherld(String weatherld) {
        this.weatherld = weatherld;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getCityld() {
        return cityld;
    }

    public void setCityld(int cityld) {
        this.cityld = cityld;
    }

    String weatherld;
    int provinceCode;
    int cityld;

}
