package kotlin.p586h0;

import kotlin.Metadata;
import kotlin.jvm.internal.p589f0.C12872a;
import kotlin.p577b0.C12719c;
import kotlin.p590y.C13162e0;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo31007d2 = {"Lkotlin/ranges/IntProgression;", "", "", "start", "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.h0.b */
/* compiled from: Progressions.kt */
public class C12754b implements Iterable<Integer>, C12872a {

    /* renamed from: W */
    public static final C12755a f29416W = new C12755a(null);

    /* renamed from: U */
    private final int f29417U;

    /* renamed from: V */
    private final int f29418V;

    /* renamed from: c */
    private final int f29419c;

    /* renamed from: kotlin.h0.b$a */
    /* compiled from: Progressions.kt */
    public static final class C12755a {
        private C12755a() {
        }

        /* renamed from: a */
        public final C12754b mo31078a(int i, int i2, int i3) {
            return new C12754b(i, i2, i3);
        }

        public /* synthetic */ C12755a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C12754b(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f29419c = i;
            this.f29417U = C12719c.m39857b(i, i2, i3);
            this.f29418V = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: b */
    public final int mo31070b() {
        return this.f29419c;
    }

    /* renamed from: c */
    public final int mo31071c() {
        return this.f29417U;
    }

    /* renamed from: d */
    public final int mo31072d() {
        return this.f29418V;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f29418V == r3.f29418V) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p586h0.C12754b
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            kotlin.h0.b r0 = (kotlin.p586h0.C12754b) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f29419c
            kotlin.h0.b r3 = (kotlin.p586h0.C12754b) r3
            int r1 = r3.f29419c
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f29417U
            int r1 = r3.f29417U
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f29418V
            int r3 = r3.f29418V
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p586h0.C12754b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f29419c * 31) + this.f29417U) * 31) + this.f29418V;
    }

    public boolean isEmpty() {
        if (this.f29418V > 0) {
            if (this.f29419c > this.f29417U) {
                return true;
            }
        } else if (this.f29419c < this.f29417U) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i;
        StringBuilder sb;
        String str = " step ";
        if (this.f29418V > 0) {
            sb = new StringBuilder();
            sb.append(this.f29419c);
            sb.append("..");
            sb.append(this.f29417U);
            sb.append(str);
            i = this.f29418V;
        } else {
            sb = new StringBuilder();
            sb.append(this.f29419c);
            sb.append(" downTo ");
            sb.append(this.f29417U);
            sb.append(str);
            i = -this.f29418V;
        }
        sb.append(i);
        return sb.toString();
    }

    public C13162e0 iterator() {
        return new C12756c(this.f29419c, this.f29417U, this.f29418V);
    }
}
