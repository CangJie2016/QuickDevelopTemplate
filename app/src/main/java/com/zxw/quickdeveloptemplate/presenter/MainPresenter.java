package com.zxw.quickdeveloptemplate.presenter;

import com.zxw.quickdeveloptemplate.presenter.view.MainView;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainPresenter extends BasePresenter<MainView> {
    public MainPresenter(MainView mvpView) {
        super(mvpView);
    }

    public void verifyAccount(final String userName, final String password) {
        mvpView.showLoading();
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        verifyAccountByRemote(userName, password);
                    }
                });
    }
    public void verifyAccountByRemote(String userName, String password) {
        mvpView.hideLoading();
        if (userName.equals(password)){
            String info = userName + ", welcome back!";
            mvpView.loginSuccess(info);
        }else{
            String info = "sorry, login failed!";
            mvpView.loginFailed(info);
        }
    }
}
