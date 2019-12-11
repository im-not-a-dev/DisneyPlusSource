package com.bamtechmedia.dominguez.profiles;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bamtechmedia.dominguez.analytics.C2378m;
import com.bamtechmedia.dominguez.analytics.p057o0.C2433b;
import com.bamtechmedia.dominguez.core.p218n.C5792f;
import com.bamtechmedia.dominguez.core.p218n.C5798g;
import com.bamtechmedia.dominguez.core.utils.C5880u;
import com.bamtechmedia.dominguez.profiles.C6671h0.C6672a;
import com.bamtechmedia.dominguez.profiles.C6769r0.C6771b.C6778d;
import com.bamtechmedia.dominguez.profiles.p259s1.C6791g;
import com.bamtechmedia.dominguez.profiles.p263u1.p264d.C6864d;
import com.bamtechmedia.dominguez.profiles.p266v1.C6869b;
import com.bamtechmedia.dominguez.profiles.p266v1.C6869b.C6870a;
import com.bamtechmedia.dominguez.profiles.p267w1.C6891b;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6947a;
import com.bamtechmedia.dominguez.profiles.p268x1.p270h.C6947a.C6948a;
import com.bamtechmedia.dominguez.profiles.p271y1.C6972b;
import com.bamtechmedia.dominguez.profiles.p271y1.C6987e;
import com.bamtechmedia.dominguez.profiles.p271y1.C6987e.C6989b;
import kotlin.C12907r;
import p163g.p201e.p203b.p299m.C7543f.C7544a;
import p163g.p201e.p203b.p299m.C7547h;
import p163g.p201e.p203b.p330z.C7943b;
import p163g.p201e.p203b.p330z.C7945d;
import p163g.p201e.p203b.p330z.C7946e;
import p163g.p201e.p203b.p330z.C7949h;

/* renamed from: com.bamtechmedia.dominguez.profiles.i0 */
/* compiled from: ProfileNavRouterImpl.kt */
public final class C6676i0 implements C6671h0 {

    /* renamed from: a */
    private final C5792f f15026a;

    /* renamed from: b */
    private final C7547h f15027b;

    /* renamed from: c */
    private final C6864d f15028c;

    /* renamed from: d */
    private final boolean f15029d;

    /* renamed from: e */
    private final C6969y0 f15030e;

    public C6676i0(C5792f fVar, C7547h hVar, C6864d dVar, boolean z, C6969y0 y0Var) {
        this.f15026a = fVar;
        this.f15027b = hVar;
        this.f15028c = dVar;
        this.f15029d = z;
        this.f15030e = y0Var;
    }

    /* renamed from: a */
    private final void m20697a(C6780r1 r1Var, boolean z, C2378m mVar) {
        C5792f.m18757a(this.f15026a, C6791g.f15186j0.mo19535a(r1Var, z, mVar), false, this.f15029d ? null : C5798g.f13582d.mo17704b(), null, null, 26, null);
    }

    /* renamed from: b */
    public void mo19400b(C6780r1 r1Var) {
        m20697a(r1Var, true, new C2378m(C2433b.PROFILE_EDIT_PROFILE, (String) null, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: c */
    public void mo19401c(C6780r1 r1Var) {
        m20697a(r1Var, false, new C2378m(C2433b.PROFILE_ADD_PROFILE, (String) null, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: a */
    public void mo19394a(C6780r1 r1Var) {
        Intent intent = new Intent();
        intent.putExtra("temp_profile", r1Var);
        this.f15026a.mo17695a(intent);
    }

    /* renamed from: a */
    public void mo19396a(String str, String str2) {
        C7547h hVar = this.f15027b;
        C7544a aVar = new C7544a();
        aVar.mo20466a(C7946e.delete_profile_request);
        aVar.mo20485i(C5880u.m18937a(C7949h.delete_profile_title, C13170i0.m40332a(C12907r.m40244a("user_profile", str2))));
        aVar.mo20475d(C5880u.m18936a(C7949h.delete_profile_copy));
        aVar.mo20481g(C5880u.m18936a(C7949h.btn_delete));
        aVar.mo20483h(C5880u.m18936a(C7949h.a11y_profileeditor_confirmdelete));
        aVar.mo20478f(Integer.valueOf(C7943b.vader_error));
        aVar.mo20476e(Integer.valueOf(C7945d.selector_tv_dialog_destruction_btn));
        aVar.mo20477e(C5880u.m18936a(C7949h.cancel_label));
        aVar.mo20479f(C5880u.m18936a(C7949h.a11y_profileeditor_canceldelete));
        hVar.mo20491b(aVar.mo20465a());
    }

    /* renamed from: a */
    public void mo19397a(boolean z, boolean z2) {
        Fragment fragment;
        if (this.f15029d) {
            fragment = C6987e.f15520g0.mo19754a(C6989b.EDIT_ALL_PROFILE);
        } else {
            fragment = C6891b.f15348b0.mo19664a(new C2378m(C2433b.PROFILE_EDIT_PROFILE, (String) null, 2, (DefaultConstructorMarker) null));
        }
        Fragment fragment2 = fragment;
        if (z2) {
            this.f15026a.mo17696a(fragment2);
        } else {
            C5792f.m18757a(this.f15026a, fragment2, z, null, null, null, 28, null);
        }
    }

    /* renamed from: a */
    public void mo19399a(boolean z, boolean z2, boolean z3) {
        Fragment a;
        if (!z) {
            this.f15030e.mo19723a(C6778d.f15158c);
        }
        if (!this.f15029d) {
            a = C6972b.f15491k0.mo19737a(z);
        } else if (z) {
            a = C6987e.f15520g0.mo19754a(C6989b.ADD_PROFILES);
        } else {
            a = C6987e.f15520g0.mo19754a(C6989b.WHO_WATCHING);
        }
        Fragment fragment = a;
        if (z3) {
            this.f15026a.mo17696a(fragment);
        } else {
            C5792f.m18757a(this.f15026a, fragment, z2, null, null, null, 28, null);
        }
    }

    /* renamed from: a */
    public void mo19398a(boolean z, boolean z2, C6780r1 r1Var, boolean z3, Fragment fragment, int i) {
        C6780r1 r1Var2;
        boolean z4;
        C6870a aVar = C6869b.f15310l0;
        if (r1Var != null) {
            z4 = z;
            r1Var2 = r1Var;
        } else {
            C6780r1 r1Var3 = new C6780r1(null, null, false, z2, false, null, false, false, this.f15028c.mo19632a(), null, false, 1783, null);
            z4 = z;
            r1Var2 = r1Var3;
        }
        m20696a(aVar.mo19643a(z4, r1Var2), z3, fragment, i);
    }

    /* renamed from: a */
    public void mo19395a(C6780r1 r1Var, Fragment fragment, int i) {
        C6780r1 r1Var2;
        C6948a aVar = C6947a.f15451b0;
        if (r1Var != null) {
            r1Var2 = r1Var;
        } else {
            r1Var2 = new C6780r1(null, null, false, false, false, null, false, false, null, null, false, 2047, null);
        }
        m20696a(aVar.mo19699a(r1Var2), false, fragment, i);
    }

    /* renamed from: a */
    private final void m20696a(Fragment fragment, boolean z, Fragment fragment2, int i) {
        if (fragment2 != null) {
            fragment.setTargetFragment(fragment2, i);
            C5792f.m18757a(this.f15026a, fragment, false, null, null, null, 30, null);
        } else if (z) {
            this.f15026a.mo17696a(fragment);
        } else {
            C5792f.m18757a(this.f15026a, fragment, false, null, null, null, 30, null);
        }
    }

    /* renamed from: a */
    public void mo19393a() {
        C6672a.m20688a(this, false, true, null, true, null, 0, 52, null);
    }
}
