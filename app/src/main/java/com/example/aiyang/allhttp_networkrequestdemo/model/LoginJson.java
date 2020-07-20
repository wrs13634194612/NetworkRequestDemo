package com.example.aiyang.allhttp_networkrequestdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author diaokaibin@gmail.com on 2020/6/11.
 */
public class LoginJson {

    @SerializedName("access_token")
    public String accessToken;
    @SerializedName("token_type")
    public String tokenType;
    @SerializedName("expires_in")
    public int expiresIn;
    @SerializedName("scope")
    public String scope;
    @SerializedName("createTime")
    public String createTime;
    @SerializedName("sessionId")
    public String sessionId;
}
