package com.twelker.geo_guess_swipe;

public class Photos {

    private String mPhotoName;
    private int mPhotoImageName;

    public Photos(String mGeoName, int mGeoImageName) {

        this.mPhotoName = mGeoName;
        this.mPhotoImageName = mGeoImageName;
    }

    public String getmPhotoName() {
        return mPhotoName;
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

    public static final String[] Imagesnames = {
            "img1_yes_denmark",
            "img2_no_canada",
            "img3_no_bangladesh",
            "img4_yes_kazachstan",
            "img5_no_colombia",
            "img6_yes_poland",
            "img7_yes_malta",
            "img8_no_thailand"
    };

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
}
