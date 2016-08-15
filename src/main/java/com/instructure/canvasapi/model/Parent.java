package com.instructure.canvasapi.model;

import android.os.Parcel;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Parent extends CanvasModel<Parent> {

    private String password;
    private String username;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getComparisonString() {
        return null;
    }

    @Override
    public Date getComparisonDate() {
        return null;
    }

    @Override
    public long getId() {
        return username.hashCode();
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.password);
        dest.writeString(this.username);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }

    public Parent() {
    }

    protected Parent(Parcel in) {
        this.password = in.readString();
        this.username = in.readString();
        this.firstName = in.readString();
        this.lastName = in.readString();
    }

    public static final Creator<Parent> CREATOR = new Creator<Parent>() {
        @Override
        public Parent createFromParcel(Parcel source) {
            return new Parent(source);
        }

        @Override
        public Parent[] newArray(int size) {
            return new Parent[size];
        }
    };
}
