package p163g.p201e.p203b.p307o;

import androidx.fragment.app.C0538i;
import androidx.fragment.app.C0564o;
import androidx.fragment.app.Fragment;
import p163g.p201e.p203b.p307o.p308p.C7629c;
import p163g.p201e.p203b.p307o.p310r.C7641a;

/* renamed from: g.e.b.o.j */
/* compiled from: OfflineRouterImpl.kt */
public final class C7620j implements C7629c {
    /* renamed from: a */
    public void mo20550a(int i, C0538i iVar) {
        String str = "NoConnectionFragment";
        if (iVar.mo3146a(str) == null) {
            C0564o a = iVar.mo3147a();
            a.mo3312a(i, new C7641a(), str);
            a.mo3046c();
        }
    }

    public Fragment newInstance() {
        return new C7641a();
    }
}
