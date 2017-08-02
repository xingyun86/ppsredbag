package com.ppshuai.redbag.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ppshuai.redbag.application.RedbagApplication;

/**
 * <p>Created 2017/08/01 上午1:16.</p>
 * <p><a href="mailto:375182886@qq.com">Email:375182886@qq.com</a></p>
 * <p><a href="http://www.ppsbbs.tech">PPSBBS论坛</a></p>
 *
 * @author xingyun86(ppshuai)
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RedbagApplication.activityCreateStatistics(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        RedbagApplication.activityResumeStatistics(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        RedbagApplication.activityPauseStatistics(this);
    }
}
