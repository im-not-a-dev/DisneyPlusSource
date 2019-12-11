package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.C13147x;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: constantValues.kt */
public final class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {
    private final Function1<ModuleDescriptor, KotlinType> computeType;

    public ArrayValue(List<? extends ConstantValue<?>> list, Function1<? super ModuleDescriptor, ? extends KotlinType> function1) {
        super(list);
        this.computeType = function1;
    }

    public KotlinType getType(ModuleDescriptor moduleDescriptor) {
        KotlinType kotlinType = (KotlinType) this.computeType.invoke(moduleDescriptor);
        boolean z = KotlinBuiltIns.isArray(kotlinType) || KotlinBuiltIns.isPrimitiveArray(kotlinType);
        if (!C13147x.f29590a || z) {
            return kotlinType;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type should be an array, but was ");
        sb.append(kotlinType);
        sb.append(": ");
        sb.append((List) getValue());
        throw new AssertionError(sb.toString());
    }
}
