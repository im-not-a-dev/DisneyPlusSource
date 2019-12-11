package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12880j;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: RuntimeTypeMapper.kt */
final class JvmFunctionSignature$JavaConstructor$asString$1 extends C12881k implements Function1<Class<?>, String> {
    public static final JvmFunctionSignature$JavaConstructor$asString$1 INSTANCE = new JvmFunctionSignature$JavaConstructor$asString$1();

    JvmFunctionSignature$JavaConstructor$asString$1() {
        super(1);
    }

    public final String invoke(Class<?> cls) {
        C12880j.m40222a((Object) cls, "it");
        return ReflectClassUtilKt.getDesc(cls);
    }
}
