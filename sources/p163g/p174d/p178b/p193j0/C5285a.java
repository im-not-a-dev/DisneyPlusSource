package p163g.p174d.p178b.p193j0;

import kotlin.jvm.internal.C12880j;
import p163g.p174d.p178b.C5326w;

/* renamed from: g.d.b.j0.a */
/* compiled from: AudioTrack.kt */
public final class C5285a extends C5290d {

    /* renamed from: e */
    private final String f12652e;

    /* renamed from: f */
    private final boolean f12653f;

    public C5285a(Object obj, String str, C5326w wVar, String str2, String str3, String str4, boolean z) {
        super(obj, str, str2, wVar);
        this.f12652e = str4;
        this.f12653f = z;
    }

    /* renamed from: e */
    public boolean mo16858e() {
        C5326w wVar = (C5326w) mo16871d().get();
        if (wVar == null) {
            return false;
        }
        C12880j.m40222a((Object) wVar, "it");
        if (!wVar.mo7622f().equals(this.f12652e) || !Boolean.valueOf(wVar.mo7642w()).equals(Boolean.valueOf(this.f12653f))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo16859f() {
        C5326w wVar = (C5326w) mo16871d().get();
        if (wVar != null) {
            wVar.mo7606a(this.f12652e);
        }
        C5326w wVar2 = (C5326w) mo16871d().get();
        if (wVar2 != null) {
            wVar2.mo7616c(this.f12653f);
        }
    }

    /* renamed from: g */
    public final String mo16860g() {
        return this.f12652e;
    }

    /* renamed from: h */
    public final boolean mo16861h() {
        return this.f12653f;
    }
}
