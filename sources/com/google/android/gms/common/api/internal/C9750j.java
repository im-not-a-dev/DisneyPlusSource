package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.j */
public class C9750j {

    /* renamed from: a */
    private final Set<C9745i<?>> f22860a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public final void mo25193a() {
        for (C9745i a : this.f22860a) {
            a.mo25185a();
        }
        this.f22860a.clear();
    }
}
