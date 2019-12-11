package com.bamtechmedia.dominguez.playback.p237m.p242m;

import android.os.Build;
import com.bamtech.sdk4.media.drm.DrmType;
import com.bamtechmedia.dominguez.core.utils.C5860p0;
import com.bamtechmedia.dominguez.core.utils.C5862q0;
import com.bamtechmedia.dominguez.playback.C6266a;
import com.bamtechmedia.dominguez.playback.p236l.C6335c;
import java.util.List;
import kotlin.jvm.internal.C12880j;

/* renamed from: com.bamtechmedia.dominguez.playback.m.m.b */
/* compiled from: PlaybackScenarioProvider.kt */
public final class C6423b implements C6335c {

    /* renamed from: a */
    private final C5862q0 f14570a;

    /* renamed from: b */
    private final C6266a f14571b;

    public C6423b(C5862q0 q0Var, C6266a aVar) {
        this.f14570a = q0Var;
        this.f14571b = aVar;
    }

    /* renamed from: e */
    private final boolean m20079e() {
        C5860p0 a = this.f14570a.mo17767a();
        if (a != null) {
            String a2 = a.mo17761a();
            if (a2 != null) {
                List m = this.f14571b.mo18862m();
                if (m != null) {
                    return m.contains(a2);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private final boolean m20080f() {
        return this.f14570a.mo17768b();
    }

    /* renamed from: a */
    public boolean mo18949a() {
        return C12880j.m40224a((Object) this.f14571b.mo18866q(), (Object) mo19076d());
    }

    /* renamed from: b */
    public Integer mo18950b() {
        return this.f14571b.mo18864o();
    }

    /* renamed from: c */
    public final DrmType mo19075c() {
        DrmType drmType = DrmType.PLAYREADY;
        if (!(!this.f14571b.mo18861l().contains(Build.MODEL))) {
            return drmType;
        }
        return null;
    }

    /* renamed from: d */
    public final String mo19076d() {
        String p = this.f14571b.mo18865p();
        if (p == null) {
            p = this.f14571b.mo18851b();
        }
        if (p != null) {
            return p;
        }
        String q = this.f14571b.mo18866q();
        if (!((m20080f() && m20079e()) || C12880j.m40224a((Object) mo19075c(), (Object) DrmType.PLAYREADY))) {
            return q;
        }
        return null;
    }
}
