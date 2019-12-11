package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13142s;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* compiled from: StarProjectionImpl.kt */
public final class StarProjectionImplKt {
    public static final KotlinType starProjectionType(TypeParameterDescriptor typeParameterDescriptor) {
        DeclarationDescriptor containingDeclaration = typeParameterDescriptor.getContainingDeclaration();
        if (containingDeclaration != null) {
            TypeConstructor typeConstructor = ((ClassifierDescriptorWithTypeParameters) containingDeclaration).getTypeConstructor();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "classDescriptor.typeConstructor");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.checkReturnedValueIsNotNull((Object) parameters, "classDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) parameters, 10));
            for (TypeParameterDescriptor typeParameterDescriptor2 : parameters) {
                Intrinsics.checkReturnedValueIsNotNull((Object) typeParameterDescriptor2, "it");
                arrayList.add(typeParameterDescriptor2.getTypeConstructor());
            }
            TypeSubstitutor create = TypeSubstitutor.create((TypeSubstitution) new StarProjectionImplKt$starProjectionType$1(arrayList));
            List upperBounds = typeParameterDescriptor.getUpperBounds();
            Intrinsics.checkReturnedValueIsNotNull((Object) upperBounds, "this.upperBounds");
            KotlinType substitute = create.substitute((KotlinType) C13199w.m40589f(upperBounds), Variance.OUT_VARIANCE);
            if (substitute != null) {
                return substitute;
            }
            SimpleType defaultBound = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getDefaultBound();
            Intrinsics.checkReturnedValueIsNotNull((Object) defaultBound, "builtIns.defaultBound");
            return defaultBound;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
    }
}
