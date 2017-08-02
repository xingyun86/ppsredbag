package com.ppshuai.redbag.taskjobs;

import android.view.accessibility.AccessibilityEvent;

import com.ppshuai.redbag.services.RedbagService;

/**
 * <p>Created 2017/08/01 上午1:16.</p>
 * <p><a href="mailto:375182886@qq.com">Email:375182886@qq.com</a></p>
 * <p><a href="http://www.ppsbbs.tech">PPSBBS论坛</a></p>
 *
 * @author xingyun86(ppshuai)
 */
public interface AccessbilityTaskJob {
    String getTargetPackageName();
    void onCreateJob(RedbagService service);
    void onReceiveJob(AccessibilityEvent event);
    void onStopJob();
    boolean isEnable();
}
