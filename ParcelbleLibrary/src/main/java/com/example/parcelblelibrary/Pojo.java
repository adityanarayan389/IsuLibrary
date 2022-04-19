package com.example.parcelblelibrary;

import android.os.Parcel;
import android.os.Parcelable;

public class Pojo implements Parcelable {
    private String userName;
    private String passWord;
    private String id;

    public Pojo(String userName, String passWord, String id) {
        this.userName = userName;
        this.passWord = passWord;
    }

    protected Pojo(Parcel in) {
        userName = in.readString();
        passWord = in.readString();
        id = in.readString();
    }

    public static final Creator<Pojo> CREATOR = new Creator<Pojo>() {
        @Override
        public Pojo createFromParcel(Parcel in) {
            return new Pojo(in);
        }

        @Override
        public Pojo[] newArray(int size) {
            return new Pojo[size];
        }
    };

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
        parcel.writeString(passWord);
        parcel.writeString(id);
    }
}
