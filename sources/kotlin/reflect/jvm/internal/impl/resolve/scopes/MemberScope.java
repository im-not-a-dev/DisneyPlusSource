package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: MemberScope.kt */
public interface MemberScope extends ResolutionScope {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: MemberScope.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final Function1<Name, Boolean> ALL_NAME_FILTER = MemberScope$Companion$ALL_NAME_FILTER$1.INSTANCE;

        private Companion() {
        }

        public final Function1<Name, Boolean> getALL_NAME_FILTER() {
            return ALL_NAME_FILTER;
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class DefaultImpls {
        public static void recordLookup(MemberScope memberScope, Name name, LookupLocation lookupLocation) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.recordLookup(memberScope, name, lookupLocation);
        }
    }

    /* compiled from: MemberScope.kt */
    public static final class Empty extends MemberScopeImpl {
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        public Set<Name> getFunctionNames() {
            return C13188p0.m40531a();
        }

        public Set<Name> getVariableNames() {
            return C13188p0.m40531a();
        }
    }

    Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation);

    Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation);

    Set<Name> getFunctionNames();

    Set<Name> getVariableNames();
}
