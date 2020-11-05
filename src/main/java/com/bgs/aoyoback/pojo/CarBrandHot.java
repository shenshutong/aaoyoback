package com.bgs.aoyoback.pojo;

import lombok.Data;


public class CarBrandHot {
    private int hotCarId;
    private String carBrandName;
    private String num;
    private String deleteFlag;
    private String carBrandLogoUrl;
    private String carBrandId;

    public int getHotCarId() {
        return hotCarId;
    }

    public void setHotCarId(int hotCarId) {
        this.hotCarId = hotCarId;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getCarBrandLogoUrl() {
        return carBrandLogoUrl;
    }

    public void setCarBrandLogoUrl(String carBrandLogoUrl) {
        this.carBrandLogoUrl = carBrandLogoUrl;
    }

    public String getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(String carBrandId) {
        this.carBrandId = carBrandId;
    }
}
