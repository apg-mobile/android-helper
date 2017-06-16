package com.apg.library.corehelper;

import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siwarats on 15/6/2560.
 */

public class DateHelper {

    DateHelper() {
    }

    public String getNotificationTime(Context context, long ms, String defaultPattern) {
        long now = System.currentTimeMillis();
        long result = now - ms;

        if (result < 0) {
            //Future
            return new SimpleDateFormat("d-M-yyyy HH:mm").format(new Date(ms).getTime());
        }

        long secondAgo = TimeUnit.MILLISECONDS.toSeconds(result);
        if (secondAgo < 60) {
            return context.getString(R.string.notification_now);
        }

        long minuteAgo = TimeUnit.MILLISECONDS.toMinutes(result);
        if (minuteAgo < 60) {
            return context.getString(R.string.notification_minute_ago, minuteAgo);
        }

        long hourAgo = TimeUnit.MILLISECONDS.toHours(result);
        if (hourAgo < 24) {
            return context.getString(R.string.notification_hour_ago, hourAgo);
        }

        long dayAgo = TimeUnit.MILLISECONDS.toDays(result);
        if (dayAgo == 1) {
            return context.getString(R.string.notification_yesterday);
        } else if (dayAgo == 2) {
            return context.getString(R.string.notification_day_ago, dayAgo);
        } else {
            return new SimpleDateFormat(defaultPattern).format(new Date(ms).getTime());
        }
    }

    public String getNotificationTime(Context context, long ms) {
        return getNotificationTime(context, ms, "d-M-yyyy HH:mm");
    }
}
