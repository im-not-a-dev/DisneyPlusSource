package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C9678a.C9681c;
import com.google.android.gms.common.api.C9678a.C9689f;
import com.google.android.gms.common.api.C9810l;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.u1 */
public final class C9792u1 {

    /* renamed from: d */
    public static final Status f22975d = new Status(8, "The connection to Google Play services was lost");

    /* renamed from: e */
    private static final BasePendingResult<?>[] f22976e = new BasePendingResult[0];

    /* renamed from: a */
    final Set<BasePendingResult<?>> f22977a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b */
    private final C9801x1 f22978b = new C9795v1(this);

    /* renamed from: c */
    private final Map<C9681c<?>, C9689f> f22979c;

    public C9792u1(Map<C9681c<?>, C9689f> map) {
        this.f22979c = map;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo25248a(BasePendingResult<? extends C9810l> basePendingResult) {
        this.f22977a.add(basePendingResult);
        basePendingResult.mo25085a(this.f22978b);
    }

    /* renamed from: b */
    public final void mo25249b() {
        for (BasePendingResult b : (BasePendingResult[]) this.f22977a.toArray(f22976e)) {
            b.mo25087b(f22975d);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.common.api.m, com.google.android.gms.common.api.s, com.google.android.gms.common.api.internal.v1, com.google.android.gms.common.api.internal.x1] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v0, types: [com.google.android.gms.common.api.m, com.google.android.gms.common.api.s, com.google.android.gms.common.api.internal.v1, com.google.android.gms.common.api.internal.x1]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [com.google.android.gms.common.api.internal.x1, com.google.android.gms.common.api.m, com.google.android.gms.common.api.s, com.google.android.gms.common.api.internal.v1]
      mth insns count: 47
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25247a() {
        /*
            r8 = this;
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r0 = r8.f22977a
            com.google.android.gms.common.api.internal.BasePendingResult<?>[] r1 = f22976e
            java.lang.Object[] r0 = r0.toArray(r1)
            com.google.android.gms.common.api.internal.BasePendingResult[] r0 = (com.google.android.gms.common.api.internal.BasePendingResult[]) r0
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x000d:
            if (r3 >= r1) goto L_0x0088
            r4 = r0[r3]
            r5 = 0
            r4.mo25085a(r5)
            java.lang.Integer r6 = r4.mo25090d()
            if (r6 != 0) goto L_0x0027
            boolean r5 = r4.mo25091e()
            if (r5 == 0) goto L_0x0085
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f22977a
            r5.remove(r4)
            goto L_0x0085
        L_0x0027:
            r4.mo25081a(r5)
            java.util.Map<com.google.android.gms.common.api.a$c<?>, com.google.android.gms.common.api.a$f> r6 = r8.f22979c
            r7 = r4
            com.google.android.gms.common.api.internal.c r7 = (com.google.android.gms.common.api.internal.C9718c) r7
            com.google.android.gms.common.api.a$c r7 = r7.mo25126h()
            java.lang.Object r6 = r6.get(r7)
            com.google.android.gms.common.api.a$f r6 = (com.google.android.gms.common.api.C9678a.C9689f) r6
            android.os.IBinder r6 = r6.mo25036m()
            boolean r7 = r4.mo25089c()
            if (r7 == 0) goto L_0x004c
            com.google.android.gms.common.api.internal.w1 r7 = new com.google.android.gms.common.api.internal.w1
            r7.<init>(r4, r5, r6, r5)
            r4.mo25085a(r7)
            goto L_0x0080
        L_0x004c:
            if (r6 == 0) goto L_0x006f
            boolean r7 = r6.isBinderAlive()
            if (r7 == 0) goto L_0x006f
            com.google.android.gms.common.api.internal.w1 r7 = new com.google.android.gms.common.api.internal.w1
            r7.<init>(r4, r5, r6, r5)
            r4.mo25085a(r7)
            r6.linkToDeath(r7, r2)     // Catch:{ RemoteException -> 0x0060 }
            goto L_0x0080
        L_0x0060:
            r4.mo25084a()
            java.lang.Integer r6 = r4.mo25090d()
            int r6 = r6.intValue()
            r5.mo25265a(r6)
            goto L_0x0080
        L_0x006f:
            r4.mo25085a(r5)
            r4.mo25084a()
            java.lang.Integer r6 = r4.mo25090d()
            int r6 = r6.intValue()
            r5.mo25265a(r6)
        L_0x0080:
            java.util.Set<com.google.android.gms.common.api.internal.BasePendingResult<?>> r5 = r8.f22977a
            r5.remove(r4)
        L_0x0085:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C9792u1.mo25247a():void");
    }
}
