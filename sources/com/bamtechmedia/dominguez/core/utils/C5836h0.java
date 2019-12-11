package com.bamtechmedia.dominguez.core.utils;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

/* renamed from: com.bamtechmedia.dominguez.core.utils.h0 */
/* compiled from: SharedPreferencesExt.kt */
public final class C5836h0 {
    /* renamed from: a */
    public static final void m18832a(SharedPreferences sharedPreferences, String str, Object obj) {
        String str2 = "editor";
        if (obj != null ? obj instanceof String : true) {
            Editor edit = sharedPreferences.edit();
            C12880j.m40222a((Object) edit, str2);
            edit.putString(str, (String) obj);
            edit.apply();
        } else if (obj instanceof Integer) {
            Editor edit2 = sharedPreferences.edit();
            C12880j.m40222a((Object) edit2, str2);
            edit2.putInt(str, ((Number) obj).intValue());
            edit2.apply();
        } else if (obj instanceof Boolean) {
            Editor edit3 = sharedPreferences.edit();
            C12880j.m40222a((Object) edit3, str2);
            edit3.putBoolean(str, ((Boolean) obj).booleanValue());
            edit3.apply();
        } else if (obj instanceof Float) {
            Editor edit4 = sharedPreferences.edit();
            C12880j.m40222a((Object) edit4, str2);
            edit4.putFloat(str, ((Number) obj).floatValue());
            edit4.apply();
        } else if (obj instanceof Long) {
            Editor edit5 = sharedPreferences.edit();
            C12880j.m40222a((Object) edit5, str2);
            edit5.putLong(str, ((Number) obj).longValue());
            edit5.apply();
        } else if (obj instanceof DateTime) {
            Editor edit6 = sharedPreferences.edit();
            C12880j.m40222a((Object) edit6, str2);
            edit6.putString(str, obj.toString());
            edit6.apply();
        } else {
            throw new UnsupportedOperationException("Not yet implemented");
        }
    }
}
