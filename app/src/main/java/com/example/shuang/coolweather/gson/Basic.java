package com.example.shuang.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {
    //使用注解的方式让JSON和Java字段建立映射关系
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
