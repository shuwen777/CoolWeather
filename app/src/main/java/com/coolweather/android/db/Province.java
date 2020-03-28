package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProinceCode() {
        return proinceCode;
    }

    public void setProinceCode(int proinceCode) {
        this.proinceCode = proinceCode;
    }

    private String provinceName;
    private int proinceCode;

}
