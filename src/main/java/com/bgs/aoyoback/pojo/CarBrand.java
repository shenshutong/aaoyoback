package com.bgs.aoyoback.pojo;


public class CarBrand {
    private Integer carBrandId;
    private String carBrandInitials;
    private String carBrandName;
    private String carBrandUrl;
    private Integer deleteFlag;
    private Integer carBrandParentId;
    private String carBrandPyFirstLetter;

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    public String getCarBrandInitials() {
        return carBrandInitials;
    }

    public void setCarBrandInitials(String carBrandInitials) {
        this.carBrandInitials = carBrandInitials;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandUrl() {
        return carBrandUrl;
    }

    public void setCarBrandUrl(String carBrandUrl) {
        this.carBrandUrl = carBrandUrl;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getCarBrandParentId() {
        return carBrandParentId;
    }

    public void setCarBrandParentId(Integer carBrandParentId) {
        this.carBrandParentId = carBrandParentId;
    }

    public String getCarBrandPyFirstLetter() {
        return carBrandPyFirstLetter;
    }

    public void setCarBrandPyFirstLetter(String carBrandPyFirstLetter) {
        this.carBrandPyFirstLetter = carBrandPyFirstLetter;
    }
}
