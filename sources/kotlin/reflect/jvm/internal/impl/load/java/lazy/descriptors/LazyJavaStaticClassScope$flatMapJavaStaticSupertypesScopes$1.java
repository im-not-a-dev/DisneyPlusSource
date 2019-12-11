package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

/* compiled from: LazyJavaStaticClassScope.kt */
final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1<N> implements Neighbors<N> {
    public static final LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1 INSTANCE = new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1();

    LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1() {
    }

    public final Iterable<ClassDescriptor> getNeighbors(ClassDescriptor classDescriptor) {
        C12880j.m40222a((Object) classDescriptor, "it");
        TypeConstructor typeConstructor = classDescriptor.getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "it.typeConstructor");
        Collection supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "it.typeConstructor.supertypes");
        return C12788p.m39991c(C12788p.m39996e(C13199w.m40577c((Iterable) supertypes), C129781.INSTANCE));
    }
}
