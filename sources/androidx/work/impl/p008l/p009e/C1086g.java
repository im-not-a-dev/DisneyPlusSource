package androidx.work.impl.p008l.p009e;

import android.content.Context;
import androidx.work.C1036i;
import androidx.work.impl.p008l.C1076b;
import androidx.work.impl.p008l.p010f.C1097g;
import androidx.work.impl.p011m.C1111j;

/* renamed from: androidx.work.impl.l.e.g */
/* compiled from: NetworkUnmeteredController */
public class C1086g extends C1081c<C1076b> {
    public C1086g(Context context) {
        super(C1097g.m5799a(context).mo5834c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5806a(C1111j jVar) {
        return jVar.f4289j.mo5668b() == C1036i.UNMETERED;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5808b(C1076b bVar) {
        return !bVar.mo5794a() || bVar.mo5795b();
    }
}
