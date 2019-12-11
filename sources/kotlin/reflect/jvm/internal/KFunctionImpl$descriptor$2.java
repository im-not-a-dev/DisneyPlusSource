package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KFunctionImpl.kt */
final class KFunctionImpl$descriptor$2 extends C12881k implements Function0<FunctionDescriptor> {
    final /* synthetic */ String $name;
    final /* synthetic */ KFunctionImpl this$0;

    KFunctionImpl$descriptor$2(KFunctionImpl kFunctionImpl, String str) {
        this.this$0 = kFunctionImpl;
        this.$name = str;
        super(0);
    }

    public final FunctionDescriptor invoke() {
        return this.this$0.getContainer().findFunctionDescriptor(this.$name, this.this$0.signature);
    }
}
