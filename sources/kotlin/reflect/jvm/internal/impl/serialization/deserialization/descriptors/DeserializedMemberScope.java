package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.C13145v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.NameAndTypeMemberComparator;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* compiled from: DeserializedMemberScope.kt */
public abstract class DeserializedMemberScope extends MemberScopeImpl {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final DeserializationContext f29578c;
    private final NotNullLazyValue classNames$delegate;
    private final NotNullLazyValue functionNamesLazy$delegate;
    /* access modifiers changed from: private */
    public final Map<Name, byte[]> functionProtosBytes;
    private final MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> functions;
    private final MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> properties;
    /* access modifiers changed from: private */
    public final Map<Name, byte[]> propertyProtosBytes;
    private final MemoizedFunctionToNullable<Name, TypeAliasDescriptor> typeAliasByName;
    private final Map<Name, byte[]> typeAliasBytes;
    private final NotNullLazyValue variableNamesLazy$delegate;

    static {
        Class<DeserializedMemberScope> cls = DeserializedMemberScope.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "variableNamesLazy", "getVariableNamesLazy()Ljava/util/Set;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "classNames", "getClassNames$deserialization()Ljava/util/Set;"))};
    }

    protected DeserializedMemberScope(DeserializationContext deserializationContext, Collection<Function> collection, Collection<Property> collection2, Collection<TypeAlias> collection3, Function0<? extends Collection<Name>> function0) {
        Map<Name, byte[]> map;
        this.f29578c = deserializationContext;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : collection) {
            Name name = NameResolverUtilKt.getName(this.f29578c.getNameResolver(), ((Function) next).getName());
            Object obj = linkedHashMap.get(name);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(name, obj);
            }
            ((List) obj).add(next);
        }
        this.functionProtosBytes = packToByteArray(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object next2 : collection2) {
            Name name2 = NameResolverUtilKt.getName(this.f29578c.getNameResolver(), ((Property) next2).getName());
            Object obj2 = linkedHashMap2.get(name2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(name2, obj2);
            }
            ((List) obj2).add(next2);
        }
        this.propertyProtosBytes = packToByteArray(linkedHashMap2);
        if (this.f29578c.getComponents().getConfiguration().getTypeAliasesAllowed()) {
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object next3 : collection3) {
                Name name3 = NameResolverUtilKt.getName(this.f29578c.getNameResolver(), ((TypeAlias) next3).getName());
                Object obj3 = linkedHashMap3.get(name3);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap3.put(name3, obj3);
                }
                ((List) obj3).add(next3);
            }
            map = packToByteArray(linkedHashMap3);
        } else {
            map = C13173j0.m40350a();
        }
        this.typeAliasBytes = map;
        this.functions = this.f29578c.getStorageManager().createMemoizedFunction(new DeserializedMemberScope$functions$1(this));
        this.properties = this.f29578c.getStorageManager().createMemoizedFunction(new DeserializedMemberScope$properties$1(this));
        this.typeAliasByName = this.f29578c.getStorageManager().createMemoizedFunctionWithNullableValues(new DeserializedMemberScope$typeAliasByName$1(this));
        this.functionNamesLazy$delegate = this.f29578c.getStorageManager().createLazyValue(new DeserializedMemberScope$functionNamesLazy$2(this));
        this.variableNamesLazy$delegate = this.f29578c.getStorageManager().createLazyValue(new DeserializedMemberScope$variableNamesLazy$2(this));
        this.classNames$delegate = this.f29578c.getStorageManager().createLazyValue(new DeserializedMemberScope$classNames$2(function0));
    }

    private final void addFunctionsAndProperties(Collection<DeclarationDescriptor> collection, DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1, LookupLocation lookupLocation) {
        String str = "MemberComparator.NameAnd…MemberComparator.INSTANCE";
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK())) {
            Set<Name> variableNames = getVariableNames();
            ArrayList arrayList = new ArrayList();
            for (Name name : variableNames) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.addAll(getContributedVariables(name, lookupLocation));
                }
            }
            NameAndTypeMemberComparator nameAndTypeMemberComparator = NameAndTypeMemberComparator.INSTANCE;
            Intrinsics.checkReturnedValueIsNotNull((Object) nameAndTypeMemberComparator, str);
            C13194s.m40541a(arrayList, nameAndTypeMemberComparator);
            collection.addAll(arrayList);
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK())) {
            Set<Name> functionNames = getFunctionNames();
            ArrayList arrayList2 = new ArrayList();
            for (Name name2 : functionNames) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    arrayList2.addAll(getContributedFunctions(name2, lookupLocation));
                }
            }
            NameAndTypeMemberComparator nameAndTypeMemberComparator2 = NameAndTypeMemberComparator.INSTANCE;
            Intrinsics.checkReturnedValueIsNotNull((Object) nameAndTypeMemberComparator2, str);
            C13194s.m40541a(arrayList2, nameAndTypeMemberComparator2);
            collection.addAll(arrayList2);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> computeFunctions(kotlin.reflect.jvm.internal.impl.name.Name r6) {
        /*
            r5 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> r0 = r5.functionProtosBytes
            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER
            java.lang.String r2 = "ProtoBuf.Function.PARSER"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            java.lang.Object r0 = r0.get(r6)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0026
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$1
            r0.<init>(r2, r5, r1)
            kotlin.i0.h r0 = kotlin.p587i0.C12781n.m39977a(r0)
            java.util.List r0 = kotlin.p587i0.C12788p.m39999g(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.util.List r0 = kotlin.p590y.C13185o.m40513a()
        L_0x002a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0033:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r5.f29578c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r3 = r3.getMemberDeserializer()
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r2 = r3.loadFunction(r2)
            r1.add(r2)
            goto L_0x0033
        L_0x0052:
            r5.computeNonDeclaredFunctions(r6, r1)
            java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.computeFunctions(kotlin.reflect.jvm.internal.impl.name.Name):java.util.Collection");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor> computeProperties(kotlin.reflect.jvm.internal.impl.name.Name r6) {
        /*
            r5 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.Name, byte[]> r0 = r5.propertyProtosBytes
            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER
            java.lang.String r2 = "ProtoBuf.Property.PARSER"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            java.lang.Object r0 = r0.get(r6)
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x0026
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3 r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope$computeDescriptors$$inlined$let$lambda$3
            r0.<init>(r2, r5, r1)
            kotlin.i0.h r0 = kotlin.p587i0.C12781n.m39977a(r0)
            java.util.List r0 = kotlin.p587i0.C12788p.m39999g(r0)
            if (r0 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            java.util.List r0 = kotlin.p590y.C13185o.m40513a()
        L_0x002a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0033:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r5.f29578c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r3 = r3.getMemberDeserializer()
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r2 = r3.loadProperty(r2)
            r1.add(r2)
            goto L_0x0033
        L_0x0052:
            r5.computeNonDeclaredProperties(r6, r1)
            java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.compact(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope.computeProperties(kotlin.reflect.jvm.internal.impl.name.Name):java.util.Collection");
    }

    /* access modifiers changed from: private */
    public final TypeAliasDescriptor createTypeAlias(Name name) {
        byte[] bArr = (byte[]) this.typeAliasBytes.get(name);
        if (bArr != null) {
            TypeAlias parseDelimitedFrom = TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f29578c.getComponents().getExtensionRegistryLite());
            if (parseDelimitedFrom != null) {
                return this.f29578c.getMemberDeserializer().loadTypeAlias(parseDelimitedFrom);
            }
        }
        return null;
    }

    private final ClassDescriptor deserializeClass(Name name) {
        return this.f29578c.getComponents().deserializeClass(createClassId(name));
    }

    private final Set<Name> getFunctionNamesLazy() {
        return (Set) StorageKt.getValue(this.functionNamesLazy$delegate, (Object) this, $$delegatedProperties[0]);
    }

    private final Set<Name> getTypeAliasNames() {
        return this.typeAliasBytes.keySet();
    }

    private final Set<Name> getVariableNamesLazy() {
        return (Set) StorageKt.getValue(this.variableNamesLazy$delegate, (Object) this, $$delegatedProperties[1]);
    }

    private final Map<Name, byte[]> packToByteArray(Map<Name, ? extends Collection<? extends AbstractMessageLite>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C13173j0.m40349a(map.size()));
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractMessageLite> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) iterable, 10));
            for (AbstractMessageLite writeDelimitedTo : iterable) {
                writeDelimitedTo.writeDelimitedTo(byteArrayOutputStream);
                arrayList.add(C13145v.f29587a);
            }
            linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: protected */
    public abstract void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1);

    /* access modifiers changed from: protected */
    public final Collection<DeclarationDescriptor> computeDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1, LookupLocation lookupLocation) {
        ArrayList arrayList = new ArrayList(0);
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getSINGLETON_CLASSIFIERS_MASK())) {
            addEnumEntryDescriptors(arrayList, function1);
        }
        addFunctionsAndProperties(arrayList, descriptorKindFilter, function1, lookupLocation);
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
            for (Name name : getClassNames$deserialization()) {
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, deserializeClass(name));
                }
            }
        }
        if (descriptorKindFilter.acceptsKinds(DescriptorKindFilter.Companion.getTYPE_ALIASES_MASK())) {
            for (Name name2 : getTypeAliasNames()) {
                if (((Boolean) function1.invoke(name2)).booleanValue()) {
                    CollectionsKt.addIfNotNull(arrayList, this.typeAliasByName.invoke(name2));
                }
            }
        }
        return CollectionsKt.compact(arrayList);
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredFunctions(Name name, Collection<SimpleFunctionDescriptor> collection) {
    }

    /* access modifiers changed from: protected */
    public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
    }

    /* access modifiers changed from: protected */
    public abstract ClassId createClassId(Name name);

    /* access modifiers changed from: protected */
    public final DeserializationContext getC() {
        return this.f29578c;
    }

    public final Set<Name> getClassNames$deserialization() {
        return (Set) StorageKt.getValue(this.classNames$delegate, (Object) this, $$delegatedProperties[2]);
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        if (hasClass(name)) {
            return deserializeClass(name);
        }
        if (getTypeAliasNames().contains(name)) {
            return (ClassifierDescriptor) this.typeAliasByName.invoke(name);
        }
        return null;
    }

    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
        if (!getFunctionNames().contains(name)) {
            return C13185o.m40513a();
        }
        return (Collection) this.functions.invoke(name);
    }

    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
        if (!getVariableNames().contains(name)) {
            return C13185o.m40513a();
        }
        return (Collection) this.properties.invoke(name);
    }

    public Set<Name> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    /* access modifiers changed from: protected */
    public abstract Set<Name> getNonDeclaredFunctionNames();

    /* access modifiers changed from: protected */
    public abstract Set<Name> getNonDeclaredVariableNames();

    public Set<Name> getVariableNames() {
        return getVariableNamesLazy();
    }

    /* access modifiers changed from: protected */
    public boolean hasClass(Name name) {
        return getClassNames$deserialization().contains(name);
    }
}
