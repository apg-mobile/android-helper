package com.apg.library.corehelper;

import android.content.Context;
import android.content.res.Configuration;
import android.hardware.usb.UsbConstants;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by X-tivity on 2/10/2017 AD.
 */

public class UsbServiceHelper {

    private UsbManager getUsbManager (Context context) {
        return  (UsbManager) context.getSystemService(Context.USB_SERVICE);
    }

    public boolean hasUsbClassHid(Context context) {

        HashMap<String, UsbDevice> deviceList = getUsbManager(context).getDeviceList();

        Iterator<UsbDevice> iterator = deviceList.values().iterator();
        while (iterator.hasNext()) {
            UsbDevice device = iterator.next();
            if (device.getDeviceClass() == UsbConstants.USB_CLASS_HID  ||
                    device.getDeviceClass() == UsbConstants.USB_CLASS_PER_INTERFACE) {
                return true;
            }
        }
        return false;
    }

    public boolean isHardwareKeyboardAvailable(Context context) {
        return (context.getResources().getConfiguration().keyboard != Configuration.KEYBOARD_NOKEYS)
                || hasUsbClassHid(context);
    }
}
