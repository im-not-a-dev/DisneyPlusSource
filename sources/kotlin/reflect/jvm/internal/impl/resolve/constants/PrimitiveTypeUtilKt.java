package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: PrimitiveTypeUtil.kt */
public final class PrimitiveTypeUtilKt {
    public static final Collection<KotlinType> getAllSignedLiteralTypes(ModuleDescriptor moduleDescriptor) {
        return C13185o.m40520c(moduleDescriptor.getBuiltIns().getIntType(), moduleDescriptor.getBuiltIns().getLongType(), moduleDescriptor.getBuiltIns().getByteType(), moduleDescriptor.getBuiltIns().getShortType());
    }
}
