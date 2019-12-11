package p096e.p114f.p117b.p118j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p096e.p114f.p117b.C3957e;
import p096e.p114f.p117b.p118j.C3968e.C3972d;
import p096e.p114f.p117b.p118j.C3973f.C3975b;
import p096e.p114f.p117b.p118j.p119u.C3994b;
import p096e.p114f.p117b.p118j.p119u.C3994b.C3996b;
import p096e.p114f.p117b.p118j.p119u.C3999e;

/* renamed from: e.f.b.j.g */
/* compiled from: ConstraintWidgetContainer */
public class C3976g extends C3992t {

    /* renamed from: K0 */
    C3994b f10059K0 = new C3994b(this);

    /* renamed from: L0 */
    public C3999e f10060L0 = new C3999e(this);

    /* renamed from: M0 */
    private C3996b f10061M0 = null;

    /* renamed from: N0 */
    private boolean f10062N0 = false;

    /* renamed from: O0 */
    protected C3957e f10063O0 = new C3957e();

    /* renamed from: P0 */
    private C3989r f10064P0;

    /* renamed from: Q0 */
    int f10065Q0;

    /* renamed from: R0 */
    int f10066R0;

    /* renamed from: S0 */
    int f10067S0;

    /* renamed from: T0 */
    int f10068T0;

    /* renamed from: U0 */
    int f10069U0 = 0;

    /* renamed from: V0 */
    int f10070V0 = 0;

    /* renamed from: W0 */
    C3967d[] f10071W0 = new C3967d[4];

    /* renamed from: X0 */
    C3967d[] f10072X0 = new C3967d[4];

    /* renamed from: Y0 */
    public List<C3977h> f10073Y0 = new ArrayList();

    /* renamed from: Z0 */
    private int f10074Z0 = 7;

    /* renamed from: a1 */
    public boolean f10075a1 = false;

    /* renamed from: b1 */
    private boolean f10076b1 = false;

    /* renamed from: c1 */
    private boolean f10077c1 = false;

    /* renamed from: g0 */
    private void m13553g0() {
        this.f10069U0 = 0;
        this.f10070V0 = 0;
    }

    /* renamed from: A */
    public void mo14411A(int i) {
        this.f10074Z0 = i;
    }

    /* renamed from: K */
    public void mo14325K() {
        this.f10063O0.mo14273f();
        this.f10065Q0 = 0;
        this.f10067S0 = 0;
        this.f10066R0 = 0;
        this.f10068T0 = 0;
        this.f10073Y0.clear();
        this.f10075a1 = false;
        super.mo14325K();
    }

    /* JADX WARNING: type inference failed for: r10v11, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v12 */
    /* JADX WARNING: type inference failed for: r10v13 */
    /* JADX WARNING: type inference failed for: r10v33 */
    /* JADX WARNING: type inference failed for: r10v34 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r10v11, types: [boolean]
      assigns: []
      uses: [?[int, short, byte, char], boolean]
      mth insns count: 382
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
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0302  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14412T() {
        /*
            r21 = this;
            r1 = r21
            int r2 = r1.f9991R
            int r3 = r1.f9992S
            int r0 = r21.mo14316B()
            r4 = 0
            int r5 = java.lang.Math.max(r4, r0)
            int r0 = r21.mo14381l()
            int r6 = java.lang.Math.max(r4, r0)
            r1.f10076b1 = r4
            r1.f10077c1 = r4
            e.f.b.j.f r0 = r1.f9986M
            if (r0 == 0) goto L_0x0046
            e.f.b.j.r r0 = r1.f10064P0
            if (r0 != 0) goto L_0x002a
            e.f.b.j.r r0 = new e.f.b.j.r
            r0.<init>(r1)
            r1.f10064P0 = r0
        L_0x002a:
            e.f.b.j.r r0 = r1.f10064P0
            r0.mo14484b(r1)
            int r0 = r1.f10065Q0
            r1.mo14407x(r0)
            int r0 = r1.f10066R0
            r1.mo14409y(r0)
            r21.mo14326L()
            e.f.b.e r0 = r1.f10063O0
            e.f.b.c r0 = r0.mo14271d()
            r1.mo14335a(r0)
            goto L_0x004a
        L_0x0046:
            r1.f9991R = r4
            r1.f9992S = r4
        L_0x004a:
            r0 = 64
            boolean r0 = r1.mo14294z(r0)
            r7 = 1
            if (r0 != 0) goto L_0x005e
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r1.mo14294z(r0)
            if (r0 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            e.f.b.e r8 = r1.f10063O0
            r8.f9855g = r4
            r8.f9856h = r4
            int r8 = r1.f10074Z0
            r9 = 8
            r10 = 32
            if (r8 == 0) goto L_0x00d3
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r1.mo14294z(r9)
            if (r0 != 0) goto L_0x007e
            boolean r0 = r1.mo14294z(r10)
            if (r0 != 0) goto L_0x007e
            r21.mo14428d0()
        L_0x007e:
            boolean r0 = r1.mo14294z(r10)
            if (r0 != 0) goto L_0x0087
            r21.mo14425c0()
        L_0x0087:
            boolean r0 = r1.mo14294z(r4)
            if (r0 == 0) goto L_0x00ce
            java.util.ArrayList r0 = r21.mo14286R()
            int r8 = r0.size()
            r11 = 0
        L_0x0096:
            if (r11 >= r8) goto L_0x00b3
            java.lang.Object r12 = r0.get(r11)
            e.f.b.j.f r12 = (p096e.p114f.p117b.p118j.C3973f) r12
            boolean r13 = r12.mo14323I()
            if (r13 == 0) goto L_0x00a7
            r12.mo14376i(r4)
        L_0x00a7:
            boolean r13 = r12.mo14324J()
            if (r13 == 0) goto L_0x00b0
            r12.mo14376i(r7)
        L_0x00b0:
            int r11 = r11 + 1
            goto L_0x0096
        L_0x00b3:
            r11 = 0
        L_0x00b4:
            if (r11 >= r8) goto L_0x00ce
            java.lang.Object r12 = r0.get(r11)
            e.f.b.j.f r12 = (p096e.p114f.p117b.p118j.C3973f) r12
            boolean r13 = r12.mo14324J()
            if (r13 != 0) goto L_0x00c8
            boolean r13 = r12.mo14323I()
            if (r13 == 0) goto L_0x00cb
        L_0x00c8:
            r12.mo14327O()
        L_0x00cb:
            int r11 = r11 + 1
            goto L_0x00b4
        L_0x00ce:
            e.f.b.e r0 = r1.f10063O0
            r0.f9855g = r7
            goto L_0x00dd
        L_0x00d3:
            int r8 = r1.f10074Z0
            if (r8 == 0) goto L_0x00dd
            if (r0 == 0) goto L_0x00dd
            e.f.b.e r0 = r1.f10063O0
            r0.f9856h = r7
        L_0x00dd:
            e.f.b.j.f$b[] r0 = r1.f9985L
            r8 = r0[r7]
            r11 = r0[r4]
            r21.m13553g0()
            java.util.List<e.f.b.j.h> r0 = r1.f10073Y0
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00ff
            java.util.List<e.f.b.j.h> r0 = r1.f10073Y0
            r0.clear()
            java.util.List<e.f.b.j.h> r0 = r1.f10073Y0
            e.f.b.j.h r12 = new e.f.b.j.h
            java.util.ArrayList<e.f.b.j.f> r13 = r1.f10159J0
            r12.<init>(r13)
            r0.add(r4, r12)
        L_0x00ff:
            java.util.List<e.f.b.j.h> r0 = r1.f10073Y0
            int r12 = r0.size()
            java.util.ArrayList<e.f.b.j.f> r13 = r1.f10159J0
            e.f.b.j.f$b r0 = r21.mo14387o()
            e.f.b.j.f$b r14 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r0 == r14) goto L_0x011a
            e.f.b.j.f$b r0 = r21.mo14410z()
            e.f.b.j.f$b r14 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r0 != r14) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r14 = 0
            goto L_0x011b
        L_0x011a:
            r14 = 1
        L_0x011b:
            r0 = 0
            r15 = 0
        L_0x011d:
            if (r15 >= r12) goto L_0x0363
            boolean r9 = r1.f10075a1
            if (r9 != 0) goto L_0x0363
            java.util.List<e.f.b.j.h> r9 = r1.f10073Y0
            java.lang.Object r9 = r9.get(r15)
            e.f.b.j.h r9 = (p096e.p114f.p117b.p118j.C3977h) r9
            boolean r9 = r9.f10079b
            if (r9 == 0) goto L_0x0133
            r19 = r12
            goto L_0x0357
        L_0x0133:
            boolean r9 = r1.mo14294z(r10)
            if (r9 == 0) goto L_0x0168
            e.f.b.j.f$b r9 = r21.mo14387o()
            e.f.b.j.f$b r10 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            if (r9 != r10) goto L_0x015a
            e.f.b.j.f$b r9 = r21.mo14410z()
            e.f.b.j.f$b r10 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            if (r9 != r10) goto L_0x015a
            java.util.List<e.f.b.j.h> r9 = r1.f10073Y0
            java.lang.Object r9 = r9.get(r15)
            e.f.b.j.h r9 = (p096e.p114f.p117b.p118j.C3977h) r9
            java.util.List r9 = r9.mo14433a()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r1.f10159J0 = r9
            goto L_0x0168
        L_0x015a:
            java.util.List<e.f.b.j.h> r9 = r1.f10073Y0
            java.lang.Object r9 = r9.get(r15)
            e.f.b.j.h r9 = (p096e.p114f.p117b.p118j.C3977h) r9
            java.util.List<e.f.b.j.f> r9 = r9.f10078a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r1.f10159J0 = r9
        L_0x0168:
            r21.m13553g0()
            java.util.ArrayList<e.f.b.j.f> r9 = r1.f10159J0
            int r9 = r9.size()
            r10 = 0
        L_0x0172:
            if (r10 >= r9) goto L_0x018a
            java.util.ArrayList<e.f.b.j.f> r4 = r1.f10159J0
            java.lang.Object r4 = r4.get(r10)
            e.f.b.j.f r4 = (p096e.p114f.p117b.p118j.C3973f) r4
            boolean r7 = r4 instanceof p096e.p114f.p117b.p118j.C3992t
            if (r7 == 0) goto L_0x0185
            e.f.b.j.t r4 = (p096e.p114f.p117b.p118j.C3992t) r4
            r4.mo14412T()
        L_0x0185:
            int r10 = r10 + 1
            r4 = 0
            r7 = 1
            goto L_0x0172
        L_0x018a:
            r7 = r0
            r0 = 0
            r4 = 1
        L_0x018d:
            if (r4 == 0) goto L_0x0346
            r17 = r4
            r10 = 1
            int r4 = r0 + 1
            e.f.b.e r0 = r1.f10063O0     // Catch:{ Exception -> 0x01d1 }
            r0.mo14273f()     // Catch:{ Exception -> 0x01d1 }
            r21.m13553g0()     // Catch:{ Exception -> 0x01d1 }
            e.f.b.e r0 = r1.f10063O0     // Catch:{ Exception -> 0x01d1 }
            r1.mo14351b(r0)     // Catch:{ Exception -> 0x01d1 }
            r0 = 0
        L_0x01a2:
            if (r0 >= r9) goto L_0x01b8
            java.util.ArrayList<e.f.b.j.f> r10 = r1.f10159J0     // Catch:{ Exception -> 0x01d1 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ Exception -> 0x01d1 }
            e.f.b.j.f r10 = (p096e.p114f.p117b.p118j.C3973f) r10     // Catch:{ Exception -> 0x01d1 }
            r18 = r7
            e.f.b.e r7 = r1.f10063O0     // Catch:{ Exception -> 0x01cf }
            r10.mo14351b(r7)     // Catch:{ Exception -> 0x01cf }
            int r0 = r0 + 1
            r7 = r18
            goto L_0x01a2
        L_0x01b8:
            r18 = r7
            e.f.b.e r0 = r1.f10063O0     // Catch:{ Exception -> 0x01cf }
            boolean r7 = r1.mo14426d(r0)     // Catch:{ Exception -> 0x01cf }
            if (r7 == 0) goto L_0x01ca
            e.f.b.e r0 = r1.f10063O0     // Catch:{ Exception -> 0x01c8 }
            r0.mo14272e()     // Catch:{ Exception -> 0x01c8 }
            goto L_0x01ca
        L_0x01c8:
            r0 = move-exception
            goto L_0x01d6
        L_0x01ca:
            r17 = r7
            r19 = r12
            goto L_0x01f3
        L_0x01cf:
            r0 = move-exception
            goto L_0x01d4
        L_0x01d1:
            r0 = move-exception
            r18 = r7
        L_0x01d4:
            r7 = r17
        L_0x01d6:
            r0.printStackTrace()
            java.io.PrintStream r10 = java.lang.System.out
            r17 = r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r19 = r12
            java.lang.String r12 = "EXCEPTION : "
            r7.append(r12)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r10.println(r0)
        L_0x01f3:
            if (r17 == 0) goto L_0x01fe
            e.f.b.e r7 = r1.f10063O0
            boolean[] r10 = p096e.p114f.p117b.p118j.C3984m.f10126a
            r1.mo14419a(r7, r10)
        L_0x01fc:
            r10 = 2
            goto L_0x0247
        L_0x01fe:
            e.f.b.e r7 = r1.f10063O0
            r1.mo14360c(r7)
            r7 = 0
        L_0x0204:
            if (r7 >= r9) goto L_0x01fc
            java.util.ArrayList<e.f.b.j.f> r10 = r1.f10159J0
            java.lang.Object r10 = r10.get(r7)
            e.f.b.j.f r10 = (p096e.p114f.p117b.p118j.C3973f) r10
            e.f.b.j.f$b[] r12 = r10.f9985L
            r16 = 0
            r12 = r12[r16]
            e.f.b.j.f$b r0 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r12 != r0) goto L_0x0229
            int r0 = r10.mo14316B()
            int r12 = r10.mo14318D()
            if (r0 >= r12) goto L_0x0229
            boolean[] r0 = p096e.p114f.p117b.p118j.C3984m.f10126a
            r7 = 2
            r12 = 1
            r0[r7] = r12
            goto L_0x01fc
        L_0x0229:
            r12 = 1
            e.f.b.j.f$b[] r0 = r10.f9985L
            r0 = r0[r12]
            e.f.b.j.f$b r12 = p096e.p114f.p117b.p118j.C3973f.C3975b.MATCH_CONSTRAINT
            if (r0 != r12) goto L_0x0243
            int r0 = r10.mo14381l()
            int r10 = r10.mo14317C()
            if (r0 >= r10) goto L_0x0243
            boolean[] r0 = p096e.p114f.p117b.p118j.C3984m.f10126a
            r7 = 1
            r10 = 2
            r0[r10] = r7
            goto L_0x0247
        L_0x0243:
            r10 = 2
            int r7 = r7 + 1
            goto L_0x0204
        L_0x0247:
            if (r14 == 0) goto L_0x02c1
            r7 = 8
            if (r4 >= r7) goto L_0x02c1
            boolean[] r0 = p096e.p114f.p117b.p118j.C3984m.f10126a
            boolean r0 = r0[r10]
            if (r0 == 0) goto L_0x02c1
            r0 = 0
            r10 = 0
            r12 = 0
        L_0x0256:
            if (r0 >= r9) goto L_0x0280
            java.util.ArrayList<e.f.b.j.f> r7 = r1.f10159J0
            java.lang.Object r7 = r7.get(r0)
            e.f.b.j.f r7 = (p096e.p114f.p117b.p118j.C3973f) r7
            r17 = r4
            int r4 = r7.f9991R
            int r20 = r7.mo14316B()
            int r4 = r4 + r20
            int r10 = java.lang.Math.max(r10, r4)
            int r4 = r7.f9992S
            int r7 = r7.mo14381l()
            int r4 = r4 + r7
            int r12 = java.lang.Math.max(r12, r4)
            int r0 = r0 + 1
            r4 = r17
            r7 = 8
            goto L_0x0256
        L_0x0280:
            r17 = r4
            int r0 = r1.f10005c0
            int r0 = java.lang.Math.max(r0, r10)
            int r4 = r1.f10007d0
            int r4 = java.lang.Math.max(r4, r12)
            e.f.b.j.f$b r7 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r11 != r7) goto L_0x02a6
            int r7 = r21.mo14316B()
            if (r7 >= r0) goto L_0x02a6
            r1.mo14401u(r0)
            e.f.b.j.f$b[] r0 = r1.f9985L
            e.f.b.j.f$b r7 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            r10 = 0
            r0[r10] = r7
            r0 = 1
            r18 = 1
            goto L_0x02a7
        L_0x02a6:
            r0 = 0
        L_0x02a7:
            e.f.b.j.f$b r7 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r8 != r7) goto L_0x02be
            int r7 = r21.mo14381l()
            if (r7 >= r4) goto L_0x02be
            r1.mo14384m(r4)
            e.f.b.j.f$b[] r0 = r1.f9985L
            e.f.b.j.f$b r4 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            r7 = 1
            r0[r7] = r4
            r0 = 1
            r7 = 1
            goto L_0x02c6
        L_0x02be:
            r7 = r18
            goto L_0x02c6
        L_0x02c1:
            r17 = r4
            r7 = r18
            r0 = 0
        L_0x02c6:
            int r4 = r1.f10005c0
            int r10 = r21.mo14316B()
            int r4 = java.lang.Math.max(r4, r10)
            int r10 = r21.mo14316B()
            if (r4 <= r10) goto L_0x02e2
            r1.mo14401u(r4)
            e.f.b.j.f$b[] r0 = r1.f9985L
            e.f.b.j.f$b r4 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r7 = 0
            r0[r7] = r4
            r0 = 1
            r7 = 1
        L_0x02e2:
            int r4 = r1.f10007d0
            int r10 = r21.mo14381l()
            int r4 = java.lang.Math.max(r4, r10)
            int r10 = r21.mo14381l()
            if (r4 <= r10) goto L_0x02ff
            r1.mo14384m(r4)
            e.f.b.j.f$b[] r0 = r1.f9985L
            e.f.b.j.f$b r4 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r10 = 1
            r0[r10] = r4
            r0 = 1
            r7 = 1
            goto L_0x0300
        L_0x02ff:
            r10 = 1
        L_0x0300:
            if (r7 != 0) goto L_0x033f
            e.f.b.j.f$b[] r4 = r1.f9985L
            r12 = 0
            r4 = r4[r12]
            e.f.b.j.f$b r12 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r4 != r12) goto L_0x0321
            if (r5 <= 0) goto L_0x0321
            int r4 = r21.mo14316B()
            if (r4 <= r5) goto L_0x0321
            r1.f10076b1 = r10
            e.f.b.j.f$b[] r0 = r1.f9985L
            e.f.b.j.f$b r4 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r7 = 0
            r0[r7] = r4
            r1.mo14401u(r5)
            r0 = 1
            r7 = 1
        L_0x0321:
            e.f.b.j.f$b[] r4 = r1.f9985L
            r4 = r4[r10]
            e.f.b.j.f$b r12 = p096e.p114f.p117b.p118j.C3973f.C3975b.WRAP_CONTENT
            if (r4 != r12) goto L_0x033f
            if (r6 <= 0) goto L_0x033f
            int r4 = r21.mo14381l()
            if (r4 <= r6) goto L_0x033f
            r1.f10077c1 = r10
            e.f.b.j.f$b[] r0 = r1.f9985L
            e.f.b.j.f$b r4 = p096e.p114f.p117b.p118j.C3973f.C3975b.FIXED
            r0[r10] = r4
            r1.mo14384m(r6)
            r4 = 1
            r7 = 1
            goto L_0x0340
        L_0x033f:
            r4 = r0
        L_0x0340:
            r0 = r17
            r12 = r19
            goto L_0x018d
        L_0x0346:
            r18 = r7
            r19 = r12
            java.util.List<e.f.b.j.h> r0 = r1.f10073Y0
            java.lang.Object r0 = r0.get(r15)
            e.f.b.j.h r0 = (p096e.p114f.p117b.p118j.C3977h) r0
            r0.mo14434b()
            r0 = r18
        L_0x0357:
            int r15 = r15 + 1
            r12 = r19
            r4 = 0
            r7 = 1
            r9 = 8
            r10 = 32
            goto L_0x011d
        L_0x0363:
            r1.f10159J0 = r13
            e.f.b.j.f r4 = r1.f9986M
            if (r4 == 0) goto L_0x0395
            int r2 = r1.f10005c0
            int r3 = r21.mo14316B()
            int r2 = java.lang.Math.max(r2, r3)
            int r3 = r1.f10007d0
            int r4 = r21.mo14381l()
            int r3 = java.lang.Math.max(r3, r4)
            e.f.b.j.r r4 = r1.f10064P0
            r4.mo14483a(r1)
            int r4 = r1.f10065Q0
            int r2 = r2 + r4
            int r4 = r1.f10067S0
            int r2 = r2 + r4
            r1.mo14401u(r2)
            int r2 = r1.f10066R0
            int r3 = r3 + r2
            int r2 = r1.f10068T0
            int r3 = r3 + r2
            r1.mo14384m(r3)
            goto L_0x0399
        L_0x0395:
            r1.f9991R = r2
            r1.f9992S = r3
        L_0x0399:
            if (r0 == 0) goto L_0x03a3
            e.f.b.j.f$b[] r0 = r1.f9985L
            r2 = 0
            r0[r2] = r11
            r2 = 1
            r0[r2] = r8
        L_0x03a3:
            e.f.b.e r0 = r1.f10063O0
            e.f.b.c r0 = r0.mo14271d()
            r1.mo14335a(r0)
            e.f.b.j.g r0 = r21.mo14501S()
            if (r1 != r0) goto L_0x03b5
            r21.mo14328P()
        L_0x03b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p096e.p114f.p117b.p118j.C3976g.mo14412T():void");
    }

    /* renamed from: V */
    public C3996b mo14413V() {
        return this.f10061M0;
    }

    /* renamed from: W */
    public int mo14414W() {
        return this.f10074Z0;
    }

    /* renamed from: X */
    public boolean mo14415X() {
        return false;
    }

    /* renamed from: Y */
    public void mo14416Y() {
        this.f10060L0.mo14519b();
    }

    /* renamed from: Z */
    public boolean mo14417Z() {
        return this.f10077c1;
    }

    /* renamed from: a */
    public boolean mo14422a(boolean z, int i) {
        return this.f10060L0.mo14518a(z, i);
    }

    /* renamed from: a0 */
    public boolean mo14423a0() {
        return this.f10062N0;
    }

    /* renamed from: b0 */
    public boolean mo14424b0() {
        return this.f10076b1;
    }

    /* renamed from: c0 */
    public void mo14425c0() {
        if (!mo14294z(8)) {
            mo14289a(this.f10074Z0);
        }
        mo14430e0();
    }

    /* renamed from: d */
    public boolean mo14427d(boolean z) {
        return this.f10060L0.mo14517a(z);
    }

    /* renamed from: d0 */
    public void mo14428d0() {
        int size = this.f10159J0.size();
        mo14284M();
        for (int i = 0; i < size; i++) {
            ((C3973f) this.f10159J0.get(i)).mo14284M();
        }
    }

    /* renamed from: e */
    public boolean mo14429e(boolean z) {
        return this.f10060L0.mo14520b(z);
    }

    /* renamed from: e0 */
    public void mo14430e0() {
        C3986o e = mo14330a(C3972d.LEFT).mo14307e();
        C3986o e2 = mo14330a(C3972d.TOP).mo14307e();
        e.mo14470a((C3986o) null, 0.0f);
        e2.mo14470a((C3986o) null, 0.0f);
    }

    /* renamed from: f */
    public void mo14431f(boolean z) {
        this.f10062N0 = z;
    }

    /* renamed from: f0 */
    public void mo14432f0() {
        this.f10059K0.mo14505a(this);
    }

    /* renamed from: z */
    public boolean mo14294z(int i) {
        return (this.f10074Z0 & i) == i;
    }

    /* renamed from: e */
    private void m13551e(C3973f fVar) {
        int i = this.f10069U0 + 1;
        C3967d[] dVarArr = this.f10072X0;
        if (i >= dVarArr.length) {
            this.f10072X0 = (C3967d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f10072X0[this.f10069U0] = new C3967d(fVar, 0, mo14423a0());
        this.f10069U0++;
    }

    /* renamed from: f */
    private void m13552f(C3973f fVar) {
        int i = this.f10070V0 + 1;
        C3967d[] dVarArr = this.f10071W0;
        if (i >= dVarArr.length) {
            this.f10071W0 = (C3967d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        this.f10071W0[this.f10070V0] = new C3967d(fVar, 1, mo14423a0());
        this.f10070V0++;
    }

    /* renamed from: a */
    public void mo14418a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f10059K0.mo14506a(this, i, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: d */
    public boolean mo14426d(C3957e eVar) {
        mo14290a(eVar);
        int size = this.f10159J0.size();
        for (int i = 0; i < size; i++) {
            C3973f fVar = (C3973f) this.f10159J0.get(i);
            if (fVar instanceof C3991s) {
                fVar.mo14290a(eVar);
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            C3973f fVar2 = (C3973f) this.f10159J0.get(i2);
            if (fVar2 instanceof C3976g) {
                C3975b[] bVarArr = fVar2.f9985L;
                C3975b bVar = bVarArr[0];
                C3975b bVar2 = bVarArr[1];
                if (bVar == C3975b.WRAP_CONTENT) {
                    fVar2.mo14340a(C3975b.FIXED);
                }
                if (bVar2 == C3975b.WRAP_CONTENT) {
                    fVar2.mo14352b(C3975b.FIXED);
                }
                fVar2.mo14290a(eVar);
                if (bVar == C3975b.WRAP_CONTENT) {
                    fVar2.mo14340a(bVar);
                }
                if (bVar2 == C3975b.WRAP_CONTENT) {
                    fVar2.mo14352b(bVar2);
                }
            } else {
                C3984m.m13653a(this, eVar, fVar2);
                if (!(fVar2 instanceof C3991s)) {
                    fVar2.mo14290a(eVar);
                }
            }
        }
        if (this.f10069U0 > 0) {
            C3966c.m13424a(this, eVar, 0);
        }
        if (this.f10070V0 > 0) {
            C3966c.m13424a(this, eVar, 1);
        }
        return true;
    }

    /* renamed from: a */
    public void mo14421a(C3996b bVar) {
        this.f10061M0 = bVar;
        this.f10060L0.mo14515a(bVar);
    }

    /* renamed from: a */
    public void mo14419a(C3957e eVar, boolean[] zArr) {
        zArr[2] = false;
        mo14360c(eVar);
        int size = this.f10159J0.size();
        for (int i = 0; i < size; i++) {
            C3973f fVar = (C3973f) this.f10159J0.get(i);
            fVar.mo14360c(eVar);
            if (fVar.f9985L[0] == C3975b.MATCH_CONSTRAINT && fVar.mo14316B() < fVar.mo14318D()) {
                zArr[2] = true;
            }
            if (fVar.f9985L[1] == C3975b.MATCH_CONSTRAINT && fVar.mo14381l() < fVar.mo14317C()) {
                zArr[2] = true;
            }
        }
    }

    /* renamed from: a */
    public void mo14345a(boolean z, boolean z2) {
        super.mo14345a(z, z2);
        int size = this.f10159J0.size();
        for (int i = 0; i < size; i++) {
            ((C3973f) this.f10159J0.get(i)).mo14345a(z, z2);
        }
    }

    /* renamed from: a */
    public void mo14289a(int i) {
        super.mo14289a(i);
        int size = this.f10159J0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((C3973f) this.f10159J0.get(i2)).mo14289a(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo14420a(C3973f fVar, int i) {
        if (i == 0) {
            m13551e(fVar);
        } else if (i == 1) {
            m13552f(fVar);
        }
    }
}
