package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C13142s;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: SubstitutingScope.kt */
public final class SubstitutingScope implements MemberScope {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(SubstitutingScope.class), "_allDescriptors", "get_allDescriptors()Ljava/util/Collection;"))};
    private final Lazy _allDescriptors$delegate = C12763i.m39921a(new SubstitutingScope$_allDescriptors$2(this));
    private Map<DeclarationDescriptor, DeclarationDescriptor> substitutedDescriptors;
    private final TypeSubstitutor substitutor;
    /* access modifiers changed from: private */
    public final MemberScope workerScope;

    public SubstitutingScope(MemberScope memberScope, TypeSubstitutor typeSubstitutor) {
        this.workerScope = memberScope;
        TypeSubstitution substitution = typeSubstitutor.getSubstitution();
        C12880j.m40222a((Object) substitution, "givenSubstitutor.substitution");
        this.substitutor = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
    }

    private final Collection<DeclarationDescriptor> get_allDescriptors() {
        Lazy lazy = this._allDescriptors$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (Collection) lazy.getValue();
    }

    private final <D extends DeclarationDescriptor> D substitute(D d) {
        if (this.substitutor.isEmpty()) {
            return d;
        }
        if (this.substitutedDescriptors == null) {
            this.substitutedDescriptors = new HashMap();
        }
        Map<DeclarationDescriptor, DeclarationDescriptor> map = this.substitutedDescriptors;
        if (map != null) {
            D d2 = map.get(d);
            if (d2 == null) {
                if (d instanceof Substitutable) {
                    d2 = ((Substitutable) d).substitute(this.substitutor);
                    if (d2 != null) {
                        map.put(d, d2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, ");
                        sb.append("but ");
                        sb.append(d);
                        sb.append(" substitution fails");
                        throw new AssertionError(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown descriptor in scope: ");
                    sb2.append(d);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
            D d3 = (DeclarationDescriptor) d2;
            if (d3 != null) {
                return d3;
            }
            throw new C13142s("null cannot be cast to non-null type D");
        }
        C12880j.m40220a();
        throw null;
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        ClassifierDescriptor contributedClassifier = this.workerScope.getContributedClassifier(name, lookupLocation);
        if (contributedClassifier != null) {
            return (ClassifierDescriptor) substitute((D) contributedClassifier);
        }
        return null;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return get_allDescriptors();
    }

    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        return substitute(this.workerScope.getContributedFunctions(name, lookupLocation));
    }

    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        return substitute(this.workerScope.getContributedVariables(name, lookupLocation));
    }

    public Set<Name> getFunctionNames() {
        return this.workerScope.getFunctionNames();
    }

    public Set<Name> getVariableNames() {
        return this.workerScope.getVariableNames();
    }

    /* access modifiers changed from: private */
    public final <D extends DeclarationDescriptor> Collection<D> substitute(Collection<? extends D> collection) {
        if (this.substitutor.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet newLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            newLinkedHashSetWithExpectedSize.add(substitute((D) (DeclarationDescriptor) it.next()));
        }
        return newLinkedHashSetWithExpectedSize;
    }
}
