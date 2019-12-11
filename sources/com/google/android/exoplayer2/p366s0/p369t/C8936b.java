package com.google.android.exoplayer2.p366s0.p369t;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;

/* renamed from: com.google.android.exoplayer2.s0.t.b */
/* compiled from: DefaultEbmlReader */
final class C8936b implements C8940d {

    /* renamed from: a */
    private final byte[] f19227a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque<C8938b> f19228b = new ArrayDeque<>();

    /* renamed from: c */
    private final C8947g f19229c = new C8947g();

    /* renamed from: d */
    private C8939c f19230d;

    /* renamed from: e */
    private int f19231e;

    /* renamed from: f */
    private int f19232f;

    /* renamed from: g */
    private long f19233g;

    /* renamed from: com.google.android.exoplayer2.s0.t.b$b */
    /* compiled from: DefaultEbmlReader */
    private static final class C8938b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f19234a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f19235b;

        private C8938b(int i, long j) {
            this.f19234a = i;
            this.f19235b = j;
        }
    }

    /* renamed from: b */
    private long m26238b(C8913h hVar) throws IOException, InterruptedException {
        hVar.mo23297c();
        while (true) {
            hVar.mo23294b(this.f19227a, 0, 4);
            int a = C8947g.m26307a(this.f19227a[0]);
            if (a != -1 && a <= 4) {
                int a2 = (int) C8947g.m26308a(this.f19227a, a, false);
                if (this.f19230d.mo23340c(a2)) {
                    hVar.mo23298c(a);
                    return (long) a2;
                }
            }
            hVar.mo23298c(1);
        }
    }

    /* renamed from: c */
    private String m26240c(C8913h hVar, int i) throws IOException, InterruptedException {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        hVar.mo23289a(bArr, 0, i);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }

    /* renamed from: a */
    public void mo23330a(C8939c cVar) {
        this.f19230d = cVar;
    }

    public void reset() {
        this.f19231e = 0;
        this.f19228b.clear();
        this.f19229c.mo23359b();
    }

    /* renamed from: a */
    public boolean mo23331a(C8913h hVar) throws IOException, InterruptedException {
        Assertions.checkNotNull(this.f19230d);
        while (true) {
            if (this.f19228b.isEmpty() || hVar.getPosition() < ((C8938b) this.f19228b.peek()).f19235b) {
                if (this.f19231e == 0) {
                    long a = this.f19229c.mo23358a(hVar, true, false, 4);
                    if (a == -2) {
                        a = m26238b(hVar);
                    }
                    if (a == -1) {
                        return false;
                    }
                    this.f19232f = (int) a;
                    this.f19231e = 1;
                }
                if (this.f19231e == 1) {
                    this.f19233g = this.f19229c.mo23358a(hVar, false, true, 8);
                    this.f19231e = 2;
                }
                int b = this.f19230d.mo23339b(this.f19232f);
                if (b == 0) {
                    hVar.mo23298c((int) this.f19233g);
                    this.f19231e = 0;
                } else if (b == 1) {
                    long position = hVar.getPosition();
                    this.f19228b.push(new C8938b(this.f19232f, this.f19233g + position));
                    this.f19230d.mo23337a(this.f19232f, position, this.f19233g);
                    this.f19231e = 0;
                    return true;
                } else if (b == 2) {
                    long j = this.f19233g;
                    if (j <= 8) {
                        this.f19230d.mo23336a(this.f19232f, m26239b(hVar, (int) j));
                        this.f19231e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid integer size: ");
                    sb.append(this.f19233g);
                    throw new C8723g0(sb.toString());
                } else if (b == 3) {
                    long j2 = this.f19233g;
                    if (j2 <= 2147483647L) {
                        this.f19230d.mo23338a(this.f19232f, m26240c(hVar, (int) j2));
                        this.f19231e = 0;
                        return true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("String element size: ");
                    sb2.append(this.f19233g);
                    throw new C8723g0(sb2.toString());
                } else if (b == 4) {
                    this.f19230d.mo23335a(this.f19232f, (int) this.f19233g, hVar);
                    this.f19231e = 0;
                    return true;
                } else if (b == 5) {
                    long j3 = this.f19233g;
                    if (j3 == 4 || j3 == 8) {
                        this.f19230d.mo23334a(this.f19232f, m26237a(hVar, (int) this.f19233g));
                        this.f19231e = 0;
                        return true;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Invalid float size: ");
                    sb3.append(this.f19233g);
                    throw new C8723g0(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("Invalid element type ");
                    sb4.append(b);
                    throw new C8723g0(sb4.toString());
                }
            } else {
                this.f19230d.mo23333a(((C8938b) this.f19228b.pop()).f19234a);
                return true;
            }
        }
    }

    /* renamed from: b */
    private long m26239b(C8913h hVar, int i) throws IOException, InterruptedException {
        hVar.mo23289a(this.f19227a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.f19227a[i2] & 255));
        }
        return j;
    }

    /* renamed from: a */
    private double m26237a(C8913h hVar, int i) throws IOException, InterruptedException {
        long b = m26239b(hVar, i);
        if (i == 4) {
            return (double) Float.intBitsToFloat((int) b);
        }
        return Double.longBitsToDouble(b);
    }
}
