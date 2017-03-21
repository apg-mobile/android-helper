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
    private static GoogleServiceHelper googleHelperInstance;
    private static ToolbarHelper toolbarHelperInstance;
    private static ThreadHelper threadHelperInstance;
    private static UsbServiceHelper usbServiceHelperInstance;

    private Apg() {}

    public static InputServiceHelper input() {

        if (inputHelperInstance == null) {
            inputHelperInstance = new InputServiceHelper();
        }

        return inputHelperInstance;
    }

    public static UsbServiceHelper usb() {

        if (usbServiceHelperInstance == null) {
            usbServiceHelperInstance = new UsbServiceHelper();
        }

        return usbServiceHelperInstance;
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

    public static GoogleServiceHelper google() {

        if (googleHelperInstance == null) {
            googleHelperInstance = new GoogleServiceHelper();
        }

        return googleHelperInstance;
    }

    public static ToolbarHelper toolbar() {

        if (toolbarHelperInstance == null) {
            toolbarHelperInstance = new ToolbarHelper();
        }

        return toolbarHelperInstance;
    }

    public static ThreadHelper thread() {

        if (threadHelperInstance == null) {
            threadHelperInstance = new ThreadHelper();
        }

        return threadHelperInstance;
    }
}
