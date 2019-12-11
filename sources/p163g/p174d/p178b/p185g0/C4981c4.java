package p163g.p174d.p178b.p185g0;

import android.net.Uri;
import java.util.List;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p184f0.C4956a;
import p163g.p174d.p178b.p184f0.C4957b;
import p163g.p174d.p178b.p196m0.C5305c;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.c4 */
/* compiled from: DateRangeDelegate */
public class C4981c4 implements C5271z3 {

    /* renamed from: U */
    C4957b f12235U = new C4957b();

    /* renamed from: c */
    private final C5300m f12236c;

    public C4981c4(C5300m mVar) {
        this.f12236c = mVar;
        mVar.mo17080z().mo30192f((Consumer<? super T>) new C5002f3<Object>(this));
        mVar.mo16938C0().mo30192f((Consumer<? super T>) new C5060m<Object>(this));
        mVar.mo16973U().mo30192f((Consumer<? super T>) new C5125s0<Object>(this));
        mVar.mo17059o0().mo30192f((Consumer<? super T>) new C4964a3<Object>(this));
    }

    /* renamed from: a */
    public void mo16478a(List<C4956a> list) {
        this.f12235U.mo16425a(list);
    }

    /* renamed from: a */
    public void mo16475a(long j) {
        List a = this.f12235U.mo16423a(j);
        if (!a.isEmpty()) {
            this.f12236c.mo16997a(a);
        }
    }

    /* renamed from: a */
    public void mo16477a(C5305c cVar) {
        if (cVar.mo17083a() < 0) {
            this.f12235U.mo16426b(cVar.mo17084b());
        } else {
            mo16475a(cVar.mo17084b());
        }
    }

    /* renamed from: a */
    public void mo16476a(Uri uri) {
        this.f12235U.mo16424a();
    }
}
