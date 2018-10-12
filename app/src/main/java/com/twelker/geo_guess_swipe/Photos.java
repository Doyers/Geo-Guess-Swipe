package com.twelker.geo_guess_swipe;

public class Photos {

    private String mPhotoName;
    private int mPhotoImageName;

    public Photos(int mGeoImageName) {

        this.mPhotoImageName = mGeoImageName;
    }

    public void setmPhotoName(String mPhotoName) {
        this.mPhotoName = mPhotoName;
    }

    public int getmPhotoImageName() {
        return mPhotoImageName;
    }

    public void setmPhotoImageName(int mPhotoImageName) {
        this.mPhotoImageName = mPhotoImageName;
    }

    public static final int[] Europe = {
            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };
    public static final boolean[] InEurope = {
            true,
            false,
            false,
            true,
            false,
            true,
            true,
            false
    };
}
