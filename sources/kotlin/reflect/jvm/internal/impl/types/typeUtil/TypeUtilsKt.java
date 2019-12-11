package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import java.util.Iterator;
import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor;

/* compiled from: TypeUtils.kt */
public final class TypeUtilsKt {
    public static final TypeProjection asTypeProjection(KotlinType kotlinType) {
        return new TypeProjectionImpl(kotlinType);
    }

    public static final boolean canHaveUndefinedNullability(UnwrappedType unwrappedType) {
        return (unwrappedType.getConstructor() instanceof NewTypeVariableConstructor) || (unwrappedType.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) || (unwrappedType instanceof NewCapturedType);
    }

    public static final boolean contains(KotlinType kotlinType, Function1<? super UnwrappedType, Boolean> function1) {
        return TypeUtils.contains(kotlinType, function1);
    }

    public static final TypeProjection createProjection(KotlinType kotlinType, Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == variance) {
            variance = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(variance, kotlinType);
    }

    public static final KotlinBuiltIns getBuiltIns(KotlinType kotlinType) {
        KotlinBuiltIns builtIns = kotlinType.getConstructor().getBuiltIns();
        Intrinsics.checkReturnedValueIsNotNull((Object) builtIns, "constructor.builtIns");
        return builtIns;
    }

    public static final KotlinType getRepresentativeUpperBound(TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        String str = "upperBounds";
        Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, str);
        boolean z = !upperBounds.isEmpty();
        if (!C13147x.f29590a || z) {
            List upperBounds2 = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds2, str);
            Iterator it = upperBounds2.iterator();
            while (true) {
                ClassDescriptor classDescriptor = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ClassifierDescriptor declarationDescriptor = ((KotlinType) obj).getConstructor().getDeclarationDescriptor();
                if (declarationDescriptor instanceof ClassDescriptor) {
                    classDescriptor = declarationDescriptor;
                }
                ClassDescriptor classDescriptor2 = classDescriptor;
                boolean z2 = false;
                if (!(classDescriptor2 == null || classDescriptor2.getKind() == ClassKind.INTERFACE || classDescriptor2.getKind() == ClassKind.ANNOTATION_CLASS)) {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            KotlinType kotlinType = (KotlinType) obj;
            if (kotlinType != null) {
                return kotlinType;
            }
            List upperBounds3 = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds3, str);
            Object f = C13199w.m40589f(upperBounds3);
            Intrinsics.checkReturnedValueIsNotNull(f, "upperBounds.first()");
            return (KotlinType) f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Upper bounds should not be empty: ");
        sb.append(typeParameterDescriptor);
        throw new AssertionError(sb.toString());
    }

    public static final boolean isSubtypeOf(KotlinType kotlinType, KotlinType kotlinType2) {
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, kotlinType2);
    }

    public static final boolean isTypeParameter(KotlinType kotlinType) {
        return TypeUtils.isTypeParameter(kotlinType);
    }

    public static final KotlinType makeNotNullable(KotlinType kotlinType) {
        KotlinType makeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        Intrinsics.checkReturnedValueIsNotNull((Object) makeNotNullable, "TypeUtils.makeNotNullable(this)");
        return makeNotNullable;
    }

    public static final KotlinType makeNullable(KotlinType kotlinType) {
        KotlinType makeNullable = TypeUtils.makeNullable(kotlinType);
        Intrinsics.checkReturnedValueIsNotNull((Object) makeNullable, "TypeUtils.makeNullable(this)");
        return makeNullable;
    }

    public static final KotlinType replaceAnnotations(KotlinType kotlinType, Annotations annotations) {
        if (!kotlinType.getAnnotations().isEmpty() || !annotations.isEmpty()) {
            return kotlinType.unwrap().replaceAnnotations(annotations);
        }
        return kotlinType;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    /* JADX WARNING: type inference failed for: r0v10, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType replaceArgumentsWithStarProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType r10) {
        /*
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r10 = r10.unwrap()
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType
            r1 = 2
            r2 = 10
            java.lang.String r3 = "constructor.parameters"
            r4 = 0
            if (r0 == 0) goto L_0x00b2
            r0 = r10
            kotlin.reflect.jvm.internal.impl.types.FlexibleType r0 = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) r0
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r0.getLowerBound()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6 = r5.getConstructor()
            java.util.List r6 = r6.getParameters()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x005f
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6 = r5.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r6 = r6.getDeclarationDescriptor()
            if (r6 != 0) goto L_0x002e
            goto L_0x005f
        L_0x002e:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6 = r5.getConstructor()
            java.util.List r6 = r6.getParameters()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r8 = kotlin.p590y.C13187p.m40525a(r6, r2)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x0046:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x005b
            java.lang.Object r8 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r8 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r8
            kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl r9 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl
            r9.<init>(r8)
            r7.add(r9)
            goto L_0x0046
        L_0x005b:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(r5, r7, r4, r1, r4)
        L_0x005f:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.getUpperBound()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6 = r0.getConstructor()
            java.util.List r6 = r6.getParameters()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x00ad
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6 = r0.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r6 = r6.getDeclarationDescriptor()
            if (r6 != 0) goto L_0x007c
            goto L_0x00ad
        L_0x007c:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r6 = r0.getConstructor()
            java.util.List r6 = r6.getParameters()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = kotlin.p590y.C13187p.m40525a(r6, r2)
            r3.<init>(r2)
            java.util.Iterator r2 = r6.iterator()
        L_0x0094:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x00a9
            java.lang.Object r6 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r6
            kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl r7 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl
            r7.<init>(r6)
            r3.add(r7)
            goto L_0x0094
        L_0x00a9:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(r0, r3, r4, r1, r4)
        L_0x00ad:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r0 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r5, r0)
            goto L_0x0103
        L_0x00b2:
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType
            if (r0 == 0) goto L_0x0108
            r0 = r10
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r0
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r0.getConstructor()
            java.util.List r5 = r5.getParameters()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0103
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r0.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.getDeclarationDescriptor()
            if (r5 != 0) goto L_0x00d2
            goto L_0x0103
        L_0x00d2:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r0.getConstructor()
            java.util.List r5 = r5.getParameters()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = kotlin.p590y.C13187p.m40525a(r5, r2)
            r3.<init>(r2)
            java.util.Iterator r2 = r5.iterator()
        L_0x00ea:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ff
            java.lang.Object r5 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r5
            kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl r6 = new kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl
            r6.<init>(r5)
            r3.add(r6)
            goto L_0x00ea
        L_0x00ff:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt.replace$default(r0, r3, r4, r1, r4)
        L_0x0103:
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r10 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(r0, r10)
            return r10
        L_0x0108:
            kotlin.l r10 = new kotlin.l
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceArgumentsWithStarProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }
}
