package com.google.firebase.iid;

import com.google.android.gms.common.internal.C9901s;
import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.firebase.iid.t0 */
/* compiled from: com.google.firebase:firebase-iid@@19.0.1 */
final class C10500t0 {

    /* renamed from: a */
    private final String f24884a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f24885b;

    C10500t0(String str, long j) {
        C9908u.m30853a(str);
        this.f24884a = str;
        this.f24885b = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo27349a() {
        return this.f24884a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo27350b() {
        return this.f24885b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10500t0)) {
            return false;
        }
        C10500t0 t0Var = (C10500t0) obj;
        if (this.f24885b != t0Var.f24885b || !this.f24884a.equals(t0Var.f24884a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C9901s.m30839a(this.f24884a, Long.valueOf(this.f24885b));
    }
}
