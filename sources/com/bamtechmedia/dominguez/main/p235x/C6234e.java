package com.bamtechmedia.dominguez.main.p235x;

import com.bamtechmedia.dominguez.main.p235x.C6219d.C6222c;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6223d;
import com.bamtechmedia.dominguez.main.p235x.C6219d.C6231l;
import kotlin.jvm.internal.C12880j;
import p520io.reactivex.C11907a;
import p520io.reactivex.Flowable;
import p520io.reactivex.subjects.C11976a;

/* renamed from: com.bamtechmedia.dominguez.main.x.e */
/* compiled from: MainActivityStateHolder.kt */
public final class C6234e {

    /* renamed from: a */
    private final C11976a<C6219d> f14271a;

    public C6234e() {
        this(null, 1, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2 != null) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6234e(com.bamtechmedia.dominguez.main.p235x.C6219d r2) {
        /*
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L_0x000c
            io.reactivex.subjects.a r2 = p520io.reactivex.subjects.C11976a.m38562e(r2)
            if (r2 == 0) goto L_0x000c
            goto L_0x0015
        L_0x000c:
            io.reactivex.subjects.a r2 = p520io.reactivex.subjects.C11976a.m38563p()
            java.lang.String r0 = "BehaviorSubject.create()"
            kotlin.jvm.internal.C12880j.m40222a(r2, r0)
        L_0x0015:
            r1.f14271a = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bamtechmedia.dominguez.main.p235x.C6234e.<init>(com.bamtechmedia.dominguez.main.x.d):void");
    }

    /* renamed from: a */
    public final C6219d mo18827a() {
        return (C6219d) this.f14271a.mo30311o();
    }

    /* renamed from: b */
    public final boolean mo18830b() {
        return mo18827a() != null && !(mo18827a() instanceof C6223d) && !(mo18827a() instanceof C6222c) && !(mo18827a() instanceof C6231l);
    }

    /* renamed from: c */
    public final Flowable<C6219d> mo18831c() {
        Flowable<C6219d> a = this.f14271a.mo30135a(C11907a.LATEST);
        C12880j.m40222a((Object) a, "subject.toFlowable(LATEST)");
        return a;
    }

    /* renamed from: a */
    public final void mo18829a(C6219d dVar) {
        this.f14271a.onNext(mo18828a((C6219d) this.f14271a.mo30311o(), dVar));
    }

    public /* synthetic */ C6234e(C6219d dVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            dVar = null;
        }
        this(dVar);
    }

    /* renamed from: a */
    public final C6219d mo18828a(C6219d dVar, C6219d dVar2) {
        boolean z = dVar2 instanceof C6223d;
        if (z) {
            C6223d dVar3 = (C6223d) dVar2;
            if (dVar3.mo18818a() && dVar3.mo18819b() != null) {
                return dVar3.mo18819b();
            }
        }
        if (z) {
            C6223d dVar4 = (C6223d) dVar2;
            if (!(dVar instanceof C6223d)) {
                dVar = null;
            }
            C6223d dVar5 = (C6223d) dVar;
            return C6223d.m19715a(dVar4, dVar5 != null ? dVar5.mo18819b() : null, false, 2, null);
        }
        if (dVar instanceof C6223d) {
            C6223d dVar6 = (C6223d) dVar;
            if (!dVar6.mo18818a()) {
                C6219d b = dVar6.mo18819b();
                return (b == null || b.mo18812a(dVar2)) ? C6223d.m19715a(dVar6, dVar2, false, 2, null) : dVar6;
            }
        }
        return (dVar == null || dVar.mo18812a(dVar2)) ? dVar2 : dVar;
    }
}
