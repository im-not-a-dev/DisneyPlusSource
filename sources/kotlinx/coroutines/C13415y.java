package kotlinx.coroutines;

import kotlin.p573a0.C12684d;
import kotlin.p573a0.C12688f;
import kotlinx.coroutines.p595m2.C13350c;

/* renamed from: kotlinx.coroutines.y */
/* compiled from: CoroutineContext.kt */
public final class C13415y {

    /* renamed from: a */
    private static final boolean f29911a;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r0.equals("on") != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r0.equals("") != false) goto L_0x0033;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C13280r.m40826a(r0)
            if (r0 != 0) goto L_0x0009
            goto L_0x0033
        L_0x0009:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x002b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0022
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0034
        L_0x0022:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
            goto L_0x0033
        L_0x002b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0037
        L_0x0033:
            r0 = 1
        L_0x0034:
            f29911a = r0
            return
        L_0x0037:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13415y.<clinit>():void");
    }

    /* renamed from: a */
    public static final C13418z m41268a() {
        return f29911a ? C13350c.f29820Z : C13381p.f29872V;
    }

    /* renamed from: a */
    public static final C12688f m41267a(C13233e0 e0Var, C12688f fVar) {
        C12688f plus = e0Var.mo34332e().plus(fVar);
        C12688f plus2 = C13292j0.m40865c() ? plus.plus(new C13222c0(C13292j0.m40864b().incrementAndGet())) : plus;
        return (plus == C13390r0.m41147a() || plus.get(C12684d.f29380b) != null) ? plus2 : plus2.plus(C13390r0.m41147a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r4 != null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m41266a(kotlin.p573a0.C12688f r4) {
        /*
            boolean r0 = kotlinx.coroutines.C13292j0.m40865c()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            kotlinx.coroutines.c0$a r0 = kotlinx.coroutines.C13222c0.f29654U
            kotlin.a0.f$b r0 = r4.get(r0)
            kotlinx.coroutines.c0 r0 = (kotlinx.coroutines.C13222c0) r0
            if (r0 == 0) goto L_0x003e
            kotlinx.coroutines.d0$a r1 = kotlinx.coroutines.C13228d0.f29656U
            kotlin.a0.f$b r4 = r4.get(r1)
            kotlinx.coroutines.d0 r4 = (kotlinx.coroutines.C13228d0) r4
            if (r4 == 0) goto L_0x0023
            java.lang.String r4 = r4.mo34364f()
            if (r4 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            java.lang.String r4 = "coroutine"
        L_0x0025:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r4 = 35
            r1.append(r4)
            long r2 = r0.mo34360f()
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            return r4
        L_0x003e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13415y.m41266a(kotlin.a0.f):java.lang.String");
    }
}
