package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

/* compiled from: LazyJavaStaticClassScope.kt */
final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1<N> implements Neighbors<N> {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1 INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1();

    LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1() {
    }

    public final Iterable<ClassDescriptor> getNeighbors(ClassDescriptor classDescriptor) {
        Intrinsics.checkReturnedValueIsNotNull((Object) classDescriptor, "it");
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeConstructor, "it.typeConstructor");
        Collection supertypes = typeConstructor.getSupertypes();
        Intrinsics.checkReturnedValueIsNotNull((Object) supertypes, "it.typeConstructor.supertypes");
        return C12788p.m39991c(C12788p.m39996e(C13199w.m40577c((Iterable) supertypes), C129781.INSTANCE));
    }
}
