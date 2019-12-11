package kotlin.reflect.jvm.internal.impl.types;

import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl;

public class DescriptorSubstitutor {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 4 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "typeParameters";
                break;
        }
        String str3 = "substituteTypeParameters";
        if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i != 4) {
            objArr[2] = str3;
        }
        String format = String.format(str, objArr);
        throw (i != 4 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public static TypeSubstitutor substituteTypeParameters(List<TypeParameterDescriptor> list, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, List<TypeParameterDescriptor> list2) {
        if (list == null) {
            $$$reportNull$$$0(0);
        }
        if (typeSubstitution == null) {
            $$$reportNull$$$0(1);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(2);
        }
        if (list2 == null) {
            $$$reportNull$$$0(3);
        }
        TypeSubstitutor substituteTypeParameters = substituteTypeParameters(list, typeSubstitution, declarationDescriptor, list2, null);
        if (substituteTypeParameters != null) {
            if (substituteTypeParameters == null) {
                $$$reportNull$$$0(4);
            }
            return substituteTypeParameters;
        }
        throw new AssertionError("Substitution failed");
    }

    public static TypeSubstitutor substituteTypeParameters(List<TypeParameterDescriptor> list, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, List<TypeParameterDescriptor> list2, boolean[] zArr) {
        TypeSubstitution typeSubstitution2 = typeSubstitution;
        List<TypeParameterDescriptor> list3 = list2;
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (typeSubstitution2 == null) {
            $$$reportNull$$$0(6);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (list3 == null) {
            $$$reportNull$$$0(8);
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int i = 0;
        for (TypeParameterDescriptor typeParameterDescriptor : list) {
            int i2 = i + 1;
            TypeParameterDescriptorImpl createForFurtherModification = TypeParameterDescriptorImpl.createForFurtherModification(declarationDescriptor, typeParameterDescriptor.getAnnotations(), typeParameterDescriptor.isReified(), typeParameterDescriptor.getVariance(), typeParameterDescriptor.getName(), i, SourceElement.NO_SOURCE);
            hashMap.put(typeParameterDescriptor.getTypeConstructor(), new TypeProjectionImpl(createForFurtherModification.getDefaultType()));
            hashMap2.put(typeParameterDescriptor, createForFurtherModification);
            list3.add(createForFurtherModification);
            i = i2;
        }
        TypeSubstitutor createChainedSubstitutor = TypeSubstitutor.createChainedSubstitutor(typeSubstitution2, TypeConstructorSubstitution.createByConstructorsMap(hashMap));
        for (TypeParameterDescriptor typeParameterDescriptor2 : list) {
            TypeParameterDescriptorImpl typeParameterDescriptorImpl = (TypeParameterDescriptorImpl) hashMap2.get(typeParameterDescriptor2);
            for (KotlinType kotlinType : typeParameterDescriptor2.getUpperBounds()) {
                KotlinType substitute = createChainedSubstitutor.substitute(kotlinType, Variance.IN_VARIANCE);
                if (substitute == null) {
                    return null;
                }
                if (!(substitute == kotlinType || zArr == null)) {
                    zArr[0] = true;
                }
                typeParameterDescriptorImpl.addUpperBound(substitute);
            }
            typeParameterDescriptorImpl.setInitialized();
        }
        return createChainedSubstitutor;
    }
}
