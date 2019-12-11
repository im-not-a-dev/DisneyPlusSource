package p163g.p174d.p178b.p179a0;

import java.io.RandomAccessFile;

/* renamed from: g.d.b.a0.c */
/* compiled from: BifEntry.kt */
public final class C4825c implements Comparable<C4825c> {

    /* renamed from: U */
    private final int f11978U;

    /* renamed from: V */
    private final C4833h f11979V;

    /* renamed from: W */
    private int f11980W;

    /* renamed from: X */
    private int f11981X;

    /* renamed from: c */
    private final int f11982c;

    public C4825c(int i, int i2, C4833h hVar, int i3, int i4) {
        this.f11982c = i;
        this.f11978U = i2;
        this.f11979V = hVar;
        this.f11980W = i3;
        this.f11981X = i4;
    }

    /* renamed from: a */
    public final C4833h mo16219a() {
        return this.f11979V;
    }

    /* renamed from: b */
    public final int mo16221b() {
        return this.f11978U;
    }

    /* renamed from: c */
    public final void mo16223c(int i) {
        this.f11981X = i;
    }

    /* renamed from: d */
    public final int mo16226d() {
        return this.f11982c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11982c);
        sb.append(" -> ");
        sb.append(this.f11978U);
        return sb.toString();
    }

    public /* synthetic */ C4825c(int i, int i2, C4833h hVar, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        int i6 = (i5 & 2) != 0 ? 0 : i2;
        if ((i5 & 4) != 0) {
            hVar = null;
        }
        this(i, i6, hVar, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }

    /* renamed from: a */
    public int compareTo(C4825c cVar) {
        return this.f11982c - cVar.f11982c;
    }

    /* renamed from: b */
    public final void mo16222b(int i) {
        this.f11980W = i;
    }

    /* renamed from: c */
    public final byte[] mo16224c() {
        byte[] bArr = new byte[this.f11981X];
        C4833h hVar = this.f11979V;
        if (hVar != null) {
            RandomAccessFile b = hVar.mo16246b();
            if (b != null) {
                b.seek((long) this.f11978U);
            }
        }
        C4833h hVar2 = this.f11979V;
        if (hVar2 != null) {
            RandomAccessFile b2 = hVar2.mo16246b();
            if (b2 != null) {
                b2.read(bArr);
            }
        }
        return bArr;
    }

    /* renamed from: a */
    public final boolean mo16220a(int i) {
        int i2 = this.f11982c;
        return i2 <= i && i < i2 + this.f11980W;
    }
}
