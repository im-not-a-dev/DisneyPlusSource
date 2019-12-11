package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors;

@Metadata(mo31005bv = {1, 0, 3}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
final class KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0 implements Neighbors {
    private final /* synthetic */ Function1 function;

    KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0(Function1 function1) {
        this.function = function1;
    }

    public final /* synthetic */ Iterable getNeighbors(Object obj) {
        return (Iterable) this.function.invoke(obj);
    }
}
