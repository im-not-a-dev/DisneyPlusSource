package androidx.work.impl.p006k.p007a;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.C1034h;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1039a;
import androidx.work.impl.C1060d;
import androidx.work.impl.C1068h;
import androidx.work.impl.p008l.C1077c;
import androidx.work.impl.p008l.C1078d;
import androidx.work.impl.p011m.C1111j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.k.a.a */
/* compiled from: GreedyScheduler */
public class C1074a implements C1060d, C1077c, C1039a {

    /* renamed from: Y */
    private static final String f4223Y = C1034h.m5551a("GreedyScheduler");

    /* renamed from: U */
    private C1078d f4224U;

    /* renamed from: V */
    private List<C1111j> f4225V = new ArrayList();

    /* renamed from: W */
    private boolean f4226W;

    /* renamed from: X */
    private final Object f4227X;

    /* renamed from: c */
    private C1068h f4228c;

    public C1074a(Context context, C1068h hVar) {
        this.f4228c = hVar;
        this.f4224U = new C1078d(context, this);
        this.f4227X = new Object();
    }

    /* renamed from: a */
    public void mo5738a(C1111j... jVarArr) {
        m5719a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1111j jVar : jVarArr) {
            if (jVar.f4281b == State.ENQUEUED && !jVar.mo5855d() && jVar.f4286g == 0 && !jVar.mo5854c()) {
                if (!jVar.mo5853b()) {
                    C1034h.m5550a().mo5697a(f4223Y, String.format("Starting work for %s", new Object[]{jVar.f4280a}), new Throwable[0]);
                    this.f4228c.mo5775d(jVar.f4280a);
                } else if (VERSION.SDK_INT < 24 || !jVar.f4289j.mo5675e()) {
                    arrayList.add(jVar);
                    arrayList2.add(jVar.f4280a);
                }
            }
        }
        synchronized (this.f4227X) {
            if (!arrayList.isEmpty()) {
                C1034h.m5550a().mo5697a(f4223Y, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)}), new Throwable[0]);
                this.f4225V.addAll(arrayList);
                this.f4224U.mo5805c(this.f4225V);
            }
        }
    }

    /* renamed from: b */
    public void mo5725b(List<String> list) {
        for (String str : list) {
            C1034h.m5550a().mo5697a(f4223Y, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            this.f4228c.mo5775d(str);
        }
    }

    /* renamed from: b */
    private void m5720b(String str) {
        synchronized (this.f4227X) {
            int size = this.f4225V.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C1111j) this.f4225V.get(i)).f4280a.equals(str)) {
                    C1034h.m5550a().mo5697a(f4223Y, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f4225V.remove(i);
                    this.f4224U.mo5805c(this.f4225V);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo5737a(String str) {
        m5719a();
        C1034h.m5550a().mo5697a(f4223Y, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        this.f4228c.mo5777e(str);
    }

    /* renamed from: a */
    public void mo5724a(List<String> list) {
        for (String str : list) {
            C1034h.m5550a().mo5697a(f4223Y, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.f4228c.mo5777e(str);
        }
    }

    /* renamed from: a */
    public void mo5713a(String str, boolean z) {
        m5720b(str);
    }

    /* renamed from: a */
    private void m5719a() {
        if (!this.f4226W) {
            this.f4228c.mo5776e().mo5750a((C1039a) this);
            this.f4226W = true;
        }
    }
}
