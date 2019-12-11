package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C9908u;

/* renamed from: com.google.android.gms.measurement.internal.f */
final class C10040f {

    /* renamed from: a */
    final String f23413a;

    /* renamed from: b */
    final String f23414b;

    /* renamed from: c */
    final long f23415c;

    /* renamed from: d */
    final long f23416d;

    /* renamed from: e */
    final long f23417e;

    /* renamed from: f */
    final long f23418f;

    /* renamed from: g */
    final long f23419g;

    /* renamed from: h */
    final Long f23420h;

    /* renamed from: i */
    final Long f23421i;

    /* renamed from: j */
    final Long f23422j;

    /* renamed from: k */
    final Boolean f23423k;

    C10040f(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        long j6 = j;
        long j7 = j2;
        long j8 = j3;
        long j9 = j5;
        C9908u.m30863b(str);
        C9908u.m30863b(str2);
        boolean z = true;
        C9908u.m30860a(j6 >= 0);
        C9908u.m30860a(j7 >= 0);
        C9908u.m30860a(j8 >= 0);
        if (j9 < 0) {
            z = false;
        }
        C9908u.m30860a(z);
        this.f23413a = str;
        this.f23414b = str2;
        this.f23415c = j6;
        this.f23416d = j7;
        this.f23417e = j8;
        this.f23418f = j4;
        this.f23419g = j9;
        this.f23420h = l;
        this.f23421i = l2;
        this.f23422j = l3;
        this.f23423k = bool;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10040f mo25682a(long j) {
        C10040f fVar = new C10040f(this.f23413a, this.f23414b, this.f23415c, this.f23416d, this.f23417e, j, this.f23419g, this.f23420h, this.f23421i, this.f23422j, this.f23423k);
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10040f mo25683a(long j, long j2) {
        C10040f fVar = new C10040f(this.f23413a, this.f23414b, this.f23415c, this.f23416d, this.f23417e, this.f23418f, j, Long.valueOf(j2), this.f23421i, this.f23422j, this.f23423k);
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C10040f mo25684a(Long l, Long l2, Boolean bool) {
        C10040f fVar = new C10040f(this.f23413a, this.f23414b, this.f23415c, this.f23416d, this.f23417e, this.f23418f, this.f23419g, this.f23420h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
        return fVar;
    }

    C10040f(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, j, j2, 0, j3, 0, null, null, null, null);
    }
}
