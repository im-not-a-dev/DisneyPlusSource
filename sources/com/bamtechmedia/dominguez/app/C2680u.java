package com.bamtechmedia.dominguez.app;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p520io.reactivex.p525e0.C11934b;
import p520io.reactivex.subjects.C11976a;

/* renamed from: com.bamtechmedia.dominguez.app.u */
/* compiled from: DominguezWorkerFactory.kt */
public final class C2680u extends WorkerFactory {

    /* renamed from: b */
    private final C11976a<Set<WorkerFactory>> f7428b;

    public C2680u() {
        C11976a<Set<WorkerFactory>> p = C11976a.m38563p();
        Intrinsics.checkReturnedValueIsNotNull((Object) p, "BehaviorSubject.create()");
        this.f7428b = p;
    }

    /* renamed from: a */
    public final void mo11719a(Set<WorkerFactory> set) {
        this.f7428b.onNext(C13199w.m40609t(set));
    }

    /* renamed from: a */
    public ListenableWorker mo5648a(Context context, String str, WorkerParameters workerParameters) {
        Object c = this.f7428b.mo30186d().mo30203a(1, TimeUnit.SECONDS, C11934b.m38498a()).mo30224c();
        Intrinsics.checkReturnedValueIsNotNull(c, "subject\n        .firstOr…))\n        .blockingGet()");
        Iterable<WorkerFactory> iterable = (Iterable) c;
        ArrayList arrayList = new ArrayList();
        for (WorkerFactory a : iterable) {
            ListenableWorker a2 = a.mo5648a(context, str, workerParameters);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return (ListenableWorker) C13199w.m40591g((List) arrayList);
    }
}
