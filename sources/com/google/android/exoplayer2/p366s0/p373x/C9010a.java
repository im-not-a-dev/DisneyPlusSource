package com.google.android.exoplayer2.p366s0.p373x;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8920o.C8922b;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.Util;
import com.google.android.exoplayer2.p393v0.C9572w;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.s0.x.a */
/* compiled from: RawCcExtractor */
public final class C9010a implements C8912g {

    /* renamed from: i */
    private static final int f19781i = Util.m29428b("RCC\u0001");

    /* renamed from: a */
    private final Format f19782a;

    /* renamed from: b */
    private final C9572w f19783b = new C9572w(9);

    /* renamed from: c */
    private C8924q f19784c;

    /* renamed from: d */
    private int f19785d = 0;

    /* renamed from: e */
    private int f19786e;

    /* renamed from: f */
    private long f19787f;

    /* renamed from: g */
    private int f19788g;

    /* renamed from: h */
    private int f19789h;

    public C9010a(Format format) {
        this.f19782a = format;
    }

    /* renamed from: b */
    private boolean m26611b(C8913h hVar) throws IOException, InterruptedException {
        this.f19783b.mo24678D();
        if (!hVar.mo23291a(this.f19783b.f22333a, 0, 8, true)) {
            return false;
        }
        if (this.f19783b.mo24698i() == f19781i) {
            this.f19786e = this.f19783b.mo24711v();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    /* renamed from: c */
    private void m26612c(C8913h hVar) throws IOException, InterruptedException {
        while (this.f19788g > 0) {
            this.f19783b.mo24678D();
            hVar.mo23289a(this.f19783b.f22333a, 0, 3);
            this.f19784c.mo23305a(this.f19783b, 3);
            this.f19789h += 3;
            this.f19788g--;
        }
        int i = this.f19789h;
        if (i > 0) {
            this.f19784c.mo23303a(this.f19787f, 1, i, 0, null);
        }
    }

    /* renamed from: d */
    private boolean m26613d(C8913h hVar) throws IOException, InterruptedException {
        this.f19783b.mo24678D();
        int i = this.f19786e;
        if (i == 0) {
            if (!hVar.mo23291a(this.f19783b.f22333a, 0, 5, true)) {
                return false;
            }
            this.f19787f = (this.f19783b.mo24713x() * 1000) / 45;
        } else if (i != 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported version number: ");
            sb.append(this.f19786e);
            throw new C8723g0(sb.toString());
        } else if (!hVar.mo23291a(this.f19783b.f22333a, 0, 9, true)) {
            return false;
        } else {
            this.f19787f = this.f19783b.mo24707r();
        }
        this.f19788g = this.f19783b.mo24711v();
        this.f19789h = 0;
        return true;
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        iVar.mo23313a(new C8922b(-9223372036854775807L));
        this.f19784c = iVar.mo23311a(0, 3);
        iVar.mo23312a();
        this.f19784c.mo23304a(this.f19782a);
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        this.f19783b.mo24678D();
        hVar.mo23294b(this.f19783b.f22333a, 0, 8);
        if (this.f19783b.mo24698i() == f19781i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        while (true) {
            int i = this.f19785d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m26612c(hVar);
                        this.f19785d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (m26613d(hVar)) {
                    this.f19785d = 2;
                } else {
                    this.f19785d = 0;
                    return -1;
                }
            } else if (!m26611b(hVar)) {
                return -1;
            } else {
                this.f19785d = 1;
            }
        }
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f19785d = 0;
    }
}
