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
public final class UShortValue extends UnsignedValueConstant<Short> {
    public UShortValue(short s) {
        super(Short.valueOf(s));
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        ClassId classId = KotlinBuiltIns.FQ_NAMES.uShort;
        C12880j.m40222a((Object) classId, "KotlinBuiltIns.FQ_NAMES.uShort");
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies != null) {
            SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
            if (defaultType != null) {
                return defaultType;
            }
        }
        SimpleType createErrorType = ErrorUtils.createErrorType("Unsigned type UShort not found");
        C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorTy…d type UShort not found\")");
        return createErrorType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).shortValue());
        sb.append(".toUShort()");
        return sb.toString();
    }
}
