package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: AbstractScopeAdapter.kt */
public abstract class AbstractScopeAdapter implements MemberScope {
    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return getWorkerScope().getContributedClassifier(name, lookupLocation);
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return getWorkerScope().getContributedDescriptors(descriptorKindFilter, function1);
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        return getWorkerScope().getContributedFunctions(name, lookupLocation);
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        return getWorkerScope().getContributedVariables(name, lookupLocation);
    }

    public Set<Name> getFunctionNames() {
        return getWorkerScope().getFunctionNames();
    }

    public Set<Name> getVariableNames() {
        return getWorkerScope().getVariableNames();
    }

    /* access modifiers changed from: protected */
    public abstract MemberScope getWorkerScope();
}
