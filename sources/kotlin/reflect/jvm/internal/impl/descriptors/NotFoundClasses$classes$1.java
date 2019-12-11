package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor;

/* compiled from: NotFoundClasses.kt */
final class NotFoundClasses$classes$1 extends C12881k implements Function1<ClassRequest, MockClassDescriptor> {
    final /* synthetic */ NotFoundClasses this$0;

    NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        this.this$0 = notFoundClasses;
        super(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (r1 != null) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.MockClassDescriptor invoke(kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses.ClassRequest r9) {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.impl.name.ClassId r0 = r9.component1()
            java.util.List r9 = r9.component2()
            boolean r1 = r0.isLocal()
            if (r1 != 0) goto L_0x0067
            kotlin.reflect.jvm.internal.impl.name.ClassId r1 = r0.getOuterClassId()
            if (r1 == 0) goto L_0x0027
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r2 = r8.this$0
            java.lang.String r3 = "outerClassId"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r3)
            r3 = 1
            java.util.List r3 = kotlin.p590y.C13199w.m40571c(r9, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r1 = r2.getClass(r1, r3)
            if (r1 == 0) goto L_0x0027
            goto L_0x003c
        L_0x0027:
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r1 = r8.this$0
            kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull r1 = r1.packageFragments
            kotlin.reflect.jvm.internal.impl.name.FqName r2 = r0.getPackageFqName()
            java.lang.String r3 = "classId.packageFqName"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r2, r3)
            java.lang.Object r1 = r1.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassOrPackageFragmentDescriptor) r1
        L_0x003c:
            r4 = r1
            boolean r6 = r0.isNestedClass()
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$MockClassDescriptor r1 = new kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$MockClassDescriptor
            kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses r2 = r8.this$0
            kotlin.reflect.jvm.internal.impl.storage.StorageManager r3 = r2.storageManager
            kotlin.reflect.jvm.internal.impl.name.Name r5 = r0.getShortClassName()
            java.lang.String r0 = "classId.shortClassName"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r5, r0)
            java.lang.Object r9 = kotlin.p590y.C13199w.m40591g(r9)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L_0x0060
            int r9 = r9.intValue()
            r7 = r9
            goto L_0x0062
        L_0x0060:
            r9 = 0
            r7 = 0
        L_0x0062:
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            return r1
        L_0x0067:
            java.lang.UnsupportedOperationException r9 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unresolved local class: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$classes$1.invoke(kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$ClassRequest):kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses$MockClassDescriptor");
    }
}
