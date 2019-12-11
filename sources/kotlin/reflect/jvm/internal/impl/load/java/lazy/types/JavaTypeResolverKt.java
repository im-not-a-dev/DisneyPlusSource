package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImplKt;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolverKt {
    /* access modifiers changed from: private */
    public static final FqName JAVA_LANG_CLASS_FQ_NAME = new FqName("java.lang.Class");

    public static final KotlinType getErasedUpperBound(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, Function0<? extends KotlinType> function0) {
        if (typeParameterDescriptor == typeParameterDescriptor2) {
            return (KotlinType) function0.invoke();
        }
        List upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "upperBounds");
        KotlinType kotlinType = (KotlinType) C13199w.m40589f(upperBounds);
        if (kotlinType.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
            Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType, "firstUpperBound");
            return TypeUtilsKt.replaceArgumentsWithStarProjections(kotlinType);
        }
        if (typeParameterDescriptor2 != null) {
            typeParameterDescriptor = typeParameterDescriptor2;
        }
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        String str = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor";
        if (declarationDescriptor != null) {
            while (true) {
                TypeParameterDescriptor typeParameterDescriptor3 = (TypeParameterDescriptor) declarationDescriptor;
                if (!(!Intrinsics.areEqual((Object) typeParameterDescriptor3, (Object) typeParameterDescriptor))) {
                    return (KotlinType) function0.invoke();
                }
                List upperBounds2 = typeParameterDescriptor3.getUpperBounds();
                Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds2, "current.upperBounds");
                KotlinType kotlinType2 = (KotlinType) C13199w.m40589f(upperBounds2);
                if (kotlinType2.getConstructor().getDeclarationDescriptor() instanceof ClassDescriptor) {
                    Intrinsics.checkReturnedValueIsNotNull((Object) kotlinType2, "nextUpperBound");
                    return TypeUtilsKt.replaceArgumentsWithStarProjections(kotlinType2);
                }
                declarationDescriptor = kotlinType2.getConstructor().getDeclarationDescriptor();
                if (declarationDescriptor == null) {
                    throw new TypeCastException(str);
                }
            }
        } else {
            throw new TypeCastException(str);
        }
    }

    public static /* synthetic */ KotlinType getErasedUpperBound$default(TypeParameterDescriptor typeParameterDescriptor, TypeParameterDescriptor typeParameterDescriptor2, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            typeParameterDescriptor2 = null;
        }
        if ((i & 2) != 0) {
            function0 = new JavaTypeResolverKt$getErasedUpperBound$1(typeParameterDescriptor);
        }
        return getErasedUpperBound(typeParameterDescriptor, typeParameterDescriptor2, function0);
    }

    public static final TypeProjection makeStarProjection(TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes) {
        if (javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) {
            return new TypeProjectionImpl(StarProjectionImplKt.starProjectionType(typeParameterDescriptor));
        }
        return new StarProjectionImpl(typeParameterDescriptor);
    }

    public static final JavaTypeAttributes toAttributes(TypeUsage typeUsage, boolean z, TypeParameterDescriptor typeParameterDescriptor) {
        JavaTypeAttributes javaTypeAttributes = new JavaTypeAttributes(typeUsage, null, z, typeParameterDescriptor, 2, null);
        return javaTypeAttributes;
    }

    public static /* synthetic */ JavaTypeAttributes toAttributes$default(TypeUsage typeUsage, boolean z, TypeParameterDescriptor typeParameterDescriptor, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            typeParameterDescriptor = null;
        }
        return toAttributes(typeUsage, z, typeParameterDescriptor);
    }
}
