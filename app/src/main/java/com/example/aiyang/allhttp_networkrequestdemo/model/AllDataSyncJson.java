package com.example.aiyang.allhttp_networkrequestdemo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author luoyang_workmail@163.com on 2020/6/12.
 */
public class AllDataSyncJson {

    @SerializedName("code")
    public int code;

    @SerializedName("message")
    public String message;

    @SerializedName("failed")
    public boolean  failed;

    @SerializedName("data")
    public DataSyncBean dataSync;

    public static class DataSyncBean {

        @SerializedName("storeID")
        public String storeId;

        @SerializedName("list")
        public List<ListDataJson> listData;

    }

}

