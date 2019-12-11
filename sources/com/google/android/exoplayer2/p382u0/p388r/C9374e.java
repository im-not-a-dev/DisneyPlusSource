package com.google.android.exoplayer2.p382u0.p388r;

import android.text.Layout.Alignment;
import com.google.android.exoplayer2.p393v0.Assertions;

/* renamed from: com.google.android.exoplayer2.u0.r.e */
/* compiled from: TtmlStyle */
final class C9374e {

    /* renamed from: a */
    private String f21586a;

    /* renamed from: b */
    private int f21587b;

    /* renamed from: c */
    private boolean f21588c;

    /* renamed from: d */
    private int f21589d;

    /* renamed from: e */
    private boolean f21590e;

    /* renamed from: f */
    private int f21591f = -1;

    /* renamed from: g */
    private int f21592g = -1;

    /* renamed from: h */
    private int f21593h = -1;

    /* renamed from: i */
    private int f21594i = -1;

    /* renamed from: j */
    private int f21595j = -1;

    /* renamed from: k */
    private float f21596k;

    /* renamed from: l */
    private String f21597l;

    /* renamed from: m */
    private C9374e f21598m;

    /* renamed from: n */
    private Alignment f21599n;

    /* renamed from: a */
    public C9374e mo24203a(boolean z) {
        Assertions.checkState(this.f21598m == null);
        this.f21593h = z ? 1 : 0;
        return this;
    }

    /* renamed from: b */
    public C9374e mo24207b(boolean z) {
        Assertions.checkState(this.f21598m == null);
        this.f21594i = z ? 1 : 0;
        return this;
    }

    /* renamed from: c */
    public C9374e mo24209c(boolean z) {
        Assertions.checkState(this.f21598m == null);
        this.f21591f = z ? 1 : 0;
        return this;
    }

    /* renamed from: d */
    public C9374e mo24212d(boolean z) {
        Assertions.checkState(this.f21598m == null);
        this.f21592g = z ? 1 : 0;
        return this;
    }

    /* renamed from: e */
    public int mo24213e() {
        return this.f21595j;
    }

    /* renamed from: f */
    public String mo24214f() {
        return this.f21597l;
    }

    /* renamed from: g */
    public int mo24215g() {
        if (this.f21593h == -1 && this.f21594i == -1) {
            return -1;
        }
        int i = 0;
        int i2 = this.f21593h == 1 ? 1 : 0;
        if (this.f21594i == 1) {
            i = 2;
        }
        return i2 | i;
    }

    /* renamed from: h */
    public Alignment mo24216h() {
        return this.f21599n;
    }

    /* renamed from: i */
    public boolean mo24217i() {
        return this.f21590e;
    }

    /* renamed from: j */
    public boolean mo24218j() {
        return this.f21588c;
    }

    /* renamed from: k */
    public boolean mo24219k() {
        return this.f21591f == 1;
    }

    /* renamed from: l */
    public boolean mo24220l() {
        return this.f21592g == 1;
    }

    /* renamed from: a */
    public C9374e mo24202a(String str) {
        Assertions.checkState(this.f21598m == null);
        this.f21586a = str;
        return this;
    }

    /* renamed from: b */
    public int mo24204b() {
        if (this.f21588c) {
            return this.f21587b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    /* renamed from: c */
    public String mo24210c() {
        return this.f21586a;
    }

    /* renamed from: d */
    public float mo24211d() {
        return this.f21596k;
    }

    /* renamed from: c */
    public C9374e mo24208c(int i) {
        this.f21595j = i;
        return this;
    }

    /* renamed from: a */
    public int mo24197a() {
        if (this.f21590e) {
            return this.f21589d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    /* renamed from: b */
    public C9374e mo24205b(int i) {
        Assertions.checkState(this.f21598m == null);
        this.f21587b = i;
        this.f21588c = true;
        return this;
    }

    /* renamed from: a */
    public C9374e mo24199a(int i) {
        this.f21589d = i;
        this.f21590e = true;
        return this;
    }

    /* renamed from: b */
    public C9374e mo24206b(String str) {
        this.f21597l = str;
        return this;
    }

    /* renamed from: a */
    public C9374e mo24201a(C9374e eVar) {
        m28595a(eVar, true);
        return this;
    }

    /* renamed from: a */
    private C9374e m28595a(C9374e eVar, boolean z) {
        if (eVar != null) {
            if (!this.f21588c && eVar.f21588c) {
                mo24205b(eVar.f21587b);
            }
            if (this.f21593h == -1) {
                this.f21593h = eVar.f21593h;
            }
            if (this.f21594i == -1) {
                this.f21594i = eVar.f21594i;
            }
            if (this.f21586a == null) {
                this.f21586a = eVar.f21586a;
            }
            if (this.f21591f == -1) {
                this.f21591f = eVar.f21591f;
            }
            if (this.f21592g == -1) {
                this.f21592g = eVar.f21592g;
            }
            if (this.f21599n == null) {
                this.f21599n = eVar.f21599n;
            }
            if (this.f21595j == -1) {
                this.f21595j = eVar.f21595j;
                this.f21596k = eVar.f21596k;
            }
            if (z && !this.f21590e && eVar.f21590e) {
                mo24199a(eVar.f21589d);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C9374e mo24200a(Alignment alignment) {
        this.f21599n = alignment;
        return this;
    }

    /* renamed from: a */
    public C9374e mo24198a(float f) {
        this.f21596k = f;
        return this;
    }
}
