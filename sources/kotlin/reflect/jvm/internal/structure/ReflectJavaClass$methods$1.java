package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "method", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClass.kt */
final class ReflectJavaClass$methods$1 extends C12881k implements Function1<Method, Boolean> {
    final /* synthetic */ ReflectJavaClass this$0;

    ReflectJavaClass$methods$1(ReflectJavaClass reflectJavaClass) {
        this.this$0 = reflectJavaClass;
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Method) obj));
    }

    public final boolean invoke(Method method) {
        C12880j.m40222a((Object) method, "method");
        return !method.isSynthetic() && (!this.this$0.isEnum() || !this.this$0.isEnumValuesOrValueOf(method));
    }
}
