package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.google.android.exoplayer2.v0.c0 */
/* compiled from: SlidingPercentile */
public class C9532c0 {

    /* renamed from: h */
    private static final Comparator<C9534b> f22234h = C9529b.f22231c;

    /* renamed from: i */
    private static final Comparator<C9534b> f22235i = C9531c.f22233c;

    /* renamed from: a */
    private final int f22236a;

    /* renamed from: b */
    private final ArrayList<C9534b> f22237b = new ArrayList<>();

    /* renamed from: c */
    private final C9534b[] f22238c = new C9534b[5];

    /* renamed from: d */
    private int f22239d = -1;

    /* renamed from: e */
    private int f22240e;

    /* renamed from: f */
    private int f22241f;

    /* renamed from: g */
    private int f22242g;

    /* renamed from: com.google.android.exoplayer2.v0.c0$b */
    /* compiled from: SlidingPercentile */
    private static class C9534b {

        /* renamed from: a */
        public int f22243a;

        /* renamed from: b */
        public int f22244b;

        /* renamed from: c */
        public float f22245c;

        private C9534b() {
        }
    }

    public C9532c0(int i) {
        this.f22236a = i;
    }

    /* renamed from: a */
    static /* synthetic */ int m29283a(C9534b bVar, C9534b bVar2) {
        return bVar.f22243a - bVar2.f22243a;
    }

    /* renamed from: c */
    private void m29286c() {
        if (this.f22239d != 0) {
            Collections.sort(this.f22237b, f22235i);
            this.f22239d = 0;
        }
    }

    /* renamed from: b */
    private void m29285b() {
        if (this.f22239d != 1) {
            Collections.sort(this.f22237b, f22234h);
            this.f22239d = 1;
        }
    }

    /* renamed from: a */
    public void mo24599a() {
        this.f22237b.clear();
        this.f22239d = -1;
        this.f22240e = 0;
        this.f22241f = 0;
    }

    /* renamed from: a */
    public void mo24600a(int i, float f) {
        C9534b bVar;
        m29285b();
        int i2 = this.f22242g;
        if (i2 > 0) {
            C9534b[] bVarArr = this.f22238c;
            int i3 = i2 - 1;
            this.f22242g = i3;
            bVar = bVarArr[i3];
        } else {
            bVar = new C9534b();
        }
        int i4 = this.f22240e;
        this.f22240e = i4 + 1;
        bVar.f22243a = i4;
        bVar.f22244b = i;
        bVar.f22245c = f;
        this.f22237b.add(bVar);
        this.f22241f += i;
        while (true) {
            int i5 = this.f22241f;
            int i6 = this.f22236a;
            if (i5 > i6) {
                int i7 = i5 - i6;
                C9534b bVar2 = (C9534b) this.f22237b.get(0);
                int i8 = bVar2.f22244b;
                if (i8 <= i7) {
                    this.f22241f -= i8;
                    this.f22237b.remove(0);
                    int i9 = this.f22242g;
                    if (i9 < 5) {
                        C9534b[] bVarArr2 = this.f22238c;
                        this.f22242g = i9 + 1;
                        bVarArr2[i9] = bVar2;
                    }
                } else {
                    bVar2.f22244b = i8 - i7;
                    this.f22241f -= i7;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public float mo24598a(float f) {
        float f2;
        m29286c();
        float f3 = f * ((float) this.f22241f);
        int i = 0;
        for (int i2 = 0; i2 < this.f22237b.size(); i2++) {
            C9534b bVar = (C9534b) this.f22237b.get(i2);
            i += bVar.f22244b;
            if (((float) i) >= f3) {
                return bVar.f22245c;
            }
        }
        if (this.f22237b.isEmpty()) {
            f2 = Float.NaN;
        } else {
            ArrayList<C9534b> arrayList = this.f22237b;
            f2 = ((C9534b) arrayList.get(arrayList.size() - 1)).f22245c;
        }
        return f2;
    }
}
