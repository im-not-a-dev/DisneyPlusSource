package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C9692b;
import com.google.android.gms.common.api.C9702g.C9703a;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;
import p163g.p449j.p450a.p451a.p467f.C11436i;

/* renamed from: com.google.android.gms.common.api.internal.q */
public final class C9778q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f22941a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<C11436i<?>, Boolean> f22942b = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25231a(BasePendingResult<? extends C9810l> basePendingResult, boolean z) {
        this.f22941a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo25080a((C9703a) new C9781r(this, basePendingResult));
    }

    /* renamed from: b */
    public final void mo25233b() {
        m30458a(false, C9726e.f22788g0);
    }

    /* renamed from: c */
    public final void mo25234c() {
        m30458a(true, C9792u1.f22975d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo25232a() {
        return !this.f22941a.isEmpty() || !this.f22942b.isEmpty();
    }

    /* renamed from: a */
    private final void m30458a(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f22941a) {
            hashMap = new HashMap(this.f22941a);
        }
        synchronized (this.f22942b) {
            hashMap2 = new HashMap(this.f22942b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo25087b(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C11436i) entry2.getKey()).mo29274b((Exception) new C9692b(status));
            }
        }
    }
}
