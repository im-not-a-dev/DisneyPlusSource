package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

/* compiled from: DescriptorUtils.kt */
final class DescriptorUtilsKt$declaresOrInheritsDefaultValue$1<N> implements Neighbors<N> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$1 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$1();

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$1() {
    }

    public final List<ValueParameterDescriptor> getNeighbors(ValueParameterDescriptor valueParameterDescriptor) {
        Intrinsics.checkReturnedValueIsNotNull((Object) valueParameterDescriptor, "current");
        Collection<ValueParameterDescriptor> overriddenDescriptors = valueParameterDescriptor.getOverriddenDescriptors();
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) overriddenDescriptors, 10));
        for (ValueParameterDescriptor original : overriddenDescriptors) {
            arrayList.add(original.getOriginal());
        }
        return arrayList;
    }
}
