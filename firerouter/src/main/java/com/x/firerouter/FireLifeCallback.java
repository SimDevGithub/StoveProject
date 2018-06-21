package com.x.firerouter;

import android.app.Activity;
import android.os.Bundle;

public class FireLifeCallback implements FireActivityLife {

    private Activity resumedActivity;

    FireLifeCallback() {
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {
        if (resumedActivity != null) {
            resumedActivity = null;
        }
        resumedActivity = activity;
    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    @Override
    public Activity resumedActivity() {
        return resumedActivity;
    }

    @Override
    public Activity currentActivity() {
        return resumedActivity();
    }
}
