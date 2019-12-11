package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: InnerClassesScopeWrapper.kt */
public final class InnerClassesScopeWrapper extends MemberScopeImpl {
    private final MemberScope workerScope;

    public InnerClassesScopeWrapper(MemberScope memberScope) {
        this.workerScope = memberScope;
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        ClassifierDescriptor contributedClassifier = this.workerScope.getContributedClassifier(name, lookupLocation);
        if (contributedClassifier == null) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) (!(contributedClassifier instanceof ClassDescriptor) ? null : contributedClassifier);
        if (classDescriptor != null) {
            return classDescriptor;
        }
        if (!(contributedClassifier instanceof TypeAliasDescriptor)) {
            contributedClassifier = null;
        }
        return (TypeAliasDescriptor) contributedClassifier;
    }

    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Classes from ");
        sb.append(this.workerScope);
        return sb.toString();
    }

    public List<ClassifierDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        DescriptorKindFilter restrictedToKindsOrNull = descriptorKindFilter.restrictedToKindsOrNull(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if (restrictedToKindsOrNull == null) {
            return C13185o.m40513a();
        }
        Collection contributedDescriptors = this.workerScope.getContributedDescriptors(restrictedToKindsOrNull, function1);
        ArrayList arrayList = new ArrayList();
        for (Object next : contributedDescriptors) {
            if (next instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
