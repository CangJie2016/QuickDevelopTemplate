package com.zxw.quickdeveloptemplate.presenter.view;

/**
 * author：CangJie on 2016/8/18 14:50
 * email：cangjie2016@gmail.com
 */
public interface BaseView {
    void showLoading();
    void hideLoading();

    void disPlay(String s);
    void finish();
}
