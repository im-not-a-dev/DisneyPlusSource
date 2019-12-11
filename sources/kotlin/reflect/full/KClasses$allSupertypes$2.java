package kotlin.reflect.full;

import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandlerWithListResult;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo31007d2 = {"kotlin/reflect/full/KClasses$allSupertypes$2", "Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandlerWithListResult;", "Lkotlin/reflect/KType;", "beforeChildren", "", "current", "kotlin-reflection"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
public final class KClasses$allSupertypes$2 extends NodeHandlerWithListResult<KType, KType> {
    KClasses$allSupertypes$2() {
    }

    public boolean beforeChildren(KType kType) {
        ((LinkedList) this.result).add(kType);
        return true;
    }
}
