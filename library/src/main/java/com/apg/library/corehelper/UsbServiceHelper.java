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

    private final int QUALCOMM_CDMA_PRODUCT_ID = 37022;
    private final int QUALCOMM_CDMA_VENDOR_ID = 1478;

    private UsbManager getUsbManager (Context context) {
        return  (UsbManager) context.getSystemService(Context.USB_SERVICE);
    }

    public boolean hasUsbClassHid(Context context) {

        HashMap<String, UsbDevice> deviceList = getUsbManager(context).getDeviceList();

        for (UsbDevice device : deviceList.values()) {
            if (device.getDeviceClass() == UsbConstants.USB_CLASS_HID || device.getDeviceClass() == UsbConstants.USB_CLASS_PER_INTERFACE) {

                // Bug on Samsung galaxy note edge (Android 6.0.1), detect unknown usb in its device ?
                if (device.getProductId() == QUALCOMM_CDMA_PRODUCT_ID && device.getVendorId() == QUALCOMM_CDMA_VENDOR_ID) {
                    continue;
                }

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
