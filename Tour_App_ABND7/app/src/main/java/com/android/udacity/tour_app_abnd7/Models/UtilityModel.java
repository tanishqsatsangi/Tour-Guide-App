package com.android.udacity.tour_app_abnd7.Models;

public class UtilityModel {
    String utilityname;
    String utilityaddress;
    String description;
    String Contactno;
    int imgid;

    public UtilityModel() {

    }

    public String getUtilityname() {
        return utilityname;
    }

    public String getUtilityaddress() {
        return utilityaddress;
    }

    public String getDescription() {
        return description;
    }

    public String getContactno() {
        return Contactno;
    }

    public int getImgid() {
        return imgid;
    }

    public UtilityModel(String utilityname, String utilityaddress, String description, String contactno, int imgid) {
        this.utilityname = utilityname;
        this.utilityaddress = utilityaddress;
        this.description = description;
        Contactno = contactno;
        this.imgid = imgid;
    }
}
