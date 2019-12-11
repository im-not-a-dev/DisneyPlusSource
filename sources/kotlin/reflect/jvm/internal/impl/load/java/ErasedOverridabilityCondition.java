package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.p587i0.C12775h;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: ErasedOverridabilityCondition.kt */
public final class ErasedOverridabilityCondition implements ExternalOverridabilityCondition {

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Result.values().length];

        static {
            $EnumSwitchMapping$0[Result.OVERRIDABLE.ordinal()] = 1;
        }
    }

    public Contract getContract() {
        return Contract.SUCCESS_ONLY;
    }

    public ExternalOverridabilityCondition.Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        boolean z;
        ExternalOverridabilityCondition.Result result;
        boolean z2;
        if (callableDescriptor2 instanceof JavaMethodDescriptor) {
            JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) callableDescriptor2;
            List typeParameters = javaMethodDescriptor.getTypeParameters();
            C12880j.m40222a((Object) typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                OverrideCompatibilityInfo basicOverridabilityProblem = OverridingUtil.getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
                if ((basicOverridabilityProblem != null ? basicOverridabilityProblem.getResult() : null) != null) {
                    return ExternalOverridabilityCondition.Result.UNKNOWN;
                }
                List valueParameters = javaMethodDescriptor.getValueParameters();
                C12880j.m40222a((Object) valueParameters, "subDescriptor.valueParameters");
                C12775h d = C12788p.m39994d(C13199w.m40577c((Iterable) valueParameters), ErasedOverridabilityCondition$isOverridable$signatureTypes$1.INSTANCE);
                KotlinType returnType = javaMethodDescriptor.getReturnType();
                if (returnType != null) {
                    C12775h a = C12788p.m39988a(d, returnType);
                    ReceiverParameterDescriptor extensionReceiverParameter = javaMethodDescriptor.getExtensionReceiverParameter();
                    Iterator it = C12788p.m39987a(a, (Iterable<? extends T>) C13185o.m40517b(extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        KotlinType kotlinType = (KotlinType) it.next();
                        if (!(!kotlinType.getArguments().isEmpty()) || (kotlinType.unwrap() instanceof RawTypeImpl)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                    CallableDescriptor callableDescriptor3 = (CallableDescriptor) callableDescriptor.substitute(RawSubstitution.INSTANCE.buildSubstitutor());
                    if (callableDescriptor3 == null) {
                        return ExternalOverridabilityCondition.Result.UNKNOWN;
                    }
                    if (callableDescriptor3 instanceof SimpleFunctionDescriptor) {
                        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) callableDescriptor3;
                        List typeParameters2 = simpleFunctionDescriptor.getTypeParameters();
                        C12880j.m40222a((Object) typeParameters2, "erasedSuper.typeParameters");
                        if (!typeParameters2.isEmpty()) {
                            callableDescriptor3 = simpleFunctionDescriptor.newCopyBuilder().setTypeParameters(C13185o.m40513a()).build();
                            if (callableDescriptor3 == null) {
                                C12880j.m40220a();
                                throw null;
                            }
                        }
                    }
                    OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = OverridingUtil.DEFAULT.isOverridableByWithoutExternalConditions(callableDescriptor3, callableDescriptor2, false);
                    C12880j.m40222a((Object) isOverridableByWithoutExternalConditions, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                    Result result2 = isOverridableByWithoutExternalConditions.getResult();
                    C12880j.m40222a((Object) result2, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                    if (WhenMappings.$EnumSwitchMapping$0[result2.ordinal()] != 1) {
                        result = ExternalOverridabilityCondition.Result.UNKNOWN;
                    } else {
                        result = ExternalOverridabilityCondition.Result.OVERRIDABLE;
                    }
                    return result;
                }
                C12880j.m40220a();
                throw null;
            }
        }
        return ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
