package com.lv.rxdemo.viewmodel;

import android.content.Context;
import android.view.View;

import com.lv.rxdemo.R;
import com.lv.rxdemo.config.Constant;
import com.lv.rxdemo.utils.IntentUtil;

/**
 * Created by Lv on 2016/7/20.
 */
public class AboutViewModel {

    private Context context;

    public AboutViewModel(Context context) {
        this.context = context;
    }

    private String githubAddress;
    private String emailAddress;

    public String getGithubAddress() {
        return "github地址";
    }

    public String getEmailAddress() {
        return "1025202464@qq.com";
    }

    public void onClickEvent(View view) {
        switch (view.getId()){
            case R.id.float_btn_star:
                IntentUtil.redirectFinestWebView(context, Constant.GITHUB_URL);
                break;
            case R.id.item_github_address:
                IntentUtil.redirectFinestWebView(context, Constant.GITHUB_URL);
                break;
        }
    }
}