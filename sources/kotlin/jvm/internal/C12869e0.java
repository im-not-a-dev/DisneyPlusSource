package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.p581d0.C12731a;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\f\u0010\u0017\u001a\u00020\u0013*\u00020\u0006H\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u001c\u0010\u0012\u001a\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, mo31007d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", "other", "", "hashCode", "", "toString", "kotlin-stdlib"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.jvm.internal.e0 */
/* compiled from: TypeReference.kt */
public final class C12869e0 implements KType {

    /* renamed from: U */
    private final List<KTypeProjection> f29518U;

    /* renamed from: V */
    private final boolean f29519V;

    /* renamed from: c */
    private final KClassifier f29520c;

    /* renamed from: kotlin.jvm.internal.e0$a */
    /* compiled from: TypeReference.kt */
    static final class C12870a extends C12881k implements Function1<KTypeProjection, String> {

        /* renamed from: c */
        final /* synthetic */ C12869e0 f29521c;

        C12870a(C12869e0 e0Var) {
            this.f29521c = e0Var;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(KTypeProjection kTypeProjection) {
            return this.f29521c.m40213a(kTypeProjection);
        }
    }

    public C12869e0(KClassifier kClassifier, List<KTypeProjection> list, boolean z) {
        this.f29520c = kClassifier;
        this.f29518U = list;
        this.f29519V = z;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C12869e0) {
            C12869e0 e0Var = (C12869e0) obj;
            if (C12880j.m40224a((Object) getClassifier(), (Object) e0Var.getClassifier()) && C12880j.m40224a((Object) getArguments(), (Object) e0Var.getArguments()) && isMarkedNullable() == e0Var.isMarkedNullable()) {
                return true;
            }
        }
        return false;
    }

    public List<Annotation> getAnnotations() {
        return C13185o.m40513a();
    }

    public List<KTypeProjection> getArguments() {
        return this.f29518U;
    }

    public KClassifier getClassifier() {
        return this.f29520c;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Boolean.valueOf(isMarkedNullable()).hashCode();
    }

    public boolean isMarkedNullable() {
        return this.f29519V;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m40210a());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m40210a() {
        String str;
        String str2;
        KClassifier classifier = getClassifier();
        Class cls = null;
        if (!(classifier instanceof KClass)) {
            classifier = null;
        }
        KClass kClass = (KClass) classifier;
        if (kClass != null) {
            cls = C12731a.m39866a(kClass);
        }
        if (cls == null) {
            str = getClassifier().toString();
        } else if (cls.isArray()) {
            str = m40211a(cls);
        } else {
            str = cls.getName();
        }
        String str3 = "";
        if (getArguments().isEmpty()) {
            str2 = str3;
        } else {
            str2 = C13199w.m40559a(getArguments(), ", ", "<", ">", 0, null, new C12870a(this), 24, null);
        }
        if (isMarkedNullable()) {
            str3 = "?";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    /* renamed from: a */
    private final String m40211a(Class<?> cls) {
        if (C12880j.m40224a((Object) cls, (Object) boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (C12880j.m40224a((Object) cls, (Object) char[].class)) {
            return "kotlin.CharArray";
        }
        if (C12880j.m40224a((Object) cls, (Object) byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (C12880j.m40224a((Object) cls, (Object) short[].class)) {
            return "kotlin.ShortArray";
        }
        if (C12880j.m40224a((Object) cls, (Object) int[].class)) {
            return "kotlin.IntArray";
        }
        if (C12880j.m40224a((Object) cls, (Object) float[].class)) {
            return "kotlin.FloatArray";
        }
        if (C12880j.m40224a((Object) cls, (Object) long[].class)) {
            return "kotlin.LongArray";
        }
        return C12880j.m40224a((Object) cls, (Object) double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String m40213a(kotlin.reflect.KTypeProjection r3) {
        /*
            r2 = this;
            kotlin.reflect.KVariance r0 = r3.getVariance()
            if (r0 != 0) goto L_0x0009
            java.lang.String r3 = "*"
            return r3
        L_0x0009:
            kotlin.reflect.KType r0 = r3.getType()
            boolean r1 = r0 instanceof kotlin.jvm.internal.C12869e0
            if (r1 != 0) goto L_0x0012
            r0 = 0
        L_0x0012:
            kotlin.jvm.internal.e0 r0 = (kotlin.jvm.internal.C12869e0) r0
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.m40210a()
            if (r0 == 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            kotlin.reflect.KType r0 = r3.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0025:
            kotlin.reflect.KVariance r3 = r3.getVariance()
            if (r3 == 0) goto L_0x0060
            int[] r1 = kotlin.jvm.internal.C12867d0.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r1[r3]
            r1 = 1
            if (r3 == r1) goto L_0x005f
            r1 = 2
            if (r3 == r1) goto L_0x004e
            r1 = 3
            if (r3 != r1) goto L_0x0060
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "out "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto L_0x005f
        L_0x004e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "in "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x005f:
            return r0
        L_0x0060:
            kotlin.l r3 = new kotlin.l
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C12869e0.m40213a(kotlin.reflect.KTypeProjection):java.lang.String");
    }
}
