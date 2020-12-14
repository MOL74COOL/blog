package com.songtian.restaurant.bean.menu;


public class Menu {

    String name;
    String number;
    String price;
    String url;
    String address;
    Integer totalPrice;

    public Menu(){

    }

    public Menu(String name, String number, String price, String address, Integer totalPrice) {
        this.name = name;
        this.number = number;
        this.price = price;
        this.address = address;
        this.totalPrice=totalPrice;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", price='" + price + '\'' +
                ", address='" + address + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                '}';
    }
}
