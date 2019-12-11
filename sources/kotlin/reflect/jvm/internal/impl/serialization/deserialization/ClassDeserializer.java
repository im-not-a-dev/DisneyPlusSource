package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* compiled from: ClassDeserializer.kt */
public final class ClassDeserializer {
    /* access modifiers changed from: private */
    public static final Set<ClassId> BLACK_LIST = C13186o0.m40524a(ClassId.topLevel(KotlinBuiltIns.FQ_NAMES.cloneable.toSafe()));
    public static final Companion Companion = new Companion(null);
    private final Function1<ClassKey, ClassDescriptor> classes = this.components.getStorageManager().createMemoizedFunctionWithNullableValues(new ClassDeserializer$classes$1(this));
    private final DeserializationComponents components;

    /* compiled from: ClassDeserializer.kt */
    private static final class ClassKey {
        private final ClassData classData;
        private final ClassId classId;

        public ClassKey(ClassId classId2, ClassData classData2) {
            this.classId = classId2;
            this.classData = classData2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ClassKey) && Intrinsics.areEqual((Object) this.classId, (Object) ((ClassKey) obj).classId);
        }

        public final ClassData getClassData() {
            return this.classData;
        }

        public final ClassId getClassId() {
            return this.classId;
        }

        public int hashCode() {
            return this.classId.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Set<ClassId> getBLACK_LIST() {
            return ClassDeserializer.BLACK_LIST;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ClassDeserializer(DeserializationComponents deserializationComponents) {
        this.components = deserializationComponents;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b9 A[EDGE_INSN: B:45:0x00b9->B:37:0x00b9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor createClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.ClassKey r13) {
        /*
            r12 = this;
            kotlin.reflect.jvm.internal.impl.name.ClassId r0 = r13.getClassId()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r1 = r12.components
            java.lang.Iterable r1 = r1.getFictitiousClassDescriptorFactories()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0021
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory r2 = (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory) r2
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = r2.createClass(r0)
            if (r2 == 0) goto L_0x000e
            return r2
        L_0x0021:
            java.util.Set<kotlin.reflect.jvm.internal.impl.name.ClassId> r1 = BLACK_LIST
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L_0x002b
            return r2
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData r13 = r13.getClassData()
            if (r13 == 0) goto L_0x0032
            goto L_0x003c
        L_0x0032:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r13 = r12.components
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder r13 = r13.getClassDataFinder()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData r13 = r13.findClassData(r0)
        L_0x003c:
            if (r13 == 0) goto L_0x00f0
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r1 = r13.component1()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r10 = r13.component2()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion r11 = r13.component3()
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r13 = r13.component4()
            kotlin.reflect.jvm.internal.impl.name.ClassId r3 = r0.getOuterClassId()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L_0x007a
            r5 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = deserializeClass$default(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r5 != 0) goto L_0x0060
            r3 = r2
        L_0x0060:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r3
            if (r3 == 0) goto L_0x0079
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r0.getShortClassName()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            boolean r0 = r3.hasNestedClass$deserialization(r0)
            if (r0 != 0) goto L_0x0072
            return r2
        L_0x0072:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r3.getC()
        L_0x0076:
            r4 = r0
            goto L_0x00e5
        L_0x0079:
            return r2
        L_0x007a:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r3 = r12.components
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider r3 = r3.getPackageFragmentProvider()
            kotlin.reflect.jvm.internal.impl.name.FqName r5 = r0.getPackageFqName()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r6)
            java.util.List r3 = r3.getPackageFragments(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0091:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r6
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment
            if (r7 == 0) goto L_0x00b4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment r6 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedPackageFragment) r6
            kotlin.reflect.jvm.internal.impl.name.Name r7 = r0.getShortClassName()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r7, r4)
            boolean r6 = r6.hasTopLevelClass(r7)
            if (r6 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r6 = 0
            goto L_0x00b5
        L_0x00b4:
            r6 = 1
        L_0x00b5:
            if (r6 == 0) goto L_0x0091
            goto L_0x00b9
        L_0x00b8:
            r5 = r2
        L_0x00b9:
            r4 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor) r4
            if (r4 == 0) goto L_0x00f0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r3 = r12.components
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6 = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r0 = r10.getTypeTable()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            r6.<init>(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable$Companion r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r2 = r10.getVersionRequirementTable()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r5)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r7 = r0.create(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r3.createContext(r4, r5, r6, r7, r8, r9)
            goto L_0x0076
        L_0x00e5:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x00f0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer.createClass(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$ClassKey):kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor");
    }

    public static /* synthetic */ ClassDescriptor deserializeClass$default(ClassDeserializer classDeserializer, ClassId classId, ClassData classData, int i, Object obj) {
        if ((i & 2) != 0) {
            classData = null;
        }
        return classDeserializer.deserializeClass(classId, classData);
    }

    public final ClassDescriptor deserializeClass(ClassId classId, ClassData classData) {
        return (ClassDescriptor) this.classes.invoke(new ClassKey(classId, classData));
    }
}
