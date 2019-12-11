package androidx.work.impl.p008l.p009e;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1034h;
import androidx.work.C1036i;
import androidx.work.impl.p008l.C1076b;
import androidx.work.impl.p008l.p010f.C1097g;
import androidx.work.impl.p011m.C1111j;

/* renamed from: androidx.work.impl.l.e.f */
/* compiled from: NetworkNotRoamingController */
public class C1085f extends C1081c<C1076b> {

    /* renamed from: e */
    private static final String f4242e = C1034h.m5551a("NetworkNotRoamingCtrlr");

    public C1085f(Context context) {
        super(C1097g.m5799a(context).mo5834c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5806a(C1111j jVar) {
        return jVar.f4289j.mo5668b() == C1036i.NOT_ROAMING;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5808b(C1076b bVar) {
        boolean z = true;
        if (VERSION.SDK_INT < 24) {
            C1034h.m5550a().mo5697a(f4242e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !bVar.mo5794a();
        }
        if (bVar.mo5794a() && bVar.mo5796c()) {
            z = false;
        }
        return z;
    }
}
