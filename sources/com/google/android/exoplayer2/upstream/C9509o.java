package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.p393v0.C9537e;
import com.google.android.exoplayer2.p393v0.C9554k0;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.upstream.o */
/* compiled from: DefaultAllocator */
public final class C9509o implements C9491f {

    /* renamed from: a */
    private final boolean f22146a;

    /* renamed from: b */
    private final int f22147b;

    /* renamed from: c */
    private final byte[] f22148c;

    /* renamed from: d */
    private final C9489e[] f22149d;

    /* renamed from: e */
    private int f22150e;

    /* renamed from: f */
    private int f22151f;

    /* renamed from: g */
    private int f22152g;

    /* renamed from: h */
    private C9489e[] f22153h;

    public C9509o(boolean z, int i) {
        this(z, i, 0);
    }

    /* renamed from: a */
    public synchronized void mo24575a(int i) {
        boolean z = i < this.f22150e;
        this.f22150e = i;
        if (z) {
            mo24560b();
        }
    }

    /* renamed from: b */
    public synchronized void mo24560b() {
        int i = 0;
        int max = Math.max(0, C9554k0.m29381a(this.f22150e, this.f22147b) - this.f22151f);
        if (max < this.f22152g) {
            if (this.f22148c != null) {
                int i2 = this.f22152g - 1;
                while (i <= i2) {
                    C9489e eVar = this.f22153h[i];
                    if (eVar.f22091a == this.f22148c) {
                        i++;
                    } else {
                        C9489e eVar2 = this.f22153h[i2];
                        if (eVar2.f22091a != this.f22148c) {
                            i2--;
                        } else {
                            int i3 = i + 1;
                            this.f22153h[i] = eVar2;
                            int i4 = i2 - 1;
                            this.f22153h[i2] = eVar;
                            i2 = i4;
                            i = i3;
                        }
                    }
                }
                max = Math.max(max, i);
                if (max >= this.f22152g) {
                    return;
                }
            }
            Arrays.fill(this.f22153h, max, this.f22152g, null);
            this.f22152g = max;
        }
    }

    /* renamed from: c */
    public int mo24561c() {
        return this.f22147b;
    }

    /* renamed from: d */
    public synchronized int mo24576d() {
        return this.f22151f * this.f22147b;
    }

    /* renamed from: e */
    public synchronized void mo24577e() {
        if (this.f22146a) {
            mo24575a(0);
        }
    }

    public C9509o(boolean z, int i, int i2) {
        C9537e.m29299a(i > 0);
        C9537e.m29299a(i2 >= 0);
        this.f22146a = z;
        this.f22147b = i;
        this.f22152g = i2;
        this.f22153h = new C9489e[(i2 + 100)];
        if (i2 > 0) {
            this.f22148c = new byte[(i2 * i)];
            for (int i3 = 0; i3 < i2; i3++) {
                this.f22153h[i3] = new C9489e(this.f22148c, i3 * i);
            }
        } else {
            this.f22148c = null;
        }
        this.f22149d = new C9489e[1];
    }

    /* renamed from: a */
    public synchronized C9489e mo24557a() {
        C9489e eVar;
        this.f22151f++;
        if (this.f22152g > 0) {
            C9489e[] eVarArr = this.f22153h;
            int i = this.f22152g - 1;
            this.f22152g = i;
            eVar = eVarArr[i];
            this.f22153h[this.f22152g] = null;
        } else {
            eVar = new C9489e(new byte[this.f22147b], 0);
        }
        return eVar;
    }

    /* renamed from: a */
    public synchronized void mo24558a(C9489e eVar) {
        this.f22149d[0] = eVar;
        mo24559a(this.f22149d);
    }

    /* renamed from: a */
    public synchronized void mo24559a(C9489e[] eVarArr) {
        if (this.f22152g + eVarArr.length >= this.f22153h.length) {
            this.f22153h = (C9489e[]) Arrays.copyOf(this.f22153h, Math.max(this.f22153h.length * 2, this.f22152g + eVarArr.length));
        }
        for (C9489e eVar : eVarArr) {
            C9489e[] eVarArr2 = this.f22153h;
            int i = this.f22152g;
            this.f22152g = i + 1;
            eVarArr2[i] = eVar;
        }
        this.f22151f -= eVarArr.length;
        notifyAll();
    }
}
