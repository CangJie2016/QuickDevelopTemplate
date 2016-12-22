package com.zxw.quickdeveloptemplate.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.zxw.quickdeveloptemplate.R;
import com.zxw.quickdeveloptemplate.presenter.MainPresenter;
import com.zxw.quickdeveloptemplate.presenter.view.MainView;
import com.zxw.quickdeveloptemplate.ui.base.PresenterActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.zxw.quickdeveloptemplate.R.id.et_password;
import static com.zxw.quickdeveloptemplate.R.id.et_username;

public class MainActivity extends PresenterActivity<MainPresenter> implements MainView {
    @Bind(et_username)
    EditText etUsername;
    @Bind(et_password)
    EditText etPassword;
    @Bind(R.id.btn_login)
    Button btnLogin;

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        showTitle("Mvp Template");
        showBackButton();
        showRightImageButton(R.mipmap.ic_launcher, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disPlay("Hello Mvp!!");
            }
        });
    }
    @OnClick(R.id.btn_login)
    public void verifyAccount(){
        String userName = etUsername.getText().toString().trim();
        String password = btnLogin.getText().toString().trim();
        if (TextUtils.isEmpty(userName)){
            disPlay("请输入用户名");
            return;
        }
        if(TextUtils.isEmpty(password)){
            disPlay("请输入密码");
            return;
        }
        mPresenter.verifyAccount(userName, password);
    }

    @Override
    public void loginSuccess(String info) {
        disPlay(info);
    }

    @Override
    public void loginFailed(String info) {
        disPlay(info);
    }
}
