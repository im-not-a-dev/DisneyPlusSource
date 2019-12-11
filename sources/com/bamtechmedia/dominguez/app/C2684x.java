package com.bamtechmedia.dominguez.app;

import com.bamtechmedia.dominguez.core.AspectRatioJsonAdapter;
import com.bamtechmedia.dominguez.core.DateTimeJsonAdapter;
import com.bamtechmedia.dominguez.core.content.C3682d;
import kotlin.jvm.internal.C12880j;
import p163g.p500m.p501a.C11725h.C11732g;
import p163g.p500m.p501a.C11760v;
import p163g.p500m.p501a.C11760v.C11761a;

/* renamed from: com.bamtechmedia.dominguez.app.x */
/* compiled from: MoshiProvider.kt */
public final class C2684x {

    /* renamed from: a */
    private static final C11760v f7430a;

    /* renamed from: b */
    public static final C2684x f7431b = new C2684x();

    static {
        C11761a aVar = new C11761a();
        aVar.mo29871a((Object) new AspectRatioJsonAdapter());
        aVar.mo29871a((Object) new DateTimeJsonAdapter());
        aVar.mo29870a((C11732g) new C3682d());
        aVar.mo29870a((C11732g) new C2682w());
        C11760v a = aVar.mo29873a();
        C12880j.m40222a((Object) a, "Moshi.Builder()\n        …ctory())\n        .build()");
        f7430a = a;
    }

    private C2684x() {
    }

    /* renamed from: a */
    public final C11760v mo11722a() {
        return f7430a;
    }
}
