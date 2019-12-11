package p163g.p174d.p178b;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.MotionEvent;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p163g.p174d.p178b.p179a0.C4831f;
import p163g.p174d.p178b.p180b0.C4922v2;
import p163g.p174d.p178b.p180b0.C4930x2;
import p163g.p174d.p178b.p182d0.C4946g;
import p163g.p174d.p178b.p182d0.C4949i;
import p163g.p174d.p178b.p184f0.C4956a;
import p163g.p174d.p178b.p185g0.p189y5.C5253h;
import p163g.p174d.p178b.p190h0.C5274a;
import p163g.p174d.p178b.p190h0.C5275b;
import p163g.p174d.p178b.p191i0.p192a.C5281a;
import p163g.p174d.p178b.p193j0.C5291e;
import p163g.p174d.p178b.p194k0.C5295a;
import p163g.p174d.p178b.p195l0.C5298a;
import p163g.p174d.p178b.p195l0.C5299b;
import p163g.p174d.p178b.p196m0.C5305c;
import p163g.p174d.p178b.p199y.C5338i;
import p520io.reactivex.Observable;
import p520io.reactivex.disposables.CompositeDisposable;
import p520io.reactivex.disposables.Disposable;
import p520io.reactivex.functions.C11947c;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.p527w.p529c.C11992a;
import p520io.reactivex.subjects.C11976a;
import p520io.reactivex.subjects.PublishSubject;

/* renamed from: g.d.b.m */
/* compiled from: PlayerEvents */
public class C5300m {

    /* renamed from: w0 */
    public static final Object f12706w0 = new Object();

    /* renamed from: A */
    private final C11976a<Long> f12707A;

    /* renamed from: B */
    private final C11976a<Long> f12708B;

    /* renamed from: C */
    private final C11976a<C5298a> f12709C;

    /* renamed from: D */
    private final C11976a<C5298a> f12710D;

    /* renamed from: E */
    private final C11976a<Long> f12711E;

    /* renamed from: F */
    private final C11976a<Long> f12712F;

    /* renamed from: G */
    private final PublishSubject<List<C4956a>> f12713G;

    /* renamed from: H */
    private final PublishSubject<List<C4956a>> f12714H;

    /* renamed from: I */
    private final PublishSubject<Integer> f12715I;

    /* renamed from: J */
    private final C11976a<C5291e> f12716J;

    /* renamed from: K */
    private final PublishSubject<C5291e> f12717K;

    /* renamed from: L */
    private final PublishSubject<Throwable> f12718L;

    /* renamed from: M */
    private final PublishSubject<Integer> f12719M;

    /* renamed from: N */
    private final PublishSubject<Object> f12720N;

    /* renamed from: O */
    private final PublishSubject<Object> f12721O;

    /* renamed from: P */
    private final PublishSubject<Object> f12722P;

    /* renamed from: Q */
    private final PublishSubject<Object> f12723Q;

    /* renamed from: R */
    private final PublishSubject<C5305c> f12724R;

    /* renamed from: S */
    private final PublishSubject<Integer> f12725S;

    /* renamed from: T */
    private final PublishSubject<Integer> f12726T;

    /* renamed from: U */
    private final PublishSubject<Integer> f12727U;

    /* renamed from: V */
    private final PublishSubject<Object> f12728V;

    /* renamed from: W */
    private final PublishSubject<Object> f12729W;

    /* renamed from: X */
    private final PublishSubject<Object> f12730X;

    /* renamed from: Y */
    private final PublishSubject<C4949i> f12731Y;

    /* renamed from: Z */
    private final PublishSubject<C4946g> f12732Z;

    /* renamed from: a */
    private final Set<Integer> f12733a;

    /* renamed from: a0 */
    private final PublishSubject<C4946g> f12734a0;

    /* renamed from: b */
    private final C11976a<C5302b> f12735b;

    /* renamed from: b0 */
    private final PublishSubject<Object> f12736b0;

    /* renamed from: c */
    private final C11976a<Long> f12737c;

    /* renamed from: c0 */
    private final PublishSubject<Object> f12738c0;

    /* renamed from: d */
    private final C11976a<Long> f12739d;

    /* renamed from: d0 */
    private final PublishSubject<Boolean> f12740d0;

    /* renamed from: e */
    private final C11976a<Long> f12741e;

    /* renamed from: e0 */
    private final C11976a<Uri> f12742e0;

    /* renamed from: f */
    private final PublishSubject<Boolean> f12743f;

    /* renamed from: f0 */
    private final C11976a<Uri> f12744f0;

    /* renamed from: g */
    private final PublishSubject<Object> f12745g;

    /* renamed from: g0 */
    private final C11976a<C5295a> f12746g0;

    /* renamed from: h */
    private final C11976a<Boolean> f12747h;

    /* renamed from: h0 */
    private final C11976a<Boolean> f12748h0;

    /* renamed from: i */
    private final C11976a<Object> f12749i;

    /* renamed from: i0 */
    private final PublishSubject<C4831f> f12750i0;

    /* renamed from: j */
    private final C11976a<Object> f12751j;

    /* renamed from: j0 */
    private final C11976a<Boolean> f12752j0;

    /* renamed from: k */
    private final C11976a<Boolean> f12753k;

    /* renamed from: k0 */
    private final C11976a<Long> f12754k0;

    /* renamed from: l */
    private final C11976a<Boolean> f12755l;

    /* renamed from: l0 */
    private final C11976a<Boolean> f12756l0;

    /* renamed from: m */
    private final C11976a<Boolean> f12757m;

    /* renamed from: m0 */
    private final PublishSubject<Integer> f12758m0;

    /* renamed from: n */
    private final C11976a<Boolean> f12759n;

    /* renamed from: n0 */
    private final PublishSubject<MotionEvent> f12760n0;

    /* renamed from: o */
    private final C11976a<Boolean> f12761o;

    /* renamed from: o0 */
    public final C11976a<Long> f12762o0;

    /* renamed from: p */
    private final PublishSubject<Object> f12763p;

    /* renamed from: p0 */
    private final C5274a f12764p0;

    /* renamed from: q */
    private final C11976a<Float> f12765q;

    /* renamed from: q0 */
    private final C5297l f12766q0;

    /* renamed from: r */
    private final PublishSubject<Uri> f12767r;

    /* renamed from: r0 */
    private final C5338i f12768r0;

    /* renamed from: s */
    private final PublishSubject<String> f12769s;

    /* renamed from: s0 */
    private final C5281a f12770s0;

    /* renamed from: t */
    private final C11976a<Boolean> f12771t;

    /* renamed from: t0 */
    private final C5299b f12772t0;

    /* renamed from: u */
    private final PublishSubject<Object> f12773u;

    /* renamed from: u0 */
    private final C5325v f12774u0;

    /* renamed from: v */
    private final PublishSubject<C5301a> f12775v;

    /* renamed from: v0 */
    private final CompositeDisposable f12776v0;

    /* renamed from: w */
    private final C11976a<Long> f12777w;

    /* renamed from: x */
    private final C11976a<Integer> f12778x;

    /* renamed from: y */
    private final C11976a<Integer> f12779y;

    /* renamed from: z */
    private final C11976a<Boolean> f12780z;

    /* renamed from: g.d.b.m$a */
    /* compiled from: PlayerEvents */
    public static class C5301a {

        /* renamed from: a */
        public final String f12781a;

        /* renamed from: b */
        public final boolean f12782b;

        /* renamed from: c */
        public final boolean f12783c;

        public C5301a(String str, boolean z, boolean z2) {
            this.f12781a = str;
            this.f12782b = z;
            this.f12783c = z2;
        }
    }

    /* renamed from: g.d.b.m$b */
    /* compiled from: PlayerEvents */
    public enum C5302b {
        START,
        STOP
    }

    public C5300m() {
        this(new CompositeDisposable());
    }

    /* renamed from: a */
    public static <T> Observable<T> m17796a(Observable<T> observable, CompositeDisposable compositeDisposable) {
        Observable a = observable.mo30151a(C11992a.m38600a());
        compositeDisposable.getClass();
        return a.mo30188e((Consumer<? super Disposable>) new C4816a<Object>(compositeDisposable));
    }

    /* renamed from: b */
    static /* synthetic */ boolean m17802b(C5302b bVar) throws Exception {
        return bVar == C5302b.STOP;
    }

    /* renamed from: A */
    public Observable<Integer> mo16933A() {
        return m17794a((Observable<T>) this.f12758m0);
    }

    /* renamed from: A0 */
    public Observable<Object> mo16934A0() {
        return m17794a((Observable<T>) this.f12736b0);
    }

    /* renamed from: B */
    public Observable<Long> mo16935B() {
        return m17794a((Observable<T>) this.f12708B);
    }

    /* renamed from: B0 */
    public Observable<Boolean> mo16936B0() {
        return m17794a((Observable<T>) this.f12756l0);
    }

    /* renamed from: C */
    public Observable<Long> mo16937C() {
        return m17794a((Observable<T>) this.f12711E);
    }

    /* renamed from: C0 */
    public Observable<Long> mo16938C0() {
        return m17794a((Observable<T>) this.f12737c);
    }

    /* renamed from: D */
    public Observable<Object> mo16939D() {
        return m17794a((Observable<T>) this.f12763p);
    }

    /* renamed from: D0 */
    public Observable<String> mo16940D0() {
        return m17794a((Observable<T>) this.f12769s);
    }

    /* renamed from: E */
    public Observable<Object> mo16941E() {
        return m17794a((Observable<T>) this.f12728V);
    }

    /* renamed from: E0 */
    public Observable<Boolean> mo16942E0() {
        return m17794a((Observable<T>) this.f12752j0);
    }

    /* renamed from: F */
    public C5274a mo16943F() {
        return this.f12764p0;
    }

    /* renamed from: F0 */
    public Observable<Boolean> mo16944F0() {
        return mo17062q().mo30193g(C4951e.f12112c).mo30164b();
    }

    /* renamed from: G */
    public Observable<Integer> mo16945G() {
        return m17794a((Observable<T>) this.f12719M);
    }

    /* renamed from: G0 */
    public Observable<Long> mo16946G0() {
        return m17794a((Observable<T>) this.f12754k0);
    }

    /* renamed from: H */
    public Observable<Object> mo16947H() {
        return m17794a((Observable<T>) this.f12721O);
    }

    /* renamed from: H0 */
    public Observable<Float> mo16948H0() {
        return this.f12765q;
    }

    /* renamed from: I */
    public Observable<Object> mo16949I() {
        return m17794a((Observable<T>) this.f12720N);
    }

    /* renamed from: I0 */
    public void mo16950I0() {
        this.f12749i.onNext(f12706w0);
    }

    /* renamed from: J */
    public Observable<Integer> mo16951J() {
        return m17794a((Observable<T>) this.f12725S);
    }

    /* renamed from: J0 */
    public void mo16952J0() {
        this.f12751j.onNext(f12706w0);
    }

    /* renamed from: K */
    public Observable<Integer> mo16953K() {
        return m17794a((Observable<T>) this.f12726T);
    }

    /* renamed from: K0 */
    public void mo16954K0() {
        this.f12747h.onNext(Boolean.valueOf(false));
    }

    /* renamed from: L */
    public Observable<C5302b> mo16955L() {
        return m17794a((Observable<T>) this.f12735b).mo30164b().mo30150a((C11952h<? super T>) C4937c.f12096c);
    }

    /* renamed from: L0 */
    public void mo16956L0() {
        this.f12731Y.onComplete();
    }

    /* renamed from: M */
    public Observable<C5302b> mo16957M() {
        return m17794a((Observable<T>) this.f12735b).mo30164b().mo30150a((C11952h<? super T>) C4955f.f12167c);
    }

    /* renamed from: M0 */
    public void mo16958M0() {
        this.f12747h.onNext(Boolean.valueOf(true));
    }

    /* renamed from: N */
    public Observable<Boolean> mo16959N() {
        return m17794a((Observable<T>) this.f12759n);
    }

    /* renamed from: N0 */
    public void mo16960N0() {
        this.f12745g.onNext(f12706w0);
    }

    /* renamed from: O */
    public Observable<Boolean> mo16961O() {
        return m17794a((Observable<T>) this.f12761o);
    }

    /* renamed from: O0 */
    public void mo16962O0() {
        mo17042h(0);
        mo17005b(0);
        mo17016c(0);
        mo17032f(-1);
        mo16993a(new C5298a());
        mo17008b(new C5298a());
        mo16974U0().mo16929a(new C5298a());
    }

    /* renamed from: P */
    public Observable<Long> mo16963P() {
        return m17794a((Observable<T>) this.f12741e);
    }

    /* renamed from: P0 */
    public void mo16964P0() {
        this.f12729W.onNext(f12706w0);
    }

    /* renamed from: Q */
    public Observable<MotionEvent> mo16965Q() {
        return m17794a((Observable<T>) this.f12760n0);
    }

    /* renamed from: Q0 */
    public void mo16966Q0() {
        this.f12723Q.onNext(f12706w0);
    }

    /* renamed from: R */
    public Observable<Long> mo16967R() {
        return m17794a((Observable<T>) this.f12739d);
    }

    /* renamed from: R0 */
    public void mo16968R0() {
        this.f12722P.onNext(f12706w0);
    }

    /* renamed from: S */
    public Observable<Integer> mo16969S() {
        return m17795a(mo16947H(), this.f12774u0);
    }

    /* renamed from: S0 */
    public void mo16970S0() {
        this.f12773u.onNext(f12706w0);
    }

    /* renamed from: T */
    public Observable<Integer> mo16971T() {
        return m17795a(mo16949I(), this.f12774u0);
    }

    /* renamed from: T0 */
    public void mo16972T0() {
        mo17018c(121);
    }

    /* renamed from: U */
    public Observable<Uri> mo16973U() {
        return m17794a((Observable<T>) this.f12767r);
    }

    /* renamed from: U0 */
    public C5299b mo16974U0() {
        return this.f12772t0;
    }

    @Deprecated
    /* renamed from: V */
    public Observable<C5295a> mo16975V() {
        return m17794a((Observable<T>) this.f12746g0);
    }

    /* renamed from: V0 */
    public void mo16976V0() {
        this.f12759n.onNext(Boolean.valueOf(false));
    }

    /* renamed from: W */
    public Observable<C5291e> mo16977W() {
        return m17794a((Observable<T>) this.f12716J);
    }

    /* renamed from: X */
    public Observable<Integer> mo16978X() {
        return m17794a((Observable<T>) this.f12778x);
    }

    /* renamed from: Y */
    public Observable<Integer> mo16979Y() {
        return m17794a((Observable<T>) this.f12779y).mo30164b();
    }

    /* renamed from: Z */
    public Observable<Integer> mo16980Z() {
        return m17794a((Observable<T>) this.f12715I);
    }

    /* renamed from: a0 */
    public Observable<Boolean> mo17002a0() {
        return m17794a((Observable<T>) this.f12748h0);
    }

    /* renamed from: b0 */
    public Observable<Boolean> mo17014b0() {
        return m17794a((Observable<T>) this.f12747h);
    }

    /* renamed from: c */
    public void mo17015c() {
        this.f12730X.onNext(f12706w0);
    }

    /* renamed from: c0 */
    public Observable<Object> mo17019c0() {
        return m17794a((Observable<T>) this.f12749i);
    }

    /* renamed from: d */
    public boolean mo17023d(int i) {
        if (!this.f12733a.contains(Integer.valueOf(i))) {
            return false;
        }
        this.f12726T.onNext(Integer.valueOf(i));
        return true;
    }

    /* renamed from: d0 */
    public Observable<Throwable> mo17024d0() {
        return m17794a((Observable<T>) this.f12718L);
    }

    /* renamed from: e */
    public void mo17027e(long j) {
        this.f12739d.onNext(Long.valueOf(j));
    }

    /* renamed from: e0 */
    public Observable<Object> mo17029e0() {
        return m17794a((Observable<T>) this.f12751j);
    }

    /* renamed from: f */
    public C5297l mo17030f() {
        return this.f12766q0;
    }

    /* renamed from: f0 */
    public Observable<C4946g> mo17034f0() {
        return m17794a((Observable<T>) this.f12734a0);
    }

    /* renamed from: g */
    public void mo17036g(int i) {
        this.f12715I.onNext(Integer.valueOf(i));
    }

    /* renamed from: g0 */
    public Observable<C4949i> mo17039g0() {
        return m17794a((Observable<T>) this.f12731Y);
    }

    /* renamed from: h */
    public void mo17041h(int i) {
        this.f12727U.onNext(Integer.valueOf(i));
    }

    /* renamed from: h0 */
    public Observable<C4946g> mo17043h0() {
        return m17794a((Observable<T>) this.f12732Z);
    }

    /* renamed from: i */
    public void mo17044i() {
        this.f12728V.onNext(f12706w0);
    }

    /* renamed from: i0 */
    public Observable<Integer> mo17046i0() {
        return m17794a((Observable<T>) this.f12727U);
    }

    /* renamed from: j */
    public void mo17048j(long j) {
        this.f12754k0.onNext(Long.valueOf(j));
    }

    /* renamed from: j0 */
    public Observable<Boolean> mo17049j0() {
        return m17794a((Observable<T>) this.f12743f);
    }

    /* renamed from: k */
    public void mo17050k() {
        this.f12721O.onNext(f12706w0);
    }

    /* renamed from: k0 */
    public Observable<Object> mo17051k0() {
        return m17794a((Observable<T>) this.f12745g);
    }

    /* renamed from: l */
    public void mo17052l() {
        this.f12720N.onNext(f12706w0);
    }

    /* renamed from: l0 */
    public Observable<Long> mo17053l0() {
        return m17794a((Observable<T>) this.f12712F);
    }

    /* renamed from: m */
    public void mo17054m() {
        this.f12735b.onNext(C5302b.START);
    }

    /* renamed from: m0 */
    public Observable<Object> mo17055m0() {
        return m17794a((Observable<T>) this.f12738c0);
    }

    /* renamed from: n */
    public void mo17056n() {
        this.f12735b.onNext(C5302b.STOP);
    }

    /* renamed from: n0 */
    public Observable<Object> mo17057n0() {
        return m17794a((Observable<T>) this.f12729W);
    }

    /* renamed from: o */
    public void mo17058o() {
        this.f12759n.onNext(Boolean.valueOf(true));
    }

    /* renamed from: o0 */
    public Observable<C5305c> mo17059o0() {
        return m17794a((Observable<T>) this.f12724R);
    }

    /* renamed from: p */
    public Observable<Object> mo17060p() {
        return m17794a((Observable<T>) this.f12730X);
    }

    /* renamed from: p0 */
    public Observable<Object> mo17061p0() {
        return m17794a((Observable<T>) this.f12723Q);
    }

    /* renamed from: q */
    public Observable<C4831f> mo17062q() {
        return m17794a((Observable<T>) this.f12750i0);
    }

    /* renamed from: q0 */
    public Observable<Object> mo17063q0() {
        return m17794a((Observable<T>) this.f12722P);
    }

    /* renamed from: r */
    public Observable<Uri> mo17064r() {
        return m17794a((Observable<T>) this.f12744f0);
    }

    /* renamed from: r0 */
    public Observable<Long> mo17065r0() {
        return m17794a((Observable<T>) this.f12777w);
    }

    /* renamed from: s */
    public Observable<Long> mo17066s() {
        return m17794a((Observable<T>) this.f12762o0);
    }

    /* renamed from: s0 */
    public Observable<Boolean> mo17067s0() {
        return m17794a((Observable<T>) this.f12780z);
    }

    /* renamed from: t */
    public Observable<Boolean> mo17068t() {
        return m17794a((Observable<T>) this.f12755l);
    }

    /* renamed from: t0 */
    public Observable<Boolean> mo17069t0() {
        return m17794a((Observable<T>) this.f12757m);
    }

    /* renamed from: u */
    public Observable<Boolean> mo17070u() {
        return m17794a((Observable<T>) this.f12753k);
    }

    /* renamed from: u0 */
    public Observable<C5291e> mo17071u0() {
        return m17794a((Observable<T>) this.f12717K);
    }

    /* renamed from: v */
    public Observable<Object> mo17072v() {
        return m17794a((Observable<T>) this.f12773u);
    }

    /* renamed from: v0 */
    public Observable<Uri> mo17073v0() {
        return m17794a((Observable<T>) this.f12742e0);
    }

    /* renamed from: w */
    public Observable<C5301a> mo17074w() {
        return m17794a((Observable<T>) this.f12775v);
    }

    /* renamed from: w0 */
    public Observable<Boolean> mo17075w0() {
        return m17794a((Observable<T>) this.f12740d0);
    }

    /* renamed from: x */
    public Observable<Boolean> mo17076x() {
        return m17794a((Observable<T>) this.f12771t);
    }

    /* renamed from: x0 */
    public Observable<C5298a> mo17077x0() {
        return m17794a((Observable<T>) this.f12709C);
    }

    /* renamed from: y */
    public Observable<List<C4956a>> mo17078y() {
        return m17794a((Observable<T>) this.f12714H);
    }

    /* renamed from: y0 */
    public Observable<C5298a> mo17079y0() {
        return m17794a((Observable<T>) this.f12710D);
    }

    /* renamed from: z */
    public Observable<List<C4956a>> mo17080z() {
        return m17794a((Observable<T>) this.f12713G);
    }

    /* renamed from: z0 */
    public Observable<Long> mo17081z0() {
        return m17794a((Observable<T>) this.f12707A);
    }

    private C5300m(CompositeDisposable compositeDisposable) {
        this(new C5274a(compositeDisposable), new C5297l(compositeDisposable), new C5338i(compositeDisposable), new C5281a(compositeDisposable), new C5299b(compositeDisposable), compositeDisposable);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m17801b(C4831f fVar) throws Exception {
        return Boolean.valueOf(fVar != C5253h.f12616Y.mo16794a());
    }

    /* renamed from: c */
    public boolean mo17018c(int i) {
        if (!this.f12733a.contains(Integer.valueOf(i))) {
            return false;
        }
        this.f12725S.onNext(Integer.valueOf(i));
        return true;
    }

    /* renamed from: e */
    public void mo17028e(boolean z) {
        this.f12780z.onNext(Boolean.valueOf(z));
    }

    /* renamed from: f */
    public void mo17033f(boolean z) {
        this.f12740d0.onNext(Boolean.valueOf(z));
    }

    /* renamed from: g */
    public void mo17037g(long j) {
        this.f12777w.onNext(Long.valueOf(j));
    }

    /* renamed from: h */
    public void mo17040h() {
        this.f12763p.onNext(f12706w0);
    }

    /* renamed from: i */
    public void mo17045i(long j) {
        this.f12737c.onNext(Long.valueOf(j));
    }

    /* renamed from: j */
    public C5281a mo17047j() {
        return this.f12770s0;
    }

    public C5300m(C5274a aVar, C5297l lVar, C5338i iVar, C5281a aVar2, C5299b bVar, CompositeDisposable compositeDisposable) {
        this(aVar, lVar, iVar, aVar2, bVar, compositeDisposable, new C5325v());
    }

    /* renamed from: a */
    private <T> Observable<T> m17794a(Observable<T> observable) {
        return m17796a(observable, this.f12776v0);
    }

    /* renamed from: b */
    public void mo17008b(C5298a aVar) {
        this.f12710D.onNext(aVar);
    }

    /* renamed from: d */
    public void mo17020d() {
        this.f12761o.onNext(Boolean.valueOf(false));
    }

    /* renamed from: e */
    public void mo17026e(int i) {
        this.f12778x.onNext(Integer.valueOf(i));
    }

    /* renamed from: f */
    public void mo17031f(int i) {
        this.f12779y.onNext(Integer.valueOf(i));
    }

    /* renamed from: g */
    public void mo17038g(boolean z) {
        this.f12752j0.onNext(Boolean.valueOf(z));
    }

    /* renamed from: h */
    public void mo17042h(long j) {
        this.f12707A.onNext(Long.valueOf(j));
    }

    public C5300m(C5274a aVar, C5297l lVar, C5338i iVar, C5281a aVar2, C5299b bVar, CompositeDisposable compositeDisposable, C5325v vVar) {
        this.f12733a = new HashSet();
        this.f12735b = C11976a.m38563p();
        this.f12737c = C11976a.m38563p();
        this.f12739d = C11976a.m38563p();
        this.f12741e = C11976a.m38563p();
        this.f12743f = PublishSubject.m38553q();
        this.f12745g = PublishSubject.m38553q();
        this.f12747h = C11976a.m38563p();
        this.f12749i = C11976a.m38563p();
        this.f12751j = C11976a.m38563p();
        this.f12753k = C11976a.m38563p();
        this.f12755l = C11976a.m38563p();
        this.f12757m = C11976a.m38562e(Boolean.valueOf(true));
        this.f12759n = C11976a.m38563p();
        this.f12761o = C11976a.m38563p();
        this.f12763p = PublishSubject.m38553q();
        this.f12765q = C11976a.m38563p();
        this.f12767r = PublishSubject.m38553q();
        this.f12769s = PublishSubject.m38553q();
        this.f12771t = C11976a.m38563p();
        this.f12773u = PublishSubject.m38553q();
        this.f12775v = PublishSubject.m38553q();
        this.f12777w = C11976a.m38563p();
        this.f12778x = C11976a.m38563p();
        this.f12779y = C11976a.m38563p();
        this.f12780z = C11976a.m38563p();
        this.f12707A = C11976a.m38563p();
        this.f12708B = C11976a.m38563p();
        this.f12709C = C11976a.m38563p();
        this.f12710D = C11976a.m38563p();
        this.f12711E = C11976a.m38563p();
        this.f12712F = C11976a.m38563p();
        this.f12713G = PublishSubject.m38553q();
        this.f12714H = PublishSubject.m38553q();
        this.f12715I = PublishSubject.m38553q();
        this.f12716J = C11976a.m38563p();
        this.f12717K = PublishSubject.m38553q();
        this.f12718L = PublishSubject.m38553q();
        this.f12719M = PublishSubject.m38553q();
        this.f12720N = PublishSubject.m38553q();
        this.f12721O = PublishSubject.m38553q();
        this.f12722P = PublishSubject.m38553q();
        this.f12723Q = PublishSubject.m38553q();
        this.f12724R = PublishSubject.m38553q();
        this.f12725S = PublishSubject.m38553q();
        this.f12726T = PublishSubject.m38553q();
        this.f12727U = PublishSubject.m38553q();
        this.f12728V = PublishSubject.m38553q();
        this.f12729W = PublishSubject.m38553q();
        this.f12730X = PublishSubject.m38553q();
        this.f12731Y = PublishSubject.m38553q();
        this.f12732Z = PublishSubject.m38553q();
        this.f12734a0 = PublishSubject.m38553q();
        this.f12736b0 = PublishSubject.m38553q();
        this.f12738c0 = PublishSubject.m38553q();
        this.f12740d0 = PublishSubject.m38553q();
        this.f12742e0 = C11976a.m38563p();
        this.f12744f0 = C11976a.m38563p();
        this.f12746g0 = C11976a.m38563p();
        this.f12748h0 = C11976a.m38563p();
        this.f12750i0 = PublishSubject.m38553q();
        this.f12752j0 = C11976a.m38563p();
        this.f12754k0 = C11976a.m38563p();
        this.f12756l0 = C11976a.m38563p();
        this.f12758m0 = PublishSubject.m38553q();
        this.f12760n0 = PublishSubject.m38553q();
        this.f12762o0 = C11976a.m38563p();
        this.f12776v0 = compositeDisposable;
        this.f12764p0 = aVar;
        this.f12766q0 = lVar;
        this.f12770s0 = aVar2;
        this.f12768r0 = iVar;
        this.f12772t0 = bVar;
        this.f12774u0 = vVar;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m17800a(C5302b bVar) throws Exception {
        return bVar == C5302b.START;
    }

    /* renamed from: b */
    public void mo17006b(C4946g gVar) {
        this.f12732Z.onNext(gVar);
    }

    /* renamed from: c */
    public void mo17017c(boolean z) {
        this.f12753k.onNext(Boolean.valueOf(z));
    }

    /* renamed from: d */
    public void mo17021d(long j) {
        this.f12741e.onNext(Long.valueOf(j));
    }

    /* renamed from: e */
    public void mo17025e() {
        this.f12750i0.onNext(C5253h.f12616Y.mo16794a());
    }

    /* renamed from: f */
    public void mo17032f(long j) {
        this.f12712F.onNext(Long.valueOf(j));
    }

    /* renamed from: g */
    public void mo17035g() {
        this.f12776v0.mo30247a();
    }

    /* renamed from: a */
    static Observable<Integer> m17795a(Observable<Object> observable, C5325v vVar) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        return observable.mo30193g(new C4834b(vVar)).mo30149a((C11947c<T, T, T>) new C4939d<T,T,T>(atomicInteger)).mo30193g(new C4959g(atomicInteger));
    }

    /* renamed from: b */
    public boolean mo17013b(KeyEvent keyEvent) {
        return mo17023d(keyEvent.getKeyCode());
    }

    /* renamed from: c */
    public void mo17016c(long j) {
        this.f12711E.onNext(Long.valueOf(j));
    }

    /* renamed from: d */
    public void mo17022d(boolean z) {
        this.f12771t.onNext(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo17012b(boolean z) {
        this.f12755l.onNext(Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo17003b() {
        this.f12761o.onNext(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public void mo17007b(C5291e eVar) {
        this.f12716J.onNext(eVar);
    }

    /* renamed from: b */
    public void mo17004b(int i) {
        this.f12719M.onNext(Integer.valueOf(i));
    }

    /* renamed from: a */
    static /* synthetic */ Long m17799a(AtomicInteger atomicInteger, Long l, Long l2) throws Exception {
        if (l2.longValue() - l.longValue() <= 1000) {
            atomicInteger.incrementAndGet();
        } else {
            atomicInteger.set(1);
        }
        return l2;
    }

    /* renamed from: b */
    public void mo17010b(String str) {
        this.f12775v.onNext(new C5301a(str, false, false));
    }

    /* renamed from: b */
    public void mo17005b(long j) {
        this.f12708B.onNext(Long.valueOf(j));
    }

    /* renamed from: b */
    public void mo17011b(List<C4956a> list) {
        this.f12713G.onNext(list);
    }

    /* renamed from: b */
    public void mo17009b(Disposable disposable) {
        if (disposable != null) {
            this.f12776v0.mo30251c(disposable);
            disposable.dispose();
        }
    }

    /* renamed from: a */
    public void mo17000a(int... iArr) {
        for (int valueOf : iArr) {
            this.f12733a.add(Integer.valueOf(valueOf));
        }
    }

    /* renamed from: a */
    public void mo16998a(Set<Integer> set) {
        this.f12733a.addAll(set);
    }

    /* renamed from: a */
    public void mo16993a(C5298a aVar) {
        this.f12709C.onNext(aVar);
    }

    /* renamed from: a */
    public void mo16990a(C4946g gVar) {
        this.f12734a0.onNext(gVar);
    }

    /* renamed from: a */
    public boolean mo17001a(KeyEvent keyEvent) {
        return mo17018c(keyEvent.getKeyCode());
    }

    /* renamed from: a */
    public void mo16985a(long j) {
        this.f12762o0.onNext(Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo16996a(Throwable th) {
        this.f12718L.onNext(th);
    }

    /* renamed from: a */
    public void mo16987a(Uri uri) {
        this.f12767r.onNext(uri);
    }

    /* renamed from: a */
    public void mo16999a(boolean z) {
        this.f12743f.onNext(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void mo16983a(float f) {
        this.f12765q.onNext(Float.valueOf(f));
    }

    /* renamed from: a */
    public void mo16991a(C5275b bVar) {
        this.f12764p0.accept(bVar);
    }

    /* renamed from: a */
    public void mo16986a(long j, long j2) {
        this.f12724R.onNext(new C5305c(j, j2));
    }

    /* renamed from: a */
    public void mo16995a(String str) {
        this.f12775v.onNext(new C5301a(str, true, false));
    }

    /* renamed from: a */
    public void mo16997a(List<C4956a> list) {
        this.f12714H.onNext(list);
    }

    /* renamed from: a */
    public void mo16989a(C4831f fVar) {
        this.f12750i0.onNext(fVar);
    }

    /* renamed from: a */
    public void mo16984a(int i) {
        this.f12758m0.onNext(Integer.valueOf(i));
    }

    /* renamed from: a */
    public void mo16988a(MotionEvent motionEvent) {
        this.f12760n0.onNext(motionEvent);
    }

    /* renamed from: a */
    public Disposable mo16982a(C4922v2 v2Var) {
        return new C4930x2(this).mo16336a(v2Var);
    }

    /* renamed from: a */
    public void mo16994a(Disposable disposable) {
        this.f12776v0.mo30250b(disposable);
    }

    /* renamed from: a */
    public C5338i mo16981a() {
        return this.f12768r0;
    }

    /* renamed from: a */
    public void mo16992a(C5291e eVar) {
        this.f12717K.onNext(eVar);
    }
}
