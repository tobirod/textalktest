package com.tobirod.textalktest.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Article implements Parcelable {

    public Article(String title, String imageName, String ingress, String body) {

        this.mTitle = title;
        this.mImageName = imageName;
        this.mIngress = ingress;
        this.mBody = body;
    }


    private String mTitle;
    private String mImageName;
    private String mIngress;
    private String mBody;


    public String getTitle() { return mTitle; }
    public void setTitle(String title) { this.mTitle = title; }

    public String getImage() { return mImageName; }
    public void setImage(String imageName) { this.mImageName = imageName; }

    public String getIngress() { return mIngress; }
    public void setIngress(String ingress) { this.mIngress = ingress; }

    public String getBody() { return mBody; }
    public void setBody(String body) { this.mBody = body; }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
