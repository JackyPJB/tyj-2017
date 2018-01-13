package cn.tyj.dao.pojo;

public class Device {
    private Long deviceId;

    private String userName;

    private String identityCardId;

    private String drivingCode;

    private String drivingAuthorityName;

    private Byte sex;

    private String tellphone;

    private Integer provinceId;

    private Integer cityId;

    private String makerId;

    private String deviceModel;

    private Integer catColor;

    private String carId;

    private String vinId;

    private String simId;

    private Integer cacheTime;

    private Integer uploadTime;

    private Integer warnningUploadTime;

    private Integer domainLength;

    private String domain;

    private Integer serverPort;

    private String deviceVersion;

    private String deviceSoftwareVersion;

    private Integer heartbeatTime;

    private Integer deviceOvertime;

    private Integer serverOvertime;

    private Integer loginIntervalTime;

    private String govDomainLength;

    private String govDomain;

    private Integer govServerPort;

    private Short samplingInspection;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getIdentityCardId() {
        return identityCardId;
    }

    public void setIdentityCardId(String identityCardId) {
        this.identityCardId = identityCardId == null ? null : identityCardId.trim();
    }

    public String getDrivingCode() {
        return drivingCode;
    }

    public void setDrivingCode(String drivingCode) {
        this.drivingCode = drivingCode == null ? null : drivingCode.trim();
    }

    public String getDrivingAuthorityName() {
        return drivingAuthorityName;
    }

    public void setDrivingAuthorityName(String drivingAuthorityName) {
        this.drivingAuthorityName = drivingAuthorityName == null ? null : drivingAuthorityName.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getTellphone() {
        return tellphone;
    }

    public void setTellphone(String tellphone) {
        this.tellphone = tellphone == null ? null : tellphone.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getMakerId() {
        return makerId;
    }

    public void setMakerId(String makerId) {
        this.makerId = makerId == null ? null : makerId.trim();
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel == null ? null : deviceModel.trim();
    }

    public Integer getCatColor() {
        return catColor;
    }

    public void setCatColor(Integer catColor) {
        this.catColor = catColor;
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getVinId() {
        return vinId;
    }

    public void setVinId(String vinId) {
        this.vinId = vinId == null ? null : vinId.trim();
    }

    public String getSimId() {
        return simId;
    }

    public void setSimId(String simId) {
        this.simId = simId == null ? null : simId.trim();
    }

    public Integer getCacheTime() {
        return cacheTime;
    }

    public void setCacheTime(Integer cacheTime) {
        this.cacheTime = cacheTime;
    }

    public Integer getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Integer uploadTime) {
        this.uploadTime = uploadTime;
    }

    public Integer getWarnningUploadTime() {
        return warnningUploadTime;
    }

    public void setWarnningUploadTime(Integer warnningUploadTime) {
        this.warnningUploadTime = warnningUploadTime;
    }

    public Integer getDomainLength() {
        return domainLength;
    }

    public void setDomainLength(Integer domainLength) {
        this.domainLength = domainLength;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public Integer getServerPort() {
        return serverPort;
    }

    public void setServerPort(Integer serverPort) {
        this.serverPort = serverPort;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion == null ? null : deviceVersion.trim();
    }

    public String getDeviceSoftwareVersion() {
        return deviceSoftwareVersion;
    }

    public void setDeviceSoftwareVersion(String deviceSoftwareVersion) {
        this.deviceSoftwareVersion = deviceSoftwareVersion == null ? null : deviceSoftwareVersion.trim();
    }

    public Integer getHeartbeatTime() {
        return heartbeatTime;
    }

    public void setHeartbeatTime(Integer heartbeatTime) {
        this.heartbeatTime = heartbeatTime;
    }

    public Integer getDeviceOvertime() {
        return deviceOvertime;
    }

    public void setDeviceOvertime(Integer deviceOvertime) {
        this.deviceOvertime = deviceOvertime;
    }

    public Integer getServerOvertime() {
        return serverOvertime;
    }

    public void setServerOvertime(Integer serverOvertime) {
        this.serverOvertime = serverOvertime;
    }

    public Integer getLoginIntervalTime() {
        return loginIntervalTime;
    }

    public void setLoginIntervalTime(Integer loginIntervalTime) {
        this.loginIntervalTime = loginIntervalTime;
    }

    public String getGovDomainLength() {
        return govDomainLength;
    }

    public void setGovDomainLength(String govDomainLength) {
        this.govDomainLength = govDomainLength == null ? null : govDomainLength.trim();
    }

    public String getGovDomain() {
        return govDomain;
    }

    public void setGovDomain(String govDomain) {
        this.govDomain = govDomain == null ? null : govDomain.trim();
    }

    public Integer getGovServerPort() {
        return govServerPort;
    }

    public void setGovServerPort(Integer govServerPort) {
        this.govServerPort = govServerPort;
    }

    public Short getSamplingInspection() {
        return samplingInspection;
    }

    public void setSamplingInspection(Short samplingInspection) {
        this.samplingInspection = samplingInspection;
    }
}