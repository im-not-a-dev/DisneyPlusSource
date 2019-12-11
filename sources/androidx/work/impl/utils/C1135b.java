package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.C1027c;
import androidx.work.C1034h;
import androidx.work.Data.C1011a;
import androidx.work.Operation;
import androidx.work.Operation.State.C1016a;
import androidx.work.impl.C1040b;
import androidx.work.impl.C1060d;
import androidx.work.impl.C1061e;
import androidx.work.impl.C1062f;
import androidx.work.impl.C1068h;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.p011m.C1111j;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;

/* renamed from: androidx.work.impl.utils.b */
/* compiled from: EnqueueRunnable */
public class C1135b implements Runnable {

    /* renamed from: V */
    private static final String f4329V = C1034h.m5551a("EnqueueRunnable");

    /* renamed from: U */
    private final C1040b f4330U = new C1040b();

    /* renamed from: c */
    private final C1062f f4331c;

    public C1135b(C1062f fVar) {
        this.f4331c = fVar;
    }

    /* renamed from: a */
    public boolean mo5900a() {
        WorkDatabase g = this.f4331c.mo5765g().mo5779g();
        g.beginTransaction();
        try {
            boolean b = m5907b(this.f4331c);
            g.setTransactionSuccessful();
            return b;
        } finally {
            g.endTransaction();
        }
    }

    /* renamed from: b */
    public Operation mo5901b() {
        return this.f4330U;
    }

    /* renamed from: c */
    public void mo5902c() {
        C1068h g = this.f4331c.mo5765g();
        C1061e.m5661a(g.mo5773c(), g.mo5779g(), g.mo5778f());
    }

    public void run() {
        try {
            if (!this.f4331c.mo5766h()) {
                if (mo5900a()) {
                    C1137d.m5916a(this.f4331c.mo5765g().mo5772b(), RescheduleReceiver.class, true);
                    mo5902c();
                }
                this.f4330U.mo5714a(Operation.f4003a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", new Object[]{this.f4331c}));
        } catch (Throwable th) {
            this.f4330U.mo5714a(new C1016a(th));
        }
    }

    /* renamed from: b */
    private static boolean m5907b(C1062f fVar) {
        List<C1062f> e = fVar.mo5763e();
        boolean z = false;
        if (e != null) {
            boolean z2 = false;
            for (C1062f fVar2 : e) {
                if (!fVar2.mo5767i()) {
                    z2 |= m5907b(fVar2);
                } else {
                    C1034h.m5550a().mo5701e(f4329V, String.format("Already enqueued work ids (%s).", new Object[]{TextUtils.join(", ", fVar2.mo5761c())}), new Throwable[0]);
                }
            }
            z = z2;
        }
        return m5904a(fVar) | z;
    }

    /* renamed from: a */
    private static boolean m5904a(C1062f fVar) {
        boolean a = m5906a(fVar.mo5765g(), fVar.mo5764f(), (String[]) C1062f.m5662a(fVar).toArray(new String[0]), fVar.mo5762d(), fVar.mo5760b());
        fVar.mo5768j();
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01a8 A[LOOP:6: B:109:0x01a2->B:111:0x01a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01d1 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x011f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m5906a(androidx.work.impl.C1068h r19, java.util.List<? extends androidx.work.C1166l> r20, java.lang.String[] r21, java.lang.String r22, androidx.work.C1032f r23) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = r23
            long r4 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r19.mo5779g()
            r8 = 1
            if (r1 == 0) goto L_0x0018
            int r9 = r1.length
            if (r9 <= 0) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            if (r9 == 0) goto L_0x005d
            int r10 = r1.length
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0020:
            if (r11 >= r10) goto L_0x0060
            r15 = r1[r11]
            androidx.work.impl.m.k r7 = r6.mo5705d()
            androidx.work.impl.m.j r7 = r7.mo5881f(r15)
            if (r7 != 0) goto L_0x0045
            androidx.work.h r0 = androidx.work.C1034h.m5550a()
            java.lang.String r1 = f4329V
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "Prerequisite %s doesn't exist; not enqueuing"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.mo5698b(r1, r2, r4)
            return r3
        L_0x0045:
            androidx.work.WorkInfo$State r7 = r7.f4281b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r7 != r15) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            r12 = r12 & r15
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r7 != r15) goto L_0x0055
            r13 = 1
            goto L_0x005a
        L_0x0055:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r7 != r15) goto L_0x005a
            r14 = 1
        L_0x005a:
            int r11 = r11 + 1
            goto L_0x0020
        L_0x005d:
            r12 = 1
            r13 = 0
            r14 = 0
        L_0x0060:
            boolean r7 = android.text.TextUtils.isEmpty(r22)
            r7 = r7 ^ r8
            if (r7 == 0) goto L_0x006b
            if (r9 != 0) goto L_0x006b
            r10 = 1
            goto L_0x006c
        L_0x006b:
            r10 = 0
        L_0x006c:
            if (r10 == 0) goto L_0x00cc
            androidx.work.impl.m.k r10 = r6.mo5705d()
            java.util.List r10 = r10.mo5874b(r2)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00cc
            androidx.work.f r11 = androidx.work.C1032f.APPEND
            if (r3 != r11) goto L_0x00ce
            androidx.work.impl.m.b r3 = r6.mo5702a()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x008d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            androidx.work.impl.m.j$b r11 = (androidx.work.impl.p011m.C1111j.C1113b) r11
            java.lang.String r15 = r11.f4296a
            boolean r15 = r3.mo5839c(r15)
            if (r15 != 0) goto L_0x00be
            androidx.work.WorkInfo$State r15 = r11.f4297b
            androidx.work.WorkInfo$State r8 = androidx.work.WorkInfo.State.SUCCEEDED
            if (r15 != r8) goto L_0x00a9
            r8 = 1
            goto L_0x00aa
        L_0x00a9:
            r8 = 0
        L_0x00aa:
            r8 = r8 & r12
            androidx.work.WorkInfo$State r12 = r11.f4297b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            if (r12 != r15) goto L_0x00b3
            r13 = 1
            goto L_0x00b8
        L_0x00b3:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            if (r12 != r15) goto L_0x00b8
            r14 = 1
        L_0x00b8:
            java.lang.String r11 = r11.f4296a
            r9.add(r11)
            r12 = r8
        L_0x00be:
            r8 = 1
            goto L_0x008d
        L_0x00c0:
            java.lang.Object[] r1 = r9.toArray(r1)
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r3 = r1.length
            if (r3 <= 0) goto L_0x00cb
            r9 = 1
            goto L_0x00cc
        L_0x00cb:
            r9 = 0
        L_0x00cc:
            r3 = 0
            goto L_0x0113
        L_0x00ce:
            androidx.work.f r8 = androidx.work.C1032f.KEEP
            if (r3 != r8) goto L_0x00ee
            java.util.Iterator r3 = r10.iterator()
        L_0x00d6:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x00ee
            java.lang.Object r8 = r3.next()
            androidx.work.impl.m.j$b r8 = (androidx.work.impl.p011m.C1111j.C1113b) r8
            androidx.work.WorkInfo$State r8 = r8.f4297b
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.ENQUEUED
            if (r8 == r11) goto L_0x00ec
            androidx.work.WorkInfo$State r11 = androidx.work.WorkInfo.State.RUNNING
            if (r8 != r11) goto L_0x00d6
        L_0x00ec:
            r3 = 0
            return r3
        L_0x00ee:
            r3 = 0
            androidx.work.impl.utils.a r8 = androidx.work.impl.utils.C1132a.m5894a(r2, r0, r3)
            r8.run()
            androidx.work.impl.m.k r8 = r6.mo5705d()
            java.util.Iterator r10 = r10.iterator()
        L_0x00fe:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0110
            java.lang.Object r11 = r10.next()
            androidx.work.impl.m.j$b r11 = (androidx.work.impl.p011m.C1111j.C1113b) r11
            java.lang.String r11 = r11.f4296a
            r8.mo5871a(r11)
            goto L_0x00fe
        L_0x0110:
            r16 = 1
            goto L_0x0115
        L_0x0113:
            r16 = 0
        L_0x0115:
            java.util.Iterator r8 = r20.iterator()
        L_0x0119:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01d6
            java.lang.Object r10 = r8.next()
            androidx.work.l r10 = (androidx.work.C1166l) r10
            androidx.work.impl.m.j r11 = r10.mo5953c()
            if (r9 == 0) goto L_0x0140
            if (r12 != 0) goto L_0x0140
            if (r13 == 0) goto L_0x0134
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.FAILED
            r11.f4281b = r15
            goto L_0x0148
        L_0x0134:
            if (r14 == 0) goto L_0x013b
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.CANCELLED
            r11.f4281b = r15
            goto L_0x0148
        L_0x013b:
            androidx.work.WorkInfo$State r15 = androidx.work.WorkInfo.State.BLOCKED
            r11.f4281b = r15
            goto L_0x0148
        L_0x0140:
            boolean r15 = r11.mo5855d()
            if (r15 != 0) goto L_0x014b
            r11.f4293n = r4
        L_0x0148:
            r17 = r4
            goto L_0x0151
        L_0x014b:
            r17 = r4
            r3 = 0
            r11.f4293n = r3
        L_0x0151:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 < r4) goto L_0x015f
            r4 = 25
            if (r3 > r4) goto L_0x015f
            m5903a(r11)
            goto L_0x0170
        L_0x015f:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 22
            if (r3 > r4) goto L_0x0170
            java.lang.String r3 = "androidx.work.impl.background.gcm.GcmScheduler"
            boolean r3 = m5905a(r0, r3)
            if (r3 == 0) goto L_0x0170
            m5903a(r11)
        L_0x0170:
            androidx.work.WorkInfo$State r3 = r11.f4281b
            androidx.work.WorkInfo$State r4 = androidx.work.WorkInfo.State.ENQUEUED
            if (r3 != r4) goto L_0x0178
            r16 = 1
        L_0x0178:
            androidx.work.impl.m.k r3 = r6.mo5705d()
            r3.mo5870a(r11)
            if (r9 == 0) goto L_0x019a
            int r3 = r1.length
            r4 = 0
        L_0x0183:
            if (r4 >= r3) goto L_0x019a
            r5 = r1[r4]
            androidx.work.impl.m.a r11 = new androidx.work.impl.m.a
            java.lang.String r15 = r10.mo5951a()
            r11.<init>(r15, r5)
            androidx.work.impl.m.b r5 = r6.mo5702a()
            r5.mo5837a(r11)
            int r4 = r4 + 1
            goto L_0x0183
        L_0x019a:
            java.util.Set r3 = r10.mo5952b()
            java.util.Iterator r3 = r3.iterator()
        L_0x01a2:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01bf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            androidx.work.impl.m.n r5 = r6.mo5706e()
            androidx.work.impl.m.m r11 = new androidx.work.impl.m.m
            java.lang.String r15 = r10.mo5951a()
            r11.<init>(r4, r15)
            r5.mo5889a(r11)
            goto L_0x01a2
        L_0x01bf:
            if (r7 == 0) goto L_0x01d1
            androidx.work.impl.m.h r3 = r6.mo5704c()
            androidx.work.impl.m.g r4 = new androidx.work.impl.m.g
            java.lang.String r5 = r10.mo5951a()
            r4.<init>(r2, r5)
            r3.mo5847a(r4)
        L_0x01d1:
            r4 = r17
            r3 = 0
            goto L_0x0119
        L_0x01d6:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.C1135b.m5906a(androidx.work.impl.h, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    /* renamed from: a */
    private static void m5903a(C1111j jVar) {
        C1027c cVar = jVar.f4289j;
        if (cVar.mo5677f() || cVar.mo5681i()) {
            String str = jVar.f4282c;
            C1011a aVar = new C1011a();
            aVar.mo5590a(jVar.f4284e);
            aVar.mo5592a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            jVar.f4282c = ConstraintTrackingWorker.class.getName();
            jVar.f4284e = aVar.mo5594a();
        }
    }

    /* renamed from: a */
    private static boolean m5905a(C1068h hVar, String str) {
        try {
            Class cls = Class.forName(str);
            for (C1060d dVar : hVar.mo5778f()) {
                if (cls.isAssignableFrom(dVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }
}
