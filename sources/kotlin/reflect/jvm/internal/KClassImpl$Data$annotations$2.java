package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KClassImpl.Data;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClassImpl.kt */
final class KClassImpl$Data$annotations$2 extends C12881k implements Function0<List<? extends Annotation>> {
    final /* synthetic */ Data this$0;

    KClassImpl$Data$annotations$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final List<Annotation> invoke() {
        return UtilKt.computeAnnotations(this.this$0.getDescriptor());
    }
}
