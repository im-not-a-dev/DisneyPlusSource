package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0006\b\u0000\u0010\u0003 \u0001H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KCallableImpl.kt */
final class KCallableImpl$_annotations$1 extends C12881k implements Function0<List<? extends Annotation>> {
    final /* synthetic */ KCallableImpl this$0;

    KCallableImpl$_annotations$1(KCallableImpl kCallableImpl) {
        this.this$0 = kCallableImpl;
        super(0);
    }

    public final List<Annotation> invoke() {
        return UtilKt.computeAnnotations(this.this$0.getDescriptor());
    }
}
