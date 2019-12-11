package androidx.work.impl.utils;

import androidx.work.Operation;
import androidx.work.Operation.State.C1016a;
import androidx.work.WorkInfo.State;
import androidx.work.impl.C1040b;
import androidx.work.impl.C1060d;
import androidx.work.impl.C1061e;
import androidx.work.impl.C1068h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.p011m.C1099b;
import androidx.work.impl.p011m.C1115k;
import java.util.LinkedList;
import java.util.UUID;

/* renamed from: androidx.work.impl.utils.a */
/* compiled from: CancelWorkRunnable */
public abstract class C1132a implements Runnable {

    /* renamed from: c */
    private final C1040b f4323c = new C1040b();

    /* renamed from: androidx.work.impl.utils.a$a */
    /* compiled from: CancelWorkRunnable */
    static class C1133a extends C1132a {

        /* renamed from: U */
        final /* synthetic */ C1068h f4324U;

        /* renamed from: V */
        final /* synthetic */ UUID f4325V;

        C1133a(C1068h hVar, UUID uuid) {
            this.f4324U = hVar;
            this.f4325V = uuid;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5898b() {
            WorkDatabase g = this.f4324U.mo5779g();
            g.beginTransaction();
            try {
                mo5897a(this.f4324U, this.f4325V.toString());
                g.setTransactionSuccessful();
                g.endTransaction();
                mo5896a(this.f4324U);
            } catch (Throwable th) {
                g.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.a$b */
    /* compiled from: CancelWorkRunnable */
    static class C1134b extends C1132a {

        /* renamed from: U */
        final /* synthetic */ C1068h f4326U;

        /* renamed from: V */
        final /* synthetic */ String f4327V;

        /* renamed from: W */
        final /* synthetic */ boolean f4328W;

        C1134b(C1068h hVar, String str, boolean z) {
            this.f4326U = hVar;
            this.f4327V = str;
            this.f4328W = z;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5898b() {
            WorkDatabase g = this.f4326U.mo5779g();
            g.beginTransaction();
            try {
                for (String a : g.mo5705d().mo5877c(this.f4327V)) {
                    mo5897a(this.f4326U, a);
                }
                g.setTransactionSuccessful();
                g.endTransaction();
                if (this.f4328W) {
                    mo5896a(this.f4326U);
                }
            } catch (Throwable th) {
                g.endTransaction();
                throw th;
            }
        }
    }

    /* renamed from: a */
    public Operation mo5895a() {
        return this.f4323c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo5898b();

    public void run() {
        try {
            mo5898b();
            this.f4323c.mo5714a(Operation.f4003a);
        } catch (Throwable th) {
            this.f4323c.mo5714a(new C1016a(th));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5897a(C1068h hVar, String str) {
        m5896a(hVar.mo5779g(), str);
        hVar.mo5776e().mo5756d(str);
        for (C1060d a : hVar.mo5778f()) {
            a.mo5737a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5896a(C1068h hVar) {
        C1061e.m5661a(hVar.mo5773c(), hVar.mo5779g(), hVar.mo5778f());
    }

    /* renamed from: a */
    private void m5896a(WorkDatabase workDatabase, String str) {
        C1115k d = workDatabase.mo5705d();
        C1099b a = workDatabase.mo5702a();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            State e = d.mo5880e(str2);
            if (!(e == State.SUCCEEDED || e == State.FAILED)) {
                d.mo5866a(State.CANCELLED, str2);
            }
            linkedList.addAll(a.mo5836a(str2));
        }
    }

    /* renamed from: a */
    public static C1132a m5895a(UUID uuid, C1068h hVar) {
        return new C1133a(hVar, uuid);
    }

    /* renamed from: a */
    public static C1132a m5894a(String str, C1068h hVar, boolean z) {
        return new C1134b(hVar, str, z);
    }
}
