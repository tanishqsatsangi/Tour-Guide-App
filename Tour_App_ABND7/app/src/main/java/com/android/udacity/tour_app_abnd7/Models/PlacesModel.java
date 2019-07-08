package com.android.udacity.tour_app_abnd7.Models;

public class PlacesModel {

    String placename;
    String placeaddress;
    String Timing;
    String Description;
    int img_id;
    int rating;

    public PlacesModel() {

    }

    public PlacesModel(String name, String address, String time, String details, int imgresid, int rate) {
        placename = name;
        placeaddress = address;
        Timing = time;
        Description = details;
        img_id = imgresid;
        rating = rate;
    }

    public String getPlacename() {
        return placename;
    }

    public String getPlaceaddress() {
        return placeaddress;
    }

    public String getTiming() {
        return Timing;
    }

    public String getDescription() {
        return Description;
    }

    public int getImg_id() {
        return img_id;
    }

    public int getRating() {
        return rating;
    }
}
