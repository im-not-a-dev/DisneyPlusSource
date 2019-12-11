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
public final class UByteValue extends UnsignedValueConstant<Byte> {
    public UByteValue(byte b) {
        super(Byte.valueOf(b));
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        ClassId classId = KotlinBuiltIns.FQ_NAMES.uByte;
        C12880j.m40222a((Object) classId, "KotlinBuiltIns.FQ_NAMES.uByte");
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, classId);
        if (findClassAcrossModuleDependencies != null) {
            SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
            if (defaultType != null) {
                return defaultType;
            }
        }
        SimpleType createErrorType = ErrorUtils.createErrorType("Unsigned type UByte not found");
        C12880j.m40222a((Object) createErrorType, "ErrorUtils.createErrorTy…ed type UByte not found\")");
        return createErrorType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) getValue()).byteValue());
        sb.append(".toUByte()");
        return sb.toString();
    }
}
