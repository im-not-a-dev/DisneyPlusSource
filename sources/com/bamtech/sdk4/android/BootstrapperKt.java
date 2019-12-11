package com.bamtech.sdk4.android;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Build;
import android.os.Build.VERSION;
import com.bamtech.sdk4.configuration.DeviceType;
import com.bamtech.sdk4.internal.device.Device;
import com.bamtech.sdk4.internal.device.Device.Companion;
import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0001\u001a%\u0010\u0005\u001a\u00020\u0006\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b*\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\b¨\u0006\u000b"}, mo31007d2 = {"device", "Lcom/bamtech/sdk4/internal/device/Device;", "Landroid/app/Application;", "isTv", "", "plugin", "Lcom/bamtech/sdk4/android/Bootstrapper;", "PLUGIN", "Lcom/bamtech/sdk4/plugin/Plugin;", "extra", "Lcom/bamtech/sdk4/plugin/PluginExtra;", "sdk_release"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: Bootstrapper.kt */
public final class BootstrapperKt {
    public static final Device device(Application application) {
        DeviceType deviceType;
        boolean isTv = isTv(application);
        boolean z = application.getPackageManager().hasSystemFeature("android.hardware.telephony") || application.getPackageManager().hasSystemFeature("android.hardware.telephony.cdma") || application.getPackageManager().hasSystemFeature("android.hardware.telephony.gsm");
        if (isTv) {
            deviceType = DeviceType.TV;
        } else if (z) {
            deviceType = DeviceType.PHONE;
        } else {
            deviceType = DeviceType.TABLET;
        }
        DeviceType deviceType2 = deviceType;
        Companion companion = Device.Companion;
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        String str4 = Build.PRODUCT;
        StringBuilder sb = new StringBuilder();
        sb.append("Android v");
        sb.append(VERSION.RELEASE);
        return companion.init(str, str2, str3, str4, sb.toString(), deviceType2);
    }

    @SuppressLint({"NewApi", "ObsoleteSdkInt"})
    public static final boolean isTv(Application application) {
        if (VERSION.SDK_INT < 21) {
            return application.getPackageManager().hasSystemFeature("android.hardware.type.television");
        }
        return application.getPackageManager().hasSystemFeature("android.software.leanback");
    }
}
