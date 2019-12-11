package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* compiled from: utils.kt */
public final class UtilsKt {
    private static final KotlinType approximate(KotlinType kotlinType) {
        return (KotlinType) CapturedTypeApproximationKt.approximateCapturedTypes(kotlinType).getUpper();
    }

    private static final String debugInfo(TypeConstructor typeConstructor) {
        StringBuilder sb = new StringBuilder();
        UtilsKt$debugInfo$1$1 utilsKt$debugInfo$1$1 = new UtilsKt$debugInfo$1$1(sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type: ");
        sb2.append(typeConstructor);
        utilsKt$debugInfo$1$1.invoke(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hashCode: ");
        sb3.append(typeConstructor.hashCode());
        utilsKt$debugInfo$1$1.invoke(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        String str = "javaClass: ";
        sb4.append(str);
        sb4.append(typeConstructor.getClass().getCanonicalName());
        utilsKt$debugInfo$1$1.invoke(sb4.toString());
        for (DeclarationDescriptor declarationDescriptor = typeConstructor.getDeclarationDescriptor(); declarationDescriptor != null; declarationDescriptor = declarationDescriptor.getContainingDeclaration()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("fqName: ");
            sb5.append(DescriptorRenderer.FQ_NAMES_IN_TYPES.render(declarationDescriptor));
            utilsKt$debugInfo$1$1.invoke(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(declarationDescriptor.getClass().getCanonicalName());
            utilsKt$debugInfo$1$1.invoke(sb6.toString());
        }
        String sb7 = sb.toString();
        Intrinsics.checkReturnedValueIsNotNull((Object) sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType r9, kotlin.reflect.jvm.internal.impl.types.KotlinType r10, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks r11) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode r1 = new kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode
            r2 = 0
            r1.<init>(r9, r2)
            r0.add(r1)
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r9 = r10.getConstructor()
        L_0x0012:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto L_0x011c
            java.lang.Object r10 = r0.poll()
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode r10 = (kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode) r10
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r10.getType()
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r1.getConstructor()
            boolean r4 = r11.assertEqualTypeConstructors(r3, r9)
            if (r4 == 0) goto L_0x00fa
            boolean r0 = r1.isMarkedNullable()
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode r10 = r10.getPrevious()
        L_0x0034:
            if (r10 == 0) goto L_0x00ae
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r10.getType()
            java.util.List r4 = r3.getArguments()
            boolean r5 = r4 instanceof java.util.Collection
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L_0x004c
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x004c
        L_0x004a:
            r4 = 0
            goto L_0x006a
        L_0x004c:
            java.util.Iterator r4 = r4.iterator()
        L_0x0050:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004a
            java.lang.Object r5 = r4.next()
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r5 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r5
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r5.getProjectionKind()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r5 == r8) goto L_0x0066
            r5 = 1
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            if (r5 == 0) goto L_0x0050
            r4 = 1
        L_0x006a:
            java.lang.String r5 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)"
            if (r4 == 0) goto L_0x008a
            kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion r4 = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitution r4 = r4.create(r3)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitution r4 = kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(r4, r7, r6, r2)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r4 = r4.buildSubstitutor()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r4.safeSubstitute(r1, r8)
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r5)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = approximate(r1)
            goto L_0x009d
        L_0x008a:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion r4 = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitution r4 = r4.create(r3)
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor r4 = r4.buildSubstitutor()
            kotlin.reflect.jvm.internal.impl.types.Variance r8 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r4.safeSubstitute(r1, r8)
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r5)
        L_0x009d:
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r3.isMarkedNullable()
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r0 = 0
            goto L_0x00a9
        L_0x00a8:
            r0 = 1
        L_0x00a9:
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode r10 = r10.getPrevious()
            goto L_0x0034
        L_0x00ae:
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r10 = r1.getConstructor()
            boolean r2 = r11.assertEqualTypeConstructors(r10, r9)
            if (r2 == 0) goto L_0x00bd
            kotlin.reflect.jvm.internal.impl.types.KotlinType r9 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNullableAsSpecified(r1, r0)
            return r9
        L_0x00bd:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Type constructors should be equals!\n"
            r1.append(r2)
            java.lang.String r2 = "substitutedSuperType: "
            r1.append(r2)
            java.lang.String r2 = debugInfo(r10)
            r1.append(r2)
            java.lang.String r2 = ", \n\n"
            r1.append(r2)
            java.lang.String r2 = "supertype: "
            r1.append(r2)
            java.lang.String r2 = debugInfo(r9)
            r1.append(r2)
            java.lang.String r2 = " \n"
            r1.append(r2)
            boolean r9 = r11.assertEqualTypeConstructors(r10, r9)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x00fa:
            java.util.Collection r1 = r3.getSupertypes()
            java.util.Iterator r1 = r1.iterator()
        L_0x0102:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0012
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
            kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode r4 = new kotlin.reflect.jvm.internal.impl.types.checker.SubtypePathNode
            java.lang.String r5 = "immediateSupertype"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r5)
            r4.<init>(r3, r10)
            r0.add(r4)
            goto L_0x0102
        L_0x011c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt.findCorrespondingSupertype(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedureCallbacks):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }
}
