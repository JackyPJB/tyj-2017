package cn.tyj.dao.pojo;

import java.util.Date;

public class WarnningRecord {
    private Long id;

    private Date recordTime;

    private Integer recordId;

    private String userId;

    private Integer latitudeSN;

    private Integer longitudeWE;

    private Float latitude;

    private Float longitude;

    private Float speed;

    private Integer warnningTypeId;

    private String warnningType;

    private Float warnningValue;

    private String warnningUnits;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getLatitudeSN() {
        return latitudeSN;
    }

    public void setLatitudeSN(Integer latitudeSN) {
        this.latitudeSN = latitudeSN;
    }

    public Integer getLongitudeWE() {
        return longitudeWE;
    }

    public void setLongitudeWE(Integer longitudeWE) {
        this.longitudeWE = longitudeWE;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public Integer getWarnningTypeId() {
        return warnningTypeId;
    }

    public void setWarnningTypeId(Integer warnningTypeId) {
        this.warnningTypeId = warnningTypeId;
    }

    public String getWarnningType() {
        return warnningType;
    }

    public void setWarnningType(String warnningType) {
        this.warnningType = warnningType == null ? null : warnningType.trim();
    }

    public Float getWarnningValue() {
        return warnningValue;
    }

    public void setWarnningValue(Float warnningValue) {
        this.warnningValue = warnningValue;
    }

    public String getWarnningUnits() {
        return warnningUnits;
    }

    public void setWarnningUnits(String warnningUnits) {
        this.warnningUnits = warnningUnits == null ? null : warnningUnits.trim();
    }
}