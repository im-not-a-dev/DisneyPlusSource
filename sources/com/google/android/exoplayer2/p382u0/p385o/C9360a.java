package com.google.android.exoplayer2.p382u0.p385o;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.exoplayer2.p382u0.C9322b;
import com.google.android.exoplayer2.p382u0.C9323c;
import com.google.android.exoplayer2.p382u0.C9325e;
import com.google.android.exoplayer2.p382u0.C9327g;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9572w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* renamed from: com.google.android.exoplayer2.u0.o.a */
/* compiled from: PgsDecoder */
public final class C9360a extends C9323c {

    /* renamed from: n */
    private final C9572w f21522n = new C9572w();

    /* renamed from: o */
    private final C9572w f21523o = new C9572w();

    /* renamed from: p */
    private final C9361a f21524p = new C9361a();

    /* renamed from: q */
    private Inflater f21525q;

    /* renamed from: com.google.android.exoplayer2.u0.o.a$a */
    /* compiled from: PgsDecoder */
    private static final class C9361a {

        /* renamed from: a */
        private final C9572w f21526a = new C9572w();

        /* renamed from: b */
        private final int[] f21527b = new int[256];

        /* renamed from: c */
        private boolean f21528c;

        /* renamed from: d */
        private int f21529d;

        /* renamed from: e */
        private int f21530e;

        /* renamed from: f */
        private int f21531f;

        /* renamed from: g */
        private int f21532g;

        /* renamed from: h */
        private int f21533h;

        /* renamed from: i */
        private int f21534i;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m28529a(C9572w wVar, int i) {
            if (i >= 4) {
                wVar.mo24695f(3);
                int i2 = i - 4;
                if ((wVar.mo24711v() & 128) != 0) {
                    if (i2 >= 7) {
                        int y = wVar.mo24714y();
                        if (y >= 4) {
                            this.f21533h = wVar.mo24676B();
                            this.f21534i = wVar.mo24676B();
                            this.f21526a.mo24689c(y - 4);
                            i2 -= 7;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int c = this.f21526a.mo24688c();
                int d = this.f21526a.mo24690d();
                if (c < d && i2 > 0) {
                    int min = Math.min(i2, d - c);
                    wVar.mo24685a(this.f21526a.f22333a, c, min);
                    this.f21526a.mo24693e(c + min);
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m28531b(C9572w wVar, int i) {
            if (i >= 19) {
                this.f21529d = wVar.mo24676B();
                this.f21530e = wVar.mo24676B();
                wVar.mo24695f(11);
                this.f21531f = wVar.mo24676B();
                this.f21532g = wVar.mo24676B();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public void m28533c(C9572w wVar, int i) {
            if (i % 5 == 2) {
                wVar.mo24695f(2);
                Arrays.fill(this.f21527b, 0);
                int i2 = i / 5;
                int i3 = 0;
                while (i3 < i2) {
                    int v = wVar.mo24711v();
                    int v2 = wVar.mo24711v();
                    int v3 = wVar.mo24711v();
                    int v4 = wVar.mo24711v();
                    int v5 = wVar.mo24711v();
                    double d = (double) v2;
                    double d2 = (double) (v3 - 128);
                    int i4 = (int) ((1.402d * d2) + d);
                    int i5 = i3;
                    double d3 = (double) (v4 - 128);
                    int i6 = (int) ((d - (0.34414d * d3)) - (d2 * 0.71414d));
                    int i7 = (int) (d + (d3 * 1.772d));
                    this.f21527b[v] = Util.m29382a(i7, 0, 255) | (Util.m29382a(i6, 0, 255) << 8) | (v5 << 24) | (Util.m29382a(i4, 0, 255) << 16);
                    i3 = i5 + 1;
                }
                this.f21528c = true;
            }
        }

        /* renamed from: b */
        public void mo24190b() {
            this.f21529d = 0;
            this.f21530e = 0;
            this.f21531f = 0;
            this.f21532g = 0;
            this.f21533h = 0;
            this.f21534i = 0;
            this.f21526a.mo24689c(0);
            this.f21528c = false;
        }

        /* renamed from: a */
        public C9322b mo24189a() {
            int i;
            int i2;
            int i3;
            if (this.f21529d == 0 || this.f21530e == 0 || this.f21533h == 0 || this.f21534i == 0 || this.f21526a.mo24690d() == 0 || this.f21526a.mo24688c() != this.f21526a.mo24690d() || !this.f21528c) {
                return null;
            }
            this.f21526a.mo24693e(0);
            int[] iArr = new int[(this.f21533h * this.f21534i)];
            int i4 = 0;
            while (i4 < iArr.length) {
                int v = this.f21526a.mo24711v();
                if (v != 0) {
                    i3 = i4 + 1;
                    iArr[i4] = this.f21527b[v];
                } else {
                    int v2 = this.f21526a.mo24711v();
                    if (v2 != 0) {
                        if ((v2 & 64) == 0) {
                            i = v2 & 63;
                        } else {
                            i = ((v2 & 63) << 8) | this.f21526a.mo24711v();
                        }
                        if ((v2 & 128) == 0) {
                            i2 = 0;
                        } else {
                            i2 = this.f21527b[this.f21526a.mo24711v()];
                        }
                        i3 = i + i4;
                        Arrays.fill(iArr, i4, i3, i2);
                    }
                }
                i4 = i3;
            }
            Bitmap createBitmap = Bitmap.createBitmap(iArr, this.f21533h, this.f21534i, Config.ARGB_8888);
            float f = (float) this.f21531f;
            int i5 = this.f21529d;
            float f2 = f / ((float) i5);
            float f3 = (float) this.f21532g;
            int i6 = this.f21530e;
            C9322b bVar = new C9322b(createBitmap, f2, 0, f3 / ((float) i6), 0, ((float) this.f21533h) / ((float) i5), ((float) this.f21534i) / ((float) i6));
            return bVar;
        }
    }

    public C9360a() {
        super("PgsDecoder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C9325e mo24140a(byte[] bArr, int i, boolean z) throws C9327g {
        this.f21522n.mo24684a(bArr, i);
        m28526a(this.f21522n);
        this.f21524p.mo24190b();
        ArrayList arrayList = new ArrayList();
        while (this.f21522n.mo24679a() >= 3) {
            C9322b a = m28525a(this.f21522n, this.f21524p);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return new C9362b(Collections.unmodifiableList(arrayList));
    }

    /* renamed from: a */
    private void m28526a(C9572w wVar) {
        if (wVar.mo24679a() > 0 && wVar.mo24694f() == 120) {
            if (this.f21525q == null) {
                this.f21525q = new Inflater();
            }
            if (Util.m29413a(wVar, this.f21523o, this.f21525q)) {
                C9572w wVar2 = this.f21523o;
                wVar.mo24684a(wVar2.f22333a, wVar2.mo24690d());
            }
        }
    }

    /* renamed from: a */
    private static C9322b m28525a(C9572w wVar, C9361a aVar) {
        int d = wVar.mo24690d();
        int v = wVar.mo24711v();
        int B = wVar.mo24676B();
        int c = wVar.mo24688c() + B;
        C9322b bVar = null;
        if (c > d) {
            wVar.mo24693e(d);
            return null;
        }
        if (v != 128) {
            switch (v) {
                case 20:
                    aVar.m28533c(wVar, B);
                    break;
                case 21:
                    aVar.m28529a(wVar, B);
                    break;
                case 22:
                    aVar.m28531b(wVar, B);
                    break;
            }
        } else {
            bVar = aVar.mo24189a();
            aVar.mo24190b();
        }
        wVar.mo24693e(c);
        return bVar;
    }
}
