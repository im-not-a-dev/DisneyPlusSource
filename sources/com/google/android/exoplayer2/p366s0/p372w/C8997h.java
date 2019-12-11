package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p393v0.C9554k0;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* renamed from: com.google.android.exoplayer2.s0.w.h */
/* compiled from: OpusReader */
final class C8997h extends C8998i {

    /* renamed from: o */
    private static final int f19743o = C9554k0.m29428b("Opus");

    /* renamed from: p */
    private static final byte[] f19744p = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f19745n;

    C8997h() {
    }

    /* renamed from: b */
    public static boolean m26568b(C9572w wVar) {
        int a = wVar.mo24679a();
        byte[] bArr = f19744p;
        if (a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        wVar.mo24685a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, f19744p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo23401a(boolean z) {
        super.mo23401a(z);
        if (z) {
            this.f19745n = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo23400a(C9572w wVar) {
        return mo23416b(m26566a(wVar.f22333a));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo23402a(C9572w wVar, long j, C9000b bVar) {
        boolean z = true;
        if (!this.f19745n) {
            byte[] copyOf = Arrays.copyOf(wVar.f22333a, wVar.mo24690d());
            byte b = copyOf[9] & 255;
            byte b2 = ((copyOf[11] & 255) << 8) | (copyOf[10] & 255);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(copyOf);
            m26567a(arrayList, b2);
            m26567a(arrayList, 3840);
            bVar.f19759a = Format.m24875a((String) null, "audio/opus", (String) null, -1, -1, (int) b, 48000, (List<byte[]>) arrayList, (DrmInitData) null, 0, (String) null);
            this.f19745n = true;
            return true;
        }
        if (wVar.mo24698i() != f19743o) {
            z = false;
        }
        wVar.mo24693e(0);
        return z;
    }

    /* renamed from: a */
    private void m26567a(List<byte[]> list, int i) {
        list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) i) * 1000000000) / 48000).array());
    }

    /* renamed from: a */
    private long m26566a(byte[] bArr) {
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i = b >> 3;
        int i2 = i & 3;
        int i3 = i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? DateTimeConstants.MILLIS_PER_MINUTE : 10000 << i2;
        return ((long) b3) * ((long) i3);
    }
}
