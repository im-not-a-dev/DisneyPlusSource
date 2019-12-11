package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;
import kotlin.C13142s;
import kotlin.Metadata;
import kotlin.jvm.internal.C12865c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12890t;
import kotlin.jvm.internal.C12891u;
import kotlin.jvm.internal.C12895y;
import kotlin.p581d0.C12731a;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.ReflectProperties.LazySoftVal;
import kotlin.reflect.jvm.internal.ReflectProperties.LazyVal;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.GeneratedExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00020\u0005:\u0001`B\u0013\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\bJ\u0013\u0010O\u001a\u00020%2\b\u0010P\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\u0012\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020XH\u0016J\u0016\u0010Y\u001a\b\u0012\u0004\u0012\u00020V0\u00132\u0006\u0010S\u001a\u00020TH\u0016J\b\u0010Z\u001a\u00020XH\u0016J\u0012\u0010[\u001a\u00020%2\b\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010]\u001a\u00020^H\u0002J\b\u0010_\u001a\u00020<H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R3\u0010\u001a\u001a$\u0012 \u0012\u001e \u001d*\u000e\u0018\u00010\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001cR\b\u0012\u0004\u0012\u00028\u00000\u00000\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010&R\u0014\u0010'\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0014\u0010)\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010&R\u0014\u0010*\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010&R\u0014\u0010+\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b+\u0010&R\u0014\u0010,\u001a\u00020%8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0016R\u001e\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00138VX\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u0016R\u0016\u00108\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0016\u0010;\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\"\u0010?\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00040\n8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\rR\u0016\u0010A\u001a\u0004\u0018\u00010<8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u0010>R\u0014\u0010C\u001a\u0002008@X\u0004¢\u0006\u0006\u001a\u0004\bD\u00102R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010\rR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\n8VX\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\rR\u0016\u0010K\u001a\u0004\u0018\u00010L8VX\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006a"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl;", "T", "", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "classId", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "constructorDescriptors", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "getConstructorDescriptors", "()Ljava/util/Collection;", "constructors", "Lkotlin/reflect/KFunction;", "getConstructors", "data", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "kotlin.jvm.PlatformType", "getData", "()Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "isAbstract", "", "()Z", "isCompanion", "isData", "isFinal", "isInner", "isOpen", "isSealed", "getJClass", "()Ljava/lang/Class;", "memberScope", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/MemberScope;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "members", "Lkotlin/reflect/KCallable;", "getMembers", "nestedClasses", "getNestedClasses", "objectInstance", "getObjectInstance", "()Ljava/lang/Object;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "sealedSubclasses", "getSealedSubclasses", "simpleName", "getSimpleName", "staticScope", "getStaticScope$kotlin_reflection", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "visibility", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "equals", "other", "getFunctions", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "name", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "getLocalProperty", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "index", "", "getProperties", "hashCode", "isInstance", "value", "reportUnresolvedClass", "", "toString", "Data", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
public final class KClassImpl<T> extends KDeclarationContainerImpl implements KClass<T>, KClassifierImpl {
    private final LazyVal<Data> data;
    private final Class<T> jClass;

    @Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010N\u001a\u00020<2\n\u0010O\u001a\u0006\u0012\u0002\b\u00030PH\u0002R%\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR%\u0010\u000b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\bR%\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u000f\u0010\bR!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00180\u00058FX\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\bR%\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\bR%\u0010 \u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058FX\u0002¢\u0006\f\n\u0004\b\"\u0010\n\u001a\u0004\b!\u0010\bR%\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\bR\u001b\u0010&\u001a\u00020'8FX\u0002¢\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)R%\u0010+\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b-\u0010\n\u001a\u0004\b,\u0010\bR%\u0010.\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u00058BX\u0002¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b/\u0010\bR%\u00101\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u0003020\u00058FX\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\bR#\u00105\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b6\u0010\u001a\u001a\u0004\b7\u00108R\u001d\u0010;\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\b?\u0010\n\u001a\u0004\b=\u0010>R)\u0010@\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u0000020\u00128FX\u0002¢\u0006\f\n\u0004\bB\u0010\n\u001a\u0004\bA\u0010\u0015R\u001d\u0010C\u001a\u0004\u0018\u00010<8FX\u0002¢\u0006\f\n\u0004\bE\u0010\n\u001a\u0004\bD\u0010>R!\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00128FX\u0002¢\u0006\f\n\u0004\bI\u0010\n\u001a\u0004\bH\u0010\u0015R!\u0010J\u001a\b\u0012\u0004\u0012\u00020K0\u00128FX\u0002¢\u0006\f\n\u0004\bM\u0010\n\u001a\u0004\bL\u0010\u0015¨\u0006Q"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/KClassImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$Data;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "(Lkotlin/reflect/jvm/internal/KClassImpl;)V", "allMembers", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getAllMembers", "()Ljava/util/Collection;", "allMembers$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "allNonStaticMembers", "getAllNonStaticMembers", "allNonStaticMembers$delegate", "allStaticMembers", "getAllStaticMembers", "allStaticMembers$delegate", "annotations", "", "", "getAnnotations", "()Ljava/util/List;", "annotations$delegate", "constructors", "Lkotlin/reflect/KFunction;", "constructors$annotations", "()V", "getConstructors", "constructors$delegate", "declaredMembers", "getDeclaredMembers", "declaredMembers$delegate", "declaredNonStaticMembers", "getDeclaredNonStaticMembers", "declaredNonStaticMembers$delegate", "declaredStaticMembers", "getDeclaredStaticMembers", "declaredStaticMembers$delegate", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor$delegate", "inheritedNonStaticMembers", "getInheritedNonStaticMembers", "inheritedNonStaticMembers$delegate", "inheritedStaticMembers", "getInheritedStaticMembers", "inheritedStaticMembers$delegate", "nestedClasses", "Lkotlin/reflect/KClass;", "getNestedClasses", "nestedClasses$delegate", "objectInstance", "objectInstance$annotations", "getObjectInstance", "()Ljava/lang/Object;", "objectInstance$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazyVal;", "qualifiedName", "", "getQualifiedName", "()Ljava/lang/String;", "qualifiedName$delegate", "sealedSubclasses", "getSealedSubclasses", "sealedSubclasses$delegate", "simpleName", "getSimpleName", "simpleName$delegate", "supertypes", "Lkotlin/reflect/KType;", "getSupertypes", "supertypes$delegate", "typeParameters", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters$delegate", "calculateLocalClassName", "jClass", "Ljava/lang/Class;", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
    /* compiled from: KClassImpl.kt */
    public final class Data extends kotlin.reflect.jvm.internal.KDeclarationContainerImpl.Data {
        static final /* synthetic */ KProperty[] $$delegatedProperties;
        private final LazySoftVal allMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$allMembers$2(this));
        private final LazySoftVal allNonStaticMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$allNonStaticMembers$2(this));
        private final LazySoftVal allStaticMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$allStaticMembers$2(this));
        private final LazySoftVal annotations$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$annotations$2(this));
        private final LazySoftVal constructors$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$constructors$2(this));
        private final LazySoftVal declaredMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$declaredMembers$2(this));
        private final LazySoftVal declaredNonStaticMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$declaredNonStaticMembers$2(this));
        private final LazySoftVal declaredStaticMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$declaredStaticMembers$2(this));
        private final LazySoftVal descriptor$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$descriptor$2(this));
        private final LazySoftVal inheritedNonStaticMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$inheritedNonStaticMembers$2(this));
        private final LazySoftVal inheritedStaticMembers$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$inheritedStaticMembers$2(this));
        private final LazySoftVal nestedClasses$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$nestedClasses$2(this));
        private final LazyVal objectInstance$delegate = ReflectProperties.lazy(new KClassImpl$Data$objectInstance$2(this));
        private final LazySoftVal qualifiedName$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$qualifiedName$2(this));
        private final LazySoftVal sealedSubclasses$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$sealedSubclasses$2(this));
        private final LazySoftVal simpleName$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$simpleName$2(this));
        private final LazySoftVal supertypes$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$supertypes$2(this));
        private final LazySoftVal typeParameters$delegate = ReflectProperties.lazySoft(new KClassImpl$Data$typeParameters$2(this));

        static {
            Class<Data> cls = Data.class;
            $$delegatedProperties = new KProperty[]{C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "annotations", "getAnnotations()Ljava/util/List;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "simpleName", "getSimpleName()Ljava/lang/String;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "qualifiedName", "getQualifiedName()Ljava/lang/String;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "constructors", "getConstructors()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "nestedClasses", "getNestedClasses()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "objectInstance", "getObjectInstance()Ljava/lang/Object;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "typeParameters", "getTypeParameters()Ljava/util/List;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "supertypes", "getSupertypes()Ljava/util/List;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;")), C12895y.m40235a((C12890t) new C12891u(C12895y.m40230a((Class) cls), "allMembers", "getAllMembers()Ljava/util/Collection;"))};
        }

        public Data() {
            super();
        }

        /* access modifiers changed from: private */
        public final String calculateLocalClassName(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            String str = "$";
            String str2 = "name";
            if (enclosingMethod != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) simpleName, str2);
                StringBuilder sb = new StringBuilder();
                sb.append(enclosingMethod.getName());
                sb.append(str);
                return C12833x.m40139a(simpleName, sb.toString(), (String) null, 2, (Object) null);
            }
            Constructor enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                Intrinsics.checkReturnedValueIsNotNull((Object) simpleName, str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(enclosingConstructor.getName());
                sb2.append(str);
                return C12833x.m40139a(simpleName, sb2.toString(), (String) null, 2, (Object) null);
            }
            Intrinsics.checkReturnedValueIsNotNull((Object) simpleName, str2);
            return C12833x.m40136a(simpleName, '$', (String) null, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> getDeclaredStaticMembers() {
            return (Collection) this.declaredStaticMembers$delegate.getValue(this, $$delegatedProperties[11]);
        }

        /* access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> getInheritedNonStaticMembers() {
            return (Collection) this.inheritedNonStaticMembers$delegate.getValue(this, $$delegatedProperties[12]);
        }

        /* access modifiers changed from: private */
        public final Collection<KCallableImpl<?>> getInheritedStaticMembers() {
            return (Collection) this.inheritedStaticMembers$delegate.getValue(this, $$delegatedProperties[13]);
        }

        public final Collection<KCallableImpl<?>> getAllMembers() {
            return (Collection) this.allMembers$delegate.getValue(this, $$delegatedProperties[17]);
        }

        public final Collection<KCallableImpl<?>> getAllNonStaticMembers() {
            return (Collection) this.allNonStaticMembers$delegate.getValue(this, $$delegatedProperties[14]);
        }

        public final Collection<KCallableImpl<?>> getAllStaticMembers() {
            return (Collection) this.allStaticMembers$delegate.getValue(this, $$delegatedProperties[15]);
        }

        public final List<Annotation> getAnnotations() {
            return (List) this.annotations$delegate.getValue(this, $$delegatedProperties[1]);
        }

        public final Collection<KFunction<T>> getConstructors() {
            return (Collection) this.constructors$delegate.getValue(this, $$delegatedProperties[4]);
        }

        public final Collection<KCallableImpl<?>> getDeclaredMembers() {
            return (Collection) this.declaredMembers$delegate.getValue(this, $$delegatedProperties[16]);
        }

        public final Collection<KCallableImpl<?>> getDeclaredNonStaticMembers() {
            return (Collection) this.declaredNonStaticMembers$delegate.getValue(this, $$delegatedProperties[10]);
        }

        public final ClassDescriptor getDescriptor() {
            return (ClassDescriptor) this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        }

        public final Collection<KClass<?>> getNestedClasses() {
            return (Collection) this.nestedClasses$delegate.getValue(this, $$delegatedProperties[5]);
        }

        public final T getObjectInstance() {
            return this.objectInstance$delegate.getValue(this, $$delegatedProperties[6]);
        }

        public final String getQualifiedName() {
            return (String) this.qualifiedName$delegate.getValue(this, $$delegatedProperties[3]);
        }

        public final List<KClass<? extends T>> getSealedSubclasses() {
            return (List) this.sealedSubclasses$delegate.getValue(this, $$delegatedProperties[9]);
        }

        public final String getSimpleName() {
            return (String) this.simpleName$delegate.getValue(this, $$delegatedProperties[2]);
        }

        public final List<KType> getSupertypes() {
            return (List) this.supertypes$delegate.getValue(this, $$delegatedProperties[8]);
        }

        public final List<KTypeParameter> getTypeParameters() {
            return (List) this.typeParameters$delegate.getValue(this, $$delegatedProperties[7]);
        }
    }

    @Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[Kind.values().length];

        static {
            $EnumSwitchMapping$0[Kind.FILE_FACADE.ordinal()] = 1;
            $EnumSwitchMapping$0[Kind.MULTIFILE_CLASS.ordinal()] = 2;
            $EnumSwitchMapping$0[Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            $EnumSwitchMapping$0[Kind.SYNTHETIC_CLASS.ordinal()] = 4;
            $EnumSwitchMapping$0[Kind.UNKNOWN.ordinal()] = 5;
            $EnumSwitchMapping$0[Kind.CLASS.ordinal()] = 6;
        }
    }

    public KClassImpl(Class<T> cls) {
        this.jClass = cls;
        LazyVal<Data> lazy = ReflectProperties.lazy(new KClassImpl$data$1(this));
        Intrinsics.checkReturnedValueIsNotNull((Object) lazy, "ReflectProperties.lazy { Data() }");
        this.data = lazy;
    }

    /* access modifiers changed from: private */
    public final ClassId getClassId() {
        return RuntimeTypeMapper.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Void reportUnresolvedClass() {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.components.ReflectKotlinClass$Factory r0 = kotlin.reflect.jvm.internal.components.ReflectKotlinClass.Factory
            java.lang.Class r1 = r4.getJClass()
            kotlin.reflect.jvm.internal.components.ReflectKotlinClass r0 = r0.create(r1)
            if (r0 == 0) goto L_0x0017
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.getClassHeader()
            if (r0 == 0) goto L_0x0017
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r0 = r0.getKind()
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x0093
            int[] r1 = kotlin.reflect.jvm.internal.KClassImpl.WhenMappings.$EnumSwitchMapping$0
            int r2 = r0.ordinal()
            r1 = r1[r2]
            switch(r1) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x0053;
                case 5: goto L_0x002b;
                case 6: goto L_0x0093;
                default: goto L_0x0025;
            }
        L_0x0025:
            kotlin.l r0 = new kotlin.l
            r0.<init>()
            throw r0
        L_0x002b:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown class: "
            r2.append(r3)
            java.lang.Class r3 = r4.getJClass()
            r2.append(r3)
            java.lang.String r3 = " (kind = "
            r2.append(r3)
            r2.append(r0)
            r0 = 41
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0053:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This class is an internal synthetic class generated by the Kotlin compiler, such as an anonymous class for a lambda, a SAM wrapper, a callable reference, etc. It's not a Kotlin class or interface, so the reflection "
            r1.append(r2)
            java.lang.String r2 = "library has no idea what declarations does it have. Please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.getJClass()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0073:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Packages and file facades are not yet supported in Kotlin reflection. "
            r1.append(r2)
            java.lang.String r2 = "Meanwhile please use Java reflection to inspect this class: "
            r1.append(r2)
            java.lang.Class r2 = r4.getJClass()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0093:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r0 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unresolved class: "
            r1.append(r2)
            java.lang.Class r2 = r4.getJClass()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KClassImpl.reportUnresolvedClass():java.lang.Void");
    }

    public boolean equals(Object obj) {
        return (obj instanceof KClassImpl) && Intrinsics.areEqual((Object) C12731a.m39869b(this), (Object) C12731a.m39869b((KClass) obj));
    }

    public List<Annotation> getAnnotations() {
        return ((Data) this.data.invoke()).getAnnotations();
    }

    public Collection<ConstructorDescriptor> getConstructorDescriptors() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == ClassKind.INTERFACE || descriptor.getKind() == ClassKind.OBJECT) {
            return C13185o.m40513a();
        }
        Collection<ConstructorDescriptor> constructors = descriptor.getConstructors();
        Intrinsics.checkReturnedValueIsNotNull((Object) constructors, "descriptor.constructors");
        return constructors;
    }

    public Collection<KFunction<T>> getConstructors() {
        return ((Data) this.data.invoke()).getConstructors();
    }

    public final LazyVal<Data> getData() {
        return this.data;
    }

    public Collection<FunctionDescriptor> getFunctions(Name name) {
        return C13199w.m40583d(getMemberScope$kotlin_reflection().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION), (Iterable) getStaticScope$kotlin_reflection().getContributedFunctions(name, NoLookupLocation.FROM_REFLECTION));
    }

    public Class<T> getJClass() {
        return this.jClass;
    }

    public PropertyDescriptor getLocalProperty(int i) {
        if (Intrinsics.areEqual((Object) getJClass().getSimpleName(), (Object) "DefaultImpls")) {
            Class declaringClass = getJClass().getDeclaringClass();
            if (declaringClass != null && declaringClass.isInterface()) {
                KClass a = C12731a.m39867a(declaringClass);
                if (a != null) {
                    return ((KClassImpl) a).getLocalProperty(i);
                }
                throw new C13142s("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            }
        }
        ClassDescriptor descriptor = getDescriptor();
        PropertyDescriptor propertyDescriptor = null;
        if (!(descriptor instanceof DeserializedClassDescriptor)) {
            descriptor = null;
        }
        DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) descriptor;
        if (deserializedClassDescriptor != null) {
            Class classProto = deserializedClassDescriptor.getClassProto();
            GeneratedExtension<Class, List<Property>> generatedExtension = JvmProtoBuf.classLocalVariable;
            Intrinsics.checkReturnedValueIsNotNull((Object) generatedExtension, "JvmProtoBuf.classLocalVariable");
            Property property = (Property) ProtoBufUtilKt.getExtensionOrNull(classProto, generatedExtension, i);
            if (property != null) {
                propertyDescriptor = (PropertyDescriptor) UtilKt.deserializeToDescriptor(getJClass(), property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), KClassImpl$getLocalProperty$2$1$1.INSTANCE);
            }
        }
        return propertyDescriptor;
    }

    public final MemberScope getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    public Collection<KCallable<?>> getMembers() {
        return ((Data) this.data.invoke()).getAllMembers();
    }

    public Collection<KClass<?>> getNestedClasses() {
        return ((Data) this.data.invoke()).getNestedClasses();
    }

    public T getObjectInstance() {
        return ((Data) this.data.invoke()).getObjectInstance();
    }

    public Collection<PropertyDescriptor> getProperties(Name name) {
        return C13199w.m40583d(getMemberScope$kotlin_reflection().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION), (Iterable) getStaticScope$kotlin_reflection().getContributedVariables(name, NoLookupLocation.FROM_REFLECTION));
    }

    public String getQualifiedName() {
        return ((Data) this.data.invoke()).getQualifiedName();
    }

    public List<KClass<? extends T>> getSealedSubclasses() {
        return ((Data) this.data.invoke()).getSealedSubclasses();
    }

    public String getSimpleName() {
        return ((Data) this.data.invoke()).getSimpleName();
    }

    public final MemberScope getStaticScope$kotlin_reflection() {
        MemberScope staticScope = getDescriptor().getStaticScope();
        Intrinsics.checkReturnedValueIsNotNull((Object) staticScope, "descriptor.staticScope");
        return staticScope;
    }

    public List<KType> getSupertypes() {
        return ((Data) this.data.invoke()).getSupertypes();
    }

    public List<KTypeParameter> getTypeParameters() {
        return ((Data) this.data.invoke()).getTypeParameters();
    }

    public KVisibility getVisibility() {
        Visibility visibility = getDescriptor().getVisibility();
        Intrinsics.checkReturnedValueIsNotNull((Object) visibility, "descriptor.visibility");
        return UtilKt.toKVisibility(visibility);
    }

    public int hashCode() {
        return C12731a.m39869b(this).hashCode();
    }

    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    public boolean isCompanion() {
        return getDescriptor().isCompanionObject();
    }

    public boolean isData() {
        return getDescriptor().isData();
    }

    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    public boolean isInner() {
        return getDescriptor().isInner();
    }

    public boolean isInstance(Object obj) {
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return C12865c0.m40203b(obj, functionClassArity.intValue());
        }
        Class wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(obj);
    }

    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }

    public boolean isSealed() {
        return getDescriptor().getModality() == Modality.SEALED;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        ClassId classId = getClassId();
        FqName packageFqName = classId.getPackageFqName();
        Intrinsics.checkReturnedValueIsNotNull((Object) packageFqName, "classId.packageFqName");
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(packageFqName.asString());
            sb2.append(".");
            str = sb2.toString();
        }
        String asString = classId.getRelativeClassName().asString();
        Intrinsics.checkReturnedValueIsNotNull((Object) asString, "classId.relativeClassName.asString()");
        String a = C12832w.m40115a(asString, '.', '$', false, 4, (Object) null);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(a);
        sb.append(sb3.toString());
        return sb.toString();
    }

    public ClassDescriptor getDescriptor() {
        return ((Data) this.data.invoke()).getDescriptor();
    }
}
