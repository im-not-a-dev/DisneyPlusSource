package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13142s;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass.AnnotationArgumentVisitor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Field;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature.Method;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Package;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> implements AnnotationAndConstantLoader<A, C> {
    public static final Companion Companion = new Companion(null);
    private static final Set<ClassId> SPECIAL_ANNOTATIONS;
    private final KotlinClassFinder kotlinClassFinder;
    private final MemoizedFunctionToNotNull<KotlinJvmBinaryClass, Storage<A, C>> storage;

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private enum PropertyRelatedElement {
        PROPERTY,
        BACKING_FIELD,
        DELEGATE_FIELD
    }

    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    private static final class Storage<A, C> {
        private final Map<MemberSignature, List<A>> memberAnnotations;
        private final Map<MemberSignature, C> propertyConstants;

        public Storage(Map<MemberSignature, ? extends List<? extends A>> map, Map<MemberSignature, ? extends C> map2) {
            this.memberAnnotations = map;
            this.propertyConstants = map2;
        }

        public final Map<MemberSignature, List<A>> getMemberAnnotations() {
            return this.memberAnnotations;
        }

        public final Map<MemberSignature, C> getPropertyConstants() {
            return this.propertyConstants;
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[AnnotatedCallableKind.values().length];

        static {
            $EnumSwitchMapping$0[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 1;
            $EnumSwitchMapping$0[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 2;
            $EnumSwitchMapping$0[AnnotatedCallableKind.PROPERTY.ordinal()] = 3;
        }
    }

    static {
        List<FqName> c = C13185o.m40520c(JvmAnnotationNames.METADATA_FQ_NAME, JvmAnnotationNames.JETBRAINS_NOT_NULL_ANNOTATION, JvmAnnotationNames.JETBRAINS_NULLABLE_ANNOTATION, new FqName("java.lang.annotation.Target"), new FqName("java.lang.annotation.Retention"), new FqName("java.lang.annotation.Documented"));
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) c, 10));
        for (FqName fqName : c) {
            arrayList.add(ClassId.topLevel(fqName));
        }
        SPECIAL_ANNOTATIONS = C13199w.m40609t(arrayList);
    }

    public AbstractBinaryClassAnnotationAndConstantLoader(StorageManager storageManager, KotlinClassFinder kotlinClassFinder2) {
        this.kotlinClassFinder = kotlinClassFinder2;
        this.storage = storageManager.createMemoizedFunction(new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    private final int computeJvmParameterIndexShift(ProtoContainer protoContainer, MessageLite messageLite) {
        if (messageLite instanceof Function) {
            if (ProtoTypeTableUtilKt.hasReceiver((Function) messageLite)) {
                return 1;
            }
        } else if (messageLite instanceof Property) {
            if (ProtoTypeTableUtilKt.hasReceiver((Property) messageLite)) {
                return 1;
            }
        } else if (!(messageLite instanceof Constructor)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported message: ");
            sb.append(messageLite.getClass());
            throw new UnsupportedOperationException(sb.toString());
        } else if (protoContainer != null) {
            Class classR = (Class) protoContainer;
            if (classR.getKind() == Kind.ENUM_CLASS) {
                return 2;
            }
            if (classR.isInner()) {
                return 1;
            }
        } else {
            throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.ProtoContainer.Class");
        }
        return 0;
    }

    private final List<A> findClassAndLoadMemberAnnotations(ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3) {
        KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, getSpecialCaseContainerClass(protoContainer, z, z2, bool, z3));
        if (findClassWithAnnotationsAndInitializers == null) {
            return C13185o.m40513a();
        }
        List<A> list = (List) ((Storage) this.storage.invoke(findClassWithAnnotationsAndInitializers)).getMemberAnnotations().get(memberSignature);
        if (list == null) {
            list = C13185o.m40513a();
        }
        return list;
    }

    static /* synthetic */ List findClassAndLoadMemberAnnotations$default(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, ProtoContainer protoContainer, MemberSignature memberSignature, boolean z, boolean z2, Boolean bool, boolean z3, int i, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.findClassAndLoadMemberAnnotations(protoContainer, memberSignature, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? false : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    private final KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers(ProtoContainer protoContainer, KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        if (kotlinJvmBinaryClass != null) {
            return kotlinJvmBinaryClass;
        }
        if (protoContainer instanceof Class) {
            return toBinaryClass((Class) protoContainer);
        }
        return null;
    }

    private final MemberSignature getCallableSignature(MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z) {
        MemberSignature memberSignature = null;
        if (messageLite instanceof Constructor) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = MemberSignature.Companion;
            Method jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((Constructor) messageLite, nameResolver, typeTable);
            if (jvmConstructorSignature == null) {
                return null;
            }
            memberSignature = companion.fromJvmMemberSignature(jvmConstructorSignature);
        } else if (messageLite instanceof Function) {
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion2 = MemberSignature.Companion;
            Method jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((Function) messageLite, nameResolver, typeTable);
            if (jvmMethodSignature == null) {
                return null;
            }
            memberSignature = companion2.fromJvmMemberSignature(jvmMethodSignature);
        } else if (messageLite instanceof Property) {
            ExtendableMessage extendableMessage = (ExtendableMessage) messageLite;
            GeneratedExtension<Property, JvmPropertySignature> generatedExtension = JvmProtoBuf.propertySignature;
            C12880j.m40222a((Object) generatedExtension, "propertySignature");
            JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(extendableMessage, generatedExtension);
            if (jvmPropertySignature != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[annotatedCallableKind.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            memberSignature = getPropertySignature((Property) messageLite, nameResolver, typeTable, true, true, z);
                        }
                    } else if (jvmPropertySignature.hasSetter()) {
                        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion3 = MemberSignature.Companion;
                        JvmMethodSignature setter = jvmPropertySignature.getSetter();
                        C12880j.m40222a((Object) setter, "signature.setter");
                        memberSignature = companion3.fromMethod(nameResolver, setter);
                    }
                } else if (jvmPropertySignature.hasGetter()) {
                    kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion4 = MemberSignature.Companion;
                    JvmMethodSignature getter = jvmPropertySignature.getGetter();
                    C12880j.m40222a((Object) getter, "signature.getter");
                    memberSignature = companion4.fromMethod(nameResolver, getter);
                }
            }
        }
        return memberSignature;
    }

    static /* synthetic */ MemberSignature getCallableSignature$default(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, MessageLite messageLite, NameResolver nameResolver, TypeTable typeTable, AnnotatedCallableKind annotatedCallableKind, boolean z, int i, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.getCallableSignature(messageLite, nameResolver, typeTable, annotatedCallableKind, (i & 16) != 0 ? false : z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
    }

    private final MemberSignature getPropertySignature(Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, boolean z3) {
        GeneratedExtension<Property, JvmPropertySignature> generatedExtension = JvmProtoBuf.propertySignature;
        C12880j.m40222a((Object) generatedExtension, "propertySignature");
        JvmPropertySignature jvmPropertySignature = (JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(property, generatedExtension);
        if (jvmPropertySignature != null) {
            if (z) {
                Field jvmFieldSignature = JvmProtoBufUtil.INSTANCE.getJvmFieldSignature(property, nameResolver, typeTable, z3);
                if (jvmFieldSignature != null) {
                    return MemberSignature.Companion.fromJvmMemberSignature(jvmFieldSignature);
                }
                return null;
            } else if (z2 && jvmPropertySignature.hasSyntheticMethod()) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = MemberSignature.Companion;
                JvmMethodSignature syntheticMethod = jvmPropertySignature.getSyntheticMethod();
                C12880j.m40222a((Object) syntheticMethod, "signature.syntheticMethod");
                return companion.fromMethod(nameResolver, syntheticMethod);
            }
        }
        return null;
    }

    static /* synthetic */ MemberSignature getPropertySignature$default(AbstractBinaryClassAnnotationAndConstantLoader abstractBinaryClassAnnotationAndConstantLoader, Property property, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if (obj == null) {
            return abstractBinaryClassAnnotationAndConstantLoader.getPropertySignature(property, nameResolver, typeTable, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPropertySignature");
    }

    private final KotlinJvmBinaryClass getSpecialCaseContainerClass(ProtoContainer protoContainer, boolean z, boolean z2, Boolean bool, boolean z3) {
        if (z) {
            if (bool != null) {
                if (protoContainer instanceof Class) {
                    Class classR = (Class) protoContainer;
                    if (classR.getKind() == Kind.INTERFACE) {
                        KotlinClassFinder kotlinClassFinder2 = this.kotlinClassFinder;
                        ClassId createNestedClassId = classR.getClassId().createNestedClassId(Name.identifier("DefaultImpls"));
                        C12880j.m40222a((Object) createNestedClassId, "container.classId.create…EFAULT_IMPLS_CLASS_NAME))");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder2, createNestedClassId);
                    }
                }
                if (bool.booleanValue() && (protoContainer instanceof Package)) {
                    SourceElement source = protoContainer.getSource();
                    if (!(source instanceof JvmPackagePartSource)) {
                        source = null;
                    }
                    JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) source;
                    JvmClassName facadeClassName = jvmPackagePartSource != null ? jvmPackagePartSource.getFacadeClassName() : null;
                    if (facadeClassName != null) {
                        KotlinClassFinder kotlinClassFinder3 = this.kotlinClassFinder;
                        String internalName = facadeClassName.getInternalName();
                        C12880j.m40222a((Object) internalName, "facadeClassName.internalName");
                        ClassId classId = ClassId.topLevel(new FqName(C12832w.m40115a(internalName, '/', '.', false, 4, (Object) null)));
                        C12880j.m40222a((Object) classId, "ClassId.topLevel(FqName(…lName.replace('/', '.')))");
                        return KotlinClassFinderKt.findKotlinClass(kotlinClassFinder3, classId);
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("isConst should not be null for property (container=");
                sb.append(protoContainer);
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        if (z2 && (protoContainer instanceof Class)) {
            Class classR2 = (Class) protoContainer;
            if (classR2.getKind() == Kind.COMPANION_OBJECT) {
                Class outerClass = classR2.getOuterClass();
                if (outerClass != null && (outerClass.getKind() == Kind.CLASS || outerClass.getKind() == Kind.ENUM_CLASS || (z3 && (outerClass.getKind() == Kind.INTERFACE || outerClass.getKind() == Kind.ANNOTATION_CLASS)))) {
                    return toBinaryClass(outerClass);
                }
            }
        }
        if (!(protoContainer instanceof Package) || !(protoContainer.getSource() instanceof JvmPackagePartSource)) {
            return null;
        }
        SourceElement source2 = protoContainer.getSource();
        if (source2 != null) {
            JvmPackagePartSource jvmPackagePartSource2 = (JvmPackagePartSource) source2;
            KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource2.getKnownJvmBinaryClass();
            if (knownJvmBinaryClass == null) {
                knownJvmBinaryClass = KotlinClassFinderKt.findKotlinClass(this.kotlinClassFinder, jvmPackagePartSource2.getClassId());
            }
            return knownJvmBinaryClass;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.load.kotlin.JvmPackagePartSource");
    }

    /* access modifiers changed from: private */
    public final AnnotationArgumentVisitor loadAnnotationIfNotSpecial(ClassId classId, SourceElement sourceElement, List<A> list) {
        if (SPECIAL_ANNOTATIONS.contains(classId)) {
            return null;
        }
        return loadAnnotation(classId, sourceElement, list);
    }

    /* access modifiers changed from: private */
    public final Storage<A, C> loadAnnotationsAndInitializers(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        kotlinJvmBinaryClass.visitMembers(new C13013x2cf49cf1(this, hashMap, hashMap2), getCachedFileContent(kotlinJvmBinaryClass));
        return new Storage<>(hashMap, hashMap2);
    }

    private final List<A> loadPropertyAnnotations(ProtoContainer protoContainer, Property property, PropertyRelatedElement propertyRelatedElement) {
        PropertyRelatedElement propertyRelatedElement2 = propertyRelatedElement;
        Boolean bool = Flags.IS_CONST.get(property.getFlags());
        C12880j.m40222a((Object) bool, "Flags.IS_CONST.get(proto.flags)");
        boolean booleanValue = bool.booleanValue();
        boolean isMovedFromInterfaceCompanion = JvmProtoBufUtil.isMovedFromInterfaceCompanion(property);
        if (propertyRelatedElement2 == PropertyRelatedElement.PROPERTY) {
            MemberSignature propertySignature$default = getPropertySignature$default(this, property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), false, true, false, 40, null);
            if (propertySignature$default == null) {
                return C13185o.m40513a();
            }
            return findClassAndLoadMemberAnnotations$default(this, protoContainer, propertySignature$default, true, false, Boolean.valueOf(booleanValue), isMovedFromInterfaceCompanion, 8, null);
        }
        MemberSignature propertySignature$default2 = getPropertySignature$default(this, property, protoContainer.getNameResolver(), protoContainer.getTypeTable(), true, false, false, 48, null);
        if (propertySignature$default2 == null) {
            return C13185o.m40513a();
        }
        boolean z = false;
        boolean a = C12833x.m40154a((CharSequence) propertySignature$default2.getSignature$descriptors_jvm(), (CharSequence) "$delegate", false, 2, (Object) null);
        if (propertyRelatedElement2 == PropertyRelatedElement.DELEGATE_FIELD) {
            z = true;
        }
        if (a != z) {
            return C13185o.m40513a();
        }
        return findClassAndLoadMemberAnnotations(protoContainer, propertySignature$default2, true, true, Boolean.valueOf(booleanValue), isMovedFromInterfaceCompanion);
    }

    private final KotlinJvmBinaryClass toBinaryClass(Class classR) {
        SourceElement source = classR.getSource();
        if (!(source instanceof KotlinJvmBinarySourceElement)) {
            source = null;
        }
        KotlinJvmBinarySourceElement kotlinJvmBinarySourceElement = (KotlinJvmBinarySourceElement) source;
        if (kotlinJvmBinarySourceElement != null) {
            return kotlinJvmBinarySourceElement.getBinaryClass();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public byte[] getCachedFileContent(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract AnnotationArgumentVisitor loadAnnotation(ClassId classId, SourceElement sourceElement, List<A> list);

    public List<A> loadCallableAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        if (annotatedCallableKind == AnnotatedCallableKind.PROPERTY) {
            return loadPropertyAnnotations(protoContainer, (Property) messageLite, PropertyRelatedElement.PROPERTY);
        }
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        if (callableSignature$default != null) {
            return findClassAndLoadMemberAnnotations$default(this, protoContainer, callableSignature$default, false, false, null, false, 60, null);
        }
        return C13185o.m40513a();
    }

    public List<A> loadClassAnnotations(Class classR) {
        KotlinJvmBinaryClass binaryClass = toBinaryClass(classR);
        if (binaryClass != null) {
            ArrayList arrayList = new ArrayList(1);
            binaryClass.loadClassAnnotations(new C13014xc0ff27f9(this, arrayList), getCachedFileContent(binaryClass));
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Class for loading annotations is not found: ");
        sb.append(classR.debugFqName());
        throw new IllegalStateException(sb.toString().toString());
    }

    /* access modifiers changed from: protected */
    public abstract C loadConstant(String str, Object obj);

    public List<A> loadEnumEntryAnnotations(ProtoContainer protoContainer, EnumEntry enumEntry) {
        kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature.Companion companion = MemberSignature.Companion;
        String string = protoContainer.getNameResolver().getString(enumEntry.getName());
        String asString = ((Class) protoContainer).getClassId().asString();
        C12880j.m40222a((Object) asString, "(container as ProtoConta…Class).classId.asString()");
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, companion.fromFieldNameAndDesc(string, ClassMapperLite.mapClass(asString)), false, false, null, false, 60, null);
    }

    public List<A> loadExtensionReceiverParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        if (callableSignature$default == null) {
            return C13185o.m40513a();
        }
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, 0), false, false, null, false, 60, null);
    }

    public List<A> loadPropertyBackingFieldAnnotations(ProtoContainer protoContainer, Property property) {
        return loadPropertyAnnotations(protoContainer, property, PropertyRelatedElement.BACKING_FIELD);
    }

    public C loadPropertyConstant(ProtoContainer protoContainer, Property property, KotlinType kotlinType) {
        KotlinJvmBinaryClass findClassWithAnnotationsAndInitializers = findClassWithAnnotationsAndInitializers(protoContainer, getSpecialCaseContainerClass(protoContainer, true, true, Flags.IS_CONST.get(property.getFlags()), JvmProtoBufUtil.isMovedFromInterfaceCompanion(property)));
        if (findClassWithAnnotationsAndInitializers != null) {
            Property property2 = property;
            MemberSignature callableSignature = getCallableSignature(property2, protoContainer.getNameResolver(), protoContainer.getTypeTable(), AnnotatedCallableKind.PROPERTY, findClassWithAnnotationsAndInitializers.getClassHeader().getMetadataVersion().isAtLeast(DeserializedDescriptorResolver.Companion.getKOTLIN_1_3_RC_METADATA_VERSION$descriptors_jvm()));
            if (callableSignature != null) {
                C c = ((Storage) this.storage.invoke(findClassWithAnnotationsAndInitializers)).getPropertyConstants().get(callableSignature);
                if (c != null) {
                    if (UnsignedTypes.INSTANCE.isUnsignedType(kotlinType)) {
                        c = transformToUnsignedConstant(c);
                    }
                    return c;
                }
            }
        }
        return null;
    }

    public List<A> loadPropertyDelegateFieldAnnotations(ProtoContainer protoContainer, Property property) {
        return loadPropertyAnnotations(protoContainer, property, PropertyRelatedElement.DELEGATE_FIELD);
    }

    /* access modifiers changed from: protected */
    public abstract A loadTypeAnnotation(Annotation annotation, NameResolver nameResolver);

    public List<A> loadTypeAnnotations(Type type, NameResolver nameResolver) {
        Object extension = type.getExtension(JvmProtoBuf.typeAnnotation);
        C12880j.m40222a(extension, "proto.getExtension(JvmProtoBuf.typeAnnotation)");
        Iterable<Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) iterable, 10));
        for (Annotation annotation : iterable) {
            C12880j.m40222a((Object) annotation, "it");
            arrayList.add(loadTypeAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    public List<A> loadTypeParameterAnnotations(TypeParameter typeParameter, NameResolver nameResolver) {
        Object extension = typeParameter.getExtension(JvmProtoBuf.typeParameterAnnotation);
        C12880j.m40222a(extension, "proto.getExtension(JvmPr….typeParameterAnnotation)");
        Iterable<Annotation> iterable = (Iterable) extension;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) iterable, 10));
        for (Annotation annotation : iterable) {
            C12880j.m40222a((Object) annotation, "it");
            arrayList.add(loadTypeAnnotation(annotation, nameResolver));
        }
        return arrayList;
    }

    public List<A> loadValueParameterAnnotations(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ValueParameter valueParameter) {
        MemberSignature callableSignature$default = getCallableSignature$default(this, messageLite, protoContainer.getNameResolver(), protoContainer.getTypeTable(), annotatedCallableKind, false, 16, null);
        if (callableSignature$default == null) {
            return C13185o.m40513a();
        }
        return findClassAndLoadMemberAnnotations$default(this, protoContainer, MemberSignature.Companion.fromMethodSignatureAndParameterIndex(callableSignature$default, i + computeJvmParameterIndexShift(protoContainer, messageLite)), false, false, null, false, 60, null);
    }

    /* access modifiers changed from: protected */
    public abstract C transformToUnsignedConstant(C c);
}
