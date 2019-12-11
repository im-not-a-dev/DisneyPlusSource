package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class MemberComparator implements Comparator<DeclarationDescriptor> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final MemberComparator INSTANCE = new MemberComparator();
    private static final DescriptorRenderer RENDERER = DescriptorRenderer.Companion.withOptions(new Function1<DescriptorRendererOptions, C13145v>() {
        public C13145v invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            return C13145v.f29587a;
        }
    });

    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        /* access modifiers changed from: private */
        public static Integer compareInternal(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int declarationPriority = getDeclarationPriority(declarationDescriptor2) - getDeclarationPriority(declarationDescriptor);
            if (declarationPriority != 0) {
                return Integer.valueOf(declarationPriority);
            }
            if (DescriptorUtils.isEnumEntry(declarationDescriptor) && DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return Integer.valueOf(0);
            }
            int compareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        private static int getDeclarationPriority(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 6 : 5;
            }
            if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 4 : 3;
            }
            if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            }
            return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
        }

        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer compareInternal = compareInternal(declarationDescriptor, declarationDescriptor2);
            if (compareInternal != null) {
                return compareInternal.intValue();
            }
            return 0;
        }
    }

    static {
        Class<MemberComparator> cls = MemberComparator.class;
    }

    private MemberComparator() {
    }

    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        Integer access$000 = NameAndTypeMemberComparator.compareInternal(declarationDescriptor, declarationDescriptor2);
        if (access$000 != null) {
            return access$000.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            int compareTo = RENDERER.renderType(((TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(RENDERER.renderType(((TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if (!(declarationDescriptor instanceof CallableDescriptor) || !(declarationDescriptor2 instanceof CallableDescriptor)) {
            int i = 1;
            if (!(declarationDescriptor instanceof ClassDescriptor) || !(declarationDescriptor2 instanceof ClassDescriptor)) {
                throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", new Object[]{declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()}));
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                if (!classDescriptor.isCompanionObject()) {
                    i = -1;
                }
                return i;
            }
        } else {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                int compareTo2 = RENDERER.renderType(extensionReceiverParameter.getType()).compareTo(RENDERER.renderType(extensionReceiverParameter2.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List valueParameters = callableDescriptor.getValueParameters();
            List valueParameters2 = callableDescriptor2.getValueParameters();
            for (int i2 = 0; i2 < Math.min(valueParameters.size(), valueParameters2.size()); i2++) {
                int compareTo3 = RENDERER.renderType(((ValueParameterDescriptor) valueParameters.get(i2)).getType()).compareTo(RENDERER.renderType(((ValueParameterDescriptor) valueParameters2.get(i2)).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            int size = valueParameters.size() - valueParameters2.size();
            if (size != 0) {
                return size;
            }
            List typeParameters = callableDescriptor.getTypeParameters();
            List typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i3 = 0; i3 < Math.min(typeParameters.size(), typeParameters2.size()); i3++) {
                List upperBounds = ((TypeParameterDescriptor) typeParameters.get(i3)).getUpperBounds();
                List upperBounds2 = ((TypeParameterDescriptor) typeParameters2.get(i3)).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i4 = 0; i4 < upperBounds.size(); i4++) {
                    int compareTo4 = RENDERER.renderType((KotlinType) upperBounds.get(i4)).compareTo(RENDERER.renderType((KotlinType) upperBounds2.get(i4)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor)) {
                int ordinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal();
                if (ordinal != 0) {
                    return ordinal;
                }
            }
        }
        int compareTo5 = RENDERER.render(declarationDescriptor).compareTo(RENDERER.render(declarationDescriptor2));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        return DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
