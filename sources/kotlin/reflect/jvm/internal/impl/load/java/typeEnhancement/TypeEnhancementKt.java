package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.C12898l;
import kotlin.C13147x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* compiled from: typeEnhancement.kt */
public final class TypeEnhancementKt {
    private static final EnhancedTypeAnnotations ENHANCED_MUTABILITY_ANNOTATIONS;
    private static final EnhancedTypeAnnotations ENHANCED_NULLABILITY_ANNOTATIONS;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = new int[MutabilityQualifier.values().length];
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = new int[NullabilityQualifier.values().length];

        static {
            $EnumSwitchMapping$0[MutabilityQualifier.READ_ONLY.ordinal()] = 1;
            $EnumSwitchMapping$0[MutabilityQualifier.MUTABLE.ordinal()] = 2;
            $EnumSwitchMapping$1[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            $EnumSwitchMapping$1[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
        }
    }

    static {
        FqName fqName = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        ENHANCED_NULLABILITY_ANNOTATIONS = new EnhancedTypeAnnotations(fqName);
        FqName fqName2 = JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName2, "JvmAnnotationNames.ENHANCED_MUTABILITY_ANNOTATION");
        ENHANCED_MUTABILITY_ANNOTATIONS = new EnhancedTypeAnnotations(fqName2);
    }

    private static final Annotations compositeAnnotationsOrSingle(List<? extends Annotations> list) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("At least one Annotations object expected".toString());
        } else if (size != 1) {
            return new CompositeAnnotations(C13199w.m40606q(list));
        } else {
            return (Annotations) C13199w.m40599k((List) list);
        }
    }

    public static final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> function1) {
        return enhancePossiblyFlexible(kotlinType.unwrap(), function1, 0).getTypeIfChanged();
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
    /* JADX WARNING: type inference failed for: r2v6, types: [kotlin.reflect.jvm.internal.impl.types.KotlinType] */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r2v9, types: [kotlin.reflect.jvm.internal.impl.types.UnwrappedType] */
    /* JADX WARNING: type inference failed for: r3v10, types: [kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter] */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v10
      assigns: [?[OBJECT, ARRAY], kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.SimpleType]
      uses: [kotlin.reflect.jvm.internal.impl.types.KotlinType, ?[int, boolean, OBJECT, ARRAY, byte, short, char], ?[OBJECT, ARRAY], kotlin.reflect.jvm.internal.impl.types.SimpleType]
      mth insns count: 115
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult enhanceInflexible(kotlin.reflect.jvm.internal.impl.types.SimpleType r18, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> r19, int r20, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r21
            boolean r3 = shouldEnhance(r21)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x001e
            java.util.List r3 = r18.getArguments()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x001e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult
            r1.<init>(r0, r5, r4)
            return r1
        L_0x001e:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r18.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.getDeclarationDescriptor()
            if (r3 == 0) goto L_0x0151
            java.lang.String r6 = "constructor.declarationD…pleResult(this, 1, false)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r20)
            java.lang.Object r6 = r1.invoke(r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r6 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r6
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult r3 = enhanceMutability(r3, r6, r2)
            java.lang.Object r7 = r3.component1()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor) r7
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = r3.component2()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r8 = r7.getTypeConstructor()
            java.lang.String r9 = "enhancedClassifier.typeConstructor"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r8, r9)
            int r10 = r20 + 1
            if (r3 == 0) goto L_0x0054
            r11 = 1
            goto L_0x0055
        L_0x0054:
            r11 = 0
        L_0x0055:
            java.util.List r12 = r18.getArguments()
            java.util.ArrayList r13 = new java.util.ArrayList
            r14 = 10
            int r14 = kotlin.p590y.C13187p.m40525a(r12, r14)
            r13.<init>(r14)
            java.util.Iterator r12 = r12.iterator()
            r14 = r10
            r10 = 0
        L_0x006a:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L_0x00de
            java.lang.Object r15 = r12.next()
            int r16 = r10 + 1
            if (r10 < 0) goto L_0x00d9
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r15 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r15
            boolean r17 = r15.isStarProjection()
            if (r17 == 0) goto L_0x0098
            int r14 = r14 + 1
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r15 = r7.getTypeConstructor()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r15, r9)
            java.util.List r15 = r15.getParameters()
            java.lang.Object r10 = r15.get(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r10 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r10
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeStarProjection(r10)
            goto L_0x00d1
        L_0x0098:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r17 = r15.getType()
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r5 = r17.unwrap()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.Result r5 = enhancePossiblyFlexible(r5, r1, r14)
            if (r11 != 0) goto L_0x00af
            boolean r11 = r5.getWereChanges()
            if (r11 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r11 = 0
            goto L_0x00b0
        L_0x00af:
            r11 = 1
        L_0x00b0:
            int r17 = r5.getSubtreeSize()
            int r14 = r14 + r17
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r5.getType()
            kotlin.reflect.jvm.internal.impl.types.Variance r15 = r15.getProjectionKind()
            java.lang.String r4 = "arg.projectionKind"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r15, r4)
            java.util.List r4 = r8.getParameters()
            java.lang.Object r4 = r4.get(r10)
            kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) r4
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.createProjection(r5, r15, r4)
        L_0x00d1:
            r13.add(r10)
            r10 = r16
            r4 = 0
            r5 = 1
            goto L_0x006a
        L_0x00d9:
            kotlin.p590y.C13180m.m40455c()
            r0 = 0
            throw r0
        L_0x00de:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.EnhancementResult r1 = getEnhancedNullability(r0, r6, r2)
            java.lang.Object r2 = r1.component1()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r1.component2()
            if (r11 != 0) goto L_0x00f7
            if (r1 == 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r4 = 0
            goto L_0x00f8
        L_0x00f7:
            r4 = 1
        L_0x00f8:
            int r14 = r14 - r20
            if (r4 != 0) goto L_0x0103
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult
            r4 = 0
            r1.<init>(r0, r14, r4)
            return r1
        L_0x0103:
            r4 = 0
            r5 = 3
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations[] r5 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations[r5]
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r7 = r18.getAnnotations()
            r5[r4] = r7
            r4 = 1
            r5[r4] = r3
            r3 = 2
            r5[r3] = r1
            java.util.List r3 = kotlin.p590y.C13185o.m40522d(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r3 = compositeAnnotationsOrSingle(r3)
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.simpleType(r3, r8, r13, r2)
            boolean r3 = r6.isNotNullTypeParameter()
            if (r3 == 0) goto L_0x012b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter
            r3.<init>(r2)
            r2 = r3
        L_0x012b:
            if (r1 == 0) goto L_0x0136
            boolean r1 = r6.isNullabilityQualifierForWarning()
            if (r1 == 0) goto L_0x0136
            r17 = 1
            goto L_0x0138
        L_0x0136:
            r17 = 0
        L_0x0138:
            if (r17 == 0) goto L_0x013e
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType r2 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(r0, r2)
        L_0x013e:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult
            if (r2 == 0) goto L_0x0149
            kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = (kotlin.reflect.jvm.internal.impl.types.SimpleType) r2
            r1 = 1
            r0.<init>(r2, r14, r1)
            return r0
        L_0x0149:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"
            r0.<init>(r1)
            throw r0
        L_0x0151:
            r1 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult
            r3 = 0
            r2.<init>(r0, r1, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt.enhanceInflexible(kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.jvm.functions.Function1, int, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeComponentPosition):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SimpleResult");
    }

    private static final EnhancementResult<ClassifierDescriptor> enhanceMutability(ClassifierDescriptor classifierDescriptor, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        if (!shouldEnhance(typeComponentPosition)) {
            return noChange(classifierDescriptor);
        }
        if (!(classifierDescriptor instanceof ClassDescriptor)) {
            return noChange(classifierDescriptor);
        }
        JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
        MutabilityQualifier mutability = javaTypeQualifiers.getMutability();
        if (mutability != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[mutability.ordinal()];
            if (i != 1) {
                if (i == 2 && typeComponentPosition == TypeComponentPosition.FLEXIBLE_UPPER) {
                    ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptor;
                    if (javaToKotlinClassMap.isReadOnly(classDescriptor)) {
                        return enhancedMutability(javaToKotlinClassMap.convertReadOnlyToMutable(classDescriptor));
                    }
                }
            } else if (typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
                ClassDescriptor classDescriptor2 = (ClassDescriptor) classifierDescriptor;
                if (javaToKotlinClassMap.isMutable(classDescriptor2)) {
                    return enhancedMutability(javaToKotlinClassMap.convertMutableToReadOnly(classDescriptor2));
                }
            }
        }
        return noChange(classifierDescriptor);
    }

    private static final Result enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i) {
        Result result;
        UnwrappedType unwrappedType2;
        boolean z = false;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new Result(unwrappedType, 1, false);
        }
        if (unwrappedType instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedType;
            SimpleResult enhanceInflexible = enhanceInflexible(flexibleType.getLowerBound(), function1, i, TypeComponentPosition.FLEXIBLE_LOWER);
            SimpleResult enhanceInflexible2 = enhanceInflexible(flexibleType.getUpperBound(), function1, i, TypeComponentPosition.FLEXIBLE_UPPER);
            boolean z2 = enhanceInflexible.getSubtreeSize() == enhanceInflexible2.getSubtreeSize();
            if (!C13147x.f29590a || z2) {
                if (enhanceInflexible.getWereChanges() || enhanceInflexible2.getWereChanges()) {
                    z = true;
                }
                KotlinType enhancement = TypeWithEnhancementKt.getEnhancement(enhanceInflexible.getType());
                if (enhancement == null) {
                    enhancement = TypeWithEnhancementKt.getEnhancement(enhanceInflexible2.getType());
                }
                if (z) {
                    if (unwrappedType instanceof RawTypeImpl) {
                        unwrappedType2 = new RawTypeImpl(enhanceInflexible.getType(), enhanceInflexible2.getType());
                    } else {
                        unwrappedType2 = KotlinTypeFactory.flexibleType(enhanceInflexible.getType(), enhanceInflexible2.getType());
                    }
                    unwrappedType = TypeWithEnhancementKt.wrapEnhancement(unwrappedType2, enhancement);
                }
                result = new Result(unwrappedType, enhanceInflexible.getSubtreeSize(), z);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Different tree sizes of bounds: ");
                sb.append("lower = (");
                sb.append(flexibleType.getLowerBound());
                String str = ", ";
                sb.append(str);
                sb.append(enhanceInflexible.getSubtreeSize());
                sb.append("), ");
                sb.append("upper = (");
                sb.append(flexibleType.getUpperBound());
                sb.append(str);
                sb.append(enhanceInflexible2.getSubtreeSize());
                sb.append(')');
                throw new AssertionError(sb.toString());
            }
        } else if (unwrappedType instanceof SimpleType) {
            result = enhanceInflexible((SimpleType) unwrappedType, function1, i, TypeComponentPosition.INFLEXIBLE);
        } else {
            throw new C12898l();
        }
        return result;
    }

    private static final <T> EnhancementResult<T> enhancedMutability(T t) {
        return new EnhancementResult<>(t, ENHANCED_MUTABILITY_ANNOTATIONS);
    }

    private static final <T> EnhancementResult<T> enhancedNullability(T t) {
        return new EnhancementResult<>(t, ENHANCED_NULLABILITY_ANNOTATIONS);
    }

    private static final EnhancementResult<Boolean> getEnhancedNullability(KotlinType kotlinType, JavaTypeQualifiers javaTypeQualifiers, TypeComponentPosition typeComponentPosition) {
        EnhancementResult<Boolean> enhancementResult;
        if (!shouldEnhance(typeComponentPosition)) {
            return noChange(Boolean.valueOf(kotlinType.isMarkedNullable()));
        }
        NullabilityQualifier nullability = javaTypeQualifiers.getNullability();
        if (nullability != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[nullability.ordinal()];
            if (i == 1) {
                enhancementResult = enhancedNullability(Boolean.valueOf(true));
            } else if (i == 2) {
                enhancementResult = enhancedNullability(Boolean.valueOf(false));
            }
            return enhancementResult;
        }
        enhancementResult = noChange(Boolean.valueOf(kotlinType.isMarkedNullable()));
        return enhancementResult;
    }

    public static final boolean hasEnhancedNullability(KotlinType kotlinType) {
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkReturnedValueIsNotNull((Object) fqName, "JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION");
        return annotations.findAnnotation(fqName) != null;
    }

    private static final <T> EnhancementResult<T> noChange(T t) {
        return new EnhancementResult<>(t, null);
    }

    public static final boolean shouldEnhance(TypeComponentPosition typeComponentPosition) {
        return typeComponentPosition != TypeComponentPosition.INFLEXIBLE;
    }
}
