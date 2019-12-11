package androidx.work.impl.p008l;

import android.content.Context;
import androidx.work.C1034h;
import androidx.work.impl.p008l.p009e.C1079a;
import androidx.work.impl.p008l.p009e.C1080b;
import androidx.work.impl.p008l.p009e.C1081c;
import androidx.work.impl.p008l.p009e.C1081c.C1082a;
import androidx.work.impl.p008l.p009e.C1083d;
import androidx.work.impl.p008l.p009e.C1084e;
import androidx.work.impl.p008l.p009e.C1085f;
import androidx.work.impl.p008l.p009e.C1086g;
import androidx.work.impl.p008l.p009e.C1087h;
import androidx.work.impl.p011m.C1111j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.l.d */
/* compiled from: WorkConstraintsTracker */
public class C1078d implements C1082a {

    /* renamed from: d */
    private static final String f4233d = C1034h.m5551a("WorkConstraintsTracker");

    /* renamed from: a */
    private final C1077c f4234a;

    /* renamed from: b */
    private final C1081c[] f4235b;

    /* renamed from: c */
    private final Object f4236c = new Object();

    public C1078d(Context context, C1077c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4234a = cVar;
        this.f4235b = new C1081c[]{new C1079a(applicationContext), new C1080b(applicationContext), new C1087h(applicationContext), new C1083d(applicationContext), new C1086g(applicationContext), new C1085f(applicationContext), new C1084e(applicationContext)};
    }

    /* renamed from: a */
    public void mo5801a() {
        synchronized (this.f4236c) {
            for (C1081c a : this.f4235b) {
                a.mo5810a();
            }
        }
    }

    /* renamed from: b */
    public void mo5804b(List<String> list) {
        synchronized (this.f4236c) {
            if (this.f4234a != null) {
                this.f4234a.mo5724a(list);
            }
        }
    }

    /* renamed from: c */
    public void mo5805c(List<C1111j> list) {
        synchronized (this.f4236c) {
            for (C1081c a : this.f4235b) {
                a.mo5811a((C1082a) null);
            }
            for (C1081c a2 : this.f4235b) {
                a2.mo5812a(list);
            }
            for (C1081c a3 : this.f4235b) {
                a3.mo5811a((C1082a) this);
            }
        }
    }

    /* renamed from: a */
    public boolean mo5803a(String str) {
        C1081c[] cVarArr;
        synchronized (this.f4236c) {
            for (C1081c cVar : this.f4235b) {
                if (cVar.mo5813a(str)) {
                    C1034h.m5550a().mo5697a(f4233d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public void mo5802a(List<String> list) {
        synchronized (this.f4236c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (mo5803a(str)) {
                    C1034h.m5550a().mo5697a(f4233d, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            if (this.f4234a != null) {
                this.f4234a.mo5725b(arrayList);
            }
        }
    }
}
