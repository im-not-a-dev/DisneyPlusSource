package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

/* compiled from: modifierChecks.kt */
final class OperatorChecks$checks$2 extends C12881k implements Function1<FunctionDescriptor, String> {
    public static final OperatorChecks$checks$2 INSTANCE = new OperatorChecks$checks$2();

    OperatorChecks$checks$2() {
        super(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r6) {
        /*
            r5 = this;
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1 r0 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.C131351.INSTANCE
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r1 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.INSTANCE
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r1 = r6.getContainingDeclaration()
            java.lang.String r2 = "containingDeclaration"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r1, r2)
            boolean r0 = r0.invoke(r1)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0055
            java.util.Collection r6 = r6.getOverriddenDescriptors()
            java.lang.String r0 = "overriddenDescriptors"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r6, r0)
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x002a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x002a
        L_0x0028:
            r6 = 0
            goto L_0x0051
        L_0x002a:
            java.util.Iterator r6 = r6.iterator()
        L_0x002e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r6.next()
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2$1 r3 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.C131351.INSTANCE
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r0.getContainingDeclaration()
            java.lang.String r4 = "it.containingDeclaration"
            kotlin.jvm.internal.Intrinsics.checkReturnedValueIsNotNull(r0, r4)
            boolean r0 = r3.invoke(r0)
            if (r0 == 0) goto L_0x002e
            r6 = 1
        L_0x0051:
            if (r6 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 != 0) goto L_0x005a
            java.lang.String r6 = "must override ''equals()'' in Any"
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.OperatorChecks$checks$2.invoke(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor):java.lang.String");
    }
}
