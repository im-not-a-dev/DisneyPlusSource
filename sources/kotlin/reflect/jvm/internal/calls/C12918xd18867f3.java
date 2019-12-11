package kotlin.reflect.jvm.internal.calls;

import java.util.Arrays;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010&\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "T", "", "entry", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1 */
/* compiled from: AnnotationConstructorCaller.kt */
final class C12918xd18867f3 extends C12881k implements Function1<Entry<? extends String, ? extends Object>, String> {
    public static final C12918xd18867f3 INSTANCE = new C12918xd18867f3();

    C12918xd18867f3() {
        super(1);
    }

    public final String invoke(Entry<String, ? extends Object> entry) {
        String str;
        String str2 = (String) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof boolean[]) {
            str = Arrays.toString((boolean[]) value);
        } else if (value instanceof char[]) {
            str = Arrays.toString((char[]) value);
        } else if (value instanceof byte[]) {
            str = Arrays.toString((byte[]) value);
        } else if (value instanceof short[]) {
            str = Arrays.toString((short[]) value);
        } else if (value instanceof int[]) {
            str = Arrays.toString((int[]) value);
        } else if (value instanceof float[]) {
            str = Arrays.toString((float[]) value);
        } else if (value instanceof long[]) {
            str = Arrays.toString((long[]) value);
        } else if (value instanceof double[]) {
            str = Arrays.toString((double[]) value);
        } else if (value instanceof Object[]) {
            str = Arrays.toString((Object[]) value);
        } else {
            str = value.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append('=');
        sb.append(str);
        return sb.toString();
    }
}
