package p163g.p174d.p178b.p185g0;

import android.widget.TextView;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p196m0.C5306d;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.d5 */
/* compiled from: SeekBarTimeAndElapsedTimeTextViewDelegate */
public class C4989d5 implements C5271z3 {

    /* renamed from: U */
    private final boolean f12252U;

    /* renamed from: V */
    boolean f12253V;

    /* renamed from: W */
    long f12254W;

    /* renamed from: c */
    private final TextView f12255c;

    public C4989d5(TextView textView, boolean z, C5300m mVar) {
        this.f12255c = textView;
        this.f12252U = z;
        if (textView != null) {
            mVar.mo16938C0().mo30192f((Consumer<? super T>) new C5078o2<Object>(this));
            mVar.mo17065r0().mo30192f((Consumer<? super T>) new C5157u0<Object>(this));
            mVar.mo17067s0().mo30192f((Consumer<? super T>) new C5056l2<Object>(this));
            mVar.mo17081z0().mo30192f((Consumer<? super T>) new C5118r0<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16491a(long j) {
        if (!this.f12253V) {
            mo16494c(j - this.f12254W);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16493b(long j) {
        this.f12254W = j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo16494c(long j) {
        this.f12255c.setText(C5306d.m17959a(j, this.f12252U));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo16495d(long j) {
        mo16494c(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16492a(boolean z) {
        this.f12253V = z;
    }
}
