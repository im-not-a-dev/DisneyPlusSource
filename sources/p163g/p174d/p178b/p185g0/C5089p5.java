package p163g.p174d.p178b.p185g0;

import android.widget.TextView;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p196m0.C5306d;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.p5 */
/* compiled from: TotalTimeTextViewDelegate */
public class C5089p5 implements C5271z3 {

    /* renamed from: U */
    private boolean f12390U;

    /* renamed from: V */
    private long f12391V;

    /* renamed from: W */
    private long f12392W;

    /* renamed from: X */
    private long f12393X;

    /* renamed from: c */
    private TextView f12394c;

    public C5089p5(TextView textView, boolean z, C5300m mVar) {
        this.f12394c = textView;
        this.f12390U = z;
        if (textView != null) {
            mVar.mo16963P().mo30192f((Consumer<? super T>) new C5084p0<Object>(this));
            mVar.mo16935B().mo30192f((Consumer<? super T>) new C4980c3<Object>(this));
            mVar.mo17081z0().mo30192f((Consumer<? super T>) new C5093q2<Object>(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16572a(Long l) {
        this.f12393X = l.longValue();
        m17375a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo16573b(long j) {
        this.f12391V = j;
        m17375a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16571a(long j) {
        this.f12392W = j;
        m17375a();
    }

    /* renamed from: a */
    private void m17375a() {
        long j = this.f12392W;
        long j2 = this.f12393X;
        if (0 < j2 && j2 < j) {
            j = j2;
        }
        this.f12394c.setText(C5306d.m17959a(j - this.f12391V, this.f12390U));
    }
}
