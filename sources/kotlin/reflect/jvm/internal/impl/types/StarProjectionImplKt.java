package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
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
            C12880j.m40222a((Object) typeConstructor, "classDescriptor.typeConstructor");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            C12880j.m40222a((Object) parameters, "classDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) parameters, 10));
            for (TypeParameterDescriptor typeParameterDescriptor2 : parameters) {
                C12880j.m40222a((Object) typeParameterDescriptor2, "it");
                arrayList.add(typeParameterDescriptor2.getTypeConstructor());
            }
            TypeSubstitutor create = TypeSubstitutor.create((TypeSubstitution) new StarProjectionImplKt$starProjectionType$1(arrayList));
            List upperBounds = typeParameterDescriptor.getUpperBounds();
            C12880j.m40222a((Object) upperBounds, "this.upperBounds");
            KotlinType substitute = create.substitute((KotlinType) C13199w.m40589f(upperBounds), Variance.OUT_VARIANCE);
            if (substitute != null) {
                return substitute;
            }
            SimpleType defaultBound = DescriptorUtilsKt.getBuiltIns(typeParameterDescriptor).getDefaultBound();
            C12880j.m40222a((Object) defaultBound, "builtIns.defaultBound");
            return defaultBound;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassifierDescriptorWithTypeParameters");
    }
}
