package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: descriptorUtil.kt */
public final class DescriptorUtilKt {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor resolveClassByFqName(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r5, kotlin.reflect.jvm.internal.impl.name.FqName r6, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation r7) {
        /*
            boolean r0 = r6.isRoot()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r6.parent()
            java.lang.String r2 = "fqName.parent()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor r0 = r5.getPackage(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r0 = r0.getMemberScope()
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r6.shortName()
            java.lang.String r4 = "fqName.shortName()"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r3, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r0 = r0.getContributedClassifier(r3, r7)
            boolean r3 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r3 != 0) goto L_0x002b
            r0 = r1
        L_0x002b:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
            if (r0 == 0) goto L_0x0030
            return r0
        L_0x0030:
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = r6.parent()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = resolveClassByFqName(r5, r0, r7)
            if (r5 == 0) goto L_0x004f
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r5 = r5.getUnsubstitutedInnerClassesScope()
            if (r5 == 0) goto L_0x004f
            kotlin.reflect.jvm.internal.impl.name.Name r6 = r6.shortName()
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.getContributedClassifier(r6, r7)
            goto L_0x0050
        L_0x004f:
            r5 = r1
        L_0x0050:
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r6 != 0) goto L_0x0055
            r5 = r1
        L_0x0055:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt.resolveClassByFqName(kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor, kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation):kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor");
    }
}
