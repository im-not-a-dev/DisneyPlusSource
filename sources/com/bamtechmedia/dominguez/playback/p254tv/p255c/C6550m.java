package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import p163g.p174d.p178b.p180b0.C4922v2;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.m */
/* compiled from: TvPlaybackModule_ProvideBindingsFactory */
public final class C6550m implements C11895c<C4922v2> {

    /* renamed from: a */
    private static final C6550m f14801a = new C6550m();

    /* renamed from: a */
    public static C6550m m20382a() {
        return f14801a;
    }

    /* renamed from: b */
    public static C4922v2 m20383b() {
        C4922v2 a = C6548k.m20378a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C4922v2 get() {
        return m20383b();
    }
}
