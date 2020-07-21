package com.example.aiyang.allhttp_networkrequestdemo.http;

import com.example.aiyang.allhttp_networkrequestdemo.model.AllDataSyncJson;
import com.example.aiyang.allhttp_networkrequestdemo.model.DeviceConnectJson;
import com.example.aiyang.allhttp_networkrequestdemo.model.GankBean;
import com.example.aiyang.allhttp_networkrequestdemo.model.LoginJson;
import com.example.aiyang.allhttp_networkrequestdemo.model.Translation1;
import com.example.aiyang.allhttp_networkrequestdemo.model.User;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by aiyang on 2017/5/17.
 */

public interface ApiManager {
    //一、Get
    /**
     * 无参数请求
     */

    //第二种是结合工厂GsonFromat自动解析实体类
    @GET("api/data/Android/10/1")
    Call<GankBean> getAndroidInfo();

    /**
     * 带参
     */
    //第一种  单一参数
    @GET("onebox/weather/query?cityname=深圳")
    Call<ResponseBody> getWeather(@Query("key") String key);

    //第二种  多参数
    @GET("onebox/weather/query?")
    Call<ResponseBody> getWeather2(@QueryMap Map<String,String > parmas);

    //二、Post
    /**
     * 表单
     *
     * @Field关键字
     * @Body参数
     */
    @POST("user/info")
    Call<ResponseBody> editUser(@Field("id") int id,@Field("name") String name);

    @FormUrlEncoded
    @POST("api/fieldParam")
    Call<ResponseBody> postFieldFun(@Field("key") String key);

    @POST("translate?doctype=json&jsonversion=&type=&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&network=&abtest=")
    @FormUrlEncoded
    Call<Translation1> getCall(@Field("i") String targetSentence);

    @FormUrlEncoded
    @POST("oauth/oauth/token")
    Call<LoginJson> getToken(@FieldMap Map<String, String> params);

    /**
     * 设备数据全量同步
     * @param params
     * @return
     */

    @FormUrlEncoded
    @POST("face/fullSync")
    Call<AllDataSyncJson> getAllDataSync(@Field("deviceID") String params);

    @FormUrlEncoded
    @POST("face/fullSync")
    Call<ResponseBody> getAllDataSync1(@Field("deviceID") String params);

    @FormUrlEncoded
    @POST("face/fullSync")
    Call<ResponseBody> getAllDataSync2(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("face/fullSync")
    Call<AllDataSyncJson> getAllDataSync3(@FieldMap Map<String, String> params);

    /**
     * 冰场设备通行验证
     * @param params
     * @return
     */
    @FormUrlEncoded
    @POST("code/crossing")
    Call<DeviceConnectJson> getDeviceConnect(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("translate?doctype=json&jsonversion=&type=&keyfrom=&model=&mid=&imei=&vendor=&screen=&ssid=&network=&abtest=")
    Call<ResponseBody> getCall1(@Field("i") String targetSentence);

    @FormUrlEncoded
    @POST("oauth/oauth/token")
    Call<ResponseBody> getToken1(@FieldMap Map<String, String> params);



    //三、RxJava

//    @POST("user/login")
//    Call<User> login(@Field("username") String user, @Field("password") String password);
//    @GET("user/info")
//    Call<User> getUser(@Query("id") String id);

//    @POST("user/login")
//    rx.Observable<User> loginForRX(@Body User user);
//
//    @GET("user/info")
//    rx.Observable<User> getUserForRX(@Query("id") String id);
}
