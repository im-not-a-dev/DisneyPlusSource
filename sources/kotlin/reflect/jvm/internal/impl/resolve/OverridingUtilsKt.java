package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* compiled from: overridingUtils.kt */
public final class OverridingUtilsKt {
    public static final <D extends CallableDescriptor> void retainMostSpecificInEachOverridableGroup(Collection<D> collection) {
        Collection selectMostSpecificInEachOverridableGroup = selectMostSpecificInEachOverridableGroup(collection, C13100x48e71be5.INSTANCE);
        if (collection.size() != selectMostSpecificInEachOverridableGroup.size()) {
            collection.retainAll(selectMostSpecificInEachOverridableGroup);
        }
    }

    public static final <H> Collection<H> selectMostSpecificInEachOverridableGroup(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> function1) {
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet create = SmartSet.Companion.create();
        while (!linkedList.isEmpty()) {
            Object f = C13199w.m40589f((List) linkedList);
            SmartSet create2 = SmartSet.Companion.create();
            Collection extractMembersOverridableInBothWays = OverridingUtil.extractMembersOverridableInBothWays(f, linkedList, function1, new C13101x410e6287(create2));
            Intrinsics.checkReturnedValueIsNotNull((Object) extractMembersOverridableInBothWays, "OverridingUtil.extractMe…nflictedHandles.add(it) }");
            if (extractMembersOverridableInBothWays.size() != 1 || !create2.isEmpty()) {
                Object selectMostSpecificMember = OverridingUtil.selectMostSpecificMember(extractMembersOverridableInBothWays, function1);
                Intrinsics.checkReturnedValueIsNotNull(selectMostSpecificMember, "OverridingUtil.selectMos…roup, descriptorByHandle)");
                CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(selectMostSpecificMember);
                for (Object next : extractMembersOverridableInBothWays) {
                    Intrinsics.checkReturnedValueIsNotNull(next, "it");
                    if (!OverridingUtil.isMoreSpecific(callableDescriptor, (CallableDescriptor) function1.invoke(next))) {
                        create2.add(next);
                    }
                }
                if (!create2.isEmpty()) {
                    create.addAll(create2);
                }
                create.add(selectMostSpecificMember);
            } else {
                Object m = C13199w.m40602m(extractMembersOverridableInBothWays);
                Intrinsics.checkReturnedValueIsNotNull(m, "overridableGroup.single()");
                create.add(m);
            }
        }
        return create;
    }
}
