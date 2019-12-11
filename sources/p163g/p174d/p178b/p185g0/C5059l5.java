package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.widget.ProgressBar;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.l5 */
/* compiled from: TimeProgressBarDelegate */
public class C5059l5 implements C5271z3 {

    /* renamed from: U */
    boolean f12337U;

    /* renamed from: V */
    long f12338V;

    /* renamed from: W */
    long f12339W;

    /* renamed from: X */
    long f12340X;

    /* renamed from: Y */
    long f12341Y;

    /* renamed from: Z */
    boolean f12342Z;

    /* renamed from: c */
    private final ProgressBar f12343c;

    @SuppressLint({"CheckResult"})
    public C5059l5(ProgressBar progressBar, C5326w wVar, C5300m mVar) {
        this.f12343c = progressBar;
        if (progressBar != null) {
            mVar.mo17030f().mo16908j().mo30192f((Consumer<? super T>) new C5043k1<Object>(this));
            mVar.mo16939D().mo30192f((Consumer<? super T>) new C4979c2<Object>(this));
            mVar.mo16967R().mo30192f((Consumer<? super T>) new C5193x1<Object>(this));
            mVar.mo16963P().mo30192f((Consumer<? super T>) new C5270z2<Object>(this));
            mVar.mo16937C().mo30192f((Consumer<? super T>) new C5076o0<Object>(this));
            mVar.mo17081z0().mo30192f((Consumer<? super T>) new C4993e2<Object>(this));
            mVar.mo16935B().mo30192f((Consumer<? super T>) new C5156u<Object>(this));
            mVar.mo16942E0().mo30192f((Consumer<? super T>) new C5269z1<Object>(this));
            mVar.mo16946G0().mo30192f((Consumer<? super T>) new C5057l3<Object>(this));
            mo16536a(wVar.getCurrentPosition());
            mo16543d(wVar.getDuration());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16538a(Long l) {
        this.f12343c.setProgress((int) (l.longValue() - this.f12338V));
    }

    /* renamed from: b */
    public void mo16541b(Object obj) {
        this.f12337U = false;
    }

    /* renamed from: c */
    public void mo16542c(long j) {
        this.f12340X = j;
        this.f12343c.setMax((int) (j - this.f12338V));
    }

    /* renamed from: d */
    public void mo16543d(long j) {
        this.f12341Y = j;
        if (j > this.f12340X) {
            long j2 = this.f12339W;
            if (0 < j2 && j2 < j) {
                j = j2;
            }
            this.f12343c.setMax((int) (j - this.f12338V));
            this.f12343c.setSecondaryProgress(0);
            return;
        }
        this.f12343c.setSecondaryProgress((int) (j - this.f12338V));
    }

    /* renamed from: e */
    public void mo16544e(long j) {
        this.f12338V = j;
    }

    /* renamed from: a */
    public void mo16537a(Boolean bool) {
        this.f12342Z = bool.booleanValue();
    }

    /* renamed from: b */
    public void mo16540b(long j) {
        this.f12339W = j;
    }

    /* renamed from: a */
    public void mo16539a(Object obj) {
        this.f12337U = true;
    }

    /* renamed from: a */
    public void mo16536a(long j) {
        if (!this.f12342Z) {
            if (this.f12337U) {
                ProgressBar progressBar = this.f12343c;
                progressBar.setProgress(progressBar.getMax());
            } else {
                this.f12343c.setProgress((int) (j - this.f12338V));
            }
        }
    }
}
