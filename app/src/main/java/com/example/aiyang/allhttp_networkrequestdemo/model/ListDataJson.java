package com.example.aiyang.allhttp_networkrequestdemo.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author luoyang_workmail@163.com on 2020/7/16.
 */
public class ListDataJson {

    @SerializedName("memberId")
    public String memberId;
    @SerializedName("name")
    public String name;
    @SerializedName("gender")
    public String gender;
    @SerializedName("birthday")
    public String birthday;
    @SerializedName("face")
    public String face;
    @SerializedName("organizationId")
    public String organizationId;

    public ListDataJson(String memberId, String name, String gender, String birthday, String face, String organizationId) {
        this.memberId = memberId;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.face = face;
        this.organizationId = organizationId;
    }

    @Override
    public String toString() {
        return "ListDataJson{" +
                "memberId='" + memberId + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", face='" + face + '\'' +
                ", organizationId='" + organizationId + '\'' +
                '}';
    }
}
