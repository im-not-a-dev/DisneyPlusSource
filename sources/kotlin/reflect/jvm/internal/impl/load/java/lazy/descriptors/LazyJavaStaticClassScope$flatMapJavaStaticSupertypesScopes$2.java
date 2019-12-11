package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Set;
import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2 extends AbstractNodeHandler<ClassDescriptor, C13145v> {
    final /* synthetic */ Function1 $onJavaStaticScope;
    final /* synthetic */ Set $result;
    final /* synthetic */ ClassDescriptor $root;

    LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(ClassDescriptor classDescriptor, Set set, Function1 function1) {
        this.$root = classDescriptor;
        this.$result = set;
        this.$onJavaStaticScope = function1;
    }

    public void result() {
    }

    public boolean beforeChildren(ClassDescriptor classDescriptor) {
        if (classDescriptor == this.$root) {
            return true;
        }
        MemberScope staticScope = classDescriptor.getStaticScope();
        C12880j.m40222a((Object) staticScope, "current.staticScope");
        if (!(staticScope instanceof LazyJavaStaticScope)) {
            return true;
        }
        this.$result.addAll((Collection) this.$onJavaStaticScope.invoke(staticScope));
        return false;
    }
}
