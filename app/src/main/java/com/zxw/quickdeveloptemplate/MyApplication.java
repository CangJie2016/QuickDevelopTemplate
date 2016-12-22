package com.zxw.quickdeveloptemplate;

import android.app.Application;
import android.content.Context;

/**
 * author：CangJie on 2016/12/20 16:00
 * email：cangjie2016@gmail.com
 */
public class MyApplication extends Application {

    public static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
    }
}
