package com.android.udacity.tour_app_abnd7.Models;

public class HotelModel {
    String hotelname;
    String hoteladdress;
    String hoteldescription;
    String hotelcontactno;
    int img_id;
    int rating;

    public HotelModel(String hotelname, String hoteladdress, String hoteldescription, String hotelcontactno, int img_id, int rating) {
        this.hotelname = hotelname;
        this.hoteladdress = hoteladdress;
        this.hoteldescription = hoteldescription;
        this.hotelcontactno = hotelcontactno;
        this.img_id = img_id;
        this.rating = rating;
    }

    public String getHotelname() {
        return hotelname;
    }

    public String getHoteladdress() {
        return hoteladdress;
    }

    public String getHoteldescription() {
        return hoteldescription;
    }

    public String getHotelcontactno() {
        return hotelcontactno;
    }

    public int getImg_id() {
        return img_id;
    }

    public int getRating() {
        return rating;
    }
}
