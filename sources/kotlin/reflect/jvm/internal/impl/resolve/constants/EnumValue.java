package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.C12907r;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* compiled from: constantValues.kt */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {
    private final ClassId enumClassId;
    private final Name enumEntryName;

    public EnumValue(ClassId classId, Name name) {
        super(C12907r.m40244a(classId, name));
        this.enumClassId = classId;
        this.enumEntryName = name;
    }

    public final Name getEnumEntryName() {
        return this.enumEntryName;
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        ClassDescriptor findClassAcrossModuleDependencies = FindClassInModuleKt.findClassAcrossModuleDependencies(moduleDescriptor, this.enumClassId);
        if (findClassAcrossModuleDependencies != null) {
            if (!DescriptorUtils.isEnumClass(findClassAcrossModuleDependencies)) {
                findClassAcrossModuleDependencies = null;
            }
            if (findClassAcrossModuleDependencies != null) {
                SimpleType defaultType = findClassAcrossModuleDependencies.getDefaultType();
                if (defaultType != null) {
                    return defaultType;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Containing class for error-class based enum entry ");
        sb.append(this.enumClassId);
        sb.append('.');
        sb.append(this.enumEntryName);
        SimpleType createErrorType = ErrorUtils.createErrorType(sb.toString());
        Intrinsics.checkReturnedValueIsNotNull((Object) createErrorType, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return createErrorType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.enumClassId.getShortClassName());
        sb.append('.');
        sb.append(this.enumEntryName);
        return sb.toString();
    }
}
