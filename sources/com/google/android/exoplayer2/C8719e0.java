package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.source.MediaSource.MediaPeriodId;

/* renamed from: com.google.android.exoplayer2.e0 */
/* compiled from: MediaPeriodInfo */
final class C8719e0 {

    /* renamed from: a */
    public final MediaPeriodId f18510a;

    /* renamed from: b */
    public final long f18511b;

    /* renamed from: c */
    public final long f18512c;

    /* renamed from: d */
    public final long f18513d;

    /* renamed from: e */
    public final long f18514e;

    /* renamed from: f */
    public final boolean f18515f;

    /* renamed from: g */
    public final boolean f18516g;

    C8719e0(MediaPeriodId mediaPeriodId, long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f18510a = mediaPeriodId;
        this.f18511b = j;
        this.f18512c = j2;
        this.f18513d = j3;
        this.f18514e = j4;
        this.f18515f = z;
        this.f18516g = z2;
    }

    /* renamed from: a */
    public C8719e0 mo22804a(long j) {
        if (j == this.f18512c) {
            return this;
        }
        C8719e0 e0Var = new C8719e0(this.f18510a, this.f18511b, j, this.f18513d, this.f18514e, this.f18515f, this.f18516g);
        return e0Var;
    }

    /* renamed from: b */
    public C8719e0 mo22805b(long j) {
        if (j == this.f18511b) {
            return this;
        }
        C8719e0 e0Var = new C8719e0(this.f18510a, j, this.f18512c, this.f18513d, this.f18514e, this.f18515f, this.f18516g);
        return e0Var;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8719e0.class != obj.getClass()) {
            return false;
        }
        C8719e0 e0Var = (C8719e0) obj;
        if (!(this.f18511b == e0Var.f18511b && this.f18512c == e0Var.f18512c && this.f18513d == e0Var.f18513d && this.f18514e == e0Var.f18514e && this.f18515f == e0Var.f18515f && this.f18516g == e0Var.f18516g && Util.m29414a((Object) this.f18510a, (Object) e0Var.f18510a))) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((((((((((527 + this.f18510a.hashCode()) * 31) + ((int) this.f18511b)) * 31) + ((int) this.f18512c)) * 31) + ((int) this.f18513d)) * 31) + ((int) this.f18514e)) * 31) + (this.f18515f ? 1 : 0)) * 31) + (this.f18516g ? 1 : 0);
    }
}
