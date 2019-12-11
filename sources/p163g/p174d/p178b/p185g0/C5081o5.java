package p163g.p174d.p178b.p185g0;

import android.annotation.SuppressLint;
import android.app.Activity;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p183e0.C4952a.C4954b;
import p520io.reactivex.functions.Consumer;
import p598l.p599a.p600a.p601a.C13421a;
import p598l.p599a.p600a.p601a.C13421a.C13424c;

/* renamed from: g.d.b.g0.o5 */
/* compiled from: ToggleSystemBarsDelegate */
public class C5081o5 implements C5271z3, C13424c {

    /* renamed from: U */
    private final C13421a f12375U;

    /* renamed from: V */
    private final boolean f12376V;

    /* renamed from: W */
    private final C4954b f12377W;

    /* renamed from: X */
    private final C4954b f12378X;

    /* renamed from: Y */
    private boolean f12379Y;

    /* renamed from: c */
    private final Activity f12380c;

    /* renamed from: g.d.b.g0.o5$a */
    /* compiled from: ToggleSystemBarsDelegate */
    public static class C5082a {
        /* renamed from: a */
        public C13421a mo16566a(Activity activity, C13424c cVar) {
            return new C13421a(activity, 3, 2, cVar);
        }
    }

    public C5081o5(Activity activity, boolean z, C4954b bVar, C4954b bVar2, C5300m mVar) {
        this(activity, new C5082a(), z, bVar, bVar2, mVar);
    }

    /* renamed from: b */
    private boolean m17361b(int i) {
        if (i == 2 && this.f12378X == C4954b.Hide) {
            return true;
        }
        return i == 1 && this.f12377W == C4954b.Hide;
    }

    /* renamed from: c */
    private boolean m17362c(int i) {
        if (i == 2 && this.f12378X == C4954b.Show) {
            return true;
        }
        return i == 1 && this.f12377W == C4954b.Show;
    }

    /* renamed from: a */
    public void mo16563a(int i) {
        m17360a(this.f12379Y, i);
    }

    /* renamed from: a */
    public void mo16564a(boolean z) {
    }

    @SuppressLint({"CheckResult"})
    C5081o5(Activity activity, C5082a aVar, boolean z, C4954b bVar, C4954b bVar2, C5300m mVar) {
        this.f12380c = activity;
        this.f12375U = aVar.mo16566a(activity, this);
        this.f12376V = z;
        this.f12377W = bVar;
        this.f12378X = bVar2;
        mVar.mo17076x().mo30192f((Consumer<? super T>) new C5053l<Object>(this));
        mVar.mo16978X().mo30192f((Consumer<? super T>) new C5022h3<Object>(this));
        mo16563a(activity.getResources().getConfiguration().orientation);
    }

    /* renamed from: a */
    private void m17360a(boolean z, int i) {
        if (m17362c(i)) {
            this.f12375U.mo34633b();
        } else if (m17361b(i)) {
            this.f12375U.mo34632a();
        } else if (!this.f12376V) {
        } else {
            if (z) {
                this.f12375U.mo34633b();
            } else {
                this.f12375U.mo34632a();
            }
        }
    }

    /* renamed from: b */
    public void mo16565b(boolean z) {
        this.f12379Y = z;
        m17360a(z, this.f12380c.getResources().getConfiguration().orientation);
    }
}
