package kotlin.reflect.jvm.internal.calls;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, mo31007d2 = {"<anonymous>", "", "T", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2 */
/* compiled from: AnnotationConstructorCaller.kt */
final class C12917x4fc4299 extends C12881k implements Function0<String> {
    final /* synthetic */ Class $annotationClass;
    final /* synthetic */ Map $values;

    C12917x4fc4299(Class cls, Map map) {
        this.$annotationClass = cls;
        this.$values = map;
        super(0);
    }

    public final String invoke() {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append(this.$annotationClass.getCanonicalName());
        StringBuilder sb2 = sb;
        C13199w.m40557a(this.$values.entrySet(), sb2, ", ", "(", ")", 0, null, C12918xd18867f3.INSTANCE, 48, null);
        String sb3 = sb.toString();
        C12880j.m40222a((Object) sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
