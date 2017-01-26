package com.apg.library.corehelper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by X-tivity on 1/26/2017 AD.
 */

public class ConnectivityServiceHelper {

    ConnectivityServiceHelper() {

    }

    private ConnectivityManager getConnectivityManager(Context context) {
        return (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
    }

    public boolean hasInternetConnection(Context context) {
        NetworkInfo activeNetwork = getConnectivityManager(context).getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }

    public boolean isConnectWifi(Context context) {
        NetworkInfo activeNetwork = getConnectivityManager(context).getActiveNetworkInfo();
        return activeNetwork.getType() == ConnectivityManager.TYPE_WIFI;
    }

    public boolean isConnectMobile(Context context) {
        NetworkInfo activeNetwork = getConnectivityManager(context).getActiveNetworkInfo();
        return activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE;
    }

}
