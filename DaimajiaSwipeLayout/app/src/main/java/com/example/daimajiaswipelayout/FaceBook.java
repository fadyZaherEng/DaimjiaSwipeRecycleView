package com.example.daimajiaswipelayout;

public class FaceBook
{
    private String Facebook_Name;
    private String Twitter_Name;

    public FaceBook(String facebook_Name, String twitter_Name) {
        Facebook_Name = facebook_Name;
        Twitter_Name = twitter_Name;
    }

    public String getFacebook_Name() {
        return Facebook_Name;
    }

    public void setFacebook_Name(String facebook_Name) {
        Facebook_Name = facebook_Name;
    }

    public String getTwitter_Name() {
        return Twitter_Name;
    }

    public void setTwitter_Name(String twitter_Name) {
        Twitter_Name = twitter_Name;
    }
}
