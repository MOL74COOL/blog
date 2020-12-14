package com.songtian.restaurant.bean.merchant;

public class menuStatistics {
    private int id;
    private String menu_name;
    private int menu_cost;
    public menuStatistics(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public int getMenu_cost() {
        return menu_cost;
    }

    public void setMenu_cost(int menu_cost) {
        this.menu_cost = menu_cost;
    }
}
