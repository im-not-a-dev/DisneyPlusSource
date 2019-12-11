package com.google.android.exoplayer2.source.dash.p376k;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.source.dash.k.a */
/* compiled from: AdaptationSet */
public class C9114a {

    /* renamed from: a */
    public final int f20418a;

    /* renamed from: b */
    public final int f20419b;

    /* renamed from: c */
    public final List<C9123i> f20420c;

    /* renamed from: d */
    public final List<C9118d> f20421d;

    /* renamed from: e */
    public final List<C9118d> f20422e;

    public C9114a(int i, int i2, List<C9123i> list, List<C9118d> list2, List<C9118d> list3) {
        List<C9118d> list4;
        List<C9118d> list5;
        this.f20418a = i;
        this.f20419b = i2;
        this.f20420c = Collections.unmodifiableList(list);
        if (list2 == null) {
            list4 = Collections.emptyList();
        } else {
            list4 = Collections.unmodifiableList(list2);
        }
        this.f20421d = list4;
        if (list3 == null) {
            list5 = Collections.emptyList();
        } else {
            list5 = Collections.unmodifiableList(list3);
        }
        this.f20422e = list5;
    }
}
