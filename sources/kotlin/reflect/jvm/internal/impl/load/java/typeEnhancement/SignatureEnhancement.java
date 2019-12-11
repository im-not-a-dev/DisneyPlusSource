package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C12898l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.AnnotationDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.NullDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.StringDefaultValue;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.utils.Jsr305State;
import kotlin.reflect.jvm.internal.impl.utils.ReportLevel;

/* compiled from: signatureEnhancement.kt */
public final class SignatureEnhancement {
    private final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final Jsr305State jsr305State;

    /* compiled from: signatureEnhancement.kt */
    private static class PartEnhancementResult {
        private final boolean containsFunctionN;
        private final KotlinType type;
        private final boolean wereChanges;

        public PartEnhancementResult(KotlinType kotlinType, boolean z, boolean z2) {
            this.type = kotlinType;
            this.wereChanges = z;
            this.containsFunctionN = z2;
        }

        public final boolean getContainsFunctionN() {
            return this.containsFunctionN;
        }

        public final KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }
    }

    /* compiled from: signatureEnhancement.kt */
    private final class SignatureParts {
        private final QualifierApplicabilityType containerApplicabilityType;
        private final LazyJavaResolverContext containerContext;
        private final Collection<KotlinType> fromOverridden;
        private final KotlinType fromOverride;
        private final boolean isCovariant;
        private final Annotated typeContainer;

        public SignatureParts(Annotated annotated, KotlinType kotlinType, Collection<? extends KotlinType> collection, boolean z, LazyJavaResolverContext lazyJavaResolverContext, QualifierApplicabilityType qualifierApplicabilityType) {
            this.typeContainer = annotated;
            this.fromOverride = kotlinType;
            this.fromOverridden = collection;
            this.isCovariant = z;
            this.containerContext = lazyJavaResolverContext;
            this.containerApplicabilityType = qualifierApplicabilityType;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiersForOverride() {
            /*
                r14 = this;
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r14.fromOverridden
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.p590y.C13187p.m40525a(r0, r2)
                r1.<init>(r2)
                java.util.Iterator r0 = r0.iterator()
            L_0x0011:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0025
                java.lang.Object r2 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                java.util.List r2 = r14.toIndexed(r2)
                r1.add(r2)
                goto L_0x0011
            L_0x0025:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r14.fromOverride
                java.util.List r0 = r14.toIndexed(r0)
                boolean r2 = r14.isCovariant
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x005f
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r2 = r14.fromOverridden
                boolean r5 = r2 instanceof java.util.Collection
                if (r5 == 0) goto L_0x003f
                boolean r5 = r2.isEmpty()
                if (r5 == 0) goto L_0x003f
            L_0x003d:
                r2 = 0
                goto L_0x005b
            L_0x003f:
                java.util.Iterator r2 = r2.iterator()
            L_0x0043:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x003d
                java.lang.Object r5 = r2.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r5
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker r6 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT
                kotlin.reflect.jvm.internal.impl.types.KotlinType r7 = r14.fromOverride
                boolean r5 = r6.equalTypes(r5, r7)
                r5 = r5 ^ r4
                if (r5 == 0) goto L_0x0043
                r2 = 1
            L_0x005b:
                if (r2 == 0) goto L_0x005f
                r2 = 1
                goto L_0x0060
            L_0x005f:
                r2 = 0
            L_0x0060:
                if (r2 == 0) goto L_0x0064
                r5 = 1
                goto L_0x0068
            L_0x0064:
                int r5 = r0.size()
            L_0x0068:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[r5]
                r7 = 0
            L_0x006b:
                if (r7 >= r5) goto L_0x00c9
                if (r7 != 0) goto L_0x0071
                r8 = 1
                goto L_0x0072
            L_0x0071:
                r8 = 0
            L_0x0072:
                if (r8 != 0) goto L_0x0079
                if (r2 != 0) goto L_0x0077
                goto L_0x0079
            L_0x0077:
                r9 = 0
                goto L_0x007a
            L_0x0079:
                r9 = 1
            L_0x007a:
                boolean r10 = kotlin.C13147x.f29590a
                if (r10 == 0) goto L_0x0089
                if (r9 == 0) goto L_0x0081
                goto L_0x0089
            L_0x0081:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                java.lang.String r1 = "Only head type constructors should be computed"
                r0.<init>(r1)
                throw r0
            L_0x0089:
                java.lang.Object r9 = r0.get(r7)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r9 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r9
                kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = r9.component1()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r9 = r9.component2()
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r12 = r1.iterator()
            L_0x00a0:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x00c0
                java.lang.Object r13 = r12.next()
                java.util.List r13 = (java.util.List) r13
                java.lang.Object r13 = kotlin.p590y.C13199w.m40578d(r13, r7)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r13 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r13
                if (r13 == 0) goto L_0x00b9
                kotlin.reflect.jvm.internal.impl.types.KotlinType r13 = r13.getType()
                goto L_0x00ba
            L_0x00b9:
                r13 = 0
            L_0x00ba:
                if (r13 == 0) goto L_0x00a0
                r11.add(r13)
                goto L_0x00a0
            L_0x00c0:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r8 = r14.computeQualifiersForOverride(r10, r11, r9, r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x006b
            L_0x00c9:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                r0.<init>(r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride():kotlin.jvm.functions.Function1");
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType r11, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r12, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r13, boolean r14) {
            /*
                r10 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.p590y.C13187p.m40525a(r12, r1)
                r0.<init>(r1)
                java.util.Iterator r1 = r12.iterator()
            L_0x000f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0023
                java.lang.Object r2 = r1.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r2 = r10.extractQualifiers(r2)
                r0.add(r2)
                goto L_0x000f
            L_0x0023:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r2 = r0.iterator()
            L_0x002c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0042
                java.lang.Object r3 = r2.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r3
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r3 = r3.getMutability()
                if (r3 == 0) goto L_0x002c
                r1.add(r3)
                goto L_0x002c
            L_0x0042:
                java.util.Set r1 = kotlin.p590y.C13199w.m40609t(r1)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r3 = r0.iterator()
            L_0x004f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0065
                java.lang.Object r4 = r3.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r4
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.getNullability()
                if (r4 == 0) goto L_0x004f
                r2.add(r4)
                goto L_0x004f
            L_0x0065:
                java.util.Set r2 = kotlin.p590y.C13199w.m40609t(r2)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x0072:
                boolean r4 = r12.hasNext()
                if (r4 == 0) goto L_0x0090
                java.lang.Object r4 = r12.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r4
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.unwrapEnhancement(r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r4 = r10.extractQualifiers(r4)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.getNullability()
                if (r4 == 0) goto L_0x0072
                r3.add(r4)
                goto L_0x0072
            L_0x0090:
                java.util.Set r12 = kotlin.p590y.C13199w.m40609t(r3)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r11 = r10.extractQualifiersFromAnnotations(r11, r14, r13)
                boolean r13 = r11.isNullabilityQualifierForWarning()
                r3 = 1
                r13 = r13 ^ r3
                r4 = 0
                if (r13 == 0) goto L_0x00a3
                r13 = r11
                goto L_0x00a4
            L_0x00a3:
                r13 = r4
            L_0x00a4:
                if (r13 == 0) goto L_0x00ab
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r13 = r13.getNullability()
                goto L_0x00ac
            L_0x00ab:
                r13 = r4
            L_0x00ac:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r11.getNullability()
                boolean r6 = r10.isCovariant
                r7 = 0
                if (r6 == 0) goto L_0x00b9
                if (r14 == 0) goto L_0x00b9
                r6 = 1
                goto L_0x00ba
            L_0x00b9:
                r6 = 0
            L_0x00ba:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.select(r2, r13, r6)
                if (r8 == 0) goto L_0x00d2
                boolean r9 = r10.isForVarargParameter()
                if (r9 == 0) goto L_0x00ce
                if (r14 == 0) goto L_0x00ce
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r14 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
                if (r8 != r14) goto L_0x00ce
                r14 = 1
                goto L_0x00cf
            L_0x00ce:
                r14 = 0
            L_0x00cf:
                if (r14 != 0) goto L_0x00d2
                r4 = r8
            L_0x00d2:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r14 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r9 = r11.getMutability()
                java.lang.Object r14 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.select(r1, r14, r8, r9, r6)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r14 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r14
                if (r5 != r13) goto L_0x00ec
                boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r2)
                r13 = r13 ^ r3
                if (r13 == 0) goto L_0x00ea
                goto L_0x00ec
            L_0x00ea:
                r13 = 0
                goto L_0x00ed
            L_0x00ec:
                r13 = 1
            L_0x00ed:
                boolean r11 = r11.isNotNullTypeParameter()
                if (r11 != 0) goto L_0x0117
                boolean r11 = r0.isEmpty()
                if (r11 == 0) goto L_0x00fb
            L_0x00f9:
                r11 = 0
                goto L_0x0112
            L_0x00fb:
                java.util.Iterator r11 = r0.iterator()
            L_0x00ff:
                boolean r0 = r11.hasNext()
                if (r0 == 0) goto L_0x00f9
                java.lang.Object r0 = r11.next()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers) r0
                boolean r0 = r0.isNotNullTypeParameter()
                if (r0 == 0) goto L_0x00ff
                r11 = 1
            L_0x0112:
                if (r11 == 0) goto L_0x0115
                goto L_0x0117
            L_0x0115:
                r11 = 0
                goto L_0x0118
            L_0x0117:
                r11 = 1
            L_0x0118:
                if (r4 != 0) goto L_0x0125
                if (r13 == 0) goto L_0x0125
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.select(r12, r5, r6)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.createJavaTypeQualifiers(r12, r14, r3, r11)
                return r11
            L_0x0125:
                if (r4 != 0) goto L_0x0128
                goto L_0x0129
            L_0x0128:
                r3 = 0
            L_0x0129:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r11 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementKt.createJavaTypeQualifiers(r4, r14, r3, r11)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.Collection, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        public static /* synthetic */ PartEnhancementResult enhance$default(SignatureParts signatureParts, TypeEnhancementInfo typeEnhancementInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                typeEnhancementInfo = null;
            }
            return signatureParts.enhance(typeEnhancementInfo);
        }

        /* JADX WARNING: Incorrect type for immutable var: ssa=kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, code=kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>, for r3v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor>, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, java.lang.Iterable] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullability(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations<kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor> r3) {
            /*
                r2 = this;
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.this
                java.util.Iterator r3 = r3.iterator()
            L_0x0006:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L_0x0019
                java.lang.Object r1 = r3.next()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor) r1
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r1 = r0.extractNullability(r1)
                if (r1 == 0) goto L_0x0006
                goto L_0x001a
            L_0x0019:
                r1 = 0
            L_0x001a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractNullability(kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType r12) {
            /*
                r11 = this;
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(r12)
                if (r0 == 0) goto L_0x0018
                kotlin.reflect.jvm.internal.impl.types.FlexibleType r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(r12)
                kotlin.Pair r1 = new kotlin.Pair
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r0.getLowerBound()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.getUpperBound()
                r1.<init>(r2, r0)
                goto L_0x001d
            L_0x0018:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r12, r12)
            L_0x001d:
                java.lang.Object r0 = r1.mo31013a()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
                java.lang.Object r1 = r1.mo31014b()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap.INSTANCE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                boolean r3 = r0.isMarkedNullable()
                r4 = 0
                if (r3 == 0) goto L_0x0038
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L_0x0036:
                r5 = r3
                goto L_0x0042
            L_0x0038:
                boolean r3 = r1.isMarkedNullable()
                if (r3 != 0) goto L_0x0041
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L_0x0036
            L_0x0041:
                r5 = r4
            L_0x0042:
                boolean r0 = r2.isReadOnly(r0)
                if (r0 == 0) goto L_0x004b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L_0x0055
            L_0x004b:
                boolean r0 = r2.isMutable(r1)
                if (r0 == 0) goto L_0x0054
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                goto L_0x0055
            L_0x0054:
                r0 = r4
            L_0x0055:
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12 = r12.unwrap()
                boolean r6 = r12 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter
                r7 = 0
                r8 = 8
                r9 = 0
                r3 = r10
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType r8, boolean r9, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10) {
            /*
                r7 = this;
                if (r9 == 0) goto L_0x0013
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated r0 = r7.typeContainer
                if (r0 == 0) goto L_0x0013
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r0.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r1 = r8.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt.composeAnnotations(r0, r1)
                goto L_0x0017
            L_0x0013:
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r8.getAnnotations()
            L_0x0017:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1 r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$1
                r1.<init>(r0)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$extractQualifiersFromAnnotations$2 r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.C13011x4a76798a.INSTANCE
                r3 = 0
                if (r9 == 0) goto L_0x0031
                kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r9 = r7.containerContext
                kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaTypeQualifiersByElementType r9 = r9.getDefaultTypeQualifiers()
                if (r9 == 0) goto L_0x0030
                kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r10 = r7.containerApplicabilityType
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = r9.get(r10)
                goto L_0x0031
            L_0x0030:
                r10 = r3
            L_0x0031:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r9 = r7.extractNullability(r0)
                if (r9 == 0) goto L_0x0038
                goto L_0x004f
            L_0x0038:
                if (r10 == 0) goto L_0x004e
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r9 = r10.getNullability()
                if (r9 == 0) goto L_0x004e
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r10.getNullability()
                boolean r10 = r10.isNullabilityQualifierForWarning()
                r9.<init>(r0, r10)
                goto L_0x004f
            L_0x004e:
                r9 = r3
            L_0x004f:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                if (r9 == 0) goto L_0x0058
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r9.getQualifier()
                goto L_0x0059
            L_0x0058:
                r0 = r3
            L_0x0059:
                java.util.List r4 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getREAD_ONLY_ANNOTATIONS()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                java.lang.Object r4 = r1.invoke(r4, r5)
                java.util.List r5 = kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt.getMUTABLE_ANNOTATIONS()
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                java.lang.Object r1 = r1.invoke(r5, r6)
                java.lang.Object r1 = r2.invoke(r4, r1)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier) r1
                if (r9 == 0) goto L_0x0079
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = r9.getQualifier()
            L_0x0079:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                r4 = 0
                r5 = 1
                if (r3 != r2) goto L_0x0087
                boolean r8 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isTypeParameter(r8)
                if (r8 == 0) goto L_0x0087
                r8 = 1
                goto L_0x0088
            L_0x0087:
                r8 = 0
            L_0x0088:
                if (r9 == 0) goto L_0x0091
                boolean r9 = r9.isForWarningOnly()
                if (r9 != r5) goto L_0x0091
                r4 = 1
            L_0x0091:
                r10.<init>(r0, r1, r8, r4)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        private final boolean isForVarargParameter() {
            Annotated annotated = this.typeContainer;
            KotlinType kotlinType = null;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            if (valueParameterDescriptor != null) {
                kotlinType = valueParameterDescriptor.getVarargElementType();
            }
            return kotlinType != null;
        }

        private final List<TypeAndDefaultQualifiers> toIndexed(KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            new SignatureEnhancement$SignatureParts$toIndexed$1(arrayList).invoke(kotlinType, this.containerContext);
            return arrayList;
        }

        public final PartEnhancementResult enhance(TypeEnhancementInfo typeEnhancementInfo) {
            Function1 computeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride();
            Function1 signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 = typeEnhancementInfo != null ? new C13008x93576998(typeEnhancementInfo, computeIndexedQualifiersForOverride) : null;
            boolean contains = TypeUtils.contains(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.INSTANCE);
            KotlinType kotlinType = this.fromOverride;
            if (signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 == null) {
                signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1 = computeIndexedQualifiersForOverride;
            }
            KotlinType enhance = TypeEnhancementKt.enhance(kotlinType, signatureEnhancement$SignatureParts$enhance$$inlined$let$lambda$1);
            if (enhance != null) {
                return new PartEnhancementResult(enhance, true, contains);
            }
            return new PartEnhancementResult(this.fromOverride, false, contains);
        }
    }

    /* compiled from: signatureEnhancement.kt */
    private static final class ValueParameterEnhancementResult extends PartEnhancementResult {
        private final boolean hasDefaultValue;

        public ValueParameterEnhancementResult(KotlinType kotlinType, boolean z, boolean z2, boolean z3) {
            super(kotlinType, z2, z3);
            this.hasDefaultValue = z;
        }

        public final boolean getHasDefaultValue() {
            return this.hasDefaultValue;
        }
    }

    public SignatureEnhancement(AnnotationTypeQualifierResolver annotationTypeQualifierResolver2, Jsr305State jsr305State2) {
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver2;
        this.jsr305State = jsr305State2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D r17, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r18) {
        /*
            r16 = this;
            r7 = r16
            r8 = r17
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
            if (r0 != 0) goto L_0x0009
            return r8
        L_0x0009:
            r9 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor r9 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor) r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r9.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r1 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r10 = 1
            if (r0 != r1) goto L_0x0029
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r9.getOriginal()
            java.lang.String r1 = "original"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            java.util.Collection r0 = r0.getOverriddenDescriptors()
            int r0 = r0.size()
            if (r0 != r10) goto L_0x0029
            return r8
        L_0x0029:
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r0 = r17.getAnnotations()
            r1 = r18
            kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r4 = kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt.copyWithNewDefaultTypeQualifiers(r1, r0)
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor
            r11 = 0
            if (r0 == 0) goto L_0x0058
            r0 = r8
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r1 = r0.getGetter()
            if (r1 == 0) goto L_0x0058
            boolean r1 = r1.isDefault()
            if (r1 != 0) goto L_0x0058
            kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl r0 = r0.getGetter()
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = "getter!!"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            r2 = r0
            goto L_0x0059
        L_0x0054:
            kotlin.jvm.internal.Intrinsics.throwNpe()
            throw r11
        L_0x0058:
            r2 = r8
        L_0x0059:
            kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r0 = r9.getExtensionReceiverParameter()
            if (r0 == 0) goto L_0x0080
            boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r0 != 0) goto L_0x0065
            r0 = r11
            goto L_0x0066
        L_0x0065:
            r0 = r2
        L_0x0066:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            if (r0 == 0) goto L_0x0073
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> r1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER
            java.lang.Object r0 = r0.getUserData(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            goto L_0x0074
        L_0x0073:
            r0 = r11
        L_0x0074:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1 r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$receiverTypeEnhancement$1.INSTANCE
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r7.partsForValueParameter(r8, r0, r4, r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.enhance$default(r0, r11, r10, r11)
            r12 = r0
            goto L_0x0081
        L_0x0080:
            r12 = r11
        L_0x0081:
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor
            if (r0 != 0) goto L_0x0087
            r0 = r11
            goto L_0x0088
        L_0x0087:
            r0 = r8
        L_0x0088:
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor) r0
            r13 = 0
            if (r0 == 0) goto L_0x00b6
            kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = r0.getContainingDeclaration()
            if (r3 == 0) goto L_0x00ae
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            r5 = 3
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r0, r13, r13, r5, r11)
            java.lang.String r0 = r1.signature(r3, r0)
            if (r0 == 0) goto L_0x00b6
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedEnhancementInfoKt.getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE()
            java.lang.Object r0 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.PredefinedFunctionEnhancementInfo) r0
            r14 = r0
            goto L_0x00b7
        L_0x00ae:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r0.<init>(r1)
            throw r0
        L_0x00b6:
            r14 = r11
        L_0x00b7:
            if (r14 == 0) goto L_0x0111
            java.util.List r0 = r14.getParametersInfo()
            int r0 = r0.size()
            java.util.List r1 = r9.getValueParameters()
            int r1 = r1.size()
            if (r0 != r1) goto L_0x00cd
            r0 = 1
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            boolean r1 = kotlin.C13147x.f29590a
            if (r1 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x00d5
            goto L_0x0111
        L_0x00d5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Predefined enhancement info for "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = " has "
            r0.append(r1)
            java.util.List r1 = r14.getParametersInfo()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = ", but "
            r0.append(r1)
            java.util.List r1 = r9.getValueParameters()
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " expected"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0111:
            java.util.List r0 = r2.getValueParameters()
            java.lang.String r1 = "annotationOwnerForMember.valueParameters"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r6 = 10
            int r1 = kotlin.p590y.C13187p.m40525a(r0, r6)
            r15.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0129:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x019a
            java.lang.Object r1 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1 r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$valueParameterEnhancements$1$enhancementResult$1
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r3 = r7.partsForValueParameter(r8, r1, r4, r3)
            if (r14 == 0) goto L_0x0151
            java.util.List r5 = r14.getParametersInfo()
            if (r5 == 0) goto L_0x0151
            int r6 = r1.getIndex()
            java.lang.Object r5 = kotlin.p590y.C13199w.m40578d(r5, r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo) r5
            goto L_0x0152
        L_0x0151:
            r5 = r11
        L_0x0152:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r3 = r3.enhance(r5)
            boolean r5 = r3.getWereChanges()
            java.lang.String r6 = "p"
            if (r5 == 0) goto L_0x0163
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r3.getType()
            goto L_0x016f
        L_0x0163:
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r1.getType()
            java.lang.String r11 = "p.type"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r11)
        L_0x016f:
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r6)
            boolean r5 = r7.hasDefaultValueInAnnotation(r1, r5)
            boolean r6 = r3.getWereChanges()
            if (r6 != 0) goto L_0x0185
            boolean r1 = r1.declaresDefaultValue()
            if (r5 == r1) goto L_0x0183
            goto L_0x0185
        L_0x0183:
            r1 = 0
            goto L_0x0186
        L_0x0185:
            r1 = 1
        L_0x0186:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult
            kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = r3.getType()
            boolean r3 = r3.getContainsFunctionN()
            r6.<init>(r11, r5, r1, r3)
            r15.add(r6)
            r6 = 10
            r11 = 0
            goto L_0x0129
        L_0x019a:
            r3 = 1
            boolean r0 = r8 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
            if (r0 != 0) goto L_0x01a1
            r0 = 0
            goto L_0x01a2
        L_0x01a1:
            r0 = r8
        L_0x01a2:
            kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor) r0
            if (r0 == 0) goto L_0x01af
            boolean r0 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.JavaDescriptorUtilKt.isJavaField(r0)
            if (r0 != r10) goto L_0x01af
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.FIELD
            goto L_0x01b1
        L_0x01af:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver$QualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver.QualifierApplicabilityType.METHOD_RETURN_TYPE
        L_0x01b1:
            r5 = r0
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1 r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceSignature$returnTypeEnhancement$1.INSTANCE
            r0 = r16
            r1 = r17
            r11 = 10
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts r0 = r0.parts(r1, r2, r3, r4, r5, r6)
            if (r14 == 0) goto L_0x01c5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r1 = r14.getReturnTypeInfo()
            goto L_0x01c6
        L_0x01c5:
            r1 = 0
        L_0x01c6:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$PartEnhancementResult r0 = r0.enhance(r1)
            if (r12 == 0) goto L_0x01d2
            boolean r1 = r12.getContainsFunctionN()
            if (r1 == r10) goto L_0x01fc
        L_0x01d2:
            boolean r1 = r0.getContainsFunctionN()
            if (r1 != 0) goto L_0x01fc
            boolean r1 = r15.isEmpty()
            if (r1 == 0) goto L_0x01e0
        L_0x01de:
            r1 = 0
            goto L_0x01f7
        L_0x01e0:
            java.util.Iterator r1 = r15.iterator()
        L_0x01e4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01de
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r2 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) r2
            boolean r2 = r2.getContainsFunctionN()
            if (r2 == 0) goto L_0x01e4
            r1 = 1
        L_0x01f7:
            if (r1 == 0) goto L_0x01fa
            goto L_0x01fc
        L_0x01fa:
            r1 = 0
            goto L_0x01fd
        L_0x01fc:
            r1 = 1
        L_0x01fd:
            if (r12 == 0) goto L_0x0205
            boolean r2 = r12.getWereChanges()
            if (r2 == r10) goto L_0x022f
        L_0x0205:
            boolean r2 = r0.getWereChanges()
            if (r2 != 0) goto L_0x022f
            boolean r2 = r15.isEmpty()
            if (r2 == 0) goto L_0x0212
            goto L_0x0229
        L_0x0212:
            java.util.Iterator r2 = r15.iterator()
        L_0x0216:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = r2.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r3 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) r3
            boolean r3 = r3.getWereChanges()
            if (r3 == 0) goto L_0x0216
            r13 = 1
        L_0x0229:
            if (r13 != 0) goto L_0x022f
            if (r1 == 0) goto L_0x022e
            goto L_0x022f
        L_0x022e:
            return r8
        L_0x022f:
            if (r1 == 0) goto L_0x023f
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor$UserDataKey r1 = kotlin.reflect.jvm.internal.impl.resolve.deprecation.DeprecationKt.getDEPRECATED_FUNCTION_KEY()
            kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN r2 = new kotlin.reflect.jvm.internal.impl.load.java.DeprecationCausedByFunctionN
            r2.<init>(r8)
            kotlin.Pair r1 = kotlin.C12907r.m40244a(r1, r2)
            goto L_0x0240
        L_0x023f:
            r1 = 0
        L_0x0240:
            if (r12 == 0) goto L_0x0247
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = r12.getType()
            goto L_0x0248
        L_0x0247:
            r2 = 0
        L_0x0248:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = kotlin.p590y.C13187p.m40525a(r15, r11)
            r3.<init>(r4)
            java.util.Iterator r4 = r15.iterator()
        L_0x0255:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0272
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$ValueParameterEnhancementResult r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.ValueParameterEnhancementResult) r5
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData r6 = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.ValueParameterData
            kotlin.reflect.jvm.internal.impl.types.KotlinType r8 = r5.getType()
            boolean r5 = r5.getHasDefaultValue()
            r6.<init>(r8, r5)
            r3.add(r6)
            goto L_0x0255
        L_0x0272:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor r0 = r9.enhance(r2, r3, r0, r1)
            if (r0 == 0) goto L_0x027d
            return r0
        L_0x027d:
            kotlin.s r0 = new kotlin.s
            java.lang.String r1 = "null cannot be cast to non-null type D"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(AnnotationDescriptor annotationDescriptor) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName) ? new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null) : JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName) ? new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null) : Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION()) ? extractNullabilityTypeFromArgument(annotationDescriptor) : (!Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION()) || !this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations()) ? (!Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION()) || !this.jsr305State.getEnableCompatqualCheckerFrameworkAnnotations()) ? Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION()) ? new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true) : Intrinsics.areEqual((Object) fqName, (Object) JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION()) ? new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true) : null : new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, false, 2, null) : new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null);
        if (nullabilityQualifierWithMigrationStatus != null) {
            return (nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !(annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) || !((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) ? nullabilityQualifierWithMigrationStatus : NullabilityQualifierWithMigrationStatus.copy$default(nullabilityQualifierWithMigrationStatus, null, true, 1, null);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r5.equals("NEVER") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r5.equals("MAYBE") != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE, false, 2, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r5) {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.firstArgument(r5)
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue
            r1 = 0
            if (r0 != 0) goto L_0x000a
            r5 = r1
        L_0x000a:
            kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue r5 = (kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue) r5
            r0 = 2
            r2 = 0
            if (r5 == 0) goto L_0x005b
            kotlin.reflect.jvm.internal.impl.name.Name r5 = r5.getEnumEntryName()
            java.lang.String r5 = r5.asString()
            int r3 = r5.hashCode()
            switch(r3) {
                case 73135176: goto L_0x0049;
                case 74175084: goto L_0x0040;
                case 433141802: goto L_0x0030;
                case 1933739535: goto L_0x0020;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x0059
        L_0x0020:
            java.lang.String r3 = "ALWAYS"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0059
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r5.<init>(r3, r2, r0, r1)
            goto L_0x005a
        L_0x0030:
            java.lang.String r3 = "UNKNOWN"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0059
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r5.<init>(r3, r2, r0, r1)
            goto L_0x005a
        L_0x0040:
            java.lang.String r3 = "NEVER"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0059
            goto L_0x0051
        L_0x0049:
            java.lang.String r3 = "MAYBE"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0059
        L_0x0051:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            r5.<init>(r3, r2, r0, r1)
            goto L_0x005a
        L_0x0059:
            r5 = r1
        L_0x005a:
            return r5
        L_0x005b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r5.<init>(r3, r2, r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.extractNullabilityTypeFromArgument(kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus");
    }

    private final boolean hasDefaultValueInAnnotation(ValueParameterDescriptor valueParameterDescriptor, KotlinType kotlinType) {
        boolean z;
        AnnotationDefaultValue defaultValueFromAnnotation = UtilKt.getDefaultValueFromAnnotation(valueParameterDescriptor);
        if (defaultValueFromAnnotation instanceof StringDefaultValue) {
            z = UtilsKt.lexicalCastFrom(kotlinType, ((StringDefaultValue) defaultValueFromAnnotation).getValue()) != null;
        } else if (Intrinsics.areEqual((Object) defaultValueFromAnnotation, (Object) NullDefaultValue.INSTANCE)) {
            z = TypeUtils.acceptsNullable(kotlinType);
        } else if (defaultValueFromAnnotation == null) {
            z = valueParameterDescriptor.declaresDefaultValue();
        } else {
            throw new C12898l();
        }
        if (!z || !valueParameterDescriptor.getOverriddenDescriptors().isEmpty()) {
            return false;
        }
        return true;
    }

    private final SignatureParts parts(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z, LazyJavaResolverContext lazyJavaResolverContext, QualifierApplicabilityType qualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        KotlinType kotlinType = (KotlinType) function1.invoke(callableMemberDescriptor);
        Collection<CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkReturnedValueIsNotNull((Object) overriddenDescriptors, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) overriddenDescriptors, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : overriddenDescriptors) {
            Intrinsics.checkReturnedValueIsNotNull((Object) callableMemberDescriptor2, "it");
            arrayList.add((KotlinType) function1.invoke(callableMemberDescriptor2));
        }
        SignatureParts signatureParts = new SignatureParts(annotated, kotlinType, arrayList, z, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, ((KotlinType) function1.invoke(callableMemberDescriptor)).getAnnotations()), qualifierApplicabilityType);
        return signatureParts;
    }

    private final SignatureParts partsForValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        LazyJavaResolverContext lazyJavaResolverContext2;
        if (valueParameterDescriptor != null) {
            LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations());
            if (copyWithNewDefaultTypeQualifiers != null) {
                lazyJavaResolverContext2 = copyWithNewDefaultTypeQualifiers;
                return parts(callableMemberDescriptor, valueParameterDescriptor, false, lazyJavaResolverContext2, QualifierApplicabilityType.VALUE_PARAMETER, function1);
            }
        }
        lazyJavaResolverContext2 = lazyJavaResolverContext;
        return parts(callableMemberDescriptor, valueParameterDescriptor, false, lazyJavaResolverContext2, QualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext lazyJavaResolverContext, Collection<? extends D> collection) {
        ArrayList arrayList = new ArrayList(C13187p.m40525a((Iterable) collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), lazyJavaResolverContext));
        }
        return arrayList;
    }

    public final NullabilityQualifierWithMigrationStatus extractNullability(AnnotationDescriptor annotationDescriptor) {
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(annotationDescriptor);
        if (extractNullabilityFromKnownAnnotations != null) {
            return extractNullabilityFromKnownAnnotations;
        }
        AnnotationDescriptor resolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
        if (resolveTypeQualifierAnnotation != null) {
            ReportLevel resolveJsr305AnnotationState = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
            if (resolveJsr305AnnotationState.isIgnore()) {
                return null;
            }
            NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations2 = extractNullabilityFromKnownAnnotations(resolveTypeQualifierAnnotation);
            if (extractNullabilityFromKnownAnnotations2 != null) {
                nullabilityQualifierWithMigrationStatus = NullabilityQualifierWithMigrationStatus.copy$default(extractNullabilityFromKnownAnnotations2, null, resolveJsr305AnnotationState.isWarning(), 1, null);
            }
        }
        return nullabilityQualifierWithMigrationStatus;
    }
}
