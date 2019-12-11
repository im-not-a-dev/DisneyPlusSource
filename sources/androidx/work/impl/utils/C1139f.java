package androidx.work.impl.utils;

import androidx.work.WorkerParameters.C1023a;
import androidx.work.impl.C1068h;

/* renamed from: androidx.work.impl.utils.f */
/* compiled from: StartWorkRunnable */
public class C1139f implements Runnable {

    /* renamed from: U */
    private String f4338U;

    /* renamed from: V */
    private C1023a f4339V;

    /* renamed from: c */
    private C1068h f4340c;

    public C1139f(C1068h hVar, String str, C1023a aVar) {
        this.f4340c = hVar;
        this.f4338U = str;
        this.f4339V = aVar;
    }

    public void run() {
        this.f4340c.mo5776e().mo5752a(this.f4338U, this.f4339V);
    }
}
