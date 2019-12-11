package p163g.p201e.p203b.p316t;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g.e.b.t.n */
/* compiled from: OptionsTvItemProvider.kt */
public final class C7787n implements C7776e {

    /* renamed from: a */
    private final boolean f16866a;

    public C7787n(boolean z) {
        this.f16866a = z;
    }

    /* renamed from: a */
    public List<C7774c> mo20688a(boolean z) {
        List e = C13185o.m40523e(C7774c.ACCOUNT, C7774c.HELP, C7774c.LEGAL, C7774c.LOG_OUT);
        if (this.f16866a) {
            e.add(C7774c.DEBUG_ABOUT);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            if (!z || ((C7774c) next).mo20687c() == z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
