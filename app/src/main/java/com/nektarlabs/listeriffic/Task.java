package com.nektarlabs.listeriffic;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by viktordenic on 10/20/15.
 */
public class Task implements Parcelable {

    private String mTaskName;

    public String getTaskName() {
        return mTaskName;
    }

    public void setTaskName(String taskName) {
        mTaskName = taskName;
    }

    public Task(String name) {
        mTaskName = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTaskName);
    }

    private Task(Parcel in) {
        mTaskName = in.readString();
    }

    public static final Creator <Task> CREATOR = new Creator<Task>() {
        @Override
        public Task createFromParcel(Parcel source) {
            return new Task(source);
        }

        @Override
        public Task[] newArray(int size) {
            return new Task[size];
        }
    };
}
