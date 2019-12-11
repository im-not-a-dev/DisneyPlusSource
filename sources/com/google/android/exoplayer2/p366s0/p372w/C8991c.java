package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8920o;
import com.google.android.exoplayer2.p366s0.C8920o.C8921a;
import com.google.android.exoplayer2.p366s0.C8923p;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9560n;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.w.c */
/* compiled from: FlacReader */
final class C8991c extends C8998i {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C9560n f19719n;

    /* renamed from: o */
    private C8992a f19720o;

    /* renamed from: com.google.android.exoplayer2.s0.w.c$a */
    /* compiled from: FlacReader */
    private class C8992a implements C8996g, C8920o {

        /* renamed from: a */
        private long[] f19721a;

        /* renamed from: b */
        private long[] f19722b;

        /* renamed from: c */
        private long f19723c = -1;

        /* renamed from: d */
        private long f19724d = -1;

        public C8992a() {
        }

        /* renamed from: a */
        public C8920o mo23396a() {
            return this;
        }

        /* renamed from: a */
        public void mo23403a(C9572w wVar) {
            wVar.mo24695f(1);
            int y = wVar.mo24714y() / 18;
            this.f19721a = new long[y];
            this.f19722b = new long[y];
            for (int i = 0; i < y; i++) {
                this.f19721a[i] = wVar.mo24707r();
                this.f19722b[i] = wVar.mo24707r();
                wVar.mo24695f(2);
            }
        }

        /* renamed from: b */
        public C8921a mo23277b(long j) {
            int b = C9554k0.m29429b(this.f19721a, C8991c.this.mo23416b(j), true, true);
            long a = C8991c.this.mo23413a(this.f19721a[b]);
            C8923p pVar = new C8923p(a, this.f19723c + this.f19722b[b]);
            if (a < j) {
                long[] jArr = this.f19721a;
                if (b != jArr.length - 1) {
                    int i = b + 1;
                    return new C8921a(pVar, new C8923p(C8991c.this.mo23413a(jArr[i]), this.f19723c + this.f19722b[i]));
                }
            }
            return new C8921a(pVar);
        }

        /* renamed from: c */
        public void mo23398c(long j) {
            this.f19724d = this.f19721a[C9554k0.m29429b(this.f19721a, j, true, true)];
        }

        /* renamed from: c */
        public boolean mo23279c() {
            return true;
        }

        /* renamed from: d */
        public void mo23404d(long j) {
            this.f19723c = j;
        }

        /* renamed from: d */
        public long mo23280d() {
            return C8991c.this.f19719n.mo24654b();
        }

        /* renamed from: a */
        public long mo23395a(C8913h hVar) throws IOException, InterruptedException {
            long j = this.f19724d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f19724d = -1;
            return j2;
        }
    }

    C8991c() {
    }

    /* renamed from: b */
    private int m26534b(C9572w wVar) {
        int i;
        int i2;
        int i3 = (wVar.f22333a[2] & 255) >> 4;
        switch (i3) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                i = 576;
                i2 = i3 - 2;
                break;
            case 6:
            case 7:
                wVar.mo24695f(4);
                wVar.mo24677C();
                int v = i3 == 6 ? wVar.mo24711v() : wVar.mo24676B();
                wVar.mo24693e(0);
                return v + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = 256;
                i2 = i3 - 8;
                break;
            default:
                return -1;
        }
        return i << i2;
    }

    /* renamed from: c */
    public static boolean m26535c(C9572w wVar) {
        return wVar.mo24679a() >= 5 && wVar.mo24711v() == 127 && wVar.mo24713x() == 1179402563;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23401a(boolean z) {
        super.mo23401a(z);
        if (z) {
            this.f19719n = null;
            this.f19720o = null;
        }
    }

    /* renamed from: a */
    private static boolean m26533a(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo23400a(C9572w wVar) {
        if (!m26533a(wVar.f22333a)) {
            return -1;
        }
        return (long) m26534b(wVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23402a(C9572w wVar, long j, C9000b bVar) throws IOException, InterruptedException {
        byte[] bArr = wVar.f22333a;
        if (this.f19719n == null) {
            this.f19719n = new C9560n(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, wVar.mo24690d());
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            int a = this.f19719n.mo24653a();
            C9560n nVar = this.f19719n;
            bVar.f19759a = Format.m24875a((String) null, "audio/flac", (String) null, -1, a, nVar.f22298b, nVar.f22297a, singletonList, (DrmInitData) null, 0, (String) null);
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.f19720o = new C8992a();
            this.f19720o.mo23403a(wVar);
        } else if (m26533a(bArr)) {
            C8992a aVar = this.f19720o;
            if (aVar != null) {
                aVar.mo23404d(j);
                bVar.f19760b = this.f19720o;
            }
            return false;
        }
        return true;
    }
}
