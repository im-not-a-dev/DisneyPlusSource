package p163g.p174d.p178b.p185g0;

import android.view.View;
import java.util.List;
import p163g.p174d.p178b.C5300m;
import p163g.p174d.p178b.p196m0.C5311f;
import p520io.reactivex.functions.Consumer;

/* renamed from: g.d.b.g0.m4 */
/* compiled from: LiveAndVodViewsDelegate */
public class C5065m4 implements C5271z3 {

    /* renamed from: U */
    private final List<View> f12349U;

    /* renamed from: c */
    private final List<View> f12350c;

    public C5065m4(List<View> list, List<View> list2, C5300m mVar) {
        this.f12350c = list;
        this.f12349U = list2;
        if (list != null || list2 != null) {
            mVar.mo16959N().mo30192f((Consumer<? super T>) new C5158u1<Object>(this));
        }
    }

    /* renamed from: a */
    public void mo16545a(boolean z) {
        int i = 0;
        C5311f.m17967a(this.f12350c, z ? 0 : 8);
        List<View> list = this.f12349U;
        if (z) {
            i = 8;
        }
        C5311f.m17967a(list, i);
    }
}
