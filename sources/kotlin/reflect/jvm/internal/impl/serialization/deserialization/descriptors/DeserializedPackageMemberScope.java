package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;

/* compiled from: DeserializedPackageMemberScope.kt */
public class DeserializedPackageMemberScope extends DeserializedMemberScope {
    private final PackageFragmentDescriptor packageDescriptor;
    private final FqName packageFqName = this.packageDescriptor.getFqName();

    public DeserializedPackageMemberScope(PackageFragmentDescriptor packageFragmentDescriptor, Package packageR, NameResolver nameResolver, BinaryVersion binaryVersion, DeserializedContainerSource deserializedContainerSource, DeserializationComponents deserializationComponents, Function0<? extends Collection<Name>> function0) {
        TypeTable typeTable = packageR.getTypeTable();
        C12880j.m40222a((Object) typeTable, "proto.typeTable");
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable typeTable2 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable);
        Companion companion = VersionRequirementTable.Companion;
        ProtoBuf.VersionRequirementTable versionRequirementTable = packageR.getVersionRequirementTable();
        C12880j.m40222a((Object) versionRequirementTable, "proto.versionRequirementTable");
        DeserializationContext createContext = deserializationComponents.createContext(packageFragmentDescriptor, nameResolver, typeTable2, companion.create(versionRequirementTable), binaryVersion, deserializedContainerSource);
        List functionList = packageR.getFunctionList();
        C12880j.m40222a((Object) functionList, "proto.functionList");
        List propertyList = packageR.getPropertyList();
        C12880j.m40222a((Object) propertyList, "proto.propertyList");
        List typeAliasList = packageR.getTypeAliasList();
        C12880j.m40222a((Object) typeAliasList, "proto.typeAliasList");
        super(createContext, functionList, propertyList, typeAliasList, function0);
        this.packageDescriptor = packageFragmentDescriptor;
    }

    /* access modifiers changed from: protected */
    public void addEnumEntryDescriptors(Collection<DeclarationDescriptor> collection, Function1<? super Name, Boolean> function1) {
    }

    /* access modifiers changed from: protected */
    public ClassId createClassId(Name name) {
        return new ClassId(this.packageFqName, name);
    }

    public ClassifierDescriptor getContributedClassifier(Name name, LookupLocation lookupLocation) {
        recordLookup(name, lookupLocation);
        return super.getContributedClassifier(name, lookupLocation);
    }

    /* access modifiers changed from: protected */
    public Set<Name> getNonDeclaredFunctionNames() {
        return C13188p0.m40531a();
    }

    /* access modifiers changed from: protected */
    public Set<Name> getNonDeclaredVariableNames() {
        return C13188p0.m40531a();
    }

    /* access modifiers changed from: protected */
    public boolean hasClass(Name name) {
        boolean z;
        if (super.hasClass(name)) {
            return true;
        }
        Iterable fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        if (!(fictitiousClassDescriptorFactories instanceof Collection) || !((Collection) fictitiousClassDescriptorFactories).isEmpty()) {
            Iterator it = fictitiousClassDescriptorFactories.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((ClassDescriptorFactory) it.next()).shouldCreateClass(this.packageFqName, name)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public void recordLookup(Name name, LookupLocation lookupLocation) {
        UtilsKt.record(getC().getComponents().getLookupTracker(), lookupLocation, this.packageDescriptor, name);
    }

    public List<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1) {
        Collection computeDescriptors = computeDescriptors(descriptorKindFilter, function1, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<ClassDescriptorFactory> fictitiousClassDescriptorFactories = getC().getComponents().getFictitiousClassDescriptorFactories();
        ArrayList arrayList = new ArrayList();
        for (ClassDescriptorFactory allContributedClassesIfPossible : fictitiousClassDescriptorFactories) {
            C13196t.m40545a((Collection) arrayList, (Iterable) allContributedClassesIfPossible.getAllContributedClassesIfPossible(this.packageFqName));
        }
        return C13199w.m40583d(computeDescriptors, (Iterable) arrayList);
    }
}
