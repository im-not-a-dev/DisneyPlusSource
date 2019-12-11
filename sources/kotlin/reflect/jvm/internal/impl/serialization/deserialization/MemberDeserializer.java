package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.VersionKind;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement.Version;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: MemberDeserializer.kt */
public final class MemberDeserializer {
    private final AnnotationDeserializer annotationDeserializer = new AnnotationDeserializer(this.f29574c.getComponents().getModuleDescriptor(), this.f29574c.getComponents().getNotFoundClasses());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final DeserializationContext f29574c;

    public MemberDeserializer(DeserializationContext deserializationContext) {
        this.f29574c = deserializationContext;
    }

    /* access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f29574c.getNameResolver(), this.f29574c.getTypeTable(), this.f29574c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final CoroutinesCompatibilityMode checkExperimentalCoroutine(DeserializedMemberDescriptor deserializedMemberDescriptor, TypeDeserializer typeDeserializer) {
        CoroutinesCompatibilityMode coroutinesCompatibilityMode;
        if (!versionAndReleaseCoroutinesMismatch(deserializedMemberDescriptor)) {
            return CoroutinesCompatibilityMode.COMPATIBLE;
        }
        forceUpperBoundsComputation(typeDeserializer);
        if (typeDeserializer.getExperimentalSuspendFunctionTypeEncountered()) {
            coroutinesCompatibilityMode = CoroutinesCompatibilityMode.INCOMPATIBLE;
        } else {
            coroutinesCompatibilityMode = CoroutinesCompatibilityMode.COMPATIBLE;
        }
        return coroutinesCompatibilityMode;
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00a7 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode computeExperimentalityModeForFunctions(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r5, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> r6, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> r7, kotlin.reflect.jvm.internal.impl.types.KotlinType r8, boolean r9) {
        /*
            r3 = this;
            boolean r0 = r3.versionAndReleaseCoroutinesMismatch(r4)
            if (r0 != 0) goto L_0x0009
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
            return r4
        L_0x0009:
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.fqNameOrNull(r4)
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME
            boolean r4 = kotlin.jvm.internal.C12880j.m40224a(r4, r0)
            if (r4 == 0) goto L_0x0018
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
            return r4
        L_0x0018:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r1 = kotlin.p590y.C13187p.m40525a(r6, r0)
            r4.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x0027:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x003b
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.getType()
            r4.add(r1)
            goto L_0x0027
        L_0x003b:
            if (r5 == 0) goto L_0x0042
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r5.getType()
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            java.util.List r5 = kotlin.p590y.C13185o.m40517b(r5)
            java.util.List r4 = kotlin.p590y.C13199w.m40583d(r4, r5)
            r5 = 1
            if (r8 == 0) goto L_0x0057
            boolean r6 = r3.containsSuspendFunctionType(r8)
            if (r6 != r5) goto L_0x0057
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            return r4
        L_0x0057:
            boolean r6 = r7 instanceof java.util.Collection
            r8 = 0
            if (r6 == 0) goto L_0x0064
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto L_0x0064
        L_0x0062:
            r6 = 0
            goto L_0x00a8
        L_0x0064:
            java.util.Iterator r6 = r7.iterator()
        L_0x0068:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r7
            java.util.List r7 = r7.getUpperBounds()
            java.lang.String r1 = "typeParameter.upperBounds"
            kotlin.jvm.internal.C12880j.m40222a(r7, r1)
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0089
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto L_0x0089
        L_0x0087:
            r7 = 0
            goto L_0x00a5
        L_0x0089:
            java.util.Iterator r7 = r7.iterator()
        L_0x008d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0087
            java.lang.Object r1 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
            java.lang.String r2 = "it"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
            boolean r1 = r3.containsSuspendFunctionType(r1)
            if (r1 == 0) goto L_0x008d
            r7 = 1
        L_0x00a5:
            if (r7 == 0) goto L_0x0068
            r6 = 1
        L_0x00a8:
            if (r6 == 0) goto L_0x00ad
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            return r4
        L_0x00ad:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.p590y.C13187p.m40525a(r4, r0)
            r6.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L_0x00ba:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0123
            java.lang.Object r7 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r7
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C12880j.m40222a(r7, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.isSuspendFunctionType(r7)
            if (r0 == 0) goto L_0x0114
            java.util.List r0 = r7.getArguments()
            int r0 = r0.size()
            r1 = 3
            if (r0 > r1) goto L_0x0114
            java.util.List r7 = r7.getArguments()
            boolean r0 = r7 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00ec
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x00ec
        L_0x00ea:
            r7 = 0
            goto L_0x010c
        L_0x00ec:
            java.util.Iterator r7 = r7.iterator()
        L_0x00f0:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r7.next()
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r0
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.lang.String r1 = "it.type"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r3.containsSuspendFunctionType(r0)
            if (r0 == 0) goto L_0x00f0
            r7 = 1
        L_0x010c:
            if (r7 == 0) goto L_0x0111
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            goto L_0x011f
        L_0x0111:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER
            goto L_0x011f
        L_0x0114:
            boolean r7 = r3.containsSuspendFunctionType(r7)
            if (r7 == 0) goto L_0x011d
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            goto L_0x011f
        L_0x011d:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r7 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
        L_0x011f:
            r6.add(r7)
            goto L_0x00ba
        L_0x0123:
            java.lang.Comparable r4 = kotlin.p590y.C13199w.m40596j(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode) r4
            if (r4 == 0) goto L_0x012c
            goto L_0x012e
        L_0x012c:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
        L_0x012e:
            if (r9 == 0) goto L_0x0133
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.NEEDS_WRAPPER
            goto L_0x0135
        L_0x0133:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.COMPATIBLE
        L_0x0135:
            java.lang.Comparable r4 = kotlin.p591z.C13207c.m40623b(r5, r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r4 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.computeExperimentalityModeForFunctions(kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor, java.util.Collection, java.util.Collection, kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean):kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode");
    }

    private final boolean containsSuspendFunctionType(KotlinType kotlinType) {
        return TypeUtilsKt.contains(kotlinType, MemberDeserializer$containsSuspendFunctionType$1.INSTANCE);
    }

    private final void forceUpperBoundsComputation(TypeDeserializer typeDeserializer) {
        for (TypeParameterDescriptor upperBounds : typeDeserializer.getOwnTypeParameters()) {
            upperBounds.getUpperBounds();
        }
    }

    private final Annotations getAnnotations(MessageLite messageLite, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (!Flags.HAS_ANNOTATIONS.get(i).booleanValue()) {
            return Annotations.Companion.getEMPTY();
        }
        return new NonEmptyDeserializedAnnotations(this.f29574c.getStorageManager(), new MemberDeserializer$getAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f29574c.getContainingDeclaration();
        if (!(containingDeclaration instanceof ClassDescriptor)) {
            containingDeclaration = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
        if (classDescriptor != null) {
            return classDescriptor.getThisAsReceiverParameter();
        }
        return null;
    }

    private final Annotations getPropertyFieldAnnotations(Property property, boolean z) {
        if (!Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue()) {
            return Annotations.Companion.getEMPTY();
        }
        return new NonEmptyDeserializedAnnotations(this.f29574c.getStorageManager(), new MemberDeserializer$getPropertyFieldAnnotations$1(this, z, property));
    }

    private final Annotations getReceiverParameterAnnotations(MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f29574c.getStorageManager(), new MemberDeserializer$getReceiverParameterAnnotations$1(this, messageLite, annotatedCallableKind));
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends TypeParameterDescriptor> list, List<? extends ValueParameterDescriptor> list2, KotlinType kotlinType, Modality modality, Visibility visibility, Map<? extends UserDataKey<?>, ?> map, boolean z) {
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor2 = deserializedSimpleFunctionDescriptor;
        ReceiverParameterDescriptor receiverParameterDescriptor3 = receiverParameterDescriptor;
        List<? extends TypeParameterDescriptor> list3 = list;
        deserializedSimpleFunctionDescriptor2.initialize(receiverParameterDescriptor3, receiverParameterDescriptor2, list3, list2, kotlinType, modality, visibility, map, computeExperimentalityModeForFunctions(deserializedSimpleFunctionDescriptor2, receiverParameterDescriptor3, list2, list3, kotlinType, z));
    }

    private final int loadOldFlags(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> valueParameters(java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter> r27, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r28, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r29) {
        /*
            r26 = this;
            r8 = r26
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.getContainingDeclaration()
            if (r0 == 0) goto L_0x0118
            r21 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r21 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor) r21
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r21.getContainingDeclaration()
            java.lang.String r1 = "callableDescriptor.containingDeclaration"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r22 = r8.asProtoContainer(r0)
            java.util.ArrayList r15 = new java.util.ArrayList
            r0 = 10
            r1 = r27
            int r0 = kotlin.p590y.C13187p.m40525a(r1, r0)
            r15.<init>(r0)
            java.util.Iterator r23 = r27.iterator()
            r24 = 0
            r12 = 0
        L_0x002f:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0112
            java.lang.Object r0 = r23.next()
            int r25 = r12 + 1
            if (r12 < 0) goto L_0x010d
            r10 = r0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r10
            boolean r0 = r10.hasFlags()
            if (r0 == 0) goto L_0x004c
            int r0 = r10.getFlags()
            r11 = r0
            goto L_0x004d
        L_0x004c:
            r11 = 0
        L_0x004d:
            if (r22 == 0) goto L_0x007f
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS
            java.lang.Boolean r0 = r0.get(r11)
            java.lang.String r1 = "Flags.HAS_ANNOTATIONS.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x007f
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r14 = r0.getStorageManager()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$$inlined$mapIndexed$lambda$1 r7 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$$inlined$mapIndexed$lambda$1
            r0 = r7
            r1 = r12
            r2 = r10
            r3 = r26
            r4 = r22
            r5 = r28
            r6 = r29
            r9 = r7
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.<init>(r14, r9)
            goto L_0x0086
        L_0x007f:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r0.getEMPTY()
            r13 = r0
        L_0x0086:
            r0 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r1 = r1.getNameResolver()
            int r2 = r10.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r14 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r1, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r1 = r1.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r2 = r2.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.type(r10, r2)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r1.type(r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.DECLARES_DEFAULT_VALUE
            java.lang.Boolean r2 = r2.get(r11)
            java.lang.String r3 = "Flags.DECLARES_DEFAULT_VALUE.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            boolean r16 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CROSSINLINE
            java.lang.Boolean r2 = r2.get(r11)
            java.lang.String r3 = "Flags.IS_CROSSINLINE.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            boolean r17 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOINLINE
            java.lang.Boolean r2 = r2.get(r11)
            java.lang.String r3 = "Flags.IS_NOINLINE.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            boolean r18 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r2 = r2.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.varargElementType(r10, r2)
            if (r2 == 0) goto L_0x00ef
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r8.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r3 = r3.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r3.type(r2)
            r19 = r2
            goto L_0x00f1
        L_0x00ef:
            r19 = 0
        L_0x00f1:
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r2 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            java.lang.String r3 = "SourceElement.NO_SOURCE"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl r3 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl
            r9 = r3
            r10 = r21
            r11 = r0
            r0 = r15
            r15 = r1
            r20 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.add(r3)
            r15 = r0
            r12 = r25
            goto L_0x002f
        L_0x010d:
            kotlin.p590y.C13180m.m40455c()
            r0 = 0
            throw r0
        L_0x0112:
            r0 = r15
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r0)
            return r0
        L_0x0118:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.valueParameters(java.util.List, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind):java.util.List");
    }

    private final boolean versionAndReleaseCoroutinesMismatch(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        boolean z;
        boolean z2;
        if (!this.f29574c.getComponents().getConfiguration().getReleaseCoroutines()) {
            return false;
        }
        List versionRequirements = deserializedMemberDescriptor.getVersionRequirements();
        if (!(versionRequirements instanceof Collection) || !versionRequirements.isEmpty()) {
            Iterator it = versionRequirements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                VersionRequirement versionRequirement = (VersionRequirement) it.next();
                Version version = versionRequirement.getVersion();
                Version version2 = new Version(1, 3, 0, 4, null);
                if (!C12880j.m40224a((Object) version, (Object) version2) || versionRequirement.getKind() != VersionKind.LANGUAGE_VERSION) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
        if (versionAndReleaseCoroutinesMismatch(r8) != false) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor loadConstructor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r23, boolean r24) {
        /*
            r22 = this;
            r7 = r22
            r0 = r23
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r7.f29574c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.getContainingDeclaration()
            if (r1 == 0) goto L_0x00db
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor r6 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor
            r10 = 0
            int r2 = r23.getFlags()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r11 = r7.getAnnotations(r0, r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r13 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r7.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r15 = r2.getNameResolver()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r7.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r16 = r2.getTypeTable()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r7.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r17 = r2.getVersionRequirementTable()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r7.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r18 = r2.getContainerSource()
            r19 = 0
            r20 = 1024(0x400, float:1.435E-42)
            r21 = 0
            r8 = r6
            r9 = r1
            r12 = r24
            r14 = r23
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r7.f29574c
            java.util.List r10 = kotlin.p590y.C13185o.m40513a()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 60
            r16 = 0
            r9 = r6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r2 = r2.getMemberDeserializer()
            java.util.List r3 = r23.getValueParameterList()
            java.lang.String r4 = "proto.valueParameterList"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            java.util.List r2 = r2.valueParameters(r3, r0, r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY
            int r0 = r23.getFlags()
            java.lang.Object r0 = r4.get(r0)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r0 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r0
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r0 = r3.visibility(r0)
            r6.initialize(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r1.getDefaultType()
            r6.setReturnType(r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r7.f29574c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.getContainingDeclaration()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r1 != 0) goto L_0x0091
            r0 = 0
        L_0x0091:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r0
            r1 = 1
            if (r0 == 0) goto L_0x00af
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r0 = r0.getC()
            if (r0 == 0) goto L_0x00af
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r0 = r0.getTypeDeserializer()
            if (r0 == 0) goto L_0x00af
            boolean r0 = r0.getExperimentalSuspendFunctionTypeEncountered()
            if (r0 != r1) goto L_0x00af
            boolean r0 = r7.versionAndReleaseCoroutinesMismatch(r6)
            if (r0 == 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            if (r1 == 0) goto L_0x00b6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor.CoroutinesCompatibilityMode.INCOMPATIBLE
            r9 = r6
            goto L_0x00d7
        L_0x00b6:
            r2 = 0
            java.util.List r3 = r6.getValueParameters()
            java.lang.String r0 = "descriptor.valueParameters"
            kotlin.jvm.internal.C12880j.m40222a(r3, r0)
            java.util.List r4 = r6.getTypeParameters()
            java.lang.String r0 = "descriptor.typeParameters"
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r6.getReturnType()
            r8 = 0
            r0 = r22
            r1 = r6
            r9 = r6
            r6 = r8
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r0 = r0.computeExperimentalityModeForFunctions(r1, r2, r3, r4, r5, r6)
        L_0x00d7:
            r9.setCoroutinesExperimentalCompatibilityMode$deserialization(r0)
            return r9
        L_0x00db:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadConstructor(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, boolean):kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor loadFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r32) {
        /*
            r31 = this;
            r11 = r31
            r10 = r32
            boolean r0 = r32.hasFlags()
            if (r0 == 0) goto L_0x000f
            int r0 = r32.getFlags()
            goto L_0x0017
        L_0x000f:
            int r0 = r32.getOldFlags()
            int r0 = r11.loadOldFlags(r0)
        L_0x0017:
            r9 = r0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r15 = r11.getAnnotations(r10, r9, r0)
            boolean r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver(r32)
            if (r0 == 0) goto L_0x002b
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r11.getReceiverParameterAnnotations(r10, r0)
            goto L_0x0031
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r0.getEMPTY()
        L_0x0031:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r1.getContainingDeclaration()
            kotlin.reflect.jvm.internal.impl.name.FqName r1 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r2 = r2.getNameResolver()
            int r3 = r32.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.FqName r1 = r1.child(r2)
            kotlin.reflect.jvm.internal.impl.name.FqName r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME
            boolean r1 = kotlin.jvm.internal.C12880j.m40224a(r1, r2)
            if (r1 == 0) goto L_0x005c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable$Companion r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable.Companion
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r1 = r1.getEMPTY()
            goto L_0x0062
        L_0x005c:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r1 = r1.getVersionRequirementTable()
        L_0x0062:
            r21 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor r8 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r13 = r1.getContainingDeclaration()
            r14 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r1 = r1.getNameResolver()
            int r2 = r32.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r16 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r1, r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind> r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND
            java.lang.Object r2 = r2.get(r9)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind) r2
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r17 = r1.memberKind(r2)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r19 = r1.getNameResolver()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r20 = r1.getTypeTable()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r22 = r1.getContainerSource()
            r23 = 0
            r24 = 1024(0x400, float:1.435E-42)
            r25 = 0
            r12 = r8
            r18 = r32
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            java.util.List r2 = r32.getTypeParameterList()
            java.lang.String r3 = "proto.typeParameterList"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 60
            r30 = 0
            r22 = r1
            r23 = r8
            r24 = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r2 = r2.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(r10, r2)
            if (r2 == 0) goto L_0x00e1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r3 = r1.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r3.type(r2)
            if (r2 == 0) goto L_0x00e1
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(r8, r2, r0)
            goto L_0x00e2
        L_0x00e1:
            r0 = 0
        L_0x00e2:
            r2 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r3 = r31.getDispatchReceiverParameter()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r0 = r1.getTypeDeserializer()
            java.util.List r4 = r0.getOwnTypeParameters()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r0 = r1.getMemberDeserializer()
            java.util.List r5 = r32.getValueParameterList()
            java.lang.String r6 = "proto.valueParameterList"
            kotlin.jvm.internal.C12880j.m40222a(r5, r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.FUNCTION
            java.util.List r5 = r0.valueParameters(r5, r10, r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r0 = r1.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r11.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r1 = r1.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(r10, r1)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r0.type(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY
            java.lang.Object r1 = r1.get(r9)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r7 = r0.modality(r1)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY
            java.lang.Object r1 = r1.get(r9)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r12 = r0.visibility(r1)
            java.util.Map r13 = kotlin.p590y.C13173j0.m40350a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SUSPEND
            java.lang.Boolean r0 = r0.get(r9)
            java.lang.String r14 = "Flags.IS_SUSPEND.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r14)
            boolean r15 = r0.booleanValue()
            r0 = r31
            r1 = r8
            r11 = r8
            r8 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r15
            r0.initializeWithCoroutinesExperimentalityStatus(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_OPERATOR
            java.lang.Boolean r0 = r0.get(r12)
            java.lang.String r1 = "Flags.IS_OPERATOR.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            r11.setOperator(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INFIX
            java.lang.Boolean r0 = r0.get(r12)
            java.lang.String r1 = "Flags.IS_INFIX.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            r11.setInfix(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_FUNCTION
            java.lang.Boolean r0 = r0.get(r12)
            java.lang.String r1 = "Flags.IS_EXTERNAL_FUNCTION.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            r11.setExternal(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE
            java.lang.Boolean r0 = r0.get(r12)
            java.lang.String r1 = "Flags.IS_INLINE.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            r11.setInline(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_TAILREC
            java.lang.Boolean r0 = r0.get(r12)
            java.lang.String r1 = "Flags.IS_TAILREC.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            r11.setTailrec(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_SUSPEND
            java.lang.Boolean r0 = r0.get(r12)
            kotlin.jvm.internal.C12880j.m40222a(r0, r14)
            boolean r0 = r0.booleanValue()
            r11.setSuspend(r0)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_FUNCTION
            java.lang.Boolean r0 = r0.get(r12)
            java.lang.String r1 = "Flags.IS_EXPECT_FUNCTION.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r0, r1)
            boolean r0 = r0.booleanValue()
            r11.setExpect(r0)
            r0 = r31
            r1 = r11
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents r2 = r2.getComponents()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer r2 = r2.getContractDeserializer()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r3 = r3.getTypeTable()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r4 = r4.getTypeDeserializer()
            kotlin.Pair r2 = r2.deserializeContractFromFunction(r13, r1, r3, r4)
            if (r2 == 0) goto L_0x01f7
            java.lang.Object r3 = r2.mo31015c()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey) r3
            java.lang.Object r2 = r2.mo31016d()
            r1.putInUserDataMap(r3, r2)
        L_0x01f7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadFunction(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function):kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x021c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02f1  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0307  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor loadProperty(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r25) {
        /*
            r24 = this;
            r0 = r24
            r15 = r25
            boolean r1 = r25.hasFlags()
            if (r1 == 0) goto L_0x000f
            int r1 = r25.getFlags()
            goto L_0x0017
        L_0x000f:
            int r1 = r25.getOldFlags()
            int r1 = r0.loadOldFlags(r1)
        L_0x0017:
            r14 = r1
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor r13 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor
            r1 = r13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r2 = r2.getContainingDeclaration()
            r3 = 0
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r0.getAnnotations(r15, r14, r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY
            java.lang.Object r6 = r6.get(r14)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r6
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = r5.modality(r6)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY
            java.lang.Object r7 = r7.get(r14)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r7
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r6 = r6.visibility(r7)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r7 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_VAR
            java.lang.Boolean r7 = r7.get(r14)
            java.lang.String r8 = "Flags.IS_VAR.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r7, r8)
            boolean r7 = r7.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r8 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r8 = r8.getNameResolver()
            int r9 = r25.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r8, r9)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r9 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind> r10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MEMBER_KIND
            java.lang.Object r10 = r10.get(r14)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.MemberKind) r10
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = r9.memberKind(r10)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r10 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_LATEINIT
            java.lang.Boolean r10 = r10.get(r14)
            java.lang.String r11 = "Flags.IS_LATEINIT.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r10, r11)
            boolean r10 = r10.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r11 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_CONST
            java.lang.Boolean r11 = r11.get(r14)
            java.lang.String r12 = "Flags.IS_CONST.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r11, r12)
            boolean r11 = r11.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r12 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_PROPERTY
            java.lang.Boolean r12 = r12.get(r14)
            java.lang.String r3 = "Flags.IS_EXTERNAL_PROPERTY.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r12, r3)
            boolean r12 = r12.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_DELEGATED
            java.lang.Boolean r3 = r3.get(r14)
            r16 = r13
            java.lang.String r13 = "Flags.IS_DELEGATED.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r13)
            boolean r13 = r3.booleanValue()
            r3 = r16
            r21 = r3
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXPECT_PROPERTY
            java.lang.Boolean r3 = r3.get(r14)
            r16 = r14
            java.lang.String r14 = "Flags.IS_EXPECT_PROPERTY.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r14)
            boolean r14 = r3.booleanValue()
            r3 = r16
            r22 = r3
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r16 = r3.getNameResolver()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r17 = r3.getTypeTable()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r18 = r3.getVersionRequirementTable()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r19 = r3.getContainerSource()
            r3 = r15
            r15 = r25
            r23 = r22
            r3 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r1 = r0.f29574c
            java.util.List r3 = r25.getTypeParameterList()
            java.lang.String r2 = "proto.typeParameterList"
            kotlin.jvm.internal.C12880j.m40222a(r3, r2)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r2 = r21
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r19 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_GETTER
            r15 = r23
            java.lang.Boolean r1 = r1.get(r15)
            java.lang.String r2 = "Flags.HAS_GETTER.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0121
            boolean r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.hasReceiver(r25)
            if (r2 == 0) goto L_0x0121
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            r14 = r25
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r0.getReceiverParameterAnnotations(r14, r2)
            goto L_0x0129
        L_0x0121:
            r14 = r25
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r2.getEMPTY()
        L_0x0129:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r3 = r19.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r4 = r4.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.returnType(r14, r4)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r3.type(r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r4 = r19.getTypeDeserializer()
            java.util.List r4 = r4.getOwnTypeParameters()
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r5 = r24.getDispatchReceiverParameter()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r6 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r6 = r6.getTypeTable()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt.receiverType(r14, r6)
            if (r6 == 0) goto L_0x0164
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r7 = r19.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r7.type(r6)
            if (r6 == 0) goto L_0x0164
            r13 = r21
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r2 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createExtensionReceiverParameterForCallable(r13, r6, r2)
            goto L_0x0167
        L_0x0164:
            r13 = r21
            r2 = 0
        L_0x0167:
            r13.setType(r3, r4, r5, r2)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_ANNOTATIONS
            java.lang.Boolean r2 = r2.get(r15)
            java.lang.String r3 = "Flags.HAS_ANNOTATIONS.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            boolean r4 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY
            java.lang.Object r2 = r2.get(r15)
            r5 = r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r5
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY
            java.lang.Object r2 = r2.get(r15)
            r6 = r2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r6
            r7 = 0
            r8 = 0
            r9 = 0
            int r16 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.getAccessorFlags(r4, r5, r6, r7, r8, r9)
            r11 = 1
            if (r1 == 0) goto L_0x021c
            boolean r1 = r25.hasGetterFlags()
            if (r1 == 0) goto L_0x01a0
            int r1 = r25.getGetterFlags()
            goto L_0x01a2
        L_0x01a0:
            r1 = r16
        L_0x01a2:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT
            java.lang.Boolean r2 = r2.get(r1)
            java.lang.String r3 = "Flags.IS_NOT_DEFAULT.get(getterFlags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            boolean r2 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR
            java.lang.Boolean r3 = r3.get(r1)
            java.lang.String r4 = "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            boolean r7 = r3.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR
            java.lang.Boolean r3 = r3.get(r1)
            java.lang.String r4 = "Flags.IS_INLINE_ACCESSOR.get(getterFlags)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            boolean r8 = r3.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_GETTER
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r0.getAnnotations(r14, r1, r3)
            if (r2 == 0) goto L_0x0208
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r17 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY
            java.lang.Object r5 = r5.get(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r5
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r4.modality(r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY
            java.lang.Object r1 = r6.get(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r5 = r5.visibility(r1)
            r6 = r2 ^ 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = r13.getKind()
            r10 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r18 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            r1 = r17
            r2 = r13
            r12 = 1
            r11 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0212
        L_0x0208:
            r12 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultGetter(r13, r3)
            java.lang.String r2 = "DescriptorFactory.create…er(property, annotations)"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
        L_0x0212:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r13.getReturnType()
            r1.initialize(r2)
            r21 = r1
            goto L_0x021f
        L_0x021c:
            r12 = 1
            r21 = 0
        L_0x021f:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r1 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_SETTER
            java.lang.Boolean r1 = r1.get(r15)
            java.lang.String r2 = "Flags.HAS_SETTER.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r1, r2)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x02f1
            boolean r1 = r25.hasSetterFlags()
            if (r1 == 0) goto L_0x023a
            int r16 = r25.getSetterFlags()
        L_0x023a:
            r1 = r16
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_NOT_DEFAULT
            java.lang.Boolean r2 = r2.get(r1)
            java.lang.String r3 = "Flags.IS_NOT_DEFAULT.get(setterFlags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r3)
            boolean r2 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_EXTERNAL_ACCESSOR
            java.lang.Boolean r3 = r3.get(r1)
            java.lang.String r4 = "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            boolean r7 = r3.booleanValue()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r3 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.IS_INLINE_ACCESSOR
            java.lang.Boolean r3 = r3.get(r1)
            java.lang.String r4 = "Flags.IS_INLINE_ACCESSOR.get(setterFlags)"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            boolean r8 = r3.booleanValue()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r0.getAnnotations(r14, r1, r3)
            if (r2 == 0) goto L_0x02dd
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl r11 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r4 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality> r5 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.MODALITY
            java.lang.Object r5 = r5.get(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Modality) r5
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r4.modality(r5)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags r5 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoEnumFlags.INSTANCE
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$FlagField<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility> r6 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.VISIBILITY
            java.lang.Object r1 = r6.get(r1)
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Visibility) r1
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r5 = r5.visibility(r1)
            r6 = r2 ^ 1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = r13.getKind()
            r10 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r16 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.NO_SOURCE
            r1 = r11
            r2 = r13
            r20 = r11
            r11 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.List r1 = kotlin.p590y.C13185o.m40513a()
            r2 = 0
            r3 = 0
            r4 = 0
            r16 = 0
            r17 = 60
            r18 = 0
            r10 = r19
            r11 = r20
            r5 = 1
            r12 = r1
            r7 = r13
            r13 = r2
            r1 = r14
            r14 = r3
            r2 = r15
            r15 = r4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r3 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext.childContext$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer r3 = r3.getMemberDeserializer()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = r25.getSetterValueParameter()
            java.util.List r4 = kotlin.p590y.C13183n.m40498a(r4)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r6 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind.PROPERTY_SETTER
            java.util.List r3 = r3.valueParameters(r4, r1, r6)
            java.lang.Object r3 = kotlin.p590y.C13199w.m40599k(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r3
            r4 = r20
            r4.initialize(r3)
            r3 = r4
            goto L_0x02f6
        L_0x02dd:
            r7 = r13
            r1 = r14
            r2 = r15
            r5 = 1
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r4 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r4 = r4.getEMPTY()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl r3 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory.createDefaultSetter(r7, r3, r4)
            java.lang.String r4 = "DescriptorFactory.create…ptor */\n                )"
            kotlin.jvm.internal.C12880j.m40222a(r3, r4)
            goto L_0x02f6
        L_0x02f1:
            r7 = r13
            r1 = r14
            r2 = r15
            r5 = 1
            r3 = 0
        L_0x02f6:
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r4 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.HAS_CONSTANT
            java.lang.Boolean r2 = r4.get(r2)
            java.lang.String r4 = "Flags.HAS_CONSTANT.get(flags)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r4)
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x0319
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r2 = r0.f29574c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r2 = r2.getStorageManager()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3 r4 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3
            r4.<init>(r0, r1, r7)
            kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue r2 = r2.createNullableLazyValue(r4)
            r7.setCompileTimeInitializer(r2)
        L_0x0319:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl r4 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl
            r2 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r0.getPropertyFieldAnnotations(r1, r2)
            r4.<init>(r2, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl r6 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r0.getPropertyFieldAnnotations(r1, r5)
            r6.<init>(r1, r7)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer r1 = r19.getTypeDeserializer()
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor$CoroutinesCompatibilityMode r8 = r0.checkExperimentalCoroutine(r7, r1)
            r1 = r7
            r2 = r21
            r5 = r6
            r6 = r8
            r1.initialize(r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer.loadProperty(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property):kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor");
    }

    public final TypeAliasDescriptor loadTypeAlias(TypeAlias typeAlias) {
        TypeAlias typeAlias2 = typeAlias;
        Companion companion = Annotations.Companion;
        List<Annotation> annotationList = typeAlias.getAnnotationList();
        C12880j.m40222a((Object) annotationList, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) annotationList, 10));
        for (Annotation annotation : annotationList) {
            AnnotationDeserializer annotationDeserializer2 = this.annotationDeserializer;
            C12880j.m40222a((Object) annotation, "it");
            arrayList.add(annotationDeserializer2.deserializeAnnotation(annotation, this.f29574c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f29574c.getStorageManager(), this.f29574c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f29574c.getNameResolver(), typeAlias.getName()), ProtoEnumFlags.INSTANCE.visibility((ProtoBuf.Visibility) Flags.VISIBILITY.get(typeAlias.getFlags())), typeAlias, this.f29574c.getNameResolver(), this.f29574c.getTypeTable(), this.f29574c.getVersionRequirementTable(), this.f29574c.getContainerSource());
        DeserializationContext deserializationContext = this.f29574c;
        List typeParameterList = typeAlias.getTypeParameterList();
        C12880j.m40222a((Object) typeParameterList, "proto.typeParameterList");
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor2 = deserializedTypeAliasDescriptor;
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor2.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(typeAlias2, this.f29574c.getTypeTable())), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(typeAlias2, this.f29574c.getTypeTable())), checkExperimentalCoroutine(deserializedTypeAliasDescriptor2, childContext$default.getTypeDeserializer()));
        return deserializedTypeAliasDescriptor2;
    }
}
