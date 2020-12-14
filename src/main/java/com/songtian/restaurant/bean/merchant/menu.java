package com.songtian.restaurant.bean.merchant;

public class menu {
    private int id;
    private String mname;
    private int price;
    private String url;
    private int number;
    public menu(){

    }

    public menu(int id, String mname, int price, String url, int number) {
        this.id = id;
        this.mname = mname;
        this.price = price;
        this.url = url;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
