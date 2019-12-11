package com.bamtechmedia.dominguez.playback.p237m.p252q.p253g;

import androidx.lifecycle.C0741y;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p237m.C6341e;
import kotlin.jvm.internal.C12880j;
import org.joda.time.DateTime;
import org.joda.time.ReadableInstant;

/* renamed from: com.bamtechmedia.dominguez.playback.m.q.g.a */
/* compiled from: AutoPlayRules.kt */
public final class C6512a extends C0741y {

    /* renamed from: a */
    private DateTime f14726a;

    /* renamed from: b */
    private final C6266a f14727b;

    public C6512a(C6266a aVar) {
        this.f14727b = aVar;
        DateTime now = DateTime.now();
        C12880j.m40222a((Object) now, "DateTime.now()");
        this.f14726a = now;
    }

    /* renamed from: a */
    public final boolean mo19172a(C6341e eVar, boolean z) {
        if ((!eVar.mo18979b() || z) && !mo19173y()) {
            return eVar.mo18979b();
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo19173y() {
        return DateTime.now().isAfter((ReadableInstant) this.f14726a.plusHours(this.f14727b.mo18859j()));
    }

    /* renamed from: z */
    public final void mo19174z() {
        DateTime now = DateTime.now();
        C12880j.m40222a((Object) now, "DateTime.now()");
        this.f14726a = now;
    }
}
