package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5300m.C5301a;
import p163g.p174d.p178b.p196m0.C5311f;
import p163g.p174d.p178b.p200z.C5342b;
import p163g.p174d.p178b.p200z.C5342b.C5343a;
import p520io.reactivex.functions.Consumer;
import p686n.p687a.Timber;

@SuppressLint({"CheckResult"})
/* renamed from: g.d.b.g0.b4 */
/* compiled from: ControlsViewDelegate */
public class C4974b4 implements C5271z3 {

    /* renamed from: d0 */
    public static final Set<Integer> f12212d0 = new HashSet(Arrays.asList(new Integer[]{Integer.valueOf(19), Integer.valueOf(20), Integer.valueOf(21), Integer.valueOf(22), Integer.valueOf(23), Integer.valueOf(268), Integer.valueOf(270), Integer.valueOf(269), Integer.valueOf(271), Integer.valueOf(127), Integer.valueOf(126), Integer.valueOf(85), Integer.valueOf(89), Integer.valueOf(90), Integer.valueOf(121)}));

    /* renamed from: U */
    private C5300m f12213U;

    /* renamed from: V */
    boolean f12214V;

    /* renamed from: W */
    boolean f12215W;

    /* renamed from: X */
    boolean f12216X;

    /* renamed from: Y */
    final Set<String> f12217Y;

    /* renamed from: Z */
    boolean f12218Z;

    /* renamed from: a0 */
    private View f12219a0;

    /* renamed from: b0 */
    private C5342b f12220b0;

    /* renamed from: c */
    private Activity f12221c;

    /* renamed from: c0 */
    private C5343a f12222c0;

    public C4974b4(View view, long j, long j2, C5343a aVar, boolean z, boolean z2, Activity activity, C5300m mVar) {
        this.f12219a0 = view;
        if (aVar != null) {
            this.f12220b0 = aVar.mo17110a(j, j2);
        }
        this.f12214V = z;
        this.f12215W = z2;
        this.f12221c = activity;
        this.f12222c0 = aVar;
        this.f12213U = mVar;
        this.f12217Y = new HashSet();
        if (view != null) {
            C5342b bVar = this.f12220b0;
            if (!(bVar == null || aVar == null)) {
                bVar.mo17106a(aVar);
            }
            this.f12216X = C5311f.m17968a(view);
            mVar.mo17030f().mo16906i().mo30192f((Consumer<? super T>) new C4961a0<Object>(this));
            mVar.mo17072v().mo30192f((Consumer<? super T>) new C5191x<Object>(this));
            mVar.mo17074w().mo30192f((Consumer<? super T>) new C5181w1<Object>(this));
            mVar.mo17046i0().mo30192f((Consumer<? super T>) new C5220y1<Object>(this));
            mVar.mo17014b0().mo30192f((Consumer<? super T>) new C5041k<Object>(this));
            mVar.mo16951J().mo30192f((Consumer<? super T>) new C5083p<Object>(this));
            mVar.mo17060p().mo30192f((Consumer<? super T>) new C5159u2<Object>(this));
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5124s<Object>(this));
            mVar.mo17049j0().mo30192f((Consumer<? super T>) new C5018h<Object>(this));
            mVar.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C5267z<Object>(this));
            mVar.mo16981a().mo17098a().mo30192f((Consumer<? super T>) new C5218y<Object>(this));
            mVar.mo17002a0().mo30192f((Consumer<? super T>) new C5079o3<Object>(this));
            mVar.mo16998a(f12212d0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17229e(Object obj) {
        this.f12217Y.clear();
        mo16454a();
        this.f12213U.mo16995a("CONTROL_LOCK_AD_ID");
    }

    /* renamed from: a */
    public /* synthetic */ void mo16457a(Object obj) throws Exception {
        mo16463c();
    }

    /* renamed from: b */
    public /* synthetic */ void mo16461b(Object obj) throws Exception {
        mo16454a();
    }

    /* renamed from: c */
    public void mo16466c(boolean z) {
        if (this.f12215W) {
            mo16454a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16467d(boolean z) {
        String str = "CONTROL_LOCK_SEEK_BAR";
        if (z) {
            this.f12213U.mo16995a(str);
        } else {
            this.f12213U.mo17010b(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16456a(C5301a aVar) {
        String str = aVar.f12781a;
        if (aVar.f12782b) {
            if (aVar.f12783c) {
                mo16459b();
            }
            if (!this.f12217Y.contains(str)) {
                this.f12217Y.add(str);
                return;
            }
            Timber.m44532e("Attempting to double lock controls with \"%s\" ", str);
        } else if (!this.f12217Y.remove(str)) {
            Timber.m44532e("Attempting to unlock controls with \"%s\" when controls are unlocked", str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16459b() {
        if (this.f12217Y.isEmpty() && !this.f12216X) {
            mo16464c(0);
            this.f12216X = true;
            this.f12213U.mo17022d(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17228d(Object obj) {
        this.f12213U.mo17010b("CONTROL_LOCK_AD_ID");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16465c(Object obj) {
        if (!this.f12216X || !this.f12217Y.isEmpty()) {
            this.f12221c.finish();
        } else {
            mo16454a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16460b(int i) {
        String str = "CONTROL_LOCK_RATE_CHANGE_ID";
        if (i == 1) {
            this.f12213U.mo17010b(str);
            return;
        }
        mo16459b();
        this.f12213U.mo16995a(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16464c(int i) {
        C5342b bVar = this.f12220b0;
        if (bVar != null) {
            C5343a aVar = this.f12222c0;
            if (aVar != null) {
                if (i == 8 || i == 4) {
                    this.f12220b0.mo17109b(this.f12219a0, this.f12222c0);
                    return;
                } else {
                    bVar.mo17105a(this.f12219a0, aVar);
                    return;
                }
            }
        }
        this.f12219a0.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16462b(boolean z) {
        if (this.f12214V && !this.f12218Z) {
            String str = "CONTROL_LOCK_PAUSED_ID";
            if (z) {
                this.f12213U.mo17010b(str);
                return;
            }
            mo16459b();
            this.f12213U.mo16995a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16463c() {
        if (this.f12216X) {
            mo16454a();
        } else {
            mo16459b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16454a() {
        if (this.f12217Y.isEmpty() && this.f12216X) {
            this.f12216X = false;
            mo16464c(8);
            this.f12213U.mo17022d(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16455a(int i) {
        if (f12212d0.contains(Integer.valueOf(i))) {
            mo16459b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16458a(boolean z) {
        this.f12218Z = z;
        String str = "CONTROL_LOCK_PIP";
        if (z) {
            mo16456a(new C5301a("CONTROL_LOCK_PAUSED_ID", false, false));
            mo16454a();
            mo16456a(new C5301a(str, true, false));
            return;
        }
        mo16456a(new C5301a(str, false, false));
    }
}
