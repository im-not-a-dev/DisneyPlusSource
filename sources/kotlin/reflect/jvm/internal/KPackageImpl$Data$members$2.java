package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPackageImpl.kt */
final class KPackageImpl$Data$members$2 extends C12881k implements Function0<Collection<? extends KCallableImpl<?>>> {
    final /* synthetic */ Data this$0;

    KPackageImpl$Data$members$2(Data data) {
        this.this$0 = data;
        super(0);
    }

    public final Collection<KCallableImpl<?>> invoke() {
        Data data = this.this$0;
        return KPackageImpl.this.getMembers(data.getScope(), MemberBelonginess.DECLARED);
    }
}
