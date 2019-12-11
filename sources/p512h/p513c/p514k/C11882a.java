package p512h.p513c.p514k;

import android.util.Log;
import androidx.fragment.app.Fragment;
import p512h.p513c.C11871b;
import p512h.p513c.C11880i;
import p512h.p515d.C11897e;

/* renamed from: h.c.k.a */
/* compiled from: AndroidSupportInjection */
public final class C11882a {
    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.fragment.app.d, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.app.Application] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v3, types: [androidx.fragment.app.d, android.app.Activity]
      assigns: [androidx.fragment.app.d, android.app.Application]
      uses: [?[OBJECT, ARRAY], android.app.Activity, java.lang.Object]
      mth insns count: 27
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object m38114a(androidx.fragment.app.Fragment r3) {
        /*
            r0 = r3
        L_0x0001:
            androidx.fragment.app.Fragment r0 = r0.getParentFragment()
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0 instanceof p512h.p513c.C11880i
            if (r1 != 0) goto L_0x000f
            boolean r1 = r0 instanceof p512h.p513c.p514k.C11892k
            if (r1 == 0) goto L_0x0001
        L_0x000f:
            return r0
        L_0x0010:
            androidx.fragment.app.d r0 = r3.getActivity()
            boolean r1 = r0 instanceof p512h.p513c.C11880i
            if (r1 != 0) goto L_0x0044
            boolean r1 = r0 instanceof p512h.p513c.p514k.C11892k
            if (r1 == 0) goto L_0x001d
            goto L_0x0044
        L_0x001d:
            android.app.Application r0 = r0.getApplication()
            boolean r1 = r0 instanceof p512h.p513c.C11880i
            if (r1 != 0) goto L_0x0044
            boolean r1 = r0 instanceof p512h.p513c.p514k.C11892k
            if (r1 == 0) goto L_0x002a
            goto L_0x0044
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getCanonicalName()
            r1[r2] = r3
            java.lang.String r3 = "No injector was found for %s"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p512h.p513c.p514k.C11882a.m38114a(androidx.fragment.app.Fragment):java.lang.Object");
    }

    /* renamed from: b */
    public static void m38115b(Fragment fragment) {
        C11871b bVar;
        C11897e.m38130a(fragment, "fragment");
        Object a = m38114a(fragment);
        if (a instanceof C11880i) {
            bVar = ((C11880i) a).androidInjector();
            C11897e.m38131a(bVar, "%s.androidInjector() returned null", a.getClass());
        } else if (a instanceof C11892k) {
            bVar = ((C11892k) a).mo30023a();
            C11897e.m38131a(bVar, "%s.supportFragmentInjector() returned null", a.getClass());
        } else {
            throw new RuntimeException(String.format("%s does not implement %s or %s", new Object[]{a.getClass().getCanonicalName(), C11880i.class.getCanonicalName(), C11892k.class.getCanonicalName()}));
        }
        String str = "dagger.android.support";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), a.getClass().getCanonicalName()}));
        }
        bVar.mo11603a(fragment);
    }
}
