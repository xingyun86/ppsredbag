package com.ppshuai.redbag.config;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * <p>Created 2017/08/01 上午1:16.</p>
 * <p><a href="mailto:375182886@qq.com">Email:375182886@qq.com</a></p>
 * <p><a href="http://www.ppsbbs.tech">PPSBBS论坛</a></p>
 *
 * @author xingyun86(ppshuai)
 */
public class Config {

    public static final String ACTION_REDBAG_SERVICE_DISCONNECT = "com.ppshuai.redbag.ACCESSBILITY_DISCONNECT";
    public static final String ACTION_REDBAG_SERVICE_CONNECT = "com.ppshuai.redbag.ACCESSBILITY_CONNECT";

    public static final String PREFERENCE_NAME = "config";
    public static final String KEY_ENABLE_WECHAT = "KEY_ENABLE_WECHAT";
    public static final String KEY_WECHAT_AFTER_OPEN_REDBAG = "KEY_WECHAT_AFTER_OPEN_HONGBAO";
    public static final String KEY_WECHAT_DELAY_TIME = "KEY_WECHAT_DELAY_TIME";

    public static final int WX_AFTER_OPEN_REDBAG = 0;
    public static final int WX_AFTER_OPEN_DETAIL = 1; //看大家手气

    SharedPreferences preferences;

    public Config(Context context) {
        preferences = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
    }

    /** 是否启动微信抢红包*/
    public boolean isEnableWechat() {
        return preferences.getBoolean(KEY_ENABLE_WECHAT, true);
    }

    /** 微信打开红包后的事件*/
    public int getWechatAfterOpenRedbagEvent() {
        int defaultValue = 0;
        String result =  preferences.getString(KEY_WECHAT_AFTER_OPEN_REDBAG, String.valueOf(defaultValue));
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {}
        return defaultValue;
    }

    /** 微信打开红包后延时时间*/
    public int getWechatOpenDelayTime() {
        int defaultValue = 0;
        String result = preferences.getString(KEY_WECHAT_DELAY_TIME, String.valueOf(defaultValue));
        try {
            return Integer.parseInt(result);
        } catch (Exception e) {}
        return defaultValue;
    }
}
