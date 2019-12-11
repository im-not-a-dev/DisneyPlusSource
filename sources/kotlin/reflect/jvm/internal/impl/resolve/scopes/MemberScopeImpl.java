package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* compiled from: MemberScopeImpl.kt */
public abstract class MemberScopeImpl implements MemberScope {
    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return null;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return C13185o.m40513a();
    }

    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        return C13185o.m40513a();
    }

    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        return C13185o.m40513a();
    }

    public Set<Name> getFunctionNames() {
        Collection contributedDescriptors = getContributedDescriptors(DescriptorKindFilter.FUNCTIONS, FunctionsKt.alwaysTrue());
        ArrayList<SimpleFunctionDescriptor> arrayList = new ArrayList<>();
        for (Object next : contributedDescriptors) {
            if (next instanceof SimpleFunctionDescriptor) {
                arrayList.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleFunctionDescriptor name : arrayList) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public Set<Name> getVariableNames() {
        Collection contributedDescriptors = getContributedDescriptors(DescriptorKindFilter.VARIABLES, FunctionsKt.alwaysTrue());
        ArrayList<VariableDescriptor> arrayList = new ArrayList<>();
        for (Object next : contributedDescriptors) {
            if (next instanceof VariableDescriptor) {
                arrayList.add(next);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (VariableDescriptor name : arrayList) {
            linkedHashSet.add(name.getName());
        }
        return linkedHashSet;
    }

    public void recordLookup(Name name, LookupLocation lookupLocation) {
        DefaultImpls.recordLookup(this, name, lookupLocation);
    }
}
