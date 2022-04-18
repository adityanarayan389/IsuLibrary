package com.example.parcelblelibrary;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.Toast;

public class ShowData implements Parcelable {
    private String userName;
    private String passWord;

    public ShowData(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    protected ShowData(Parcel in) {
        userName = in.readString();
        passWord = in.readString();
    }

    public static final Creator<ShowData> CREATOR = new Creator<ShowData>() {
        @Override
        public ShowData createFromParcel(Parcel in) {
            return new ShowData(in);
        }

        @Override
        public ShowData[] newArray(int size) {
            return new ShowData[size];
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



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(userName);
        parcel.writeString(passWord);
    }
}
