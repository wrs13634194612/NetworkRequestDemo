package com.example.aiyang.allhttp_networkrequestdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author luoyang_workmail@163.com on 2020/7/16.
 */
public class DeviceConnectJson {

    @SerializedName("failed")
    public boolean  failed;

    @SerializedName("code")
    public int code;

    @SerializedName("message")
    public String message;

    @Override
    public String toString() {
        return "DeviceConnectJson{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

}
