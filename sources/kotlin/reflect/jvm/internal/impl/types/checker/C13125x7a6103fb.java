package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 */
/* compiled from: IntersectionType.kt */
final class C13125x7a6103fb extends C12881k implements Function0<String> {
    final /* synthetic */ Set $inputTypes;

    C13125x7a6103fb(Set set) {
        this.$inputTypes = set;
        super(0);
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append("This collections cannot be empty! input types: ");
        sb.append(C13199w.m40559a(this.$inputTypes, null, null, null, 0, null, null, 63, null));
        return sb.toString();
    }
}
