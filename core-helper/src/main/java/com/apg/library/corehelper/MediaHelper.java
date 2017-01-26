package com.apg.library.corehelper;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;

/**
 * Created by X-tivity on 1/26/2017 AD.
 */

public class MediaHelper {

    MediaHelper() {

    }

    public boolean playSound(Context context) {
        try {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r = RingtoneManager.getRingtone(context, notification);
            r.play();
            return true;
        } catch (NullPointerException e) {
            e.printStackTrace();
            return false;
        }
    }
}
