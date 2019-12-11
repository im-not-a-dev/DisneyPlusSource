package androidx.work.impl.p008l.p009e;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.C1036i;
import androidx.work.impl.p008l.C1076b;
import androidx.work.impl.p008l.p010f.C1097g;
import androidx.work.impl.p011m.C1111j;

/* renamed from: androidx.work.impl.l.e.d */
/* compiled from: NetworkConnectedController */
public class C1083d extends C1081c<C1076b> {
    public C1083d(Context context) {
        super(C1097g.m5799a(context).mo5834c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5806a(C1111j jVar) {
        return jVar.f4289j.mo5668b() == C1036i.CONNECTED;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5808b(C1076b bVar) {
        boolean z = true;
        if (VERSION.SDK_INT < 26) {
            return !bVar.mo5794a();
        }
        if (bVar.mo5794a() && bVar.mo5797d()) {
            z = false;
        }
        return z;
    }
}
