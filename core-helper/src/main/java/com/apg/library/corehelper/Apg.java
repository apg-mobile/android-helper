package com.apg.library.corehelper;

/**
 * Created by X-tivity on 1/26/2017 AD.
 */

public final class Apg {

    private static InputServiceHelper inputHelperInstance;
    private static ConnectivityServiceHelper connectivityHelperInstance;
    private static VibrateServiceHelper vibrateHelperInstance;
    private static MediaHelper mediaHelperInstance;
    private static LogHelper logHelperInstance;

    private Apg() {}

    public static InputServiceHelper input() {

        if (inputHelperInstance == null) {
            inputHelperInstance = new InputServiceHelper();
        }

        return inputHelperInstance;
    }

    public static ConnectivityServiceHelper network() {

        if (connectivityHelperInstance == null) {
            connectivityHelperInstance = new ConnectivityServiceHelper();
        }

        return connectivityHelperInstance;
    }

    public static VibrateServiceHelper vibrator() {

        if (vibrateHelperInstance == null) {
            vibrateHelperInstance = new VibrateServiceHelper();
        }

        return vibrateHelperInstance;
    }

    public static MediaHelper media() {

        if (mediaHelperInstance == null) {
            mediaHelperInstance = new MediaHelper();
        }

        return mediaHelperInstance;
    }

    public static LogHelper log() {

        if (logHelperInstance == null) {
            logHelperInstance = new LogHelper();
        }

        return logHelperInstance;
    }
}
