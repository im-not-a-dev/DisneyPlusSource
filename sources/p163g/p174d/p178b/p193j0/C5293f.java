package p163g.p174d.p178b.p193j0;

import p163g.p174d.p178b.C5326w;

/* renamed from: g.d.b.j0.f */
/* compiled from: VideoTrack.kt */
public final class C5293f extends C5290d {

    /* renamed from: e */
    private final int f12674e;

    /* renamed from: f */
    private final int f12675f;

    /* renamed from: g */
    private final int f12676g;

    public C5293f(Object obj, String str, C5326w wVar, String str2, int i, int i2, float f, int i3) {
        super(obj, str, str2, wVar);
        this.f12674e = i;
        this.f12675f = i2;
        this.f12676g = i3;
    }

    /* renamed from: e */
    public boolean mo16858e() {
        C5326w wVar = (C5326w) super.mo16871d().get();
        if (wVar == null || !wVar.mo7638s()) {
            return super.mo16858e();
        }
        return mo16870c() == null;
    }

    /* renamed from: f */
    public void mo16859f() {
        C5326w wVar = (C5326w) super.mo16871d().get();
        if (wVar == null) {
            return;
        }
        if (mo16870c() == null) {
            wVar.mo7629j();
        } else {
            wVar.mo7601a(this.f12674e, this.f12675f, this.f12676g);
        }
    }

    /* renamed from: g */
    public final int mo16886g() {
        return this.f12676g;
    }
}
