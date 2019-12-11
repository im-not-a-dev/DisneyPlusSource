package p163g.p174d.p178b.p196m0;

/* renamed from: g.d.b.m0.d */
/* compiled from: TimeUtils */
public class C5306d {

    /* renamed from: a */
    private static final String[][] f12790a = {new String[]{"%01d:%02d", "%02d:%02d"}, new String[]{"%01d:%02d:%02d", "%02d:%02d:%02d"}};

    /* renamed from: a */
    private static int m17956a(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public static String m17959a(long j, boolean z) {
        return m17957a(m17960b(j), z);
    }

    /* renamed from: b */
    public static int m17960b(long j) {
        return (int) (j / 1000);
    }

    /* renamed from: a */
    public static String m17958a(long j) {
        return m17957a(m17960b(j), false);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r8v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0, types: [boolean]
      assigns: []
      uses: [boolean, ?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[int, short, byte, char]]
      mth insns count: 35
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m17957a(int r7, boolean r8) {
        /*
            int r0 = r7 / 3600
            int r7 = r7 % 3600
            int r1 = r7 / 60
            int r7 = r7 % 60
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L_0x000e
            r4 = 1
            goto L_0x000f
        L_0x000e:
            r4 = 0
        L_0x000f:
            m17956a(r4)
            r8 = r8 ^ r3
            m17956a(r8)
            r5 = 2
            if (r4 != r3) goto L_0x0039
            java.lang.String[][] r6 = f12790a
            r4 = r6[r4]
            r8 = r4[r8]
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r2] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r4[r3] = r0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4[r5] = r7
            java.lang.String r7 = java.lang.String.format(r8, r4)
            return r7
        L_0x0039:
            java.lang.String[][] r0 = f12790a
            r0 = r0[r4]
            r8 = r0[r8]
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r2] = r1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r0[r3] = r7
            java.lang.String r7 = java.lang.String.format(r8, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p163g.p174d.p178b.p196m0.C5306d.m17957a(int, boolean):java.lang.String");
    }
}
