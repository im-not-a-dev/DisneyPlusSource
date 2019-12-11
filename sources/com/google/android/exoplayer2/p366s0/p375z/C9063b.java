package com.google.android.exoplayer2.p366s0.p375z;

import com.google.android.exoplayer2.C8723g0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.p366s0.C8912g;
import com.google.android.exoplayer2.p366s0.C8913h;
import com.google.android.exoplayer2.p366s0.C8914i;
import com.google.android.exoplayer2.p366s0.C8919n;
import com.google.android.exoplayer2.p366s0.C8924q;
import com.google.android.exoplayer2.p393v0.C9537e;
import java.io.IOException;
import net.danlew.android.joda.DateUtils;

/* renamed from: com.google.android.exoplayer2.s0.z.b */
/* compiled from: WavExtractor */
public final class C9063b implements C8912g {

    /* renamed from: a */
    private C8914i f20132a;

    /* renamed from: b */
    private C8924q f20133b;

    /* renamed from: c */
    private C9064c f20134c;

    /* renamed from: d */
    private int f20135d;

    /* renamed from: e */
    private int f20136e;

    static {
        C9062a aVar = C9062a.f20131a;
    }

    /* renamed from: b */
    static /* synthetic */ C8912g[] m26896b() {
        return new C8912g[]{new C9063b()};
    }

    /* renamed from: a */
    public void mo23307a() {
    }

    /* renamed from: a */
    public boolean mo23310a(C8913h hVar) throws IOException, InterruptedException {
        return C9065d.m26915a(hVar) != null;
    }

    /* renamed from: a */
    public void mo23309a(C8914i iVar) {
        this.f20132a = iVar;
        this.f20133b = iVar.mo23311a(0, 1);
        this.f20134c = null;
        iVar.mo23312a();
    }

    /* renamed from: a */
    public void mo23308a(long j, long j2) {
        this.f20136e = 0;
    }

    /* renamed from: a */
    public int mo23306a(C8913h hVar, C8919n nVar) throws IOException, InterruptedException {
        C8913h hVar2 = hVar;
        if (this.f20134c == null) {
            this.f20134c = C9065d.m26915a(hVar);
            C9064c cVar = this.f20134c;
            if (cVar != null) {
                this.f20133b.mo23304a(Format.m24874a((String) null, "audio/raw", (String) null, cVar.mo23476a(), (int) DateUtils.FORMAT_ABBREV_WEEKDAY, this.f20134c.mo23483h(), this.f20134c.mo23484i(), this.f20134c.mo23482g(), null, (DrmInitData) null, 0, (String) null));
                this.f20135d = this.f20134c.mo23480e();
            } else {
                throw new C8723g0("Unsupported or unrecognized wav header.");
            }
        }
        if (!this.f20134c.mo23485j()) {
            C9065d.m26916a(hVar2, this.f20134c);
            this.f20132a.mo23313a(this.f20134c);
        } else if (hVar.getPosition() == 0) {
            hVar2.mo23298c(this.f20134c.mo23481f());
        }
        long b = this.f20134c.mo23479b();
        C9537e.m29301b(b != -1);
        long position = b - hVar.getPosition();
        int i = -1;
        if (position <= 0) {
            return -1;
        }
        int a = this.f20133b.mo23302a(hVar2, (int) Math.min((long) (DateUtils.FORMAT_ABBREV_WEEKDAY - this.f20136e), position), true);
        if (a != -1) {
            this.f20136e += a;
        }
        int i2 = this.f20136e / this.f20135d;
        if (i2 > 0) {
            long a2 = this.f20134c.mo23477a(hVar.getPosition() - ((long) this.f20136e));
            int i3 = i2 * this.f20135d;
            this.f20136e -= i3;
            this.f20133b.mo23303a(a2, 1, i3, this.f20136e, null);
        }
        if (a != -1) {
            i = 0;
        }
        return i;
    }
}
