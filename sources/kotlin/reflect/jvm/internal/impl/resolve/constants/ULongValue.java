package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class ULongValue extends UnsignedValueConstant<Long> {
    public ULongValue(long j) {
        super(Long.valueOf(j));
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        ClassId classId = KotlinBuiltIns.FQ_NAMES.uLong;
        C12880j.m40222a((Object) classId, "KotlinBuiltIns.FQ_NAMES.uLong");
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies != null) {
            SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
            if (defaultType != null) {
                return defaultType;
            }
        }
        SimpleType createErrorType = ErrorUtils.createErrorType("Unsigned type ULong not found");
        C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorTy…ed type ULong not found\")");
        return createErrorType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).longValue());
        sb.append(".toULong()");
        return sb.toString();
    }
}
