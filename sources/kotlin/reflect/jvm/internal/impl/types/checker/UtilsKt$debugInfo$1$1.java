package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

/* compiled from: utils.kt */
final class UtilsKt$debugInfo$1$1 extends C12881k implements Function1<String, StringBuilder> {
    final /* synthetic */ StringBuilder $this_buildString;

    UtilsKt$debugInfo$1$1(StringBuilder sb) {
        this.$this_buildString = sb;
        super(1);
    }

    public final StringBuilder invoke(String str) {
        StringBuilder sb = this.$this_buildString;
        sb.append(str);
        Intrinsics.checkReturnedValueIsNotNull((Object) sb, "append(value)");
        C12828s.m40102a(sb);
        return sb;
    }
}
