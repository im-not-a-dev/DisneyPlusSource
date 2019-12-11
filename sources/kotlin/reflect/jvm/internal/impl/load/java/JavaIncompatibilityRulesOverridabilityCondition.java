package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.C13147x;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType.Primitive;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {
    public static final Companion Companion = new Companion(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class Companion {
        private Companion() {
        }

        private final boolean isPrimitiveCompareTo(FunctionDescriptor functionDescriptor) {
            boolean z = true;
            if (functionDescriptor.getValueParameters().size() != 1) {
                return false;
            }
            DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
            if (!(containingDeclaration instanceof ClassDescriptor)) {
                containingDeclaration = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
            if (classDescriptor != null) {
                List valueParameters = functionDescriptor.getValueParameters();
                Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "f.valueParameters");
                Object k = C13199w.m40599k(valueParameters);
                Intrinsics.checkReturnedValueIsNotNull(k, "f.valueParameters.single()");
                ClassifierDescriptor declarationDescriptor = ((ValueParameterDescriptor) k).getType().getConstructor().getDeclarationDescriptor();
                if (!(declarationDescriptor instanceof ClassDescriptor)) {
                    declarationDescriptor = null;
                }
                ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor;
                if (classDescriptor2 != null) {
                    if (!KotlinBuiltIns.isPrimitiveClass(classDescriptor) || !Intrinsics.areEqual((Object) DescriptorUtilsKt.getFqNameSafe(classDescriptor), (Object) DescriptorUtilsKt.getFqNameSafe(classDescriptor2))) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }

        private final JvmType mapValueParameterType(FunctionDescriptor functionDescriptor, ValueParameterDescriptor valueParameterDescriptor) {
            String str = "valueParameterDescriptor.type";
            if (MethodSignatureMappingKt.forceSingleValueParameterBoxing(functionDescriptor) || isPrimitiveCompareTo(functionDescriptor)) {
                KotlinType type = valueParameterDescriptor.getType();
                Intrinsics.checkReturnedValueIsNotNull((Object) type, str);
                return MethodSignatureMappingKt.mapToJvmType(TypeUtilsKt.makeNullable(type));
            }
            KotlinType type2 = valueParameterDescriptor.getType();
            Intrinsics.checkReturnedValueIsNotNull((Object) type2, str);
            return MethodSignatureMappingKt.mapToJvmType(type2);
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
            if ((callableDescriptor2 instanceof JavaMethodDescriptor) && (callableDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor;
                boolean z = javaMethodDescriptor.getValueParameters().size() == functionDescriptor.getValueParameters().size();
                if (!C13147x.f29590a || z) {
                    SimpleFunctionDescriptor original = javaMethodDescriptor.getOriginal();
                    Intrinsics.checkReturnedValueIsNotNull((Object) original, "subDescriptor.original");
                    List valueParameters = original.getValueParameters();
                    Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters, "subDescriptor.original.valueParameters");
                    FunctionDescriptor original2 = functionDescriptor.getOriginal();
                    Intrinsics.checkReturnedValueIsNotNull((Object) original2, "superDescriptor.original");
                    List valueParameters2 = original2.getValueParameters();
                    Intrinsics.checkReturnedValueIsNotNull((Object) valueParameters2, "superDescriptor.original.valueParameters");
                    for (Pair pair : C13199w.m40586e((Iterable) valueParameters, (Iterable) valueParameters2)) {
                        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.mo31013a();
                        ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.mo31014b();
                        FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) callableDescriptor2;
                        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, "subParameter");
                        boolean z2 = mapValueParameterType(functionDescriptor2, valueParameterDescriptor) instanceof Primitive;
                        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor2, "superParameter");
                        if (z2 != (mapValueParameterType(functionDescriptor, valueParameterDescriptor2) instanceof Primitive)) {
                            return true;
                        }
                    }
                } else {
                    throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final boolean isIncompatibleInAccordanceWithBuiltInOverridabilityRules(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && !KotlinBuiltIns.isBuiltIn(callableDescriptor2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
            FunctionDescriptor functionDescriptor = (FunctionDescriptor) callableDescriptor2;
            Name name = functionDescriptor.getName();
            String str = "subDescriptor.name";
            Intrinsics.checkReturnedValueIsNotNull((Object) name, str);
            if (!builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
                BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE;
                Name name2 = functionDescriptor.getName();
                Intrinsics.checkReturnedValueIsNotNull((Object) name2, str);
                if (!builtinMethodsWithDifferentJvmName.getSameAsRenamedInJvmBuiltin(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor overriddenSpecialBuiltin = SpecialBuiltinMembers.getOverriddenSpecialBuiltin((CallableMemberDescriptor) callableDescriptor);
            boolean z = callableDescriptor instanceof FunctionDescriptor;
            FunctionDescriptor functionDescriptor2 = (FunctionDescriptor) (!z ? null : callableDescriptor);
            if ((functionDescriptor2 == null || functionDescriptor.isHiddenToOvercomeSignatureClash() != functionDescriptor2.isHiddenToOvercomeSignatureClash()) && (overriddenSpecialBuiltin == null || !functionDescriptor.isHiddenToOvercomeSignatureClash())) {
                return true;
            }
            if ((classDescriptor instanceof JavaClassDescriptor) && functionDescriptor.getInitialSignatureDescriptor() == null && overriddenSpecialBuiltin != null && !SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(classDescriptor, overriddenSpecialBuiltin)) {
                if ((overriddenSpecialBuiltin instanceof FunctionDescriptor) && z && BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((FunctionDescriptor) overriddenSpecialBuiltin) != null) {
                    String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 2, null);
                    FunctionDescriptor original = ((FunctionDescriptor) callableDescriptor).getOriginal();
                    Intrinsics.checkReturnedValueIsNotNull((Object) original, "superDescriptor.original");
                    if (Intrinsics.areEqual((Object) computeJvmDescriptor$default, (Object) MethodSignatureMappingKt.computeJvmDescriptor$default(original, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public Contract getContract() {
        return Contract.CONFLICTS_ONLY;
    }

    public Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (isIncompatibleInAccordanceWithBuiltInOverridabilityRules(callableDescriptor, callableDescriptor2, classDescriptor)) {
            return Result.INCOMPATIBLE;
        }
        if (Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(callableDescriptor, callableDescriptor2)) {
            return Result.INCOMPATIBLE;
        }
        return Result.UNKNOWN;
    }
}
