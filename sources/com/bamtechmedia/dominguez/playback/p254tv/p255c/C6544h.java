package com.bamtechmedia.dominguez.playback.p254tv.p255c;

import com.bamtechmedia.dominguez.playback.p236l.C6334b;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.playback.tv.c.h */
/* compiled from: TvPlaybackBindingModule_ProvidePlaybackIntentFactoryFactory */
public final class C6544h implements C11895c<C6334b> {

    /* renamed from: a */
    private static final C6544h f14797a = new C6544h();

    /* renamed from: a */
    public static C6544h m20367a() {
        return f14797a;
    }

    /* renamed from: b */
    public static C6334b m20368b() {
        C6334b a = C6542f.m20365a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6334b get() {
        return m20368b();
    }
}
