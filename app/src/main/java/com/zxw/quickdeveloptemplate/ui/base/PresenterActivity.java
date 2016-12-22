package com.zxw.quickdeveloptemplate.ui.base;

import android.os.Bundle;

/**
 * author：CangJie on 2016/8/18 16:44
 * email：cangjie2016@gmail.com
 */
public abstract class PresenterActivity<P> extends BaseHeadActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mPresenter = createPresenter();
        super.onCreate(savedInstanceState);
    }

    protected abstract P createPresenter();

}
