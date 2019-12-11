package kotlin.reflect.jvm.internal;

import kotlin.C12899m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, mo31007d2 = {"<anonymous>", "", "invoke", "kotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2$1$1"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KTypeParameterImpl.kt */
final class KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1 extends C12881k implements Function0 {
    final /* synthetic */ KTypeParameterImpl$upperBounds$2 this$0;

    KTypeParameterImpl$upperBounds$2$$special$$inlined$map$lambda$1(KTypeParameterImpl$upperBounds$2 kTypeParameterImpl$upperBounds$2) {
        this.this$0 = kTypeParameterImpl$upperBounds$2;
        super(0);
    }

    public final Void invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Java type is not yet supported for type parameters: ");
        sb.append(this.this$0.this$0.getDescriptor());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("An operation is not implemented: ");
        sb3.append(sb2);
        throw new C12899m(sb3.toString());
    }
}
