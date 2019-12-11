package com.google.android.exoplayer2.p366s0.p374y;

import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.p374y.C9029h0.C9033d;
import com.google.android.exoplayer2.p393v0.C9545h0;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;

/* renamed from: com.google.android.exoplayer2.s0.y.b0 */
/* compiled from: SectionReader */
public final class C9014b0 implements C9029h0 {

    /* renamed from: a */
    private final C9012a0 f19792a;

    /* renamed from: b */
    private final C9572w f19793b = new C9572w(32);

    /* renamed from: c */
    private int f19794c;

    /* renamed from: d */
    private int f19795d;

    /* renamed from: e */
    private boolean f19796e;

    /* renamed from: f */
    private boolean f19797f;

    public C9014b0(C9012a0 a0Var) {
        this.f19792a = a0Var;
    }

    /* renamed from: a */
    public void mo23426a(C9545h0 h0Var, C8914i iVar, C9033d dVar) {
        this.f19792a.mo23423a(h0Var, iVar, dVar);
        this.f19797f = true;
    }

    /* renamed from: a */
    public void mo23425a() {
        this.f19797f = true;
    }

    /* renamed from: a */
    public void mo23427a(C9572w wVar, int i) {
        boolean z = (i & 1) != 0;
        int v = z ? wVar.mo24711v() + wVar.mo24688c() : -1;
        if (this.f19797f) {
            if (z) {
                this.f19797f = false;
                wVar.mo24693e(v);
                this.f19795d = 0;
            } else {
                return;
            }
        }
        while (wVar.mo24679a() > 0) {
            int i2 = this.f19795d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int v2 = wVar.mo24711v();
                    wVar.mo24693e(wVar.mo24688c() - 1);
                    if (v2 == 255) {
                        this.f19797f = true;
                        return;
                    }
                }
                int min = Math.min(wVar.mo24679a(), 3 - this.f19795d);
                wVar.mo24685a(this.f19793b.f22333a, this.f19795d, min);
                this.f19795d += min;
                if (this.f19795d == 3) {
                    this.f19793b.mo24689c(3);
                    this.f19793b.mo24695f(1);
                    int v3 = this.f19793b.mo24711v();
                    int v4 = this.f19793b.mo24711v();
                    this.f19796e = (v3 & 128) != 0;
                    this.f19794c = (((v3 & 15) << 8) | v4) + 3;
                    int b = this.f19793b.mo24686b();
                    int i3 = this.f19794c;
                    if (b < i3) {
                        C9572w wVar2 = this.f19793b;
                        byte[] bArr = wVar2.f22333a;
                        wVar2.mo24689c(Math.min(4098, Math.max(i3, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f19793b.f22333a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(wVar.mo24679a(), this.f19794c - this.f19795d);
                wVar.mo24685a(this.f19793b.f22333a, this.f19795d, min2);
                this.f19795d += min2;
                int i4 = this.f19795d;
                int i5 = this.f19794c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.f19796e) {
                        this.f19793b.mo24689c(i5);
                    } else if (Util.m29385a(this.f19793b.f22333a, 0, i5, -1) != 0) {
                        this.f19797f = true;
                        return;
                    } else {
                        this.f19793b.mo24689c(this.f19794c - 4);
                    }
                    this.f19792a.mo23424a(this.f19793b);
                    this.f19795d = 0;
                }
            }
        }
    }
}
