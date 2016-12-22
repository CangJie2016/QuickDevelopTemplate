package com.zxw.quickdeveloptemplate.utils;

import android.util.Log;

/**
 * Created by Administrator on 2015/12/7.
 */
public class ClickUtil {

    private static long lastClickTime = 0;

    public static boolean isFastDoubleClick() {
        long time = System.currentTimeMillis();
        long timeD = time - lastClickTime;
        lastClickTime = time;
        Log.i("log",""+timeD);
        return timeD <= 100;
    }
}
