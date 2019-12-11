package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import java.util.concurrent.TimeUnit;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.C5326w;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p527w.p529c.C11992a;

/* renamed from: g.d.b.g0.k5 */
/* compiled from: TickerDelegate */
public class C5052k5 implements C5271z3 {

    /* renamed from: U */
    C5300m f12327U;

    /* renamed from: V */
    Disposable f12328V;

    /* renamed from: W */
    Disposable f12329W;

    /* renamed from: X */
    long f12330X;

    /* renamed from: c */
    private C5326w f12331c;

    @SuppressLint({"CheckResult"})
    public C5052k5(C5326w wVar, C5300m mVar, long j) {
        this.f12331c = wVar;
        this.f12327U = mVar;
        this.f12330X = j;
        mVar.mo16957M().mo30192f((Consumer<? super T>) new C4983d<Object>(this));
        mVar.mo16955L().mo30192f((Consumer<? super T>) new C5135t2<Object>(this));
        mVar.mo16934A0().mo30192f((Consumer<? super T>) new C5169v2<Object>(this));
    }

    /* renamed from: d */
    private void m17323d() {
        this.f12327U.mo17021d(this.f12331c.mo7631l());
        if (this.f12331c.mo7623g()) {
            this.f12327U.mo17003b();
            return;
        }
        this.f12327U.mo17020d();
        if (this.f12331c.mo7643x()) {
            this.f12327U.mo17040h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16531a(Object obj) {
        mo16535c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16534b(Object obj) {
        mo16529a(this.f12328V);
        mo16529a(this.f12329W);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16535c() {
        mo16529a(this.f12328V);
        mo16529a(this.f12329W);
        this.f12328V = Observable.m38306b(1000, TimeUnit.MILLISECONDS).mo30151a(C11992a.m38600a()).mo30192f((Consumer<? super T>) new C5092q1<Object>(this));
        this.f12329W = Observable.m38306b(this.f12330X, TimeUnit.MILLISECONDS).mo30151a(C11992a.m38600a()).mo30192f((Consumer<? super T>) new C5085p1<Object>(this));
        this.f12327U.mo16994a(this.f12328V);
        this.f12327U.mo16994a(this.f12329W);
    }

    /* renamed from: a */
    public /* synthetic */ void mo16530a(Long l) throws Exception {
        mo16532b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16529a(Disposable disposable) {
        if (disposable != null && !disposable.isDisposed()) {
            this.f12327U.mo17009b(disposable);
            disposable.dispose();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo16533b(Long l) throws Exception {
        mo16528a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16532b() {
        if (this.f12331c.mo7617c()) {
            m17323d();
        }
        this.f12327U.mo17045i(this.f12331c.getCurrentPosition());
        this.f12327U.mo16985a(this.f12331c.getBufferedPosition());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16528a() {
        this.f12327U.mo17027e(this.f12331c.getCurrentPosition());
    }
}
