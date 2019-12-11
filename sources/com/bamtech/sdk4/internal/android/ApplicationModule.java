package com.bamtech.sdk4.internal.android;

import android.app.Application;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\b"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/ApplicationModule;", "", "()V", "cookiePreferences", "Landroid/content/SharedPreferences;", "application", "Landroid/app/Application;", "sharedPreferences", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: AndroidSdkComponent.kt */
public final class ApplicationModule {
    public final SharedPreferences cookiePreferences(Application application) {
        SharedPreferences sharedPreferences = application.getSharedPreferences(PreferencesStorage.Companion.getCOOKIE(), 0);
        C12880j.m40222a((Object) sharedPreferences, "application.getSharedPre…IE, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }

    public final SharedPreferences sharedPreferences(Application application) {
        SharedPreferences sharedPreferences = application.getSharedPreferences(PreferencesStorage.Companion.getNAME(), 0);
        C12880j.m40222a((Object) sharedPreferences, "application.getSharedPre…ME, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
