package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes.Companion;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.Check.DefaultImpls;

/* compiled from: modifierChecks.kt */
final class IsKPropertyCheck implements Check {
    public static final IsKPropertyCheck INSTANCE = new IsKPropertyCheck();
    private static final String description = description;

    private IsKPropertyCheck() {
    }

    public boolean check(FunctionDescriptor functionDescriptor) {
        ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) functionDescriptor.getValueParameters().get(1);
        Companion companion = ReflectionTypes.Companion;
        C12880j.m40222a((Object) valueParameterDescriptor, "secondParameter");
        KotlinType createKPropertyStarType = companion.createKPropertyStarType(DescriptorUtilsKt.getModule(valueParameterDescriptor));
        if (createKPropertyStarType == null) {
            return false;
        }
        KotlinType type = valueParameterDescriptor.getType();
        C12880j.m40222a((Object) type, "secondParameter.type");
        return TypeUtilsKt.isSubtypeOf(createKPropertyStarType, TypeUtilsKt.makeNotNullable(type));
    }

    public String getDescription() {
        return description;
    }

    public String invoke(FunctionDescriptor functionDescriptor) {
        return DefaultImpls.invoke(this, functionDescriptor);
    }
}
