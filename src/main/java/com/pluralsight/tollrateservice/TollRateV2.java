package com.pluralsight.tollrateservice;

public class TollRateV2 {

    private Integer stationId;
    private Float currentRate;
    private String timestamp;
    private boolean isBaseValue;

    public TollRateV2() {}

    public TollRateV2(Integer stationId, Float currentRate, String timestamp, boolean isBaseValue) {
        this.stationId = stationId;
        this.currentRate = currentRate;
        this.timestamp = timestamp;
        this.isBaseValue = isBaseValue;
    }

    public Integer getStationId() {
        return stationId;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    public Float getCurrentRate() {
        return currentRate;
    }
    public void setCurrentRate(Float currentRate) {
        this.currentRate = currentRate;
    }
    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }
    public boolean isBaseValue() {
        return isBaseValue;
    }
    public void setBaseValue(boolean isBaseValue) {
        this.isBaseValue = isBaseValue;
    }
    
}
