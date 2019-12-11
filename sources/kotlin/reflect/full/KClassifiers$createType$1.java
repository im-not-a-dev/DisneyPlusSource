package kotlin.reflect.full;

import kotlin.C12899m;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KClassifier;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"<anonymous>", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassifiers.kt */
final class KClassifiers$createType$1 extends C12881k implements Function0 {
    final /* synthetic */ KClassifier $this_createType;

    KClassifiers$createType$1(KClassifier kClassifier) {
        this.$this_createType = kClassifier;
        super(0);
    }

    public final Void invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("Java type is not yet supported for types created with createType (classifier = ");
        sb.append(this.$this_createType);
        sb.append(')');
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("An operation is not implemented: ");
        sb3.append(sb2);
        throw new C12899m(sb3.toString());
    }
}
