package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.List;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* compiled from: JavaTypeResolver.kt */
public final class JavaTypeResolver {

    /* renamed from: c */
    private final LazyJavaResolverContext f29565c;
    private final TypeParameterResolver typeParameterResolver;

    public JavaTypeResolver(LazyJavaResolverContext lazyJavaResolverContext, TypeParameterResolver typeParameterResolver2) {
        this.f29565c = lazyJavaResolverContext;
        this.typeParameterResolver = typeParameterResolver2;
    }

    private final boolean argumentsMakeSenseOnlyForMutableContainer(JavaClassifierType javaClassifierType, ClassDescriptor classDescriptor) {
        boolean z = false;
        if (!JavaTypeResolver$argumentsMakeSenseOnlyForMutableContainer$1.INSTANCE.invoke((JavaType) C13199w.m40595i(javaClassifierType.getTypeArguments()))) {
            return false;
        }
        TypeConstructor typeConstructor = JavaToKotlinClassMap.INSTANCE.convertReadOnlyToMutable(classDescriptor).getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "JavaToKotlinClassMap.con…         .typeConstructor");
        List parameters = typeConstructor.getParameters();
        C12880j.m40222a((Object) parameters, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
        TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) C13199w.m40595i(parameters);
        if (typeParameterDescriptor != null) {
            Variance variance = typeParameterDescriptor.getVariance();
            if (variance != null) {
                C12880j.m40222a((Object) variance, "JavaToKotlinClassMap.con….variance ?: return false");
                if (variance != Variance.OUT_VARIANCE) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if ((!r3.isEmpty()) != false) goto L_0x0026;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r16, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r17, kotlin.reflect.jvm.internal.impl.types.TypeConstructor r18) {
        /*
            r15 = this;
            r6 = r15
            boolean r7 = r16.isRaw()
            java.lang.String r0 = "constructor.parameters"
            r1 = 0
            r2 = 1
            if (r7 != 0) goto L_0x0026
            java.util.List r3 = r16.getTypeArguments()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0024
            java.util.List r3 = r18.getParameters()
            kotlin.jvm.internal.C12880j.m40222a(r3, r0)
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r3 = 0
            goto L_0x0027
        L_0x0026:
            r3 = 1
        L_0x0027:
            java.util.List r4 = r18.getParameters()
            kotlin.jvm.internal.C12880j.m40222a(r4, r0)
            java.lang.String r8 = "parameter"
            r0 = 10
            if (r3 == 0) goto L_0x0086
            java.util.ArrayList r9 = new java.util.ArrayList
            int r0 = kotlin.p590y.C13187p.m40525a(r4, r0)
            r9.<init>(r0)
            java.util.Iterator r10 = r4.iterator()
        L_0x0041:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r10.next()
            r11 = r0
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r11 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r11
            kotlin.reflect.jvm.internal.impl.types.LazyWrappedType r12 = new kotlin.reflect.jvm.internal.impl.types.LazyWrappedType
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r0 = r6.f29565c
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r13 = r0.getStorageManager()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$$inlined$map$lambda$1 r14 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeArguments$$inlined$map$lambda$1
            r0 = r14
            r1 = r11
            r2 = r15
            r3 = r17
            r4 = r18
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r12.<init>(r13, r14)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution.INSTANCE
            kotlin.jvm.internal.C12880j.m40222a(r11, r8)
            if (r7 == 0) goto L_0x0071
            r1 = r17
            r2 = r1
            goto L_0x0079
        L_0x0071:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE
            r2 = r17
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r1 = r2.withFlexibility(r1)
        L_0x0079:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r0 = r0.computeProjection(r11, r1, r12)
            r9.add(r0)
            goto L_0x0041
        L_0x0081:
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r9)
            return r0
        L_0x0086:
            int r3 = r4.size()
            java.util.List r5 = r16.getTypeArguments()
            int r5 = r5.size()
            if (r3 == r5) goto L_0x00cc
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = kotlin.p590y.C13187p.m40525a(r4, r0)
            r1.<init>(r0)
            java.util.Iterator r0 = r4.iterator()
        L_0x00a1:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c7
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r2
            kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl r3 = new kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl
            java.lang.String r4 = "p"
            kotlin.jvm.internal.C12880j.m40222a(r2, r4)
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r2.getName()
            java.lang.String r2 = r2.asString()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = kotlin.reflect.jvm.internal.impl.types.ErrorUtils.createErrorType(r2)
            r3.<init>(r2)
            r1.add(r3)
            goto L_0x00a1
        L_0x00c7:
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r1)
            return r0
        L_0x00cc:
            java.util.List r3 = r16.getTypeArguments()
            java.lang.Iterable r3 = kotlin.p590y.C13199w.m40610u(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = kotlin.p590y.C13187p.m40525a(r3, r0)
            r5.<init>(r0)
            java.util.Iterator r0 = r3.iterator()
        L_0x00e1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0143
            java.lang.Object r3 = r0.next()
            kotlin.y.b0 r3 = (kotlin.p590y.C13152b0) r3
            int r7 = r3.mo34194a()
            java.lang.Object r3 = r3.mo34195b()
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r3 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType) r3
            int r9 = r4.size()
            if (r7 >= r9) goto L_0x00ff
            r9 = 1
            goto L_0x0100
        L_0x00ff:
            r9 = 0
        L_0x0100:
            boolean r10 = kotlin.C13147x.f29590a
            if (r10 == 0) goto L_0x012a
            if (r9 == 0) goto L_0x0107
            goto L_0x012a
        L_0x0107:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Argument index should be less then type parameters count, but "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = " > "
            r0.append(r1)
            int r1 = r4.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x012a:
            java.lang.Object r7 = r4.get(r7)
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r7
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r9 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            r10 = 3
            r11 = 0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r9 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(r9, r1, r11, r10, r11)
            kotlin.jvm.internal.C12880j.m40222a(r7, r8)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r3 = r15.transformToTypeProjection(r3, r9, r7)
            r5.add(r3)
            goto L_0x00e1
        L_0x0143:
            java.util.List r0 = kotlin.p590y.C13199w.m40606q(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.computeArguments(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.TypeConstructor):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r0 != null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType computeSimpleJavaClassifierType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r5, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r6, kotlin.reflect.jvm.internal.impl.types.SimpleType r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L_0x0009
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r7.getAnnotations()
            if (r0 == 0) goto L_0x0009
            goto L_0x0010
        L_0x0009:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r1 = r4.f29565c
            r0.<init>(r1, r5)
        L_0x0010:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r1 = r4.computeTypeConstructor(r5, r6)
            r2 = 0
            if (r1 == 0) goto L_0x003e
            boolean r3 = r4.isNullable(r6)
            if (r7 == 0) goto L_0x0021
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r2 = r7.getConstructor()
        L_0x0021:
            boolean r2 = kotlin.jvm.internal.C12880j.m40224a(r2, r1)
            if (r2 == 0) goto L_0x0035
            boolean r2 = r5.isRaw()
            if (r2 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0035
            r5 = 1
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r7.makeNullableAsSpecified(r5)
            return r5
        L_0x0035:
            java.util.List r5 = r4.computeArguments(r5, r6, r1)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(r0, r1, r5, r3)
            return r5
        L_0x003e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.computeSimpleJavaClassifierType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, kotlin.reflect.jvm.internal.impl.types.SimpleType):kotlin.reflect.jvm.internal.impl.types.SimpleType");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r5 != null) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.types.TypeConstructor computeTypeConstructor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType r4, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r5) {
        /*
            r3 = this;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier r0 = r4.getClassifier()
            if (r0 == 0) goto L_0x0079
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass
            if (r1 == 0) goto L_0x004d
            r1 = r0
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass r1 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass) r1
            kotlin.reflect.jvm.internal.impl.name.FqName r2 = r1.getFqName()
            if (r2 == 0) goto L_0x0036
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = r3.mapKotlinClass(r4, r5, r2)
            if (r5 == 0) goto L_0x001a
            goto L_0x0028
        L_0x001a:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r5 = r3.f29565c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents r5 = r5.getComponents()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver r5 = r5.getModuleClassResolver()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = r5.resolveClass(r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0031
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r5.getTypeConstructor()
            if (r5 == 0) goto L_0x0031
            goto L_0x0061
        L_0x0031:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r3.createNotFoundClass(r4)
            goto L_0x0061
        L_0x0036:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Class type should have a FQ name: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>(r4)
            throw r5
        L_0x004d:
            boolean r4 = r0 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter
            if (r4 == 0) goto L_0x0062
            kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver r4 = r3.typeParameterResolver
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter) r0
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r4 = r4.resolveTypeParameter(r0)
            if (r4 == 0) goto L_0x0060
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r4.getTypeConstructor()
            goto L_0x0061
        L_0x0060:
            r5 = 0
        L_0x0061:
            return r5
        L_0x0062:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "Unknown classifier kind: "
            r5.append(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0079:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r3.createNotFoundClass(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.computeTypeConstructor(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes):kotlin.reflect.jvm.internal.impl.types.TypeConstructor");
    }

    private final TypeConstructor createNotFoundClass(JavaClassifierType javaClassifierType) {
        ClassId classId = ClassId.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName()));
        C12880j.m40222a((Object) classId, "ClassId.topLevel(FqName(…classifierQualifiedName))");
        TypeConstructor typeConstructor = this.f29565c.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(classId, C13183n.m40498a(Integer.valueOf(0))).getTypeConstructor();
        C12880j.m40222a((Object) typeConstructor, "c.components.deserialize…istOf(0)).typeConstructor");
        return typeConstructor;
    }

    private final boolean isConflictingArgumentFor(Variance variance, TypeParameterDescriptor typeParameterDescriptor) {
        boolean z = false;
        if (typeParameterDescriptor.getVariance() == Variance.INVARIANT) {
            return false;
        }
        if (variance != typeParameterDescriptor.getVariance()) {
            z = true;
        }
        return z;
    }

    private final boolean isNullable(JavaTypeAttributes javaTypeAttributes) {
        boolean z = false;
        if (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND) {
            return false;
        }
        if (!javaTypeAttributes.isForAnnotationParameter() && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE) {
            z = true;
        }
        return z;
    }

    private final ClassDescriptor mapKotlinClass(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, FqName fqName) {
        if (javaTypeAttributes.isForAnnotationParameter() && C12880j.m40224a((Object) fqName, (Object) JavaTypeResolverKt.JAVA_LANG_CLASS_FQ_NAME)) {
            return this.f29565c.getComponents().getReflectionTypes().getKClass();
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        ClassDescriptor mapJavaToKotlin$default = JavaToKotlinClassMap.mapJavaToKotlin$default(javaToKotlinClassMap, fqName, this.f29565c.getModule().getBuiltIns(), null, 4, null);
        if (mapJavaToKotlin$default != null) {
            return (!javaToKotlinClassMap.isReadOnly(mapJavaToKotlin$default) || !(javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE || argumentsMakeSenseOnlyForMutableContainer(javaClassifierType, mapJavaToKotlin$default))) ? mapJavaToKotlin$default : javaToKotlinClassMap.convertReadOnlyToMutable(mapJavaToKotlin$default);
        }
        return null;
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z);
    }

    private final KotlinType transformJavaClassifierType(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes) {
        KotlinType kotlinType;
        JavaTypeResolver$transformJavaClassifierType$1 javaTypeResolver$transformJavaClassifierType$1 = new JavaTypeResolver$transformJavaClassifierType$1(javaClassifierType);
        boolean z = !javaTypeAttributes.isForAnnotationParameter() && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE;
        boolean isRaw = javaClassifierType.isRaw();
        if (isRaw || z) {
            SimpleType computeSimpleJavaClassifierType = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (computeSimpleJavaClassifierType == null) {
                return javaTypeResolver$transformJavaClassifierType$1.invoke();
            }
            SimpleType computeSimpleJavaClassifierType2 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), computeSimpleJavaClassifierType);
            if (computeSimpleJavaClassifierType2 == null) {
                return javaTypeResolver$transformJavaClassifierType$1.invoke();
            }
            if (isRaw) {
                kotlinType = new RawTypeImpl(computeSimpleJavaClassifierType, computeSimpleJavaClassifierType2);
            } else {
                kotlinType = KotlinTypeFactory.flexibleType(computeSimpleJavaClassifierType, computeSimpleJavaClassifierType2);
            }
            return kotlinType;
        }
        SimpleType computeSimpleJavaClassifierType3 = computeSimpleJavaClassifierType(javaClassifierType, javaTypeAttributes, null);
        if (computeSimpleJavaClassifierType3 == null) {
            computeSimpleJavaClassifierType3 = javaTypeResolver$transformJavaClassifierType$1.invoke();
        }
        return computeSimpleJavaClassifierType3;
    }

    private final TypeProjection transformToTypeProjection(JavaType javaType, JavaTypeAttributes javaTypeAttributes, TypeParameterDescriptor typeParameterDescriptor) {
        if (!(javaType instanceof JavaWildcardType)) {
            return new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, javaTypeAttributes));
        }
        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
        JavaType bound = javaWildcardType.getBound();
        Variance variance = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (bound == null || isConflictingArgumentFor(variance, typeParameterDescriptor)) {
            return JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor, javaTypeAttributes);
        }
        return TypeUtilsKt.createProjection(transformJavaType(bound, JavaTypeResolverKt.toAttributes$default(TypeUsage.COMMON, false, null, 3, null)), variance, typeParameterDescriptor);
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [kotlin.reflect.jvm.internal.impl.types.KotlinType] */
    /* JADX WARNING: type inference failed for: r6v12, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType transformArrayType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType r6, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r7, boolean r8) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType r6 = r6.getComponentType()
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType
            r1 = 0
            if (r0 != 0) goto L_0x000b
            r0 = r1
            goto L_0x000c
        L_0x000b:
            r0 = r6
        L_0x000c:
            kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType r0 = (kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType) r0
            if (r0 == 0) goto L_0x0015
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r0 = r0.getType()
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            r2 = 1
            if (r0 == 0) goto L_0x003c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r6 = r5.f29565c
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r6 = r6.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r6 = r6.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r6 = r6.getPrimitiveArrayKotlinType(r0)
            java.lang.String r8 = "c.module.builtIns.getPri…KotlinType(primitiveType)"
            kotlin.jvm.internal.C12880j.m40222a(r6, r8)
            boolean r7 = r7.isForAnnotationParameter()
            if (r7 == 0) goto L_0x0033
            goto L_0x003b
        L_0x0033:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r7 = r6.makeNullableAsSpecified(r2)
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r6 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r6, r7)
        L_0x003b:
            return r6
        L_0x003c:
            kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage r0 = kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage.COMMON
            boolean r3 = r7.isForAnnotationParameter()
            r4 = 2
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolverKt.toAttributes$default(r0, r3, r1, r4, r1)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r6 = r5.transformJavaType(r6, r0)
            boolean r7 = r7.isForAnnotationParameter()
            if (r7 == 0) goto L_0x006c
            if (r8 == 0) goto L_0x0056
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            goto L_0x0058
        L_0x0056:
            kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
        L_0x0058:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r8 = r5.f29565c
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r8 = r8.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r8 = r8.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.SimpleType r6 = r8.getArrayType(r7, r6)
            java.lang.String r7 = "c.module.builtIns.getArr…ctionKind, componentType)"
            kotlin.jvm.internal.C12880j.m40222a(r6, r7)
            return r6
        L_0x006c:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r7 = r5.f29565c
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r7 = r7.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r7 = r7.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.SimpleType r7 = r7.getArrayType(r8, r6)
            java.lang.String r8 = "c.module.builtIns.getArr…INVARIANT, componentType)"
            kotlin.jvm.internal.C12880j.m40222a(r7, r8)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r8 = r5.f29565c
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r8 = r8.getModule()
            kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r8 = r8.getBuiltIns()
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            kotlin.reflect.jvm.internal.impl.types.SimpleType r6 = r8.getArrayType(r0, r6)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r6 = r6.makeNullableAsSpecified(r2)
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r6 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(r7, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver.transformArrayType(kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes, boolean):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }

    public final KotlinType transformJavaType(JavaType javaType, JavaTypeAttributes javaTypeAttributes) {
        SimpleType simpleType;
        if (javaType instanceof JavaPrimitiveType) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            if (type != null) {
                simpleType = this.f29565c.getModule().getBuiltIns().getPrimitiveKotlinType(type);
            } else {
                simpleType = this.f29565c.getModule().getBuiltIns().getUnitType();
            }
            C12880j.m40222a((Object) simpleType, "if (primitiveType != nul….module.builtIns.unitType");
            return simpleType;
        } else if (javaType instanceof JavaClassifierType) {
            return transformJavaClassifierType((JavaClassifierType) javaType, javaTypeAttributes);
        } else {
            if (javaType instanceof JavaArrayType) {
                return transformArrayType$default(this, (JavaArrayType) javaType, javaTypeAttributes, false, 4, null);
            }
            String str = "c.module.builtIns.defaultBound";
            if (javaType instanceof JavaWildcardType) {
                JavaType bound = ((JavaWildcardType) javaType).getBound();
                if (bound != null) {
                    KotlinType transformJavaType = transformJavaType(bound, javaTypeAttributes);
                    if (transformJavaType != null) {
                        return transformJavaType;
                    }
                }
                SimpleType defaultBound = this.f29565c.getModule().getBuiltIns().getDefaultBound();
                C12880j.m40222a((Object) defaultBound, str);
                return defaultBound;
            } else if (javaType == null) {
                SimpleType defaultBound2 = this.f29565c.getModule().getBuiltIns().getDefaultBound();
                C12880j.m40222a((Object) defaultBound2, str);
                return defaultBound2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported type: ");
                sb.append(javaType);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }
}
