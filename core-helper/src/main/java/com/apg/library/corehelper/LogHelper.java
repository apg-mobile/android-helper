package com.apg.library.corehelper;

import android.util.Log;

/**
 * Created by X-tivity on 1/26/2017 AD.
 */

public class LogHelper {

    LogHelper() {

    }

    public void d(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.d(tag, message);
        }
    }

    public void d(String message) {
        if (BuildConfig.DEBUG) {
            Log.d("debug", message);
        }
    }

    public void e(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.e(tag, message);
        }
    }

    public void e(String message) {
        if (BuildConfig.DEBUG) {
            Log.e("error", message);
        }
    }

    public void i(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.i(tag, message);
        }
    }

    public void i(String message) {
        if (BuildConfig.DEBUG) {
            Log.i("information", message);
        }
    }

    public void v(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, message);
        }
    }

    public void v(String message) {
        if (BuildConfig.DEBUG) {
            Log.v("Verbose", message);
        }
    }

    public void w(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.w(tag, message);
        }
    }

    public void w(String message) {
        if (BuildConfig.DEBUG) {
            Log.w("Warning", message);
        }
    }

    // http://stackoverflow.com/a/7959379/2077479

    public void wtf(String tag, String message) {
        if (BuildConfig.DEBUG) {
            Log.wtf(tag, message);
        }
    }

    public void wtf(String message) {
        if (BuildConfig.DEBUG) {
            Log.wtf("What The Fuck", message);
        }
    }
}
