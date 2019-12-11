package com.bamtechmedia.dominguez.main;

import com.bamtechmedia.dominguez.playback.p236l.C6333a;
import p512h.p515d.C11895c;
import p512h.p515d.C11897e;

/* renamed from: com.bamtechmedia.dominguez.main.i */
/* compiled from: MainActivityIntentModule_ProvidesMainActivityIntentFactoryFactory */
public final class C6133i implements C11895c<C6333a> {
    static {
        new C6133i();
    }

    /* renamed from: a */
    public static C6333a m19550a() {
        C6333a a = C6132h.m19549a();
        C11897e.m38130a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }

    public C6333a get() {
        return m19550a();
    }
}
