package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.widget.TextView;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p196m0.C5306d;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.b5 */
/* compiled from: RemainingTimeTextViewDelegate */
public class C4975b5 implements C5271z3 {

    /* renamed from: U */
    private boolean f12223U;

    /* renamed from: V */
    long f12224V = 0;

    /* renamed from: W */
    long f12225W = 0;

    /* renamed from: X */
    long f12226X;

    /* renamed from: Y */
    long f12227Y;

    /* renamed from: Z */
    boolean f12228Z;

    /* renamed from: c */
    private TextView f12229c;

    @SuppressLint({"CheckResult"})
    public C4975b5(TextView textView, boolean z, C5300m mVar) {
        this.f12229c = textView;
        this.f12223U = z;
        if (textView != null) {
            mVar.mo16963P().mo30192f((Consumer<? super T>) new C4970b0<Object>(this));
            mVar.mo16938C0().mo30192f((Consumer<? super T>) new C5063m2<Object>(this));
            mVar.mo17065r0().mo30192f((Consumer<? super T>) new C4960a<Object>(this));
            mVar.mo17081z0().mo30192f((Consumer<? super T>) new C5036j1<Object>(this));
            mVar.mo16935B().mo30192f((Consumer<? super T>) new C5268z0<Object>(this));
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5072n3<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16470a(boolean z) {
        this.f12228Z = z;
    }

    /* renamed from: b */
    public void mo16471b(long j) {
        this.f12225W = j;
        mo16468a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16472c(long j) {
        this.f12227Y = j;
        mo16468a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16473d(long j) {
        this.f12226X = j;
        mo16468a();
    }

    /* renamed from: e */
    public void mo16474e(long j) {
        this.f12224V = j;
        mo16468a();
    }

    /* renamed from: a */
    public void mo16469a(long j) {
        if (!this.f12228Z) {
            this.f12226X = j;
            mo16468a();
        }
    }

    /* renamed from: a */
    public void mo16468a() {
        long j = this.f12227Y;
        long j2 = this.f12225W;
        if (0 < j2 && j2 < j) {
            j = j2;
        }
        long j3 = this.f12224V;
        this.f12229c.setText(C5306d.m17959a(Math.max(0, (j - j3) - (this.f12226X - j3)), this.f12223U));
    }
}
