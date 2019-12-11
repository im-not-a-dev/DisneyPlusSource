package p163g.p174d.p178b.p185g0;

import android.widget.TextView;
import p163g.p174d.p178b.C5300m;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.n5 */
/* compiled from: TitleTextViewDelegate */
public class C5074n5 implements C5271z3 {

    /* renamed from: c */
    private final TextView f12366c;

    public C5074n5(TextView textView, C5300m mVar) {
        this.f12366c = textView;
        if (textView != null) {
            mVar.mo16940D0().mo30192f((Consumer<? super T>) new C5045k3<Object>(this));
        }
    }

    /* renamed from: a */
    public void mo16557a(String str) {
        this.f12366c.setText(str);
    }
}
