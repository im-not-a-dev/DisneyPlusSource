package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.net.Uri;
import java.util.HashSet;
import java.util.Set;
import p163g.p174d.p178b.C5294k;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.d4 */
/* compiled from: FastForwardOrRewindDelegate */
public class C4988d4 extends C5184w4 {

    /* renamed from: V */
    private final Set<Integer> f12244V;

    /* renamed from: W */
    private final C5294k f12245W;

    /* renamed from: X */
    private final C5326w f12246X;

    /* renamed from: Y */
    private final C5300m f12247Y;

    /* renamed from: Z */
    long f12248Z;

    /* renamed from: a0 */
    long f12249a0;

    /* renamed from: b0 */
    int f12250b0 = 1;

    /* renamed from: c0 */
    long f12251c0;

    @SuppressLint({"CheckResult"})
    public C4988d4(C5294k kVar, Set<Integer> set, boolean z, C5326w wVar, C5300m mVar) {
        if (set == null) {
            set = new HashSet<>();
        }
        this.f12244V = set;
        this.f12246X = wVar;
        this.f12247Y = mVar;
        this.f12245W = kVar;
        if (kVar != null && !z) {
            mVar.mo17019c0().mo30192f((Consumer<? super T>) new C5012g3<Object>(this));
            mVar.mo17030f().mo16898e().mo30192f((Consumer<? super T>) new C4987d3<Object>(this));
            mVar.mo17030f().mo16904h().mo30192f((Consumer<? super T>) new C4986d2<Object>(this));
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C4986d2<Object>(this));
            mVar.mo16978X().mo30192f((Consumer<? super T>) new C4987d3<Object>(this));
            mVar.mo16941E().mo30192f((Consumer<? super T>) new C5055l1<Object>(this));
            mVar.mo17057n0().mo30192f((Consumer<? super T>) new C5194x2<Object>(this));
            mVar.mo17000a(90, 89, 104, 105);
            mVar.mo16965Q().mo30192f((Consumer<? super T>) new C5090q<Object>(this));
            mVar.mo16951J().mo30192f((Consumer<? super T>) new C5221y2<Object>(this));
            mVar.mo16973U().mo30192f((Consumer<? super T>) new C4999f0<Object>(this));
            mVar.mo17081z0().mo30192f((Consumer<? super T>) new C5054l0<Object>(this));
            mVar.mo16935B().mo30192f((Consumer<? super T>) new C5019h0<Object>(this));
            mVar.mo16963P().mo30192f((Consumer<? super T>) new C5044k2<Object>(this));
            mVar.mo16938C0().mo30192f((Consumer<? super T>) new C5037j2<Object>(this));
            mVar.mo16981a().mo17101d().mo30192f((Consumer<? super T>) new C5009g0<Object>(this));
            mVar.mo16981a().mo17098a().mo30192f((Consumer<? super T>) new C4991e0<Object>(this));
        }
    }

    /* renamed from: d */
    private void m17263d(int i) {
        this.f12246X.mo7599a(i == 1 ? 1.0f : 0.0f);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m17265d(Object obj) {
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17267e(Object obj) {
        mo16482a((Object) null);
    }

    /* renamed from: a */
    public void mo16482a(Object obj) {
        mo16488c(1);
    }

    /* renamed from: b */
    public void mo16487b(Object obj) {
        mo16483a(true);
    }

    /* renamed from: c */
    public void mo16490c(Object obj) {
        mo16483a(false);
    }

    /* renamed from: d */
    private void m17264d(long j) {
        if (j > this.f12248Z && this.f12249a0 > j) {
            long j2 = this.f12251c0;
            if (j2 <= 0 || j2 > j) {
                return;
            }
        }
        mo16488c(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17266e(long j) {
        this.f12251c0 = j;
    }

    /* renamed from: a */
    public void mo16483a(boolean z) {
        mo16488c(this.f12245W.mo16887a(this.f12250b0, z));
    }

    /* renamed from: b */
    public void mo16485b(int i) {
        if (i == 90) {
            mo16487b((Object) null);
        } else if (i == 89) {
            mo16490c((Object) null);
        }
    }

    /* renamed from: c */
    public void mo16489c(long j) {
        this.f12248Z = j;
    }

    /* renamed from: c */
    public void mo16488c(int i) {
        if (this.f12250b0 != i) {
            this.f12250b0 = i;
            if (mo16484a(i)) {
                this.f12246X.mo7600a(i);
                this.f12246X.mo7628i();
            } else {
                this.f12246X.mo7600a(1);
                this.f12246X.mo7611b();
            }
            this.f12247Y.mo17041h(i);
            m17263d(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17258a(Uri uri) {
        mo16488c(1);
    }

    /* renamed from: b */
    public void mo16486b(long j) {
        this.f12249a0 = j;
    }

    /* renamed from: a */
    public void mo16481a(long j) {
        int i = this.f12250b0;
        if (i != 1) {
            if (mo16484a(i)) {
                m17264d(j);
            } else {
                m17264d(m17257a());
            }
        }
    }

    /* renamed from: a */
    public boolean mo16484a(int i) {
        return i == 1 || this.f12244V.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    private long m17257a() {
        long max = Math.max(this.f12248Z, this.f12246X.getCurrentPosition() + (((long) this.f12250b0) * 1000));
        long j = this.f12249a0;
        if (j > 0) {
            max = Math.min(j, max);
        }
        this.f12246X.mo7602a(max);
        return max;
    }
}
