package com.bamtechmedia.dominguez.collections.p080o0;

import com.bamtechmedia.dominguez.config.C3524e;

/* renamed from: com.bamtechmedia.dominguez.collections.o0.h */
/* compiled from: CollectionsAppConfigImpl.kt */
public final class C3442h implements C3441g {

    /* renamed from: a */
    private final C3524e f8672a;

    public C3442h(C3524e eVar) {
        this.f8672a = eVar;
    }

    /* renamed from: a */
    public long mo12615a() {
        Long l = (Long) this.f8672a.mo12720d("collections", "heroAutoPagingDurationMillis");
        if (l != null) {
            return l.longValue();
        }
        return 5000;
    }

    /* renamed from: b */
    public long mo12616b() {
        Long a = this.f8672a.mo12716a("collections", "horizontalScrollDebounceMillis");
        if (a != null) {
            return a.longValue();
        }
        return 50;
    }

    /* renamed from: c */
    public long mo12617c() {
        Long a = this.f8672a.mo12716a("collections", "verticalScrollDebounceMillis");
        if (a != null) {
            return a.longValue();
        }
        return 200;
    }
}
