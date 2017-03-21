package com.apg.library.corehelper;

import android.app.Activity;
import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;

/**
 * Created by X-tivity on 3/21/2017 AD.
 */

public class ThreadHelper {

    ThreadHelper() {

    }

    public void executeRunnable(Activity activity, Runnable runnable) {
        if (activity != null) {
            activity.runOnUiThread(runnable);
        }
    }
}
