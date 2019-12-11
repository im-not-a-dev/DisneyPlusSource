package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: GivenFunctionsMemberScope.kt */
public abstract class GivenFunctionsMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a(GivenFunctionsMemberScope.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    private final NotNullLazyValue allDescriptors$delegate;
    private final ClassDescriptor containingClass;

    public GivenFunctionsMemberScope(StorageManager storageManager, ClassDescriptor classDescriptor) {
        this.containingClass = classDescriptor;
        this.allDescriptors$delegate = storageManager.createLazyValue(new GivenFunctionsMemberScope$allDescriptors$2(this));
    }

    /* access modifiers changed from: private */
    public final List<DeclarationDescriptor> createFakeOverrides(List<? extends FunctionDescriptor> list) {
        Collection collection;
        ArrayList arrayList = new ArrayList(3);
        TypeConstructor typeConstructor = this.containingClass.getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "containingClass.typeConstructor");
        Collection<KotlinType> supertypes = typeConstructor.getSupertypes();
        C12880j.m40222a((Object) supertypes, "containingClass.typeConstructor.supertypes");
        ArrayList arrayList2 = new ArrayList();
        for (KotlinType memberScope : supertypes) {
            C13196t.m40545a((Collection) arrayList2, (Iterable) DefaultImpls.getContributedDescriptors$default(memberScope.getMemberScope(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next : arrayList2) {
            if (next instanceof CallableMemberDescriptor) {
                arrayList3.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next2 : arrayList3) {
            Name name = ((CallableMemberDescriptor) next2).getName();
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next2);
        }
        for (Entry entry : linkedHashMap.entrySet()) {
            Name name2 = (Name) entry.getKey();
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object next3 : list2) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) next3) instanceof FunctionDescriptor);
                Object obj2 = linkedHashMap2.get(valueOf);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj2);
                }
                ((List) obj2).add(next3);
            }
            for (Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                if (booleanValue) {
                    collection = new ArrayList();
                    for (Object next4 : list) {
                        if (C12880j.m40224a((Object) ((FunctionDescriptor) next4).getName(), (Object) name2)) {
                            collection.add(next4);
                        }
                    }
                } else {
                    collection = C13185o.m40513a();
                }
                OverridingUtil.generateOverridesInFunctionGroup(name2, list3, collection, this.containingClass, new GivenFunctionsMemberScope$createFakeOverrides$4(this, arrayList));
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    private final List<DeclarationDescriptor> getAllDescriptors() {
        return (List) StorageKt.getValue(this.allDescriptors$delegate, (Object) this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: protected */
    public abstract List<FunctionDescriptor> computeDeclaredFunctions();

    /* access modifiers changed from: protected */
    public final ClassDescriptor getContainingClass() {
        return this.containingClass;
    }

    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        if (!descriptorKindFilter.acceptsKinds(DescriptorKindFilter.CALLABLES.getKindMask())) {
            return C13185o.m40513a();
        }
        return getAllDescriptors();
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        List allDescriptors = getAllDescriptors();
        ArrayList arrayList = new ArrayList();
        for (Object next : allDescriptors) {
            if (next instanceof SimpleFunctionDescriptor) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (C12880j.m40224a((Object) ((SimpleFunctionDescriptor) next2).getName(), (Object) name)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        List allDescriptors = getAllDescriptors();
        ArrayList arrayList = new ArrayList();
        for (Object next : allDescriptors) {
            if (next instanceof PropertyDescriptor) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            if (C12880j.m40224a((Object) ((PropertyDescriptor) next2).getName(), (Object) name)) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }
}
