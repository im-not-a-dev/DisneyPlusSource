package com.google.android.gms.auth.api.signin.internal;

/* renamed from: com.google.android.gms.auth.api.signin.internal.b */
public class C9653b {

    /* renamed from: b */
    private static int f22668b = 31;

    /* renamed from: a */
    private int f22669a = 1;

    /* renamed from: a */
    public C9653b mo24945a(Object obj) {
        this.f22669a = (f22668b * this.f22669a) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    /* renamed from: a */
    public final C9653b mo24946a(boolean z) {
        this.f22669a = (f22668b * this.f22669a) + (z ? 1 : 0);
        return this;
    }

    /* renamed from: a */
    public int mo24944a() {
        return this.f22669a;
    }
}
