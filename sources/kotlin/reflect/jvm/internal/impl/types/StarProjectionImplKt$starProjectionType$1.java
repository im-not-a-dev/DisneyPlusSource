package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.C13142s;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;

/* compiled from: StarProjectionImpl.kt */
public final class StarProjectionImplKt$starProjectionType$1 extends TypeConstructorSubstitution {
    final /* synthetic */ List $typeParameters;

    StarProjectionImplKt$starProjectionType$1(List list) {
        this.$typeParameters = list;
    }

    public TypeProjection get(TypeConstructor typeConstructor) {
        if (!this.$typeParameters.contains(typeConstructor)) {
            return null;
        }
        ClassifierDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return TypeUtils.makeStarProjection((TypeParameterDescriptor) declarationDescriptor);
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
    }
}
