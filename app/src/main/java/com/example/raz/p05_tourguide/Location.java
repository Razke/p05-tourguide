package com.example.raz.p05_tourguide;

public class Location {

    private String mLocationTitle;

    private String mLocationDescription;

    private int mPoster;

    public Location(String locationTitle, String locationDescription, int poster) {
        mLocationTitle = locationTitle;
        mLocationDescription = locationDescription;
        mPoster = poster;
    }

    public String getLocationTitle() {
        return mLocationTitle;
    }

    public String getLocationDescription() {
        return mLocationDescription;
    }

    public int getPoster() {
        return mPoster;
    }
}
