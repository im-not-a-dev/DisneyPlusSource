package com.bamtech.sdk4.internal.android;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtech.sdk4.internal.networking.cookies.CookiePersistor;
import com.bamtech.sdk4.internal.networking.cookies.CookiePersistor.DefaultImpls;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import okhttp3.Cookie;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo31007d2 = {"Lcom/bamtech/sdk4/internal/android/PreferencesCookiePersistor;", "Lcom/bamtech/sdk4/internal/networking/cookies/CookiePersistor;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clear", "", "loadAll", "", "Lokhttp3/Cookie;", "removeAll", "cookies", "", "saveAll", "sdk_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
@SuppressLint({"ApplySharedPref"})
/* compiled from: PreferencesCookiePersistor.kt */
public final class PreferencesCookiePersistor implements CookiePersistor {
    private final SharedPreferences sharedPreferences;

    public PreferencesCookiePersistor(SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences2;
    }

    public String createCookieKey(Cookie cookie) {
        return DefaultImpls.createCookieKey(this, cookie);
    }

    public List<Cookie> loadAll() {
        ArrayList arrayList = new ArrayList(this.sharedPreferences.getAll().size());
        Map all = this.sharedPreferences.getAll();
        C12880j.m40222a((Object) all, "sharedPreferences.all");
        for (Entry value : all.entrySet()) {
            Object value2 = value.getValue();
            if (value2 != null) {
                Cookie decode = new SerializableCookie().decode((String) value2);
                if (decode != null) {
                    arrayList.add(decode);
                }
            } else {
                throw new C13142s("null cannot be cast to non-null type kotlin.String");
            }
        }
        return arrayList;
    }

    public void removeAll(Collection<Cookie> collection) {
        Editor edit = this.sharedPreferences.edit();
        for (Cookie createCookieKey : collection) {
            edit.remove(createCookieKey(createCookieKey));
        }
        edit.commit();
    }

    public void saveAll(Collection<Cookie> collection) {
        Editor edit = this.sharedPreferences.edit();
        for (Cookie cookie : collection) {
            edit.putString(createCookieKey(cookie), new SerializableCookie().encode(cookie));
        }
        edit.commit();
    }
}
