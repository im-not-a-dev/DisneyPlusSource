package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;

/* compiled from: JvmPackageScope.kt */
public final class JvmPackageScope implements MemberScope {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(JvmPackageScope.class), "kotlinScopes", "getKotlinScopes()Ljava/util/List;"))};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final LazyJavaResolverContext f29555c;
    private final LazyJavaPackageScope javaScope;
    private final NotNullLazyValue kotlinScopes$delegate = this.f29555c.getStorageManager().createLazyValue(new JvmPackageScope$kotlinScopes$2(this));
    /* access modifiers changed from: private */
    public final LazyJavaPackageFragment packageFragment;

    public JvmPackageScope(LazyJavaResolverContext lazyJavaResolverContext, JavaPackage javaPackage, LazyJavaPackageFragment lazyJavaPackageFragment) {
        this.f29555c = lazyJavaResolverContext;
        this.packageFragment = lazyJavaPackageFragment;
        this.javaScope = new LazyJavaPackageScope(this.f29555c, javaPackage, this.packageFragment);
    }

    private final List<MemberScope> getKotlinScopes() {
        return (List) StorageKt.getValue(this.kotlinScopes$delegate, (Object) this, $$delegatedProperties[0]);
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        ClassDescriptor contributedClassifier = this.javaScope.getContributedClassifier(name, lookupLocation);
        if (contributedClassifier != null) {
            return contributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        Iterator it = getKotlinScopes().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ClassifierDescriptor contributedClassifier2 = ((MemberScope) it.next()).getContributedClassifier(name, lookupLocation);
            if (contributedClassifier2 != null) {
                if (!(contributedClassifier2 instanceof ClassifierDescriptorWithTypeParameters) || !((ClassifierDescriptorWithTypeParameters) contributedClassifier2).isExpect()) {
                    classifierDescriptor = contributedClassifier2;
                } else if (classifierDescriptor == null) {
                    classifierDescriptor = contributedClassifier2;
                }
            }
        }
        return classifierDescriptor;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        List<MemberScope> kotlinScopes = getKotlinScopes();
        Collection<DeclarationDescriptor> contributedDescriptors = lazyJavaPackageScope.getContributedDescriptors(descriptorKindFilter, function1);
        for (MemberScope contributedDescriptors2 : kotlinScopes) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, contributedDescriptors2.getContributedDescriptors(descriptorKindFilter, function1));
        }
        return contributedDescriptors != null ? contributedDescriptors : C13188p0.m40531a();
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        List<MemberScope> kotlinScopes = getKotlinScopes();
        Collection<SimpleFunctionDescriptor> contributedFunctions = lazyJavaPackageScope.getContributedFunctions(name, lookupLocation);
        for (MemberScope contributedFunctions2 : kotlinScopes) {
            contributedFunctions = ScopeUtilsKt.concat(contributedFunctions, contributedFunctions2.getContributedFunctions(name, lookupLocation));
        }
        return contributedFunctions != null ? contributedFunctions : C13188p0.m40531a();
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        LazyJavaPackageScope lazyJavaPackageScope = this.javaScope;
        List<MemberScope> kotlinScopes = getKotlinScopes();
        Collection<PropertyDescriptor> contributedVariables = lazyJavaPackageScope.getContributedVariables(name, lookupLocation);
        for (MemberScope contributedVariables2 : kotlinScopes) {
            contributedVariables = ScopeUtilsKt.concat(contributedVariables, contributedVariables2.getContributedVariables(name, lookupLocation));
        }
        return contributedVariables != null ? contributedVariables : C13188p0.m40531a();
    }

    public Set<Name> getFunctionNames() {
        List<MemberScope> kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope functionNames : kotlinScopes) {
            C13196t.m40545a((Collection) linkedHashSet, (Iterable) functionNames.getFunctionNames());
        }
        linkedHashSet.addAll(this.javaScope.getFunctionNames());
        return linkedHashSet;
    }

    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.javaScope;
    }

    public Set<Name> getVariableNames() {
        List<MemberScope> kotlinScopes = getKotlinScopes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope variableNames : kotlinScopes) {
            C13196t.m40545a((Collection) linkedHashSet, (Iterable) variableNames.getVariableNames());
        }
        linkedHashSet.addAll(this.javaScope.getVariableNames());
        return linkedHashSet;
    }

    public void recordLookup(Name name, LookupLocation lookupLocation) {
        UtilsKt.record(this.f29555c.getComponents().getLookupTracker(), lookupLocation, (PackageFragmentDescriptor) this.packageFragment, name);
    }
}
