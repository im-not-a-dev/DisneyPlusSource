package com.google.android.exoplayer2.p366s0.p372w;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.util.C9572w;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.w.f */
/* compiled from: OggPageHeader */
final class C8995f {

    /* renamed from: i */
    private static final int f19734i = Util.m29428b("OggS");

    /* renamed from: a */
    public int f19735a;

    /* renamed from: b */
    public int f19736b;

    /* renamed from: c */
    public long f19737c;

    /* renamed from: d */
    public int f19738d;

    /* renamed from: e */
    public int f19739e;

    /* renamed from: f */
    public int f19740f;

    /* renamed from: g */
    public final int[] f19741g = new int[255];

    /* renamed from: h */
    private final C9572w f19742h = new C9572w(255);

    C8995f() {
    }

    /* renamed from: a */
    public void mo23410a() {
        this.f19735a = 0;
        this.f19736b = 0;
        this.f19737c = 0;
        this.f19738d = 0;
        this.f19739e = 0;
        this.f19740f = 0;
    }

    /* renamed from: a */
    public boolean mo23411a(C8913h hVar, boolean z) throws IOException, InterruptedException {
        this.f19742h.mo24678D();
        mo23410a();
        if (!(hVar.mo23287a() == -1 || hVar.mo23287a() - hVar.mo23293b() >= 27) || !hVar.mo23296b(this.f19742h.f22333a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f19742h.mo24713x() == ((long) f19734i)) {
            this.f19735a = this.f19742h.mo24711v();
            if (this.f19735a == 0) {
                this.f19736b = this.f19742h.mo24711v();
                this.f19737c = this.f19742h.mo24702m();
                this.f19742h.mo24704o();
                this.f19742h.mo24704o();
                this.f19742h.mo24704o();
                this.f19738d = this.f19742h.mo24711v();
                this.f19739e = this.f19738d + 27;
                this.f19742h.mo24678D();
                hVar.mo23294b(this.f19742h.f22333a, 0, this.f19738d);
                for (int i = 0; i < this.f19738d; i++) {
                    this.f19741g[i] = this.f19742h.mo24711v();
                    this.f19740f += this.f19741g[i];
                }
                return true;
            } else if (z) {
                return false;
            } else {
                throw new C8723g0("unsupported bit stream revision");
            }
        } else if (z) {
            return false;
        } else {
            throw new C8723g0("expected OggS capture pattern at begin of page");
        }
    }
}
