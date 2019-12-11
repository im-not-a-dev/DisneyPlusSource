package kotlin.reflect.full;

import kotlin.C12899m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
final class KClasses$allSupertypes$1$1$1$1 extends C12881k implements Function0 {
    public static final KClasses$allSupertypes$1$1$1$1 INSTANCE = new KClasses$allSupertypes$1$1$1$1();

    KClasses$allSupertypes$1$1$1$1() {
        super(0);
    }

    public final Void invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("An operation is not implemented: ");
        sb.append("Java type for supertype");
        throw new C12899m(sb.toString());
    }
}
