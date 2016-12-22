package com.zxw.quickdeveloptemplate.presenter;


import com.zxw.quickdeveloptemplate.presenter.view.BaseView;

/**
 * author：CangJie on 2016/8/18 14:38
 * email：cangjie2016@gmail.com
 */
public class BasePresenter<V extends BaseView> {
    public V mvpView;

    public BasePresenter(V mvpView) {
        this.mvpView = mvpView;
    }

}
