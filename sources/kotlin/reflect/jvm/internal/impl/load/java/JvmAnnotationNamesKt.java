package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* compiled from: JvmAnnotationNames.kt */
public final class JvmAnnotationNamesKt {
    private static final FqName ANDROIDX_RECENTLY_NON_NULL_ANNOTATION = new FqName("androidx.annotation.RecentlyNonNull");
    private static final FqName ANDROIDX_RECENTLY_NULLABLE_ANNOTATION = new FqName("androidx.annotation.RecentlyNullable");
    private static final FqName COMPATQUAL_NONNULL_ANNOTATION = new FqName("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
    private static final FqName COMPATQUAL_NULLABLE_ANNOTATION = new FqName("org.checkerframework.checker.nullness.compatqual.NullableDecl");
    private static final FqName JAVAX_CHECKFORNULL_ANNOTATION;
    private static final FqName JAVAX_NONNULL_ANNOTATION = new FqName("javax.annotation.Nonnull");
    private static final List<FqName> MUTABLE_ANNOTATIONS = C13185o.m40520c(JvmAnnotationNames.JETBRAINS_MUTABLE_ANNOTATION, JvmAnnotationNames.MUTABLE_ANNOTATION);
    private static final List<FqName> NOT_NULL_ANNOTATIONS;
    private static final Set<FqName> NULLABILITY_ANNOTATIONS = C13190q0.m40536b(C13190q0.m40536b(C13190q0.m40536b(C13190q0.m40536b(C13190q0.m40534a(C13190q0.m40536b(C13190q0.m40534a((Set) new LinkedHashSet(), (Iterable) NULLABLE_ANNOTATIONS), JAVAX_NONNULL_ANNOTATION), (Iterable) NOT_NULL_ANNOTATIONS), COMPATQUAL_NULLABLE_ANNOTATION), COMPATQUAL_NONNULL_ANNOTATION), ANDROIDX_RECENTLY_NULLABLE_ANNOTATION), ANDROIDX_RECENTLY_NON_NULL_ANNOTATION);
    private static final List<FqName> NULLABLE_ANNOTATIONS;
    private static final List<FqName> READ_ONLY_ANNOTATIONS = C13185o.m40520c(JvmAnnotationNames.JETBRAINS_READONLY_ANNOTATION, JvmAnnotationNames.READONLY_ANNOTATION);

    /* JADX INFO: used method not loaded: kotlin.y.q0.a(java.util.Set, java.lang.Iterable):null, types can be incorrect */
    static {
        String str = "androidx.annotation.Nullable";
        String str2 = "javax.annotation.CheckForNull";
        NULLABLE_ANNOTATIONS = C13185o.m40520c(JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new FqName(str), new FqName(str), new FqName("android.annotation.Nullable"), new FqName("com.android.annotations.Nullable"), new FqName("org.eclipse.jdt.annotation.Nullable"), new FqName("org.checkerframework.checker.nullness.qual.Nullable"), new FqName("javax.annotation.Nullable"), new FqName(str2), new FqName("edu.umd.cs.findbugs.annotations.CheckForNull"), new FqName("edu.umd.cs.findbugs.annotations.Nullable"), new FqName("edu.umd.cs.findbugs.annotations.PossiblyNull"), new FqName("io.reactivex.annotations.Nullable"));
        JAVAX_CHECKFORNULL_ANNOTATION = new FqName(str2);
        String str3 = "androidx.annotation.NonNull";
        NOT_NULL_ANNOTATIONS = C13185o.m40520c(JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, new FqName("edu.umd.cs.findbugs.annotations.NonNull"), new FqName(str3), new FqName(str3), new FqName("android.annotation.NonNull"), new FqName("com.android.annotations.NonNull"), new FqName("org.eclipse.jdt.annotation.NonNull"), new FqName("org.checkerframework.checker.nullness.qual.NonNull"), new FqName("lombok.NonNull"), new FqName("io.reactivex.annotations.NonNull"));
    }

    public static final FqName getANDROIDX_RECENTLY_NON_NULL_ANNOTATION() {
        return ANDROIDX_RECENTLY_NON_NULL_ANNOTATION;
    }

    public static final FqName getANDROIDX_RECENTLY_NULLABLE_ANNOTATION() {
        return ANDROIDX_RECENTLY_NULLABLE_ANNOTATION;
    }

    public static final FqName getCOMPATQUAL_NONNULL_ANNOTATION() {
        return COMPATQUAL_NONNULL_ANNOTATION;
    }

    public static final FqName getCOMPATQUAL_NULLABLE_ANNOTATION() {
        return COMPATQUAL_NULLABLE_ANNOTATION;
    }

    public static final FqName getJAVAX_CHECKFORNULL_ANNOTATION() {
        return JAVAX_CHECKFORNULL_ANNOTATION;
    }

    public static final FqName getJAVAX_NONNULL_ANNOTATION() {
        return JAVAX_NONNULL_ANNOTATION;
    }

    public static final List<FqName> getMUTABLE_ANNOTATIONS() {
        return MUTABLE_ANNOTATIONS;
    }

    public static final List<FqName> getNOT_NULL_ANNOTATIONS() {
        return NOT_NULL_ANNOTATIONS;
    }

    public static final List<FqName> getNULLABLE_ANNOTATIONS() {
        return NULLABLE_ANNOTATIONS;
    }

    public static final List<FqName> getREAD_ONLY_ANNOTATIONS() {
        return READ_ONLY_ANNOTATIONS;
    }
}
