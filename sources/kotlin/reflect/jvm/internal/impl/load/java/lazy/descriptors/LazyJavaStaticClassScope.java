package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* compiled from: LazyJavaStaticClassScope.kt */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {
    private final JavaClass jClass;
    private final LazyJavaClassDescriptor ownerDescriptor;

    public LazyJavaStaticClassScope(LazyJavaResolverContext lazyJavaResolverContext, JavaClass javaClass, LazyJavaClassDescriptor lazyJavaClassDescriptor) {
        super(lazyJavaResolverContext);
        this.jClass = javaClass;
        this.ownerDescriptor = lazyJavaClassDescriptor;
    }

    private final <R> Set<R> flatMapJavaStaticSupertypesScopes(ClassDescriptor classDescriptor, Set<R> set, Function1<? super MemberScope, ? extends Collection<? extends R>> function1) {
        DFS.dfs(C13183n.m40498a(classDescriptor), LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$1.INSTANCE, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(classDescriptor, set, function1));
        return set;
    }

    private final PropertyDescriptor getRealOriginal(PropertyDescriptor propertyDescriptor) {
        Kind kind = propertyDescriptor.getKind();
        C12880j.m40222a((Object) kind, "this.kind");
        if (kind.isReal()) {
            return propertyDescriptor;
        }
        Collection<PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        C12880j.m40222a((Object) overriddenDescriptors, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) overriddenDescriptors, 10));
        for (PropertyDescriptor propertyDescriptor2 : overriddenDescriptors) {
            C12880j.m40222a((Object) propertyDescriptor2, "it");
            arrayList.add(getRealOriginal(propertyDescriptor2));
        }
        return (PropertyDescriptor) C13199w.m40599k(C13199w.m40579d(arrayList));
    }

    private final Set<SimpleFunctionDescriptor> getStaticFunctionsFromJavaSuperClasses(Name name, ClassDescriptor classDescriptor) {
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(classDescriptor);
        if (parentJavaStaticClassScope != null) {
            return C13199w.m40609t(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return C13188p0.m40531a();
    }

    /* access modifiers changed from: protected */
    public Set<Name> computeClassNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        return C13188p0.m40531a();
    }

    /* access modifiers changed from: protected */
    public Set<Name> computeFunctionNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Set<Name> s = C13199w.m40608s(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getMethodNames());
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(getOwnerDescriptor());
        Set functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = C13188p0.m40531a();
        }
        s.addAll(functionNames);
        if (this.jClass.isEnum()) {
            s.addAll(C13185o.m40520c(DescriptorUtils.ENUM_VALUE_OF, DescriptorUtils.ENUM_VALUES));
        }
        return s;
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredFunctions(Collection<SimpleFunctionDescriptor> collection, Name name) {
        Collection resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, getStaticFunctionsFromJavaSuperClasses(name, getOwnerDescriptor()), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
        C12880j.m40222a((Object) resolveOverridesForStaticMembers, "resolveOverridesForStati…components.errorReporter)");
        collection.addAll(resolveOverridesForStaticMembers);
        if (!this.jClass.isEnum()) {
            return;
        }
        if (C12880j.m40224a((Object) name, (Object) DescriptorUtils.ENUM_VALUE_OF)) {
            SimpleFunctionDescriptor createEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(getOwnerDescriptor());
            C12880j.m40222a((Object) createEnumValueOfMethod, "createEnumValueOfMethod(ownerDescriptor)");
            collection.add(createEnumValueOfMethod);
        } else if (C12880j.m40224a((Object) name, (Object) DescriptorUtils.ENUM_VALUES)) {
            SimpleFunctionDescriptor createEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(getOwnerDescriptor());
            C12880j.m40222a((Object) createEnumValuesMethod, "createEnumValuesMethod(ownerDescriptor)");
            collection.add(createEnumValuesMethod);
        }
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
        Set flatMapJavaStaticSupertypesScopes = flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), new LinkedHashSet(), new C12977xd2f8c9a5(name));
        if (!collection.isEmpty()) {
            Collection resolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, flatMapJavaStaticSupertypesScopes, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter());
            C12880j.m40222a((Object) resolveOverridesForStaticMembers, "resolveOverridesForStati…components.errorReporter)");
            collection.addAll(resolveOverridesForStaticMembers);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : flatMapJavaStaticSupertypesScopes) {
            PropertyDescriptor realOriginal = getRealOriginal((PropertyDescriptor) next);
            Object obj = linkedHashMap.get(realOriginal);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(realOriginal, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList();
        for (Entry value : linkedHashMap.entrySet()) {
            C13196t.m40545a((Collection) arrayList, (Iterable) DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (Collection) value.getValue(), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter()));
        }
        collection.addAll(arrayList);
    }

    /* access modifiers changed from: protected */
    public Set<Name> computePropertyNames(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Set<Name> s = C13199w.m40608s(((DeclaredMemberIndex) getDeclaredMemberIndex().invoke()).getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), s, LazyJavaStaticClassScope$computePropertyNames$1$1.INSTANCE);
        return s;
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        return null;
    }

    /* access modifiers changed from: protected */
    public ClassDeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.jClass, LazyJavaStaticClassScope$computeMemberIndex$1.INSTANCE);
    }

    /* access modifiers changed from: protected */
    public LazyJavaClassDescriptor getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
