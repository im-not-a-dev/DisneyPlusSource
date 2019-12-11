package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2 */
/* compiled from: AnnotationConstructorCaller.kt */
final class C12916xa743ec88 extends C12881k implements Function0<Integer> {
    final /* synthetic */ Map $values;

    C12916xa743ec88(Map map) {
        this.$values = map;
        super(0);
    }

    public final int invoke() {
        int i;
        int i2 = 0;
        for (Entry entry : this.$values.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof boolean[]) {
                i = Arrays.hashCode((boolean[]) value);
            } else if (value instanceof char[]) {
                i = Arrays.hashCode((char[]) value);
            } else if (value instanceof byte[]) {
                i = Arrays.hashCode((byte[]) value);
            } else if (value instanceof short[]) {
                i = Arrays.hashCode((short[]) value);
            } else if (value instanceof int[]) {
                i = Arrays.hashCode((int[]) value);
            } else if (value instanceof float[]) {
                i = Arrays.hashCode((float[]) value);
            } else if (value instanceof long[]) {
                i = Arrays.hashCode((long[]) value);
            } else if (value instanceof double[]) {
                i = Arrays.hashCode((double[]) value);
            } else if (value instanceof Object[]) {
                i = Arrays.hashCode((Object[]) value);
            } else {
                i = value.hashCode();
            }
            i2 += i ^ (str.hashCode() * 127);
        }
        return i2;
    }
}
