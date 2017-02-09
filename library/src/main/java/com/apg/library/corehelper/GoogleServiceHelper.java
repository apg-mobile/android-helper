package com.apg.library.corehelper;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;

import java.util.List;

/**
 * Created by X-tivity on 2/9/2017 AD.
 */

public class GoogleServiceHelper {

    GoogleServiceHelper() {

    }

    public void openGooglePlayStore(Context context) {

        if (context == null) {
            return;
        }

        Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                "market://details?id=" + context.getPackageName()));

        boolean marketFound = false;

        // find all applications able to handle our rateIntent
        final List<ResolveInfo> otherApps = context.getPackageManager().queryIntentActivities(rateIntent, 0);
        for (ResolveInfo otherApp : otherApps) {
            // look for Google Play application
            if (otherApp.activityInfo.applicationInfo.packageName.equals("com.android.vending")) {

                ActivityInfo otherAppActivity = otherApp.activityInfo;
                ComponentName componentName = new ComponentName(
                        otherAppActivity.applicationInfo.packageName,
                        otherAppActivity.name
                );

                rateIntent.setFlags(
                        Intent.FLAG_ACTIVITY_NEW_TASK);

                rateIntent.setComponent(componentName);
                context.startActivity(rateIntent);
                marketFound = true;
                break;
            }
        }

        // if GP not present on device, open web browser
        if (!marketFound) {
            Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                    "https://play.google.com/store/apps/details?id=" + context.getPackageName()));
            context.startActivity(webIntent);
        }
    }
}
