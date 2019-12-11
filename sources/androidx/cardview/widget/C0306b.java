package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* renamed from: androidx.cardview.widget.b */
/* compiled from: CardViewApi21Impl */
class C0306b implements C0310e {
    C0306b() {
    }

    /* renamed from: j */
    private C0311f m1649j(C0309d dVar) {
        return (C0311f) dVar.mo2054c();
    }

    /* renamed from: a */
    public void mo2056a() {
    }

    /* renamed from: a */
    public void mo2060a(C0309d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        dVar.mo2051a(new C0311f(colorStateList, f));
        View d = dVar.mo2055d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        mo2065c(dVar, f3);
    }

    /* renamed from: b */
    public float mo2062b(C0309d dVar) {
        return m1649j(dVar).mo2078c();
    }

    /* renamed from: c */
    public void mo2065c(C0309d dVar, float f) {
        m1649j(dVar).mo2075a(f, dVar.mo2053b(), dVar.mo2052a());
        mo2071i(dVar);
    }

    /* renamed from: d */
    public float mo2066d(C0309d dVar) {
        return m1649j(dVar).mo2077b();
    }

    /* renamed from: e */
    public ColorStateList mo2067e(C0309d dVar) {
        return m1649j(dVar).mo2073a();
    }

    /* renamed from: f */
    public float mo2068f(C0309d dVar) {
        return mo2062b(dVar) * 2.0f;
    }

    /* renamed from: g */
    public float mo2069g(C0309d dVar) {
        return mo2062b(dVar) * 2.0f;
    }

    /* renamed from: h */
    public void mo2070h(C0309d dVar) {
        mo2065c(dVar, mo2066d(dVar));
    }

    /* renamed from: i */
    public void mo2071i(C0309d dVar) {
        if (!dVar.mo2053b()) {
            dVar.mo2050a(0, 0, 0, 0);
            return;
        }
        float d = mo2066d(dVar);
        float b = mo2062b(dVar);
        int ceil = (int) Math.ceil((double) C0312g.m1713a(d, b, dVar.mo2052a()));
        int ceil2 = (int) Math.ceil((double) C0312g.m1716b(d, b, dVar.mo2052a()));
        dVar.mo2050a(ceil, ceil2, ceil, ceil2);
    }

    /* renamed from: b */
    public void mo2063b(C0309d dVar, float f) {
        dVar.mo2055d().setElevation(f);
    }

    /* renamed from: c */
    public void mo2064c(C0309d dVar) {
        mo2065c(dVar, mo2066d(dVar));
    }

    /* renamed from: a */
    public void mo2059a(C0309d dVar, float f) {
        m1649j(dVar).mo2074a(f);
    }

    /* renamed from: a */
    public float mo2058a(C0309d dVar) {
        return dVar.mo2055d().getElevation();
    }

    /* renamed from: a */
    public void mo2061a(C0309d dVar, ColorStateList colorStateList) {
        m1649j(dVar).mo2076a(colorStateList);
    }
}
