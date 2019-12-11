package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KClassImpl;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Ljava/lang/Class;", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
final class KClasses$defaultType$1 extends C12881k implements Function0<Class<? extends Object>> {
    final /* synthetic */ KClass $this_defaultType;

    KClasses$defaultType$1(KClass kClass) {
        this.$this_defaultType = kClass;
        super(0);
    }

    public final Class<? extends Object> invoke() {
        return ((KClassImpl) this.$this_defaultType).getJClass();
    }
}
