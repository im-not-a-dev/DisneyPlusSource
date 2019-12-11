package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.p573a0.C12680a;
import kotlin.p573a0.C12688f.C12693c;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\b\u0010\u000f\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo31007d2 = {"Lkotlinx/coroutines/CoroutineName;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Key", "kotlinx-coroutines-core"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlinx.coroutines.d0 */
/* compiled from: CoroutineName.kt */
public final class C13228d0 extends C12680a {

    /* renamed from: U */
    public static final C13229a f29656U = new C13229a(null);

    /* renamed from: c */
    private final String f29657c;

    /* renamed from: kotlinx.coroutines.d0$a */
    /* compiled from: CoroutineName.kt */
    public static final class C13229a implements C12693c<C13228d0> {
        private C13229a() {
        }

        public /* synthetic */ C13229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12880j.m40224a((java.lang.Object) r1.f29657c, (java.lang.Object) ((kotlinx.coroutines.C13228d0) r2).f29657c) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlinx.coroutines.C13228d0
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.d0 r2 = (kotlinx.coroutines.C13228d0) r2
            java.lang.String r0 = r1.f29657c
            java.lang.String r2 = r2.f29657c
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C13228d0.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final String mo34364f() {
        return this.f29657c;
    }

    public int hashCode() {
        String str = this.f29657c;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CoroutineName(");
        sb.append(this.f29657c);
        sb.append(')');
        return sb.toString();
    }
}
