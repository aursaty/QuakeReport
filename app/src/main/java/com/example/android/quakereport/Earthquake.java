package com.example.android.quakereport;

/**
 * Created by ursan on 1/23/2018.
 *
 */

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    Earthquake(String magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
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

    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }

    public void setTimeInMilliseconds(long timeInMilliseconds) { mTimeInMilliseconds = timeInMilliseconds; }

}
