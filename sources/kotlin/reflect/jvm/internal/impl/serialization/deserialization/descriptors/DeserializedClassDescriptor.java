package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker.EMPTY;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* compiled from: DeserializedClassDescriptor.kt */
public final class DeserializedClassDescriptor extends AbstractClassDescriptor {
    private final Annotations annotations;

    /* renamed from: c */
    private final DeserializationContext f29577c;
    /* access modifiers changed from: private */
    public final ClassId classId;
    private final Class classProto;
    private final NullableLazyValue<ClassDescriptor> companionObjectDescriptor;
    private final NotNullLazyValue<Collection<ClassConstructorDescriptor>> constructors;
    private final DeclarationDescriptor containingDeclaration;
    /* access modifiers changed from: private */
    public final EnumEntryClassDescriptors enumEntries;
    private final ClassKind kind = ProtoEnumFlags.INSTANCE.classKind((Kind) Flags.CLASS_KIND.get(this.classProto.getFlags()));
    private final DeserializedClassMemberScope memberScope;
    private final BinaryVersion metadataVersion;
    private final Modality modality = ProtoEnumFlags.INSTANCE.modality((ProtoBuf.Modality) Flags.MODALITY.get(this.classProto.getFlags()));
    private final NullableLazyValue<ClassConstructorDescriptor> primaryConstructor;
    private final NotNullLazyValue<Collection<ClassDescriptor>> sealedSubclasses;
    private final SourceElement sourceElement;
    private final MemberScopeImpl staticScope;
    private final ProtoContainer.Class thisAsProtoContainer;
    /* access modifiers changed from: private */
    public final DeserializedClassTypeConstructor typeConstructor;
    private final Visibility visibility = ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(this.classProto.getFlags()));

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class DeserializedClassMemberScope extends DeserializedMemberScope {
        private final NotNullLazyValue<Collection<DeclarationDescriptor>> allDescriptors;

        public DeserializedClassMemberScope() {
            DeserializationContext c = DeserializedClassDescriptor.this.getC();
            List functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            Intrinsics.checkReturnedValueIsNotNull((Object) functionList, "classProto.functionList");
            List propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            Intrinsics.checkReturnedValueIsNotNull((Object) propertyList, "classProto.propertyList");
            List typeAliasList = DeserializedClassDescriptor.this.getClassProto().getTypeAliasList();
            Intrinsics.checkReturnedValueIsNotNull((Object) typeAliasList, "classProto.typeAliasList");
            List<Number> nestedClassNameList = DeserializedClassDescriptor.this.getClassProto().getNestedClassNameList();
            Intrinsics.checkReturnedValueIsNotNull((Object) nestedClassNameList, "classProto.nestedClassNameList");
            NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) nestedClassNameList, 10));
            for (Number intValue : nestedClassNameList) {
                arrayList.add(NameResolverUtilKt.getName(nameResolver, intValue.intValue()));
            }
            super(c, functionList, propertyList, typeAliasList, new DeserializedClassDescriptor$DeserializedClassMemberScope$2$1(arrayList));
            this.allDescriptors = getC().getStorageManager().createLazyValue(new C13104xb586494b(this));
        }

        private final <D extends CallableMemberDescriptor> void generateFakeOverrides(Name name, Collection<? extends D> collection, Collection<D> collection2) {
            OverridingUtil.generateOverridesInFunctionGroup(name, collection, new ArrayList(collection2), getClassDescriptor(), new C13106xf150c8cf(collection2));
        }

        private final DeserializedClassDescriptor getClassDescriptor() {
            return DeserializedClassDescriptor.this;
        }

        /* access modifiers changed from: protected */
        public void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1) {
            EnumEntryClassDescriptors access$getEnumEntries$p = getClassDescriptor().enumEntries;
            Collection all = access$getEnumEntries$p != null ? access$getEnumEntries$p.all() : null;
            if (all == null) {
                all = C13185o.m40513a();
            }
            collection.addAll(all);
        }

        /* access modifiers changed from: protected */
        public void computeNonDeclaredFunctions(Name name, Collection<SimpleFunctionDescriptor> collection) {
            ArrayList arrayList = new ArrayList();
            for (KotlinType memberScope : getClassDescriptor().getTypeConstructor().getSupertypes()) {
                arrayList.addAll(memberScope.getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            C13196t.m40543a((Iterable) collection, (Function1) new C13105x1ddbb2bd(this));
            collection.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(name, DeserializedClassDescriptor.this));
            generateFakeOverrides(name, arrayList, collection);
        }

        /* access modifiers changed from: protected */
        public void computeNonDeclaredProperties(Name name, Collection<PropertyDescriptor> collection) {
            ArrayList arrayList = new ArrayList();
            for (KotlinType memberScope : getClassDescriptor().getTypeConstructor().getSupertypes()) {
                arrayList.addAll(memberScope.getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            generateFakeOverrides(name, arrayList, collection);
        }

        /* access modifiers changed from: protected */
        public ClassId createClassId(Name name) {
            ClassId createNestedClassId = DeserializedClassDescriptor.this.classId.createNestedClassId(name);
            Intrinsics.checkReturnedValueIsNotNull((Object) createNestedClassId, "classId.createNestedClassId(name)");
            return createNestedClassId;
        }

        public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
            recordLookup(name, lookupLocation);
            EnumEntryClassDescriptors access$getEnumEntries$p = getClassDescriptor().enumEntries;
            if (access$getEnumEntries$p != null) {
                ClassDescriptor findEnumEntry = access$getEnumEntries$p.findEnumEntry(name);
                if (findEnumEntry != null) {
                    return findEnumEntry;
                }
            }
            return super.getContributedClassifier(name, lookupLocation);
        }

        public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
            return (Collection) this.allDescriptors.invoke();
        }

        public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation lookupLocation) {
            recordLookup(name, lookupLocation);
            return super.getContributedFunctions(name, lookupLocation);
        }

        public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation lookupLocation) {
            recordLookup(name, lookupLocation);
            return super.getContributedVariables(name, lookupLocation);
        }

        /* access modifiers changed from: protected */
        public Set<Name> getNonDeclaredFunctionNames() {
            List<KotlinType> supertypes = getClassDescriptor().typeConstructor.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (KotlinType memberScope : supertypes) {
                C13196t.m40545a((Collection) linkedHashSet, (Iterable) memberScope.getMemberScope().getFunctionNames());
            }
            linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(DeserializedClassDescriptor.this));
            return linkedHashSet;
        }

        /* access modifiers changed from: protected */
        public Set<Name> getNonDeclaredVariableNames() {
            List<KotlinType> supertypes = getClassDescriptor().typeConstructor.getSupertypes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (KotlinType memberScope : supertypes) {
                C13196t.m40545a((Collection) linkedHashSet, (Iterable) memberScope.getMemberScope().getVariableNames());
            }
            return linkedHashSet;
        }

        public void recordLookup(Name name, LookupLocation lookupLocation) {
            UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, (ClassDescriptor) getClassDescriptor(), name);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class DeserializedClassTypeConstructor extends AbstractClassTypeConstructor {
        private final NotNullLazyValue<List<TypeParameterDescriptor>> parameters;

        public DeserializedClassTypeConstructor() {
            super(DeserializedClassDescriptor.this.getC().getStorageManager());
            this.parameters = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new C13107x32944d2c(this));
        }

        /* access modifiers changed from: protected */
        public Collection<KotlinType> computeSupertypes() {
            String str;
            List<Type> supertypes = ProtoTypeTableUtilKt.supertypes(DeserializedClassDescriptor.this.getClassProto(), DeserializedClassDescriptor.this.getC().getTypeTable());
            ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) supertypes, 10));
            for (Type type : supertypes) {
                arrayList.add(DeserializedClassDescriptor.this.getC().getTypeDeserializer().type(type));
            }
            List<KotlinType> d = C13199w.m40583d((Collection) arrayList, (Iterable) DeserializedClassDescriptor.this.getC().getComponents().getAdditionalClassPartsProvider().getSupertypes(DeserializedClassDescriptor.this));
            ArrayList<MockClassDescriptor> arrayList2 = new ArrayList<>();
            for (KotlinType constructor : d) {
                ClassifierDescriptor declarationDescriptor = constructor.getConstructor().getDeclarationDescriptor();
                if (!(declarationDescriptor instanceof MockClassDescriptor)) {
                    declarationDescriptor = null;
                }
                MockClassDescriptor mockClassDescriptor = (MockClassDescriptor) declarationDescriptor;
                if (mockClassDescriptor != null) {
                    arrayList2.add(mockClassDescriptor);
                }
            }
            if (!arrayList2.isEmpty()) {
                ErrorReporter errorReporter = DeserializedClassDescriptor.this.getC().getComponents().getErrorReporter();
                DeserializedClassDescriptor deserializedClassDescriptor = DeserializedClassDescriptor.this;
                ArrayList arrayList3 = new ArrayList(C13187p.m40525a((Iterable) arrayList2, 10));
                for (MockClassDescriptor mockClassDescriptor2 : arrayList2) {
                    ClassId classId = DescriptorUtilsKt.getClassId(mockClassDescriptor2);
                    if (classId != null) {
                        FqName asSingleFqName = classId.asSingleFqName();
                        if (asSingleFqName != null) {
                            str = asSingleFqName.asString();
                            if (str != null) {
                                arrayList3.add(str);
                            }
                        }
                    }
                    str = mockClassDescriptor2.getName().asString();
                    arrayList3.add(str);
                }
                errorReporter.reportIncompleteHierarchy(deserializedClassDescriptor, arrayList3);
            }
            return C13199w.m40606q(d);
        }

        public List<TypeParameterDescriptor> getParameters() {
            return (List) this.parameters.invoke();
        }

        /* access modifiers changed from: protected */
        public SupertypeLoopChecker getSupertypeLoopChecker() {
            return EMPTY.INSTANCE;
        }

        public boolean isDenotable() {
            return true;
        }

        public String toString() {
            String name = DeserializedClassDescriptor.this.getName().toString();
            Intrinsics.checkReturnedValueIsNotNull((Object) name, "name.toString()");
            return name;
        }

        public DeserializedClassDescriptor getDeclarationDescriptor() {
            return DeserializedClassDescriptor.this;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    private final class EnumEntryClassDescriptors {
        private final MemoizedFunctionToNullable<Name, ClassDescriptor> enumEntryByName;
        /* access modifiers changed from: private */
        public final Map<Name, EnumEntry> enumEntryProtos;
        /* access modifiers changed from: private */
        public final NotNullLazyValue<Set<Name>> enumMemberNames;

        public EnumEntryClassDescriptors() {
            List enumEntryList = DeserializedClassDescriptor.this.getClassProto().getEnumEntryList();
            Intrinsics.checkReturnedValueIsNotNull((Object) enumEntryList, "classProto.enumEntryList");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C12762h.m39913a(C13173j0.m40349a(C13187p.m40525a((Iterable) enumEntryList, 10)), 16));
            for (Object next : enumEntryList) {
                EnumEntry enumEntry = (EnumEntry) next;
                NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                Intrinsics.checkReturnedValueIsNotNull((Object) enumEntry, "it");
                linkedHashMap.put(NameResolverUtilKt.getName(nameResolver, enumEntry.getName()), next);
            }
            this.enumEntryProtos = linkedHashMap;
            this.enumEntryByName = DeserializedClassDescriptor.this.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new C13108xaf8327b7(this));
            this.enumMemberNames = DeserializedClassDescriptor.this.getC().getStorageManager().createLazyValue(new C13109xaaca1f71(this));
        }

        /* access modifiers changed from: private */
        public final Set<Name> computeEnumMemberNames() {
            String str;
            HashSet hashSet = new HashSet();
            for (KotlinType memberScope : DeserializedClassDescriptor.this.getTypeConstructor().getSupertypes()) {
                for (DeclarationDescriptor declarationDescriptor : DefaultImpls.getContributedDescriptors$default(memberScope.getMemberScope(), null, null, 3, null)) {
                    if ((declarationDescriptor instanceof SimpleFunctionDescriptor) || (declarationDescriptor instanceof PropertyDescriptor)) {
                        hashSet.add(declarationDescriptor.getName());
                    }
                }
            }
            List functionList = DeserializedClassDescriptor.this.getClassProto().getFunctionList();
            Intrinsics.checkReturnedValueIsNotNull((Object) functionList, "classProto.functionList");
            Iterator it = functionList.iterator();
            while (true) {
                str = "it";
                if (!it.hasNext()) {
                    break;
                }
                Function function = (Function) it.next();
                NameResolver nameResolver = DeserializedClassDescriptor.this.getC().getNameResolver();
                Intrinsics.checkReturnedValueIsNotNull((Object) function, str);
                hashSet.add(NameResolverUtilKt.getName(nameResolver, function.getName()));
            }
            List<Property> propertyList = DeserializedClassDescriptor.this.getClassProto().getPropertyList();
            Intrinsics.checkReturnedValueIsNotNull((Object) propertyList, "classProto.propertyList");
            for (Property property : propertyList) {
                NameResolver nameResolver2 = DeserializedClassDescriptor.this.getC().getNameResolver();
                Intrinsics.checkReturnedValueIsNotNull((Object) property, str);
                hashSet.add(NameResolverUtilKt.getName(nameResolver2, property.getName()));
            }
            return C13190q0.m40534a((Set) hashSet, (Iterable) hashSet);
        }

        public final Collection<ClassDescriptor> all() {
            Set<Name> keySet = this.enumEntryProtos.keySet();
            ArrayList arrayList = new ArrayList();
            for (Name findEnumEntry : keySet) {
                ClassDescriptor findEnumEntry2 = findEnumEntry(findEnumEntry);
                if (findEnumEntry2 != null) {
                    arrayList.add(findEnumEntry2);
                }
            }
            return arrayList;
        }

        public final ClassDescriptor findEnumEntry(Name name) {
            return (ClassDescriptor) this.enumEntryByName.invoke(name);
        }
    }

    public DeserializedClassDescriptor(DeserializationContext deserializationContext, Class classR, NameResolver nameResolver, BinaryVersion binaryVersion, SourceElement sourceElement2) {
        Annotations annotations2;
        super(deserializationContext.getStorageManager(), NameResolverUtilKt.getClassId(nameResolver, classR.getFqName()).getShortClassName());
        this.classProto = classR;
        this.metadataVersion = binaryVersion;
        this.sourceElement = sourceElement2;
        this.classId = NameResolverUtilKt.getClassId(nameResolver, this.classProto.getFqName());
        List typeParameterList = this.classProto.getTypeParameterList();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeParameterList, "classProto.typeParameterList");
        TypeTable typeTable = this.classProto.getTypeTable();
        Intrinsics.checkReturnedValueIsNotNull((Object) typeTable, "classProto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = this.classProto.getVersionRequirementTable();
        Intrinsics.checkReturnedValueIsNotNull((Object) versionRequirementTable, "classProto.versionRequirementTable");
        this.f29577c = deserializationContext.childContext(this, typeParameterList, nameResolver, typeTable2, companion.create(versionRequirementTable), this.metadataVersion);
        this.staticScope = this.kind == ClassKind.ENUM_CLASS ? new StaticScopeForKotlinEnum(this.f29577c.getStorageManager(), this) : Empty.INSTANCE;
        this.typeConstructor = new DeserializedClassTypeConstructor();
        this.memberScope = new DeserializedClassMemberScope();
        ProtoContainer.Class classR2 = null;
        this.enumEntries = this.kind == ClassKind.ENUM_CLASS ? new EnumEntryClassDescriptors() : null;
        this.containingDeclaration = deserializationContext.getContainingDeclaration();
        this.primaryConstructor = this.f29577c.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$primaryConstructor$1(this));
        this.constructors = this.f29577c.getStorageManager().createLazyValue(new DeserializedClassDescriptor$constructors$1(this));
        this.companionObjectDescriptor = this.f29577c.getStorageManager().createNullableLazyValue(new DeserializedClassDescriptor$companionObjectDescriptor$1(this));
        this.sealedSubclasses = this.f29577c.getStorageManager().createLazyValue(new DeserializedClassDescriptor$sealedSubclasses$1(this));
        Class classR3 = this.classProto;
        NameResolver nameResolver2 = this.f29577c.getNameResolver();
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable3 = this.f29577c.getTypeTable();
        SourceElement sourceElement3 = this.sourceElement;
        DeclarationDescriptor declarationDescriptor = this.containingDeclaration;
        if (!(declarationDescriptor instanceof DeserializedClassDescriptor)) {
            declarationDescriptor = null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) declarationDescriptor;
        if (deserializedClassDescriptor != null) {
            classR2 = deserializedClassDescriptor.thisAsProtoContainer;
        }
        ProtoContainer.Class classR4 = new ProtoContainer.Class(classR3, nameResolver2, typeTable3, sourceElement3, classR2);
        this.thisAsProtoContainer = classR4;
        if (!Flags.HAS_ANNOTATIONS.get(this.classProto.getFlags()).booleanValue()) {
            annotations2 = Annotations.Companion.getEMPTY();
        } else {
            annotations2 = new NonEmptyDeserializedAnnotations(this.f29577c.getStorageManager(), new DeserializedClassDescriptor$annotations$1(this));
        }
        this.annotations = annotations2;
    }

    /* access modifiers changed from: private */
    public final ClassDescriptor computeCompanionObjectDescriptor() {
        if (!this.classProto.hasCompanionObjectName()) {
            return null;
        }
        ClassifierDescriptor contributedClassifier = this.memberScope.getContributedClassifier(NameResolverUtilKt.getName(this.f29577c.getNameResolver(), this.classProto.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (!(contributedClassifier instanceof ClassDescriptor)) {
            contributedClassifier = null;
        }
        return (ClassDescriptor) contributedClassifier;
    }

    /* access modifiers changed from: private */
    public final Collection<ClassConstructorDescriptor> computeConstructors() {
        return C13199w.m40583d((Collection) C13199w.m40583d((Collection) computeSecondaryConstructors(), (Iterable) C13185o.m40517b((Object) getUnsubstitutedPrimaryConstructor())), (Iterable) this.f29577c.getComponents().getAdditionalClassPartsProvider().getConstructors(this));
    }

    /* access modifiers changed from: private */
    public final ClassConstructorDescriptor computePrimaryConstructor() {
        ClassConstructorDescriptor classConstructorDescriptor;
        Object obj;
        if (this.kind.isSingleton()) {
            ClassConstructorDescriptorImpl createPrimaryConstructorForObject = DescriptorFactory.createPrimaryConstructorForObject(this, SourceElement.NO_SOURCE);
            createPrimaryConstructorForObject.setReturnType(getDefaultType());
            return createPrimaryConstructorForObject;
        }
        List constructorList = this.classProto.getConstructorList();
        Intrinsics.checkReturnedValueIsNotNull((Object) constructorList, "classProto.constructorList");
        Iterator it = constructorList.iterator();
        while (true) {
            classConstructorDescriptor = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Constructor constructor = (Constructor) obj;
            BooleanFlagField booleanFlagField = Flags.IS_SECONDARY;
            Intrinsics.checkReturnedValueIsNotNull((Object) constructor, "it");
            if (!booleanFlagField.get(constructor.getFlags()).booleanValue()) {
                break;
            }
        }
        Constructor constructor2 = (Constructor) obj;
        if (constructor2 != null) {
            classConstructorDescriptor = this.f29577c.getMemberDeserializer().loadConstructor(constructor2, true);
        }
        return classConstructorDescriptor;
    }

    private final List<ClassConstructorDescriptor> computeSecondaryConstructors() {
        String str;
        List constructorList = this.classProto.getConstructorList();
        Intrinsics.checkReturnedValueIsNotNull((Object) constructorList, "classProto.constructorList");
        ArrayList<Constructor> arrayList = new ArrayList<>();
        Iterator it = constructorList.iterator();
        while (true) {
            str = "it";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Constructor constructor = (Constructor) next;
            BooleanFlagField booleanFlagField = Flags.IS_SECONDARY;
            Intrinsics.checkReturnedValueIsNotNull((Object) constructor, str);
            Boolean bool = booleanFlagField.get(constructor.getFlags());
            Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.IS_SECONDARY.get(it.flags)");
            if (bool.booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C13187p.m40525a((Iterable) arrayList, 10));
        for (Constructor constructor2 : arrayList) {
            MemberDeserializer memberDeserializer = this.f29577c.getMemberDeserializer();
            Intrinsics.checkReturnedValueIsNotNull((Object) constructor2, str);
            arrayList2.add(memberDeserializer.loadConstructor(constructor2, false));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    public final Collection<ClassDescriptor> computeSubclassesForSealedClass() {
        if (this.modality != Modality.SEALED) {
            return C13185o.m40513a();
        }
        List<Integer> sealedSubclassFqNameList = this.classProto.getSealedSubclassFqNameList();
        Intrinsics.checkReturnedValueIsNotNull((Object) sealedSubclassFqNameList, "fqNames");
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return DescriptorUtilsKt.computeSealedSubclasses(this);
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : sealedSubclassFqNameList) {
            DeserializationComponents components = this.f29577c.getComponents();
            NameResolver nameResolver = this.f29577c.getNameResolver();
            Intrinsics.checkReturnedValueIsNotNull((Object) num, "index");
            ClassDescriptor deserializeClass = components.deserializeClass(NameResolverUtilKt.getClassId(nameResolver, num.intValue()));
            if (deserializeClass != null) {
                arrayList.add(deserializeClass);
            }
        }
        return arrayList;
    }

    public Annotations getAnnotations() {
        return this.annotations;
    }

    public final DeserializationContext getC() {
        return this.f29577c;
    }

    public final Class getClassProto() {
        return this.classProto;
    }

    public ClassDescriptor getCompanionObjectDescriptor() {
        return (ClassDescriptor) this.companionObjectDescriptor.invoke();
    }

    public Collection<ClassConstructorDescriptor> getConstructors() {
        return (Collection) this.constructors.invoke();
    }

    public DeclarationDescriptor getContainingDeclaration() {
        return this.containingDeclaration;
    }

    public List<TypeParameterDescriptor> getDeclaredTypeParameters() {
        return this.f29577c.getTypeDeserializer().getOwnTypeParameters();
    }

    public ClassKind getKind() {
        return this.kind;
    }

    public final BinaryVersion getMetadataVersion() {
        return this.metadataVersion;
    }

    public Modality getModality() {
        return this.modality;
    }

    public Collection<ClassDescriptor> getSealedSubclasses() {
        return (Collection) this.sealedSubclasses.invoke();
    }

    public SourceElement getSource() {
        return this.sourceElement;
    }

    public final ProtoContainer.Class getThisAsProtoContainer$deserialization() {
        return this.thisAsProtoContainer;
    }

    public TypeConstructor getTypeConstructor() {
        return this.typeConstructor;
    }

    public MemberScope getUnsubstitutedMemberScope() {
        return this.memberScope;
    }

    public ClassConstructorDescriptor getUnsubstitutedPrimaryConstructor() {
        return (ClassConstructorDescriptor) this.primaryConstructor.invoke();
    }

    public Visibility getVisibility() {
        return this.visibility;
    }

    public final boolean hasNestedClass$deserialization(Name name) {
        return this.memberScope.getClassNames$deserialization().contains(name);
    }

    public boolean isActual() {
        return false;
    }

    public boolean isCompanionObject() {
        return ((Kind) Flags.CLASS_KIND.get(this.classProto.getFlags())) == Kind.COMPANION_OBJECT;
    }

    public boolean isData() {
        Boolean bool = Flags.IS_DATA.get(this.classProto.getFlags());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.IS_DATA.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isExpect() {
        Boolean bool = Flags.IS_EXPECT_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.IS_EXPECT_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isExternal() {
        Boolean bool = Flags.IS_EXTERNAL_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.IS_EXTERNAL_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isInline() {
        Boolean bool = Flags.IS_INLINE_CLASS.get(this.classProto.getFlags());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.IS_INLINE_CLASS.get(classProto.flags)");
        return bool.booleanValue();
    }

    public boolean isInner() {
        Boolean bool = Flags.IS_INNER.get(this.classProto.getFlags());
        Intrinsics.checkReturnedValueIsNotNull((Object) bool, "Flags.IS_INNER.get(classProto.flags)");
        return bool.booleanValue();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("deserialized class ");
        sb.append(getName());
        return sb.toString();
    }

    public MemberScopeImpl getStaticScope() {
        return this.staticScope;
    }
}
