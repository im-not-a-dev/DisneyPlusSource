package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private Boolean hasStableParameterNames;
    private Boolean hasSynthesizedParameterNames;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 11 || i == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 11 || i == 18) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = str2;
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createSubstitutedCopy";
        if (i == 11) {
            objArr[1] = str4;
        } else if (i != 18) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = str4;
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 11 || i == 18) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    protected JavaClassConstructorDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Annotations annotations, boolean z, Kind kind, SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (kind == null) {
            $$$reportNull$$$0(2);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(3);
        }
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z, kind, sourceElement);
        this.hasStableParameterNames = null;
        this.hasSynthesizedParameterNames = null;
    }

    public static JavaClassConstructorDescriptor createJavaConstructor(ClassDescriptor classDescriptor, Annotations annotations, boolean z, SourceElement sourceElement) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(4);
        }
        if (annotations == null) {
            $$$reportNull$$$0(5);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(6);
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptor = new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z, Kind.DECLARATION, sourceElement);
        return javaClassConstructorDescriptor;
    }

    /* access modifiers changed from: protected */
    public JavaClassConstructorDescriptor createDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Kind kind, SourceElement sourceElement, Annotations annotations) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(12);
        }
        if (kind == null) {
            $$$reportNull$$$0(13);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(14);
        }
        if (annotations == null) {
            $$$reportNull$$$0(15);
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptor2 = new JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.isPrimary, kind, sourceElement);
        return javaClassConstructorDescriptor2;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames.booleanValue();
    }

    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames.booleanValue();
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = Boolean.valueOf(z);
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = Boolean.valueOf(z);
    }

    public JavaClassConstructorDescriptor enhance(KotlinType kotlinType, List<ValueParameterData> list, KotlinType kotlinType2, Pair<UserDataKey<?>, ?> pair) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(17);
        }
        JavaClassConstructorDescriptor createSubstitutedCopy = createSubstitutedCopy((DeclarationDescriptor) getContainingDeclaration(), (FunctionDescriptor) null, getKind(), (Name) null, getAnnotations(), getSource());
        if (kotlinType == null) {
            receiverParameterDescriptor = null;
        } else {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(createSubstitutedCopy, kotlinType, Annotations.Companion.getEMPTY());
        }
        createSubstitutedCopy.initialize(receiverParameterDescriptor, getDispatchReceiverParameter(), getTypeParameters(), UtilKt.copyValueParameters(list, getValueParameters(), createSubstitutedCopy), kotlinType2, getModality(), getVisibility());
        if (pair != null) {
            createSubstitutedCopy.putInUserDataMap((UserDataKey) pair.mo31015c(), pair.mo31016d());
        }
        if (createSubstitutedCopy == null) {
            $$$reportNull$$$0(18);
        }
        return createSubstitutedCopy;
    }

    /* access modifiers changed from: protected */
    public JavaClassConstructorDescriptor createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(7);
        }
        if (kind == null) {
            $$$reportNull$$$0(8);
        }
        if (annotations == null) {
            $$$reportNull$$$0(9);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(10);
        }
        if (kind == Kind.DECLARATION || kind == Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor createDescriptor = createDescriptor((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
            createDescriptor.setHasStableParameterNames(hasStableParameterNames());
            createDescriptor.setHasSynthesizedParameterNames(hasSynthesizedParameterNames());
            if (createDescriptor == null) {
                $$$reportNull$$$0(11);
            }
            return createDescriptor;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
        sb.append(this);
        String str = "\n";
        sb.append(str);
        sb.append("newOwner: ");
        sb.append(declarationDescriptor);
        sb.append(str);
        sb.append("kind: ");
        sb.append(kind);
        throw new IllegalStateException(sb.toString());
    }
}
