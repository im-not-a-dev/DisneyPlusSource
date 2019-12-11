package androidx.work.impl.p008l.p009e;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1034h;
import androidx.work.C1036i;
import androidx.work.impl.p008l.C1076b;
import androidx.work.impl.p008l.p010f.C1097g;
import androidx.work.impl.p011m.C1111j;

/* renamed from: androidx.work.impl.l.e.e */
/* compiled from: NetworkMeteredController */
public class C1084e extends C1081c<C1076b> {

    /* renamed from: e */
    private static final String f4241e = C1034h.m5551a("NetworkMeteredCtrlr");

    public C1084e(Context context) {
        super(C1097g.m5799a(context).mo5834c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5806a(C1111j jVar) {
        return jVar.f4289j.mo5668b() == C1036i.METERED;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5808b(C1076b bVar) {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            C1034h.m5550a().mo5697a(f4241e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.mo5794a();
        }
        if (bVar.mo5794a() && bVar.mo5795b()) {
            z = false;
        }
        return z;
    }
}
