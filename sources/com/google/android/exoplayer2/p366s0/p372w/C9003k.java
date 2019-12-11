package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.p372w.C9005l.C9007b;
import com.google.android.exoplayer2.p366s0.p372w.C9005l.C9008c;
import com.google.android.exoplayer2.p366s0.p372w.C9005l.C9009d;
import com.google.android.exoplayer2.util.C9572w;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.s0.w.k */
/* compiled from: VorbisReader */
final class C9003k extends C8998i {

    /* renamed from: n */
    private C9004a f19765n;

    /* renamed from: o */
    private int f19766o;

    /* renamed from: p */
    private boolean f19767p;

    /* renamed from: q */
    private C9009d f19768q;

    /* renamed from: r */
    private C9007b f19769r;

    /* renamed from: com.google.android.exoplayer2.s0.w.k$a */
    /* compiled from: VorbisReader */
    static final class C9004a {

        /* renamed from: a */
        public final C9009d f19770a;

        /* renamed from: b */
        public final byte[] f19771b;

        /* renamed from: c */
        public final C9008c[] f19772c;

        /* renamed from: d */
        public final int f19773d;

        public C9004a(C9009d dVar, C9007b bVar, byte[] bArr, C9008c[] cVarArr, int i) {
            this.f19770a = dVar;
            this.f19771b = bArr;
            this.f19772c = cVarArr;
            this.f19773d = i;
        }
    }

    C9003k() {
    }

    /* renamed from: a */
    static int m26591a(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    /* renamed from: c */
    public static boolean m26594c(C9572w wVar) {
        try {
            return C9005l.m26605a(1, wVar, true);
        } catch (C8723g0 unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23401a(boolean z) {
        super.mo23401a(z);
        if (z) {
            this.f19765n = null;
            this.f19768q = null;
            this.f19769r = null;
        }
        this.f19766o = 0;
        this.f19767p = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C9004a mo23422b(C9572w wVar) throws IOException {
        if (this.f19768q == null) {
            this.f19768q = C9005l.m26607b(wVar);
            return null;
        } else if (this.f19769r == null) {
            this.f19769r = C9005l.m26603a(wVar);
            return null;
        } else {
            byte[] bArr = new byte[wVar.mo24690d()];
            System.arraycopy(wVar.f22333a, 0, bArr, 0, wVar.mo24690d());
            C9008c[] a = C9005l.m26606a(wVar, this.f19768q.f19775a);
            C9004a aVar = new C9004a(this.f19768q, this.f19769r, bArr, a, C9005l.m26600a(a.length - 1));
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo23417c(long j) {
        super.mo23417c(j);
        int i = 0;
        this.f19767p = j != 0;
        C9009d dVar = this.f19768q;
        if (dVar != null) {
            i = dVar.f19778d;
        }
        this.f19766o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo23400a(C9572w wVar) {
        byte[] bArr = wVar.f22333a;
        int i = 0;
        if ((bArr[0] & 1) == 1) {
            return -1;
        }
        int a = m26592a(bArr[0], this.f19765n);
        if (this.f19767p) {
            i = (this.f19766o + a) / 4;
        }
        long j = (long) i;
        m26593a(wVar, j);
        this.f19767p = true;
        this.f19766o = a;
        return j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23402a(C9572w wVar, long j, C9000b bVar) throws IOException, InterruptedException {
        if (this.f19765n != null) {
            return false;
        }
        this.f19765n = mo23422b(wVar);
        if (this.f19765n == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f19765n.f19770a.f19780f);
        arrayList.add(this.f19765n.f19771b);
        C9009d dVar = this.f19765n.f19770a;
        bVar.f19759a = Format.m24875a((String) null, "audio/vorbis", (String) null, dVar.f19777c, -1, dVar.f19775a, (int) dVar.f19776b, (List<byte[]>) arrayList, (DrmInitData) null, 0, (String) null);
        return true;
    }

    /* renamed from: a */
    static void m26593a(C9572w wVar, long j) {
        wVar.mo24691d(wVar.mo24690d() + 4);
        wVar.f22333a[wVar.mo24690d() - 4] = (byte) ((int) (j & 255));
        wVar.f22333a[wVar.mo24690d() - 3] = (byte) ((int) ((j >>> 8) & 255));
        wVar.f22333a[wVar.mo24690d() - 2] = (byte) ((int) ((j >>> 16) & 255));
        wVar.f22333a[wVar.mo24690d() - 1] = (byte) ((int) ((j >>> 24) & 255));
    }

    /* renamed from: a */
    private static int m26592a(byte b, C9004a aVar) {
        if (!aVar.f19772c[m26591a(b, aVar.f19773d, 1)].f19774a) {
            return aVar.f19770a.f19778d;
        }
        return aVar.f19770a.f19779e;
    }
}
