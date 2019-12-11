package kotlin.p577b0;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.p584g0.C12745b;
import kotlin.p584g0.C12747c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, mo31007d2 = {"Lkotlin/internal/PlatformImplementations;", "", "()V", "addSuppressed", "", "cause", "", "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", "", "ReflectAddSuppressedMethod", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.b0.a */
/* compiled from: PlatformImplementations.kt */
public class C12716a {

    /* renamed from: kotlin.b0.a$a */
    /* compiled from: PlatformImplementations.kt */
    private static final class C12717a {

        /* renamed from: a */
        public static final Method f29404a;

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[EDGE_INSN: B:13:0x0047->B:11:0x0047 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0043 A[LOOP:0: B:1:0x0013->B:9:0x0043, LOOP_END] */
        static {
            /*
                kotlin.b0.a$a r0 = new kotlin.b0.a$a
                r0.<init>()
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0013:
                if (r4 >= r2) goto L_0x0046
                r5 = r1[r4]
                java.lang.String r6 = "it"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r7)
                if (r6 == 0) goto L_0x003f
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r7)
                java.lang.Object r6 = kotlin.p590y.C13174k.m40411k(r6)
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
                if (r6 == 0) goto L_0x003f
                r6 = 1
                goto L_0x0040
            L_0x003f:
                r6 = 0
            L_0x0040:
                if (r6 == 0) goto L_0x0043
                goto L_0x0047
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0013
            L_0x0046:
                r5 = 0
            L_0x0047:
                f29404a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p577b0.C12716a.C12717a.<clinit>():void");
        }

        private C12717a() {
        }
    }

    /* renamed from: a */
    public void mo31060a(Throwable th, Throwable th2) {
        Method method = C12717a.f29404a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }

    /* renamed from: a */
    public C12747c mo31059a() {
        return new C12745b();
    }
}
