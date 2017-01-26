package com.apg.library.corehelper;

import android.content.Context;
import android.os.Vibrator;

/**
 * Created by X-tivity on 1/26/2017 AD.
 */

public class VibrateServiceHelper {

    private static final int VIBRATE_IN_MILLISEC = 100;

    VibrateServiceHelper() {

    }

    private Vibrator getVibrator(Context context) {
        return (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
    }

    public boolean vibrate(Context context) {
        try {
            getVibrator(context).vibrate(VIBRATE_IN_MILLISEC);
            return true;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean vibrate(Context context, long millisec) {
        try {
            getVibrator(context).vibrate(millisec);
            return true;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}
