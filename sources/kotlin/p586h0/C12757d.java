package kotlin.p586h0;

import kotlin.Metadata;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0014B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u000bH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, mo31007d2 = {"Lkotlin/ranges/IntRange;", "Lkotlin/ranges/IntProgression;", "Lkotlin/ranges/ClosedRange;", "", "start", "endInclusive", "(II)V", "getEndInclusive", "()Ljava/lang/Integer;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.h0.d */
/* compiled from: Ranges.kt */
public final class C12757d extends C12754b implements C12753a<Integer> {
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final C12757d f29424X = new C12757d(1, 0);

    /* renamed from: Y */
    public static final C12758a f29425Y = new C12758a(null);

    /* renamed from: kotlin.h0.d$a */
    /* compiled from: Ranges.kt */
    public static final class C12758a {
        private C12758a() {
        }

        /* renamed from: a */
        public final C12757d mo31084a() {
            return C12757d.f29424X;
        }

        public /* synthetic */ C12758a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12757d(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: e */
    public Integer mo31081e() {
        return Integer.valueOf(mo31071c());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (mo31071c() == r3.mo31071c()) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p586h0.C12757d
            if (r0 == 0) goto L_0x002b
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.h0.d r0 = (kotlin.p586h0.C12757d) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0029
        L_0x0013:
            int r0 = r2.mo31070b()
            kotlin.h0.d r3 = (kotlin.p586h0.C12757d) r3
            int r1 = r3.mo31070b()
            if (r0 != r1) goto L_0x002b
            int r0 = r2.mo31071c()
            int r3 = r3.mo31071c()
            if (r0 != r3) goto L_0x002b
        L_0x0029:
            r3 = 1
            goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p586h0.C12757d.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public Integer mo31082f() {
        return Integer.valueOf(mo31070b());
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo31070b() * 31) + mo31071c();
    }

    public boolean isEmpty() {
        return mo31070b() > mo31071c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo31070b());
        sb.append("..");
        sb.append(mo31071c());
        return sb.toString();
    }

    /* renamed from: f */
    public boolean mo31083f(int i) {
        return mo31070b() <= i && i <= mo31071c();
    }
}
