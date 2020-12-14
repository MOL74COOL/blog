package com.songtian.restaurant.bean.takeaway;

public class TakeMeun {
    String id;
    String mname;//菜名
    String rname;//人名
    String phone;
    String address;
    String takeaway;
    String time;

    @Override
    public String toString() {
        return "TakeMeun{" +
                "id='" + id + '\'' +
                ", mname='" + mname + '\'' +
                ", rname='" + rname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", takeaway='" + takeaway + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTakeaway() {
        return takeaway;
    }

    public void setTakeaway(String takeaway) {
        this.takeaway = takeaway;
    }
}
