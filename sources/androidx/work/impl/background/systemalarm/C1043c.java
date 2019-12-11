package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C1034h;
import androidx.work.impl.p008l.C1078d;
import androidx.work.impl.p011m.C1111j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: ConstraintsCommandHandler */
class C1043c {

    /* renamed from: e */
    private static final String f4099e = C1034h.m5551a("ConstraintsCmdHandler");

    /* renamed from: a */
    private final Context f4100a;

    /* renamed from: b */
    private final int f4101b;

    /* renamed from: c */
    private final C1045e f4102c;

    /* renamed from: d */
    private final C1078d f4103d = new C1078d(this.f4100a, null);

    C1043c(Context context, int i, C1045e eVar) {
        this.f4100a = context;
        this.f4101b = i;
        this.f4102c = eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5721a() {
        List<C1111j> a = this.f4102c.mo5731c().mo5779g().mo5705d().mo5868a();
        ConstraintProxy.m5588a(this.f4100a, a);
        this.f4103d.mo5805c(a);
        ArrayList<C1111j> arrayList = new ArrayList<>(a.size());
        long currentTimeMillis = System.currentTimeMillis();
        for (C1111j jVar : a) {
            String str = jVar.f4280a;
            if (currentTimeMillis >= jVar.mo5849a() && (!jVar.mo5853b() || this.f4103d.mo5803a(str))) {
                arrayList.add(jVar);
            }
        }
        for (C1111j jVar2 : arrayList) {
            String str2 = jVar2.f4280a;
            Intent a2 = C1042b.m5596a(this.f4100a, str2);
            C1034h.m5550a().mo5697a(f4099e, String.format("Creating a delay_met command for workSpec with id (%s)", new Object[]{str2}), new Throwable[0]);
            C1045e eVar = this.f4102c;
            eVar.mo5728a((Runnable) new C1047b(eVar, a2, this.f4101b));
        }
        this.f4103d.mo5801a();
    }
}
