package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.C13145v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtilsKt$selectMostSpecificInEachOverridableGroup$overridableGroup$1 */
/* compiled from: overridingUtils.kt */
final class C13101x410e6287 extends C12881k implements Function1<H, C13145v> {
    final /* synthetic */ SmartSet $conflictedHandles;

    C13101x410e6287(SmartSet smartSet) {
        this.$conflictedHandles = smartSet;
        super(1);
    }

    public final void invoke(H h) {
        SmartSet smartSet = this.$conflictedHandles;
        Intrinsics.checkReturnedValueIsNotNull((Object) h, "it");
        smartSet.add(h);
    }
}
