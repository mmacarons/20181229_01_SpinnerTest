package kr.tjit.a20181229_01_spinnertest.datas;

public class Restaurant {

    private String name;
    private String address;
    private String openTime;
    private String logoURL;

//    alt + insert

    //    생성자
    public Restaurant(String name, String address, String openTime, String logoURL) {
        this.name = name;
        this.address = address;
        this.openTime = openTime;
        this.logoURL = logoURL;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    //    getter + setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }
}