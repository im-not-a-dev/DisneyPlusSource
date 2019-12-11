package p163g.p174d.p178b.p185g0;

import android.net.Uri;
import java.util.List;
import java.util.TreeSet;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.C11968q;
import p520io.reactivex.Observable;
import p520io.reactivex.ObservableSource;
import p520io.reactivex.functions.C11952h;
import p520io.reactivex.functions.Consumer;
import p520io.reactivex.functions.Function;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.p527w.p529c.C11992a;
import p520io.reactivex.subjects.PublishSubject;

/* renamed from: g.d.b.g0.s4 */
/* compiled from: PercentageCompletionDelegate */
public class C5129s4 implements C5271z3 {

    /* renamed from: U */
    private long f12438U;

    /* renamed from: V */
    private TreeSet<Integer> f12439V = new TreeSet<>();

    /* renamed from: W */
    private PublishSubject<Long> f12440W = PublishSubject.m38553q();

    /* renamed from: X */
    Boolean f12441X;

    /* renamed from: c */
    private final C5300m f12442c;

    public C5129s4(List<Integer> list, C5300m mVar) {
        this.f12442c = mVar;
        if (list != null) {
            this.f12439V.addAll(list);
            mVar.mo16959N().mo30192f((Consumer<? super T>) new C4985d1<Object>(this));
            mVar.mo16973U().mo30192f((Consumer<? super T>) new C5091q0<Object>(this));
            mVar.mo16938C0().mo30162a((C11968q<? super T>) this.f12440W);
            mVar.mo16963P().mo30192f((Consumer<? super T>) new C5038j3<Object>(this));
            mVar.mo17019c0().mo30192f((Consumer<? super T>) new C4978c1<Object>(this));
            mVar.mo16994a(mo16616a().mo30192f((Consumer<? super T>) new C4971b1<Object>(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Observable<Integer> mo16621b(Long l) {
        Integer num = (Integer) this.f12439V.floor(Integer.valueOf((int) ((((double) l.longValue()) / ((double) this.f12438U)) * 100.0d)));
        return num == null ? Observable.m38314m() : Observable.m38309b(num);
    }

    /* renamed from: a */
    public /* synthetic */ void mo16619a(Object obj) throws Exception {
        this.f12440W.onNext(Long.valueOf(this.f12438U));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16618a(Uri uri) {
        this.f12440W.onNext(Long.valueOf(-1));
        this.f12441X = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Observable<Integer> mo16616a() {
        return this.f12440W.mo30187e().mo30171b(C11934b.m38502d()).mo30150a((C11952h<? super T>) new C4992e1<Object>(this)).mo30178c((Function<? super T, ? extends ObservableSource<? extends R>>) new C4962a1<Object,Object>(this)).mo30164b().mo30171b(C11992a.m38600a());
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo16620a(Long l) throws Exception {
        if (this.f12438U > 0 && l.longValue() > 0) {
            Boolean bool = this.f12441X;
            if (bool != null && !bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17425a(int i) {
        this.f12442c.mo17036g(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16617a(long j) {
        this.f12438U = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17428a(boolean z) {
        this.f12441X = Boolean.valueOf(z);
    }
}
