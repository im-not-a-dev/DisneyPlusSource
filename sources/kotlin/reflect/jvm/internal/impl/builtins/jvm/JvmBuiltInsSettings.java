package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C13142s;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12894x;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope.Empty;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* compiled from: JvmBuiltInsSettings.kt */
public class JvmBuiltInsSettings implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    static final /* synthetic */ KProperty[] $$delegatedProperties;
    private static final Set<String> BLACK_LIST_CONSTRUCTOR_SIGNATURES;
    /* access modifiers changed from: private */
    public static final Set<String> BLACK_LIST_METHOD_SIGNATURES;
    public static final Companion Companion = new Companion(null);
    /* access modifiers changed from: private */
    public static final Set<String> DROP_LIST_METHOD_SIGNATURES;
    private static final Set<String> MUTABLE_METHOD_SIGNATURES;
    private static final Set<String> WHITE_LIST_CONSTRUCTOR_SIGNATURES;
    /* access modifiers changed from: private */
    public static final Set<String> WHITE_LIST_METHOD_SIGNATURES;
    private final NotNullLazyValue cloneableType$delegate;
    private final Lazy isAdditionalBuiltInsFeatureSupported$delegate;
    /* access modifiers changed from: private */
    public final JavaToKotlinClassMap j2kClassMap = JavaToKotlinClassMap.INSTANCE;
    private final CacheWithNotNullValues<FqName, ClassDescriptor> javaAnalogueClassesWithCustomSupertypeCache;
    private final KotlinType mockSerializableType;
    /* access modifiers changed from: private */
    public final ModuleDescriptor moduleDescriptor;
    private final NotNullLazyValue notConsideredDeprecation$delegate;
    private final Lazy ownerModuleDescriptor$delegate;

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final Set<String> buildPrimitiveStringConstructorsSet() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            List<JvmPrimitiveType> c = C13185o.m40520c(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.BYTE, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, JvmPrimitiveType.BYTE, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType wrapperFqName : c) {
                String asString = wrapperFqName.getWrapperFqName().shortName().asString();
                C12880j.m40222a((Object) asString, "it.wrapperFqName.shortName().asString()");
                String[] constructors = signatureBuildingComponents.constructors("Ljava/lang/String;");
                C13196t.m40545a((Collection) linkedHashSet, (Iterable) signatureBuildingComponents.inJavaLang(asString, (String[]) Arrays.copyOf(constructors, constructors.length)));
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: private */
        public final Set<String> buildPrimitiveValueMethodsSet() {
            SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
            List<JvmPrimitiveType> c = C13185o.m40520c(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (JvmPrimitiveType jvmPrimitiveType : c) {
                String asString = jvmPrimitiveType.getWrapperFqName().shortName().asString();
                C12880j.m40222a((Object) asString, "it.wrapperFqName.shortName().asString()");
                StringBuilder sb = new StringBuilder();
                sb.append(jvmPrimitiveType.getJavaKeywordName());
                sb.append("Value()");
                sb.append(jvmPrimitiveType.getDesc());
                C13196t.m40545a((Collection) linkedHashSet, (Iterable) signatureBuildingComponents.inJavaLang(asString, sb.toString()));
            }
            return linkedHashSet;
        }

        /* access modifiers changed from: private */
        public final boolean isArrayOrPrimitiveArray(FqNameUnsafe fqNameUnsafe) {
            return C12880j.m40224a((Object) fqNameUnsafe, (Object) KotlinBuiltIns.FQ_NAMES.array) || KotlinBuiltIns.isPrimitiveArray(fqNameUnsafe);
        }

        public final Set<String> getBLACK_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.BLACK_LIST_METHOD_SIGNATURES;
        }

        public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.DROP_LIST_METHOD_SIGNATURES;
        }

        public final Set<String> getWHITE_LIST_METHOD_SIGNATURES() {
            return JvmBuiltInsSettings.WHITE_LIST_METHOD_SIGNATURES;
        }

        public final boolean isSerializableInJava(FqNameUnsafe fqNameUnsafe) {
            if (isArrayOrPrimitiveArray(fqNameUnsafe)) {
                return true;
            }
            ClassId mapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe);
            if (mapKotlinToJava != null) {
                try {
                    return Serializable.class.isAssignableFrom(Class.forName(mapKotlinToJava.asSingleFqName().asString()));
                } catch (ClassNotFoundException unused) {
                }
            }
            return false;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: JvmBuiltInsSettings.kt */
    private enum JDKMemberStatus {
        BLACK_LIST,
        WHITE_LIST,
        NOT_CONSIDERED,
        DROP
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[JDKMemberStatus.values().length];

        static {
            $EnumSwitchMapping$0[JDKMemberStatus.BLACK_LIST.ordinal()] = 1;
            $EnumSwitchMapping$0[JDKMemberStatus.NOT_CONSIDERED.ordinal()] = 2;
            $EnumSwitchMapping$0[JDKMemberStatus.DROP.ordinal()] = 3;
            $EnumSwitchMapping$0[JDKMemberStatus.WHITE_LIST.ordinal()] = 4;
        }
    }

    static {
        Class<JvmBuiltInsSettings> cls = JvmBuiltInsSettings.class;
        $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "ownerModuleDescriptor", "getOwnerModuleDescriptor()Lorg/jetbrains/kotlin/descriptors/ModuleDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "isAdditionalBuiltInsFeatureSupported", "isAdditionalBuiltInsFeatureSupported()Z")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
        String str = "Collection";
        DROP_LIST_METHOD_SIGNATURES = C13190q0.m40536b(SignatureBuildingComponents.INSTANCE.inJavaUtil(str, "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        String str2 = "sort(Ljava/util/Comparator;)V";
        String str3 = "List";
        String str4 = "String";
        Set a = C13190q0.m40534a(C13190q0.m40534a(Companion.buildPrimitiveValueMethodsSet(), (Iterable) signatureBuildingComponents.inJavaUtil(str3, str2)), (Iterable) signatureBuildingComponents.inJavaLang(str4, "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;"));
        String str5 = "isNaN()Z";
        String str6 = "isInfinite()Z";
        String[] strArr = {str6, str5};
        String str7 = "Float";
        BLACK_LIST_METHOD_SIGNATURES = C13190q0.m40534a(C13190q0.m40534a(C13190q0.m40534a(a, (Iterable) signatureBuildingComponents.inJavaLang("Double", str6, str5)), (Iterable) signatureBuildingComponents.inJavaLang(str7, strArr)), (Iterable) signatureBuildingComponents.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V"));
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String str8 = "spliterator()Ljava/util/Spliterator;";
        String str9 = "Throwable";
        Set a2 = C13190q0.m40534a(C13190q0.m40534a(C13190q0.m40534a((Set) signatureBuildingComponents2.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), (Iterable) signatureBuildingComponents2.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), (Iterable) signatureBuildingComponents2.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", str8)), (Iterable) signatureBuildingComponents2.inJavaLang(str9, "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V"));
        String str10 = "removeIf(Ljava/util/function/Predicate;)Z";
        Set a3 = C13190q0.m40534a(a2, (Iterable) signatureBuildingComponents2.inJavaUtil(str, str8, "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", str10));
        String str11 = "replaceAll(Ljava/util/function/UnaryOperator;)V";
        String str12 = "Map";
        WHITE_LIST_METHOD_SIGNATURES = C13190q0.m40534a(C13190q0.m40534a(a3, (Iterable) signatureBuildingComponents2.inJavaUtil(str3, str11)), (Iterable) signatureBuildingComponents2.inJavaUtil(str12, "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        SignatureBuildingComponents signatureBuildingComponents3 = SignatureBuildingComponents.INSTANCE;
        MUTABLE_METHOD_SIGNATURES = C13190q0.m40534a(C13190q0.m40534a((Set) signatureBuildingComponents3.inJavaUtil(str, str10), (Iterable) signatureBuildingComponents3.inJavaUtil(str3, str11, str2)), (Iterable) signatureBuildingComponents3.inJavaUtil(str12, "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        SignatureBuildingComponents signatureBuildingComponents4 = SignatureBuildingComponents.INSTANCE;
        Set access$buildPrimitiveStringConstructorsSet = Companion.buildPrimitiveStringConstructorsSet();
        String[] constructors = signatureBuildingComponents4.constructors("D");
        Set a4 = C13190q0.m40534a(access$buildPrimitiveStringConstructorsSet, (Iterable) signatureBuildingComponents4.inJavaLang(str7, (String[]) Arrays.copyOf(constructors, constructors.length)));
        String[] constructors2 = signatureBuildingComponents4.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        BLACK_LIST_CONSTRUCTOR_SIGNATURES = C13190q0.m40534a(a4, (Iterable) signatureBuildingComponents4.inJavaLang(str4, (String[]) Arrays.copyOf(constructors2, constructors2.length)));
        SignatureBuildingComponents signatureBuildingComponents5 = SignatureBuildingComponents.INSTANCE;
        String[] constructors3 = signatureBuildingComponents5.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        WHITE_LIST_CONSTRUCTOR_SIGNATURES = signatureBuildingComponents5.inJavaLang(str9, (String[]) Arrays.copyOf(constructors3, constructors3.length));
    }

    public JvmBuiltInsSettings(ModuleDescriptor moduleDescriptor2, StorageManager storageManager, Function0<? extends ModuleDescriptor> function0, Function0<Boolean> function02) {
        this.moduleDescriptor = moduleDescriptor2;
        this.ownerModuleDescriptor$delegate = C12763i.m39921a(function0);
        this.isAdditionalBuiltInsFeatureSupported$delegate = C12763i.m39921a(function02);
        this.mockSerializableType = createMockJavaIoSerializableType(storageManager);
        this.cloneableType$delegate = storageManager.createLazyValue(new JvmBuiltInsSettings$cloneableType$2(this, storageManager));
        this.javaAnalogueClassesWithCustomSupertypeCache = storageManager.createCacheWithNotNullValues();
        this.notConsideredDeprecation$delegate = storageManager.createLazyValue(new JvmBuiltInsSettings$notConsideredDeprecation$2(this));
    }

    private final SimpleFunctionDescriptor createCloneForArray(DeserializedClassDescriptor deserializedClassDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        CopyBuilder newCopyBuilder = simpleFunctionDescriptor.newCopyBuilder();
        newCopyBuilder.setOwner(deserializedClassDescriptor);
        newCopyBuilder.setVisibility(Visibilities.PUBLIC);
        newCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
        newCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
        FunctionDescriptor build = newCopyBuilder.build();
        if (build != null) {
            return (SimpleFunctionDescriptor) build;
        }
        C12880j.m40220a();
        throw null;
    }

    private final KotlinType createMockJavaIoSerializableType(StorageManager storageManager) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new C12927xaea9d104(this, this.moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, C13183n.m40498a(new LazyWrappedType(storageManager, new C12928xf01ceaf8(this))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(Empty.INSTANCE, C13188p0.m40531a(), null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        C12880j.m40222a((Object) defaultType, "mockSerializableClass.defaultType");
        return defaultType;
    }

    private final Collection<SimpleFunctionDescriptor> getAdditionalFunctions(ClassDescriptor classDescriptor, Function1<? super MemberScope, ? extends Collection<? extends SimpleFunctionDescriptor>> function1) {
        boolean z;
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null) {
            return C13185o.m40513a();
        }
        Collection<ClassDescriptor> mapPlatformClass = this.j2kClassMap.mapPlatformClass(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), FallbackBuiltIns.Companion.getInstance());
        ClassDescriptor classDescriptor2 = (ClassDescriptor) C13199w.m40594i((Iterable) mapPlatformClass);
        if (classDescriptor2 == null) {
            return C13185o.m40513a();
        }
        kotlin.reflect.jvm.internal.impl.utils.SmartSet.Companion companion = SmartSet.Companion;
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) mapPlatformClass, 10));
        for (ClassDescriptor fqNameSafe : mapPlatformClass) {
            arrayList.add(DescriptorUtilsKt.getFqNameSafe(fqNameSafe));
        }
        SmartSet create = companion.create(arrayList);
        boolean isMutable = this.j2kClassMap.isMutable(classDescriptor);
        MemberScope unsubstitutedMemberScope = ((ClassDescriptor) this.javaAnalogueClassesWithCustomSupertypeCache.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(javaAnalogue), new C12929x1b86dd87(javaAnalogue, classDescriptor2))).getUnsubstitutedMemberScope();
        C12880j.m40222a((Object) unsubstitutedMemberScope, "fakeJavaClassDescriptor.unsubstitutedMemberScope");
        Iterable iterable = (Iterable) function1.invoke(unsubstitutedMemberScope);
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) next;
            boolean z2 = false;
            if (simpleFunctionDescriptor.getKind() == Kind.DECLARATION && simpleFunctionDescriptor.getVisibility().isPublicAPI() && !KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor)) {
                Collection overriddenDescriptors = simpleFunctionDescriptor.getOverriddenDescriptors();
                C12880j.m40222a((Object) overriddenDescriptors, "analogueMember.overriddenDescriptors");
                if (!(overriddenDescriptors instanceof Collection) || !overriddenDescriptors.isEmpty()) {
                    Iterator it = overriddenDescriptors.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        FunctionDescriptor functionDescriptor = (FunctionDescriptor) it.next();
                        C12880j.m40222a((Object) functionDescriptor, "it");
                        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
                        C12880j.m40222a((Object) containingDeclaration, "it.containingDeclaration");
                        if (create.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z && !isMutabilityViolation(simpleFunctionDescriptor, isMutable)) {
                    z2 = true;
                }
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    private final SimpleType getCloneableType() {
        return (SimpleType) StorageKt.getValue(this.cloneableType$delegate, (Object) this, $$delegatedProperties[2]);
    }

    /* access modifiers changed from: private */
    public final LazyJavaClassDescriptor getJavaAnalogue(ClassDescriptor classDescriptor) {
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (!fqNameUnsafe.isSafe()) {
            return null;
        }
        ClassId mapKotlinToJava = this.j2kClassMap.mapKotlinToJava(fqNameUnsafe);
        if (mapKotlinToJava != null) {
            FqName asSingleFqName = mapKotlinToJava.asSingleFqName();
            if (asSingleFqName != null) {
                C12880j.m40222a((Object) asSingleFqName, "j2kClassMap.mapKotlinToJ…leFqName() ?: return null");
                ClassDescriptor resolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getOwnerModuleDescriptor(), asSingleFqName, NoLookupLocation.FROM_BUILTINS);
                if (!(resolveClassByFqName instanceof LazyJavaClassDescriptor)) {
                    resolveClassByFqName = null;
                }
                return (LazyJavaClassDescriptor) resolveClassByFqName;
            }
        }
        return null;
    }

    private final JDKMemberStatus getJdkMethodStatus(FunctionDescriptor functionDescriptor) {
        DeclarationDescriptor containingDeclaration = functionDescriptor.getContainingDeclaration();
        if (containingDeclaration != null) {
            ClassDescriptor classDescriptor = (ClassDescriptor) containingDeclaration;
            String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
            C12894x xVar = new C12894x();
            xVar.f29534c = null;
            Object dfs = DFS.dfs(C13183n.m40498a(classDescriptor), new JvmBuiltInsSettings$getJdkMethodStatus$1(this), new JvmBuiltInsSettings$getJdkMethodStatus$2(computeJvmDescriptor$default, xVar));
            C12880j.m40222a(dfs, "DFS.dfs<ClassDescriptor,…CONSIDERED\n            })");
            return (JDKMemberStatus) dfs;
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final Annotations getNotConsideredDeprecation() {
        return (Annotations) StorageKt.getValue(this.notConsideredDeprecation$delegate, (Object) this, $$delegatedProperties[3]);
    }

    /* access modifiers changed from: private */
    public final ModuleDescriptor getOwnerModuleDescriptor() {
        Lazy lazy = this.ownerModuleDescriptor$delegate;
        KProperty kProperty = $$delegatedProperties[0];
        return (ModuleDescriptor) lazy.getValue();
    }

    private final boolean isAdditionalBuiltInsFeatureSupported() {
        Lazy lazy = this.isAdditionalBuiltInsFeatureSupported$delegate;
        KProperty kProperty = $$delegatedProperties[1];
        return ((Boolean) lazy.getValue()).booleanValue();
    }

    private final boolean isMutabilityViolation(SimpleFunctionDescriptor simpleFunctionDescriptor, boolean z) {
        DeclarationDescriptor containingDeclaration = simpleFunctionDescriptor.getContainingDeclaration();
        if (containingDeclaration != null) {
            if (z ^ MUTABLE_METHOD_SIGNATURES.contains(SignatureBuildingComponents.INSTANCE.signature((ClassDescriptor) containingDeclaration, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null)))) {
                return true;
            }
            Boolean ifAny = DFS.ifAny(C13183n.m40498a(simpleFunctionDescriptor), JvmBuiltInsSettings$isMutabilityViolation$1.INSTANCE, new JvmBuiltInsSettings$isMutabilityViolation$2(this));
            C12880j.m40222a((Object) ifAny, "DFS.ifAny<CallableMember…lassDescriptor)\n        }");
            return ifAny.booleanValue();
        }
        throw new C13142s("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final boolean isTrivialCopyConstructorFor(ConstructorDescriptor constructorDescriptor, ClassDescriptor classDescriptor) {
        if (constructorDescriptor.getValueParameters().size() == 1) {
            List valueParameters = constructorDescriptor.getValueParameters();
            C12880j.m40222a((Object) valueParameters, "valueParameters");
            Object k = C13199w.m40599k(valueParameters);
            C12880j.m40222a(k, "valueParameters.single()");
            ClassifierDescriptor declarationDescriptor = ((ValueParameterDescriptor) k).getType().getConstructor().getDeclarationDescriptor();
            if (C12880j.m40224a((Object) declarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor) : null, (Object) DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0049 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor> getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r18.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            if (r2 != r3) goto L_0x0132
            boolean r2 = r17.isAdditionalBuiltInsFeatureSupported()
            if (r2 != 0) goto L_0x0014
            goto L_0x0132
        L_0x0014:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r2 = r17.getJavaAnalogue(r18)
            if (r2 == 0) goto L_0x012d
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap r3 = r0.j2kClassMap
            kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r2)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion r5 = kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns.Companion
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r5 = r5.getInstance()
            r6 = 0
            r7 = 4
            r8 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.mapJavaToKotlin$default(r3, r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x0128
            kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution(r3, r2)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r4 = r4.buildSubstitutor()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getConstructors$1 r5 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getConstructors$1
            r5.<init>(r4)
            java.util.List r6 = r2.getConstructors()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0049:
            boolean r8 = r6.hasNext()
            r9 = 0
            r10 = 3
            java.lang.String r11 = "javaConstructor"
            r12 = 0
            if (r8 == 0) goto L_0x00c4
            java.lang.Object r8 = r6.next()
            r13 = r8
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r13 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r13
            kotlin.jvm.internal.C12880j.m40222a(r13, r11)
            kotlin.reflect.jvm.internal.impl.descriptors.Visibility r11 = r13.getVisibility()
            boolean r11 = r11.isPublicAPI()
            if (r11 == 0) goto L_0x00bc
            java.util.Collection r11 = r3.getConstructors()
            java.lang.String r15 = "defaultKotlinVersion.constructors"
            kotlin.jvm.internal.C12880j.m40222a(r11, r15)
            boolean r15 = r11 instanceof java.util.Collection
            if (r15 == 0) goto L_0x007d
            boolean r15 = r11.isEmpty()
            if (r15 == 0) goto L_0x007d
        L_0x007b:
            r14 = 1
            goto L_0x0099
        L_0x007d:
            java.util.Iterator r11 = r11.iterator()
        L_0x0081:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x007b
            java.lang.Object r15 = r11.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r15 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r15
            java.lang.String r14 = "it"
            kotlin.jvm.internal.C12880j.m40222a(r15, r14)
            boolean r14 = r5.invoke(r15, r13)
            if (r14 == 0) goto L_0x0081
            r14 = 0
        L_0x0099:
            if (r14 == 0) goto L_0x00bc
            boolean r11 = r0.isTrivialCopyConstructorFor(r13, r1)
            if (r11 != 0) goto L_0x00bc
            boolean r11 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDeprecated(r13)
            if (r11 != 0) goto L_0x00bc
            java.util.Set<java.lang.String> r11 = BLACK_LIST_CONSTRUCTOR_SIGNATURES
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents r14 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE
            java.lang.String r9 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r13, r12, r12, r10, r9)
            java.lang.String r9 = r14.signature(r2, r9)
            boolean r9 = r11.contains(r9)
            if (r9 != 0) goto L_0x00bc
            r16 = 1
            goto L_0x00be
        L_0x00bc:
            r16 = 0
        L_0x00be:
            if (r16 == 0) goto L_0x0049
            r7.add(r8)
            goto L_0x0049
        L_0x00c4:
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.p590y.C13187p.m40525a(r7, r5)
            r3.<init>(r5)
            java.util.Iterator r5 = r7.iterator()
        L_0x00d3:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0127
            java.lang.Object r6 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r6
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r7 = r6.newCopyBuilder()
            r7.setOwner(r1)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r8 = r18.getDefaultType()
            r7.setReturnType(r8)
            r7.setPreserveSourceElement()
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitution r8 = r4.getSubstitution()
            r7.setSubstitution(r8)
            java.util.Set<java.lang.String> r8 = WHITE_LIST_CONSTRUCTOR_SIGNATURES
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents r13 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE
            kotlin.jvm.internal.C12880j.m40222a(r6, r11)
            java.lang.String r6 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r6, r12, r12, r10, r9)
            java.lang.String r6 = r13.signature(r2, r6)
            boolean r6 = r8.contains(r6)
            if (r6 != 0) goto L_0x0113
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r6 = r17.getNotConsideredDeprecation()
            r7.setAdditionalAnnotations(r6)
        L_0x0113:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6 = r7.build()
            if (r6 == 0) goto L_0x011f
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r6 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r6
            r3.add(r6)
            goto L_0x00d3
        L_0x011f:
            kotlin.s r1 = new kotlin.s
            java.lang.String r2 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor"
            r1.<init>(r2)
            throw r1
        L_0x0127:
            return r3
        L_0x0128:
            java.util.List r1 = kotlin.p590y.C13185o.m40513a()
            return r1
        L_0x012d:
            java.util.List r1 = kotlin.p590y.C13185o.m40513a()
            return r1
        L_0x0132:
            java.util.List r1 = kotlin.p590y.C13185o.m40513a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getConstructors(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Collection");
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor> getFunctions(kotlin.reflect.jvm.internal.impl.name.Name r7, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r8) {
        /*
            r6 = this;
            kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope$Companion r0 = kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion
            kotlin.reflect.jvm.internal.impl.name.Name r0 = r0.getCLONE_NAME()
            boolean r0 = kotlin.jvm.internal.C12880j.m40224a(r7, r0)
            r1 = 1
            if (r0 == 0) goto L_0x0088
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
            if (r0 == 0) goto L_0x0088
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArrayOrPrimitiveArray(r8)
            if (r0 == 0) goto L_0x0088
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r8 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r8
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r0 = r8.getClassProto()
            java.util.List r0 = r0.getFunctionList()
            java.lang.String r2 = "classDescriptor.classProto.functionList"
            kotlin.jvm.internal.C12880j.m40222a(r0, r2)
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 0
            if (r2 == 0) goto L_0x0032
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0032
            goto L_0x0064
        L_0x0032:
            java.util.Iterator r0 = r0.iterator()
        L_0x0036:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0064
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext r4 = r8.getC()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r4 = r4.getNameResolver()
            java.lang.String r5 = "functionProto"
            kotlin.jvm.internal.C12880j.m40222a(r2, r5)
            int r2 = r2.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r2 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt.getName(r4, r2)
            kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope$Companion r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope.Companion
            kotlin.reflect.jvm.internal.impl.name.Name r4 = r4.getCLONE_NAME()
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r2, r4)
            if (r2 == 0) goto L_0x0036
            r3 = 1
        L_0x0064:
            if (r3 == 0) goto L_0x006b
            java.util.List r7 = kotlin.p590y.C13185o.m40513a()
            return r7
        L_0x006b:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r6.getCloneableType()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.getMemberScope()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BUILTINS
            java.util.Collection r7 = r0.getContributedFunctions(r7, r1)
            java.lang.Object r7 = kotlin.p590y.C13199w.m40602m(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r7
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r7 = r6.createCloneForArray(r8, r7)
            java.util.List r7 = kotlin.p590y.C13183n.m40498a(r7)
            return r7
        L_0x0088:
            boolean r0 = r6.isAdditionalBuiltInsFeatureSupported()
            if (r0 != 0) goto L_0x0093
            java.util.List r7 = kotlin.p590y.C13185o.m40513a()
            return r7
        L_0x0093:
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getFunctions$2 r0 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$getFunctions$2
            r0.<init>(r7)
            java.util.Collection r7 = r6.getAdditionalFunctions(r8, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00a5:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L_0x0132
            java.lang.Object r2 = r7.next()
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r2
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r2.getContainingDeclaration()
            if (r3 == 0) goto L_0x012a
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution r3 = kotlin.reflect.jvm.internal.impl.builtins.jvm.MappingUtilKt.createMappedTypeParametersSubstitution(r3, r8)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r3 = r3.buildSubstitutor()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3 = r2.substitute(r3)
            if (r3 == 0) goto L_0x0122
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r3 = r3.newCopyBuilder()
            r3.setOwner(r8)
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r4 = r8.getThisAsReceiverParameter()
            r3.setDispatchReceiverParameter(r4)
            r3.setPreserveSourceElement()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$JDKMemberStatus r2 = r6.getJdkMethodStatus(r2)
            int[] r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r4[r2]
            r4 = 0
            if (r2 == r1) goto L_0x00ff
            r5 = 2
            if (r2 == r5) goto L_0x00f1
            r5 = 3
            if (r2 == r5) goto L_0x0118
            r5 = 4
            goto L_0x010f
        L_0x00f1:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r6.getNotConsideredDeprecation()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r3.setAdditionalAnnotations(r2)
            java.lang.String r5 = "setAdditionalAnnotations(notConsideredDeprecation)"
            kotlin.jvm.internal.C12880j.m40222a(r2, r5)
            goto L_0x010f
        L_0x00ff:
            boolean r2 = kotlin.reflect.jvm.internal.impl.descriptors.ModalityKt.isFinalClass(r8)
            if (r2 == 0) goto L_0x0106
            goto L_0x0118
        L_0x0106:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor$CopyBuilder r2 = r3.setHiddenForResolutionEverywhereBesideSupercalls()
            java.lang.String r5 = "setHiddenForResolutionEverywhereBesideSupercalls()"
            kotlin.jvm.internal.C12880j.m40222a(r2, r5)
        L_0x010f:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r2 = r3.build()
            if (r2 == 0) goto L_0x011e
            r4 = r2
            kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor) r4
        L_0x0118:
            if (r4 == 0) goto L_0x00a5
            r0.add(r4)
            goto L_0x00a5
        L_0x011e:
            kotlin.jvm.internal.C12880j.m40220a()
            throw r4
        L_0x0122:
            kotlin.s r7 = new kotlin.s
            java.lang.String r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor"
            r7.<init>(r8)
            throw r7
        L_0x012a:
            kotlin.s r7 = new kotlin.s
            java.lang.String r8 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r7.<init>(r8)
            throw r7
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getFunctions(kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Collection");
    }

    public Collection<KotlinType> getSupertypes(ClassDescriptor classDescriptor) {
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (Companion.isArrayOrPrimitiveArray(fqNameUnsafe)) {
            SimpleType cloneableType = getCloneableType();
            C12880j.m40222a((Object) cloneableType, "cloneableType");
            return C13185o.m40520c(cloneableType, this.mockSerializableType);
        } else if (Companion.isSerializableInJava(fqNameUnsafe)) {
            return C13183n.m40498a(this.mockSerializableType);
        } else {
            return C13185o.m40513a();
        }
    }

    public boolean isFunctionAvailable(ClassDescriptor classDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor) {
        LazyJavaClassDescriptor javaAnalogue = getJavaAnalogue(classDescriptor);
        if (javaAnalogue == null || !simpleFunctionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        boolean z = false;
        if (!isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String computeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = javaAnalogue.getUnsubstitutedMemberScope();
        Name name = simpleFunctionDescriptor.getName();
        C12880j.m40222a((Object) name, "functionDescriptor.name");
        Collection contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if (!(contributedFunctions instanceof Collection) || !contributedFunctions.isEmpty()) {
            Iterator it = contributedFunctions.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C12880j.m40224a((Object) MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it.next(), false, false, 3, null), (Object) computeJvmDescriptor$default)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r2 != null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2) {
        /*
            r1 = this;
            boolean r0 = r1.isAdditionalBuiltInsFeatureSupported()
            if (r0 != 0) goto L_0x000b
            java.util.Set r2 = kotlin.p590y.C13188p0.m40531a()
            return r2
        L_0x000b:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor r2 = r1.getJavaAnalogue(r2)
            if (r2 == 0) goto L_0x001e
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope r2 = r2.getUnsubstitutedMemberScope()
            if (r2 == 0) goto L_0x001e
            java.util.Set r2 = r2.getFunctionNames()
            if (r2 == 0) goto L_0x001e
            goto L_0x0022
        L_0x001e:
            java.util.Set r2 = kotlin.p590y.C13188p0.m40531a()
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings.getFunctionsNames(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):java.util.Set");
    }
}
