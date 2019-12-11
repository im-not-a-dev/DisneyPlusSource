package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Contract;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result;

/* compiled from: FieldOverridabilityCondition.kt */
public final class FieldOverridabilityCondition implements ExternalOverridabilityCondition {
    public Contract getContract() {
        return Contract.BOTH;
    }

    public Result isOverridable(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (!(callableDescriptor2 instanceof PropertyDescriptor) || !(callableDescriptor instanceof PropertyDescriptor)) {
            return Result.UNKNOWN;
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor2;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor;
        if (!C12880j.m40224a((Object) propertyDescriptor.getName(), (Object) propertyDescriptor2.getName())) {
            return Result.UNKNOWN;
        }
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) && JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
            return Result.OVERRIDABLE;
        }
        if (JavaDescriptorUtilKt.isJavaField(propertyDescriptor) || JavaDescriptorUtilKt.isJavaField(propertyDescriptor2)) {
            return Result.INCOMPATIBLE;
        }
        return Result.UNKNOWN;
    }
}
