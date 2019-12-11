package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.OperatorChecks;

public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final UserDataKey<ValueParameterDescriptor> ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER = new UserDataKey<ValueParameterDescriptor>() {
    };
    private ParameterNamesStatus parameterNamesStatus;

    private enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);
        
        public final boolean isStable;
        public final boolean isSynthesized;

        private ParameterNamesStatus(boolean z, boolean z2) {
            this.isStable = z;
            this.isSynthesized = z2;
        }

        public static ParameterNamesStatus get(boolean z, boolean z2) {
            ParameterNamesStatus parameterNamesStatus = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            if (parameterNamesStatus == null) {
                $$$reportNull$$$0(0);
            }
            return parameterNamesStatus;
        }
    }

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = (i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 12 || i == 17 || i == 20) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        switch (i) {
            case 1:
            case 6:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 14:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 16:
                objArr[0] = "source";
                break;
            case 9:
                objArr[0] = "typeParameters";
                break;
            case 10:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 11:
                objArr[0] = "visibility";
                break;
            case 12:
            case 17:
            case 20:
                objArr[0] = str2;
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createSubstitutedCopy";
        String str5 = "initialize";
        if (i == 12) {
            objArr[1] = str5;
        } else if (i == 17) {
            objArr[1] = str4;
        } else if (i != 20) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
                objArr[2] = str5;
                break;
            case 12:
            case 17:
            case 20:
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = str4;
                break;
            case 18:
            case 19:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 12 || i == 17 || i == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    protected JavaMethodDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, Kind kind, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(0);
        }
        if (annotations == null) {
            $$$reportNull$$$0(1);
        }
        if (name == null) {
            $$$reportNull$$$0(2);
        }
        if (kind == null) {
            $$$reportNull$$$0(3);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(4);
        }
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        this.parameterNamesStatus = null;
    }

    public static JavaMethodDescriptor createJavaMethod(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(5);
        }
        if (annotations == null) {
            $$$reportNull$$$0(6);
        }
        if (name == null) {
            $$$reportNull$$$0(7);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(8);
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, null, annotations, name, Kind.DECLARATION, sourceElement);
        return javaMethodDescriptor;
    }

    public boolean hasStableParameterNames() {
        return this.parameterNamesStatus.isStable;
    }

    public boolean hasSynthesizedParameterNames() {
        return this.parameterNamesStatus.isSynthesized;
    }

    public SimpleFunctionDescriptorImpl initialize(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends TypeParameterDescriptor> list, List<ValueParameterDescriptor> list2, KotlinType kotlinType, Modality modality, Visibility visibility, Map<? extends UserDataKey<?>, ?> map) {
        if (list == null) {
            $$$reportNull$$$0(9);
        }
        if (list2 == null) {
            $$$reportNull$$$0(10);
        }
        if (visibility == null) {
            $$$reportNull$$$0(11);
        }
        SimpleFunctionDescriptorImpl initialize = super.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, visibility, map);
        setOperator(OperatorChecks.INSTANCE.check(initialize).isSuccess());
        if (initialize == null) {
            $$$reportNull$$$0(12);
        }
        return initialize;
    }

    public void setParameterNamesStatus(boolean z, boolean z2) {
        this.parameterNamesStatus = ParameterNamesStatus.get(z, z2);
    }

    /* access modifiers changed from: protected */
    public JavaMethodDescriptor createSubstitutedCopy(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(13);
        }
        if (kind == null) {
            $$$reportNull$$$0(14);
        }
        if (annotations == null) {
            $$$reportNull$$$0(15);
        }
        if (sourceElement == null) {
            $$$reportNull$$$0(16);
        }
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = getName();
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        javaMethodDescriptor.setParameterNamesStatus(hasStableParameterNames(), hasSynthesizedParameterNames());
        return javaMethodDescriptor;
    }

    public JavaMethodDescriptor enhance(KotlinType kotlinType, List<ValueParameterData> list, KotlinType kotlinType2, Pair<UserDataKey<?>, ?> pair) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        if (list == null) {
            $$$reportNull$$$0(18);
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(19);
        }
        List copyValueParameters = UtilKt.copyValueParameters(list, getValueParameters(), this);
        if (kotlinType == null) {
            receiverParameterDescriptor = null;
        } else {
            receiverParameterDescriptor = DescriptorFactory.createExtensionReceiverParameterForCallable(this, kotlinType, Annotations.Companion.getEMPTY());
        }
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) newCopyBuilder().setValueParameters(copyValueParameters).setReturnType(kotlinType2).setExtensionReceiverParameter(receiverParameterDescriptor).setDropOriginalInContainingParts().setPreserveSourceElement().build();
        if (pair != null) {
            javaMethodDescriptor.putInUserDataMap((UserDataKey) pair.mo31015c(), pair.mo31016d());
        }
        if (javaMethodDescriptor == null) {
            $$$reportNull$$$0(20);
        }
        return javaMethodDescriptor;
    }
}
