package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: utils.kt */
public final class UtilsKt {
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Float] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v7, types: [java.lang.Short] */
    /* JADX WARNING: type inference failed for: r5v8, types: [java.lang.Byte] */
    /* JADX WARNING: type inference failed for: r5v9, types: [java.lang.Character] */
    /* JADX WARNING: type inference failed for: r5v10, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r4) != false) goto L_0x00b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue lexicalCastFrom(kotlin.reflect.jvm.internal.impl.types.KotlinType r4, java.lang.String r5) {
        /*
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r0 = r4.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r0 = r0.getDeclarationDescriptor()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            r2 = 0
            if (r1 == 0) goto L_0x003e
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r1 = r0.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            if (r1 != r3) goto L_0x003e
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r4 = r0.getUnsubstitutedInnerClassesScope()
            kotlin.reflect.jvm.internal.impl.name.Name r5 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r5)
            java.lang.String r0 = "Name.identifier(value)"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r0)
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r0 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_BACKEND
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r4 = r4.getContributedClassifier(r5, r0)
            boolean r5 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r5 == 0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = r4.getKind()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r0 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r5 != r0) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.load.java.EnumEntry r2 = new kotlin.reflect.jvm.internal.impl.load.java.EnumEntry
            r2.<init>(r4)
        L_0x003d:
            return r2
        L_0x003e:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNotNullable(r4)
            kotlin.reflect.jvm.internal.impl.utils.NumberWithRadix r0 = kotlin.reflect.jvm.internal.impl.utils.NumbersKt.extractRadix(r5)
            java.lang.String r1 = r0.component1()
            int r0 = r0.component2()
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBoolean(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r3 == 0) goto L_0x005d
            boolean r4 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x005d:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isChar(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r3 == 0) goto L_0x0068
            java.lang.Character r5 = kotlin.p588j0.C12839z.m40189h(r5)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x0068:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isByte(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r3 == 0) goto L_0x0073
            java.lang.Byte r5 = kotlin.p588j0.C12831v.m40107a(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x0073:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isShort(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r3 == 0) goto L_0x007e
            java.lang.Short r5 = kotlin.p588j0.C12831v.m40111d(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x007e:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isInt(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r3 == 0) goto L_0x0089
            java.lang.Integer r5 = kotlin.p588j0.C12831v.m40108b(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x0089:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isLong(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r3 == 0) goto L_0x0094
            java.lang.Long r5 = kotlin.p588j0.C12831v.m40109c(r1, r0)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x0094:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isFloat(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r0 == 0) goto L_0x009f
            java.lang.Float r5 = kotlin.p588j0.C12830u.m40106b(r5)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x009f:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isDouble(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r0 == 0) goto L_0x00aa
            java.lang.Double r5 = kotlin.p588j0.C12830u.m40105a(r5)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            goto L_0x00b2
        L_0x00aa:
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isString(r4)     // Catch:{ IllegalArgumentException -> 0x00b1 }
            if (r4 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r5 = r2
        L_0x00b2:
            if (r5 == 0) goto L_0x00b9
            kotlin.reflect.jvm.internal.impl.load.java.Constant r2 = new kotlin.reflect.jvm.internal.impl.load.java.Constant
            r2.<init>(r5)
        L_0x00b9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.UtilsKt.lexicalCastFrom(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.lang.String):kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultValue");
    }
}
