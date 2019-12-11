package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

/* compiled from: ChainedMemberScope.kt */
public final class ChainedMemberScope implements MemberScope {
    public static final Companion Companion = new Companion(null);
    private final String debugName;
    private final List<MemberScope> scopes;

    /* compiled from: ChainedMemberScope.kt */
    public static final class Companion {
        private Companion() {
        }

        public final MemberScope create(String str, List<? extends MemberScope> list) {
            int size = list.size();
            if (size == 0) {
                return Empty.INSTANCE;
            }
            if (size != 1) {
                return new ChainedMemberScope(str, list);
            }
            return (MemberScope) C13199w.m40599k((List) list);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChainedMemberScope(String str, List<? extends MemberScope> list) {
        this.debugName = str;
        this.scopes = list;
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope contributedClassifier : this.scopes) {
            ClassifierDescriptor contributedClassifier2 = contributedClassifier.getContributedClassifier(name, lookupLocation);
            if (contributedClassifier2 != null) {
                if (!(contributedClassifier2 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) contributedClassifier2).isExpect()) {
                    return contributedClassifier2;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier2;
                }
            }
        }
        return classifierDescriptor;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        List<MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return C13188p0.m40531a();
        }
        Collection collection = null;
        for (MemberScope contributedDescriptors : list) {
            collection = ScopeUtilsKt.concat(collection, contributedDescriptors.getContributedDescriptors(descriptorKindFilter, function1));
        }
        if (collection != null) {
            return collection;
        }
        return C13188p0.m40531a();
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        List<MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return C13188p0.m40531a();
        }
        Collection collection = null;
        for (MemberScope contributedFunctions : list) {
            collection = ScopeUtilsKt.concat(collection, contributedFunctions.getContributedFunctions(name, lookupLocation));
        }
        if (collection != null) {
            return collection;
        }
        return C13188p0.m40531a();
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        List<MemberScope> list = this.scopes;
        if (list.isEmpty()) {
            return C13188p0.m40531a();
        }
        Collection collection = null;
        for (MemberScope contributedVariables : list) {
            collection = ScopeUtilsKt.concat(collection, contributedVariables.getContributedVariables(name, lookupLocation));
        }
        if (collection != null) {
            return collection;
        }
        return C13188p0.m40531a();
    }

    public Set<Name> getFunctionNames() {
        List<MemberScope> list = this.scopes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope functionNames : list) {
            C13196t.m40545a((Collection) linkedHashSet, (Iterable) functionNames.getFunctionNames());
        }
        return linkedHashSet;
    }

    public Set<Name> getVariableNames() {
        List<MemberScope> list = this.scopes;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope variableNames : list) {
            C13196t.m40545a((Collection) linkedHashSet, (Iterable) variableNames.getVariableNames());
        }
        return linkedHashSet;
    }

    public String toString() {
        return this.debugName;
    }
}
