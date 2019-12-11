package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.BuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 */
/* compiled from: specialBuiltinMembers.kt */
final class C12966xbe16cae4 extends C12881k implements Function1<CallableMemberDescriptor, Boolean> {
    public static final C12966xbe16cae4 INSTANCE = new C12966xbe16cae4();

    C12966xbe16cae4() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((CallableMemberDescriptor) obj));
    }

    public final boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return BuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(callableMemberDescriptor);
    }
}
