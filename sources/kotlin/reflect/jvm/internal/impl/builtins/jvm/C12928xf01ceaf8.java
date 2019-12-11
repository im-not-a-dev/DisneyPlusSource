package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsSettings$createMockJavaIoSerializableType$superTypes$1 */
/* compiled from: JvmBuiltInsSettings.kt */
final class C12928xf01ceaf8 extends C12881k implements Function0<SimpleType> {
    final /* synthetic */ JvmBuiltInsSettings this$0;

    C12928xf01ceaf8(JvmBuiltInsSettings jvmBuiltInsSettings) {
        this.this$0 = jvmBuiltInsSettings;
        super(0);
    }

    public final SimpleType invoke() {
        SimpleType anyType = this.this$0.moduleDescriptor.getBuiltIns().getAnyType();
        Intrinsics.checkReturnedValueIsNotNull((Object) anyType, "moduleDescriptor.builtIns.anyType");
        return anyType;
    }
}
