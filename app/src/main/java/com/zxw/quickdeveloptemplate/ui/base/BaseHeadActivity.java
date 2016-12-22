package com.zxw.quickdeveloptemplate.ui.base;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zxw.quickdeveloptemplate.R;
import com.zxw.quickdeveloptemplate.utils.AnimationHelper;


public abstract class BaseHeadActivity extends BaseActivity {

    RelativeLayout rel_contentArea;
    ImageButton ibtn_headRightImageButton;
    Button btn_headRightButton;
    Button btn_backButton;
    TextView btn_headTitle;
    RelativeLayout mLoading;
    LinearLayout rel_base_headArea;

    LinearLayout info_bar;
    TextView tv_date;
    TextView tv_line_no;
    TextView tv_user;
    TextView tv_weather;
    RadioGroup rg_depart;
    RadioButton rb_automatic;
    RadioButton rb_manual;


    View mContantArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.base_head);
        assignViews();
    }

    @Override
    public void setContentView(int layoutResID) {
        mContantArea = getLayoutInflater().inflate(layoutResID, rel_contentArea, false);
        setContentView(mContantArea);
    }

    @Override
    public void setContentView(View view) {
        setContentView(view, view.getLayoutParams());
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        rel_contentArea.addView(view, params);

    }

    protected void hideHeadArea() {
        rel_base_headArea.setVisibility(View.GONE);
    }


    public void showLoading() {
        mLoading.setVisibility(View.VISIBLE);
    }

    public void hideLoading() {
        AnimationHelper.crossfade(mLoading, rel_contentArea, getResources().getInteger(android.R.integer.config_shortAnimTime));
    }

    public void showBackButton() {
        this.showBackButton(new OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_backButton.setVisibility(View.VISIBLE);
    }

    public void showBackButton(OnClickListener listener) {
        btn_backButton.setOnClickListener(listener);
        btn_backButton.setVisibility(View.VISIBLE);
    }

    public void showTitle(String title) {
        btn_headTitle.setText(title);
    }

    public void hideTitle() {
        btn_headTitle.setVisibility(View.GONE);
    }

    public void showRightImageButton(int iBtnResource) {
        ibtn_headRightImageButton.setImageResource(iBtnResource);
        ibtn_headRightImageButton.setVisibility(View.VISIBLE);
    }

    public void showRightImageButton(int iBtnResource, OnClickListener listener) {
        ibtn_headRightImageButton.setImageResource(iBtnResource);
        ibtn_headRightImageButton.setVisibility(View.VISIBLE);
        ibtn_headRightImageButton.setOnClickListener(listener);
    }

    public ImageButton getRightImageButton() {
        return ibtn_headRightImageButton;
    }

    private void assignViews() {
        rel_contentArea = (RelativeLayout) findViewById(R.id.rel_base_contentArea);
        ibtn_headRightImageButton = (ImageButton) findViewById(R.id.btn_base_head_right_imgbutton);
        btn_backButton = (Button) findViewById(R.id.btn_base_head_back);
        btn_headTitle = (TextView) findViewById(R.id.tv_base_head_title);
        btn_headRightButton = (Button) findViewById(R.id.btn_base_head_right_button);
        mLoading = (RelativeLayout) findViewById(R.id.rel_base_loading);
        rel_base_headArea = (LinearLayout) findViewById(R.id.rel_base_headArea);
    }
}
