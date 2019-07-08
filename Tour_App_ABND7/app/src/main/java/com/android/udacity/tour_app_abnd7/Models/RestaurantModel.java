package com.android.udacity.tour_app_abnd7.Models;

public class RestaurantModel {
    String restaurantname;
    String restaurantaddress;
    String restaurantdetails;
    int rating;
    String timings;
    int imgid;

    public RestaurantModel() {

    }

    public RestaurantModel(String name, String add, String restaurantdetails, int img_resid, String time, int rate) {
        restaurantname = name;
        restaurantaddress = add;
        this.restaurantdetails = restaurantdetails;
        rating = rate;
        timings = time;
        imgid = img_resid;

    }

    public String getRestaurantname() {
        return restaurantname;
    }

    public int getImgid() {
        return imgid;
    }


    public String getRestaurantaddress() {
        return restaurantaddress;
    }

    public String getRestaurantdetails() {
        return restaurantdetails;
    }

    public int getRating() {
        return rating;
    }

    public String getTimings() {
        return timings;
    }
}


