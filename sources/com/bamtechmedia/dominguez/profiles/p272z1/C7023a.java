package com.bamtechmedia.dominguez.profiles.p272z1;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import com.bamtechmedia.dominguez.profiles.p263u1.p265e.C6865a;
import java.util.List;
import java.util.Locale;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import p096e.p121h.p130o.C4065b;

/* renamed from: com.bamtechmedia.dominguez.profiles.z1.a */
/* compiled from: DeviceSettingsSelectionsImpl.kt */
public final class C7023a implements C6865a {

    /* renamed from: a */
    private final Context f15600a;

    public C7023a(Context context) {
        this.f15600a = context;
    }

    /* renamed from: a */
    public String mo19635a() {
        Object systemService = this.f15600a.getSystemService("captioning");
        if (systemService != null) {
            Locale locale = ((CaptioningManager) systemService).getLocale();
            if (locale != null) {
                return locale.toLanguageTag();
            }
            return null;
        }
        throw new C13142s("null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
    }

    /* renamed from: b */
    public boolean mo19636b() {
        Object systemService = this.f15600a.getSystemService("captioning");
        if (systemService != null) {
            return ((CaptioningManager) systemService).isEnabled();
        }
        throw new C13142s("null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
    }

    /* renamed from: c */
    public List<String> mo19637c() {
        String a = C4065b.m13973b().mo14582a();
        C12880j.m40222a((Object) a, "LocaleListCompat.getDefault().toLanguageTags()");
        return C12833x.m40142a((CharSequence) a, new String[]{","}, false, 0, 6, (Object) null);
    }
}
