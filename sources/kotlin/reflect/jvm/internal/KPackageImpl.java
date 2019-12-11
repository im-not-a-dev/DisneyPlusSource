package kotlin.reflect.jvm.internal;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectProperties.LazyVal;
import kotlin.reflect.jvm.internal.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u001d\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010#\u001a\u00020$H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0016J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\b2\u0006\u0010#\u001a\u00020$H\u0016J\b\u0010*\u001a\u00020(H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012 \u000f*\b\u0018\u00010\u000eR\u00020\u00000\u000eR\u00020\u00000\rX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00038TX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "jClass", "Ljava/lang/Class;", "usageModuleName", "", "(Ljava/lang/Class;Ljava/lang/String;)V", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "kotlin.jvm.PlatformType", "getJClass", "()Ljava/lang/Class;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "methodOwner", "getMethodOwner", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "getUsageModuleName", "()Ljava/lang/String;", "equals", "", "other", "", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "toString", "Data", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KPackageImpl.kt */
public final class KPackageImpl extends KDeclarationContainerImpl {
    private final LazyVal<Data> data;
    private final Class<?> jClass;
    private final String usageModuleName;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R%\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b \u0010!¨\u0006#"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KPackageImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KPackageImpl;)V", "kotlinClass", "Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "getKotlinClass", "()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;", "kotlinClass$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "members", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getMembers", "()Ljava/util/Collection;", "members$delegate", "metadata", "Lkotlin/Triple;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmNameResolver;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Package;", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMetadataVersion;", "getMetadata", "()Lkotlin/Triple;", "metadata$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "multifileFacade", "Ljava/lang/Class;", "getMultifileFacade", "()Ljava/lang/Class;", "multifileFacade$delegate", "scope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope$delegate", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KPackageImpl.kt */
    private final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties;
        private final LazySoftVal kotlinClass$delegate = ReflectProperties.lazySoft(new KPackageImpl$Data$kotlinClass$2(this));
        private final LazySoftVal members$delegate = ReflectProperties.lazySoft(new KPackageImpl$Data$members$2(this));
        private final LazyVal metadata$delegate = ReflectProperties.lazy(new KPackageImpl$Data$metadata$2(this));
        private final LazyVal multifileFacade$delegate = ReflectProperties.lazy(new KPackageImpl$Data$multifileFacade$2(this));
        private final LazySoftVal scope$delegate = ReflectProperties.lazySoft(new KPackageImpl$Data$scope$2(this));

        static {
            Class<Data> cls = Data.class;
            $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "kotlinClass", "getKotlinClass()Lkotlin/reflect/jvm/internal/components/ReflectKotlinClass;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "metadata", "getMetadata()Lkotlin/Triple;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
        }

        /* access modifiers changed from: private */
        public final ReflectKotlinClass getKotlinClass() {
            return (ReflectKotlinClass) this.kotlinClass$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final Collection<KCallableImpl<?>> getMembers() {
            return (Collection) this.members$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final Triple<JvmNameResolver, Package, JvmMetadataVersion> getMetadata() {
            return (Triple) this.metadata$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final Class<?> getMultifileFacade() {
            return (Class) this.multifileFacade$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final MemberScope getScope() {
            return (MemberScope) this.scope$delegate.getValue(this, $$delegatedProperties[1]);
        }
    }

    public /* synthetic */ KPackageImpl(Class cls, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 2) != 0) {
            str = null;
        }
        this(cls, str);
    }

    private final MemberScope getScope() {
        return ((Data) this.data.invoke()).getScope();
    }

    public boolean equals(Object obj) {
        return (obj instanceof KPackageImpl) && C12880j.m40224a((Object) getJClass(), (Object) ((KPackageImpl) obj).getJClass());
    }

    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        return C13185o.m40513a();
    }

    public Collection<FunctionDescriptor> getFunctions(Name name) {
        return getScope().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION);
    }

    public Class<?> getJClass() {
        return this.jClass;
    }

    public PropertyDescriptor getLocalProperty(int i) {
        Triple metadata = ((Data) this.data.invoke()).getMetadata();
        if (metadata == null) {
            return null;
        }
        JvmNameResolver jvmNameResolver = (JvmNameResolver) metadata.mo31020a();
        Package packageR = (Package) metadata.mo31021b();
        JvmMetadataVersion jvmMetadataVersion = (JvmMetadataVersion) metadata.mo31022c();
        GeneratedExtension<Package, List<Property>> generatedExtension = JvmProtoBuf.packageLocalVariable;
        C12880j.m40222a((Object) generatedExtension, "JvmProtoBuf.packageLocalVariable");
        Property property = (Property) ProtoBufUtilKt.getExtensionOrNull(packageR, generatedExtension, i);
        if (property == null) {
            return null;
        }
        Class jClass2 = getJClass();
        TypeTable typeTable = packageR.getTypeTable();
        C12880j.m40222a((Object) typeTable, "packageProto.typeTable");
        return (PropertyDescriptor) UtilKt.deserializeToDescriptor(jClass2, property, jvmNameResolver, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(typeTable), jvmMetadataVersion, KPackageImpl$getLocalProperty$1$1$1.INSTANCE);
    }

    public Collection<KCallable<?>> getMembers() {
        return ((Data) this.data.invoke()).getMembers();
    }

    /* access modifiers changed from: protected */
    public Class<?> getMethodOwner() {
        Class<?> multifileFacade = ((Data) this.data.invoke()).getMultifileFacade();
        return multifileFacade != null ? multifileFacade : getJClass();
    }

    public Collection<PropertyDescriptor> getProperties(Name name) {
        return getScope().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION);
    }

    public int hashCode() {
        return getJClass().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("file class ");
        sb.append(ReflectClassUtilKt.getClassId(getJClass()).asSingleFqName());
        return sb.toString();
    }

    public KPackageImpl(Class<?> cls, String str) {
        this.jClass = cls;
        this.usageModuleName = str;
        LazyVal<Data> lazy = ReflectProperties.lazy(new KPackageImpl$data$1(this));
        C12880j.m40222a((Object) lazy, "ReflectProperties.lazy { Data() }");
        this.data = lazy;
    }
}
