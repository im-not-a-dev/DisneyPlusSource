package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p393v0.Assertions;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.s0.w.e */
/* compiled from: OggPacket */
final class C8994e {

    /* renamed from: a */
    private final C8995f f19729a = new C8995f();

    /* renamed from: b */
    private final C9572w f19730b = new C9572w(new byte[65025], 0);

    /* renamed from: c */
    private int f19731c = -1;

    /* renamed from: d */
    private int f19732d;

    /* renamed from: e */
    private boolean f19733e;

    C8994e() {
    }

    /* renamed from: a */
    public boolean mo23406a(C8913h hVar) throws IOException, InterruptedException {
        int i;
        Assertions.checkState(hVar != null);
        if (this.f19733e) {
            this.f19733e = false;
            this.f19730b.mo24678D();
        }
        while (!this.f19733e) {
            if (this.f19731c < 0) {
                if (!this.f19729a.mo23411a(hVar, true)) {
                    return false;
                }
                C8995f fVar = this.f19729a;
                int i2 = fVar.f19739e;
                if ((fVar.f19736b & 1) == 1 && this.f19730b.mo24690d() == 0) {
                    i2 += m26555a(0);
                    i = this.f19732d + 0;
                } else {
                    i = 0;
                }
                hVar.mo23298c(i2);
                this.f19731c = i;
            }
            int a = m26555a(this.f19731c);
            int i3 = this.f19731c + this.f19732d;
            if (a > 0) {
                if (this.f19730b.mo24686b() < this.f19730b.mo24690d() + a) {
                    C9572w wVar = this.f19730b;
                    wVar.f22333a = Arrays.copyOf(wVar.f22333a, wVar.mo24690d() + a);
                }
                C9572w wVar2 = this.f19730b;
                hVar.mo23289a(wVar2.f22333a, wVar2.mo24690d(), a);
                C9572w wVar3 = this.f19730b;
                wVar3.mo24691d(wVar3.mo24690d() + a);
                this.f19733e = this.f19729a.f19741g[i3 + -1] != 255;
            }
            if (i3 == this.f19729a.f19738d) {
                i3 = -1;
            }
            this.f19731c = i3;
        }
        return true;
    }

    /* renamed from: b */
    public C9572w mo23407b() {
        return this.f19730b;
    }

    /* renamed from: c */
    public void mo23408c() {
        this.f19729a.mo23410a();
        this.f19730b.mo24678D();
        this.f19731c = -1;
        this.f19733e = false;
    }

    /* renamed from: d */
    public void mo23409d() {
        C9572w wVar = this.f19730b;
        byte[] bArr = wVar.f22333a;
        if (bArr.length != 65025) {
            wVar.f22333a = Arrays.copyOf(bArr, Math.max(65025, wVar.mo24690d()));
        }
    }

    /* renamed from: a */
    public C8995f mo23405a() {
        return this.f19729a;
    }

    /* renamed from: a */
    private int m26555a(int i) {
        int i2;
        int i3 = 0;
        this.f19732d = 0;
        do {
            int i4 = this.f19732d;
            int i5 = i + i4;
            C8995f fVar = this.f19729a;
            if (i5 >= fVar.f19738d) {
                break;
            }
            int[] iArr = fVar.f19741g;
            this.f19732d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }
}
