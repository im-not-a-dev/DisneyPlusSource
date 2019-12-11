package com.bamtechmedia.dominguez.about;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.bamtech.sdk4.content.SearchOverrides;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\f8F@FX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo31007d2 = {"Lcom/bamtechmedia/dominguez/about/PersistedDebugOverrides;", "", "debugPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "countryCodeOverride", "getCountryCodeOverride", "()Ljava/lang/String;", "setCountryCodeOverride", "(Ljava/lang/String;)V", "Lorg/joda/time/DateTime;", "timeTravelOverride", "getTimeTravelOverride", "()Lorg/joda/time/DateTime;", "setTimeTravelOverride", "(Lorg/joda/time/DateTime;)V", "searchOverrides", "Lcom/bamtech/sdk4/content/SearchOverrides;", "Companion", "about_release"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: com.bamtechmedia.dominguez.about.k */
/* compiled from: PersistedDebugOverrides.kt */
public final class C2279k {

    /* renamed from: a */
    private final SharedPreferences f6414a;

    /* renamed from: com.bamtechmedia.dominguez.about.k$a */
    /* compiled from: PersistedDebugOverrides.kt */
    private static final class C2280a {
        private C2280a() {
        }

        public /* synthetic */ C2280a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C2280a(null);
    }

    public C2279k(SharedPreferences sharedPreferences) {
        this.f6414a = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo11327a(DateTime dateTime) {
        Editor edit = this.f6414a.edit();
        C12880j.m40222a((Object) edit, "editor");
        String str = "timeTravelDate";
        if (dateTime != null) {
            edit.putLong(str, dateTime.getMillis());
        } else {
            edit.remove(str);
        }
        edit.apply();
    }

    /* renamed from: b */
    public final DateTime mo11328b() {
        Long valueOf = Long.valueOf(this.f6414a.getLong("timeTravelDate", 0));
        if (!(valueOf.longValue() != 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return new DateTime(valueOf.longValue());
        }
        return null;
    }

    /* renamed from: c */
    public final SearchOverrides mo11329c() {
        DateTime b = mo11328b();
        return new SearchOverrides(b != null ? Long.valueOf(b.getMillis()) : null, mo11325a());
    }

    /* renamed from: a */
    public final String mo11325a() {
        return this.f6414a.getString("SearchLocationOverride", null);
    }

    /* renamed from: a */
    public final void mo11326a(String str) {
        Editor edit = this.f6414a.edit();
        C12880j.m40222a((Object) edit, "editor");
        edit.putString("SearchLocationOverride", str);
        edit.apply();
    }
}
