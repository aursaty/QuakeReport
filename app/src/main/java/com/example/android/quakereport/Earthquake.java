package com.example.android.quakereport;

/**
 * Created by ursan on 1/23/2018.
 *
 */

public class Earthquake {

    private String mMagnitude;

    private String mLocation;
    private String mDate;

    Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    String getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(String magnitude) {
        mMagnitude = magnitude;
    }

    String getLocation() {
        return mLocation;
    }

    public void setLocation(String location) {
        mLocation = location;
    }

    String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }
}
