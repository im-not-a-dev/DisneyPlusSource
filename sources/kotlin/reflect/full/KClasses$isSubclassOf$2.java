package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.KClass;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KClass;", "kotlin.jvm.PlatformType", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KClasses.kt */
final class KClasses$isSubclassOf$2 extends C12881k implements Function1<KClass<?>, Boolean> {
    final /* synthetic */ KClass $base;

    KClasses$isSubclassOf$2(KClass kClass) {
        this.$base = kClass;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((KClass) obj));
    }

    public final boolean invoke(KClass<?> kClass) {
        return C12880j.m40224a((Object) kClass, (Object) this.$base);
    }
}
