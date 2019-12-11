package com.google.android.exoplayer2.source.dash.p376k;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.k.f */
/* compiled from: Period */
public class C9120f {

    /* renamed from: a */
    public final String f20453a;

    /* renamed from: b */
    public final long f20454b;

    /* renamed from: c */
    public final List<C9114a> f20455c;

    /* renamed from: d */
    public final List<C9119e> f20456d;

    public C9120f(String str, long j, List<C9114a> list, List<C9119e> list2) {
        this.f20453a = str;
        this.f20454b = j;
        this.f20455c = Collections.unmodifiableList(list);
        this.f20456d = Collections.unmodifiableList(list2);
    }

    /* renamed from: a */
    public int mo23721a(int i) {
        int size = this.f20455c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C9114a) this.f20455c.get(i2)).f20419b == i) {
                return i2;
            }
        }
        return -1;
    }
}
