package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C12880j;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b@\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\u001e\u001fB\u0016\b\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00018\u0000H\b¢\u0006\u0004\b\u0017\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, mo31007d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "value", "", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "isFailure", "", "isFailure-impl", "(Ljava/lang/Object;)Z", "isSuccess", "isSuccess-impl", "value$annotations", "()V", "equals", "other", "exceptionOrNull", "", "exceptionOrNull-impl", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getOrNull", "getOrNull-impl", "hashCode", "", "toString", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "Companion", "Failure", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.n */
/* compiled from: Result.kt */
public final class C12900n<T> implements Serializable {

    /* renamed from: c */
    public static final C12901a f29540c = new C12901a(null);

    /* renamed from: kotlin.n$a */
    /* compiled from: Result.kt */
    public static final class C12901a {
        private C12901a() {
        }

        public /* synthetic */ C12901a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.n$b */
    /* compiled from: Result.kt */
    public static final class C12902b implements Serializable {

        /* renamed from: c */
        public final Throwable f29541c;

        public C12902b(Throwable th) {
            this.f29541c = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C12902b) && C12880j.m40224a((Object) this.f29541c, (Object) ((C12902b) obj).f29541c);
        }

        public int hashCode() {
            return this.f29541c.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.f29541c);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Object m40236a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m40237b(Object obj) {
        if (obj instanceof C12902b) {
            return ((C12902b) obj).f29541c;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m40238c(Object obj) {
        return obj instanceof C12902b;
    }

    /* renamed from: d */
    public static final boolean m40239d(Object obj) {
        return !(obj instanceof C12902b);
    }
}
