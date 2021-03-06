/**
  * Generated by smali2java 1.0.0.558
  * Copyright (C) 2013 Hensence.com
  */

package hmapp.hm.com.hmandroidapp.util;

import android.app.Application;
import java.util.List;
import android.app.Activity;
import java.util.LinkedList;

public class SysApplication extends Application {
    private static SysApplication instance;
    private List<Activity> mList = new LinkedList();

    private SysApplication() {
    }

    public static synchronized SysApplication getInstance() {
        if (instance == null) {
            instance = new SysApplication();
        }

    return instance;
    }

    public void addActivity(Activity activity) {
        mList.add(activity);
    }

    public void exit() {
        // :( Parsing error. Please contact me.
    }

    public void onLowMemory() {
        super.onLowMemory();
        System.gc();
    }
}
