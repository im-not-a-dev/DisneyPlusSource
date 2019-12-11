package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C9678a;
import com.google.android.gms.common.api.C9678a.C9682d;
import com.google.android.gms.common.internal.C9901s;

/* renamed from: com.google.android.gms.common.api.internal.b2 */
public final class C9717b2<O extends C9682d> {

    /* renamed from: a */
    private final boolean f22771a = true;

    /* renamed from: b */
    private final int f22772b;

    /* renamed from: c */
    private final C9678a<O> f22773c;

    /* renamed from: d */
    private final O f22774d;

    private C9717b2(C9678a<O> aVar, O o) {
        this.f22773c = aVar;
        this.f22774d = o;
        this.f22772b = C9901s.m30839a(this.f22773c, this.f22774d);
    }

    /* renamed from: a */
    public static <O extends C9682d> C9717b2<O> m30171a(C9678a<O> aVar, O o) {
        return new C9717b2<>(aVar, o);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9717b2)) {
            return false;
        }
        C9717b2 b2Var = (C9717b2) obj;
        return !this.f22771a && !b2Var.f22771a && C9901s.m30841a(this.f22773c, b2Var.f22773c) && C9901s.m30841a(this.f22774d, b2Var.f22774d);
    }

    public final int hashCode() {
        return this.f22772b;
    }

    /* renamed from: a */
    public static <O extends C9682d> C9717b2<O> m30170a(C9678a<O> aVar) {
        return new C9717b2<>(aVar);
    }

    /* renamed from: a */
    public final String mo25118a() {
        return this.f22773c.mo25017b();
    }

    private C9717b2(C9678a<O> aVar) {
        this.f22773c = aVar;
        this.f22774d = null;
        this.f22772b = System.identityHashCode(this);
    }
}
