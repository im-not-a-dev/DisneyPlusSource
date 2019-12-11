package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: inlineClassManglingRules.kt */
public final class InlineClassManglingRulesKt {
    private static final boolean isDontMangleClass(ClassDescriptor classDescriptor) {
        return C12880j.m40224a((Object) DescriptorUtilsKt.getFqNameSafe(classDescriptor), (Object) DescriptorUtils.RESULT_FQ_NAME);
    }

    public static final boolean isInlineClassThatRequiresMangling(DeclarationDescriptor declarationDescriptor) {
        return InlineClassesUtilsKt.isInlineClass(declarationDescriptor) && !isDontMangleClass((ClassDescriptor) declarationDescriptor);
    }

    private static final boolean isTypeParameterWithUpperBoundThatRequiresMangling(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof TypeParameterDescriptor)) {
            declarationDescriptor = null;
        }
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) declarationDescriptor;
        if (typeParameterDescriptor != null) {
            return requiresFunctionNameMangling(TypeUtilsKt.getRepresentativeUpperBound(typeParameterDescriptor));
        }
        return false;
    }

    private static final boolean requiresFunctionNameMangling(KotlinType kotlinType) {
        return isInlineClassThatRequiresMangling(kotlinType) || isTypeParameterWithUpperBoundThatRequiresMangling(kotlinType);
    }

    public static final boolean shouldHideConstructorDueToInlineClassTypeValueParameters(CallableMemberDescriptor callableMemberDescriptor) {
        if (!(callableMemberDescriptor instanceof ClassConstructorDescriptor)) {
            callableMemberDescriptor = null;
        }
        ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) callableMemberDescriptor;
        boolean z = false;
        if (classConstructorDescriptor != null) {
            if (Visibilities.isPrivate(classConstructorDescriptor.getVisibility())) {
                return false;
            }
            ClassDescriptor constructedClass = classConstructorDescriptor.getConstructedClass();
            C12880j.m40222a((Object) constructedClass, "constructorDescriptor.constructedClass");
            if (constructedClass.isInline() || DescriptorUtils.isSealedClass(classConstructorDescriptor.getConstructedClass())) {
                return false;
            }
            List valueParameters = classConstructorDescriptor.getValueParameters();
            C12880j.m40222a((Object) valueParameters, "constructorDescriptor.valueParameters");
            if (!(valueParameters instanceof Collection) || !valueParameters.isEmpty()) {
                Iterator it = valueParameters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) it.next();
                    C12880j.m40222a((Object) valueParameterDescriptor, "it");
                    KotlinType type = valueParameterDescriptor.getType();
                    C12880j.m40222a((Object) type, "it.type");
                    if (requiresFunctionNameMangling(type)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public static final boolean isInlineClassThatRequiresMangling(KotlinType kotlinType) {
        ClassifierDescriptor declarationDescriptor = kotlinType.getConstructor().getDeclarationDescriptor();
        return declarationDescriptor != null && isInlineClassThatRequiresMangling((DeclarationDescriptor) declarationDescriptor);
    }
}
