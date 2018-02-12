package com.example.pranav.miwok;

/**
 * Created by pranav on 2/13/2018.
 */

class Numberlist {


    private String mMiwok;

    private String mEnglish;

    private int mImageResourceId;

    public Numberlist(String vName, String vNumber, int imageResourceId)
    {
        mMiwok = vName;
        mEnglish = vNumber;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Miwok word
     */
    public String getMiwok() {
        return mMiwok;
    }

    /**
     * Get the English word
     */
    public String getEnglish() {return mEnglish;}

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}
