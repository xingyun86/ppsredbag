package com.ppshuai.redbag.taskjobs;

import android.content.Context;

import com.ppshuai.redbag.config.Config;
import com.ppshuai.redbag.services.RedbagService;

/**
 * <p>Created 2017/08/01 上午1:16.</p>
 * <p><a href="mailto:375182886@qq.com">Email:375182886@qq.com</a></p>
 * <p><a href="http://www.ppsbbs.tech">PPSBBS论坛</a></p>
 *
 * @author xingyun86(ppshuai)
 */
public abstract class BaseAccessbilityTaskJob implements AccessbilityTaskJob {

    private RedbagService service;

    @Override
    public void onCreateJob(RedbagService service) {
        this.service = service;
    }

    public Context getContext() {
        return service.getApplicationContext();
    }

    public Config getConfig() {
        return service.getConfig();
    }

    public RedbagService getService() {
        return service;
    }
}
