package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.jvm.internal.C12880j;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancementKt {
    public static final JavaTypeQualifiers createJavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        if (!z2 || nullabilityQualifier != NullabilityQualifier.NOT_NULL) {
            return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, false, z);
        }
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, true, z);
    }

    public static final <T> T select(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (C12880j.m40224a((Object) t4, (Object) t) && C12880j.m40224a((Object) t3, (Object) t2)) {
                t4 = null;
            } else if (t3 != null) {
                t4 = t3;
            }
            return t4;
        }
        if (t3 != null) {
            Set<? extends T> t5 = C13199w.m40609t(C13190q0.m40536b(set, t3));
            if (t5 != null) {
                set = t5;
            }
        }
        return C13199w.m40603n(set);
    }

    public static final NullabilityQualifier select(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z);
    }
}
