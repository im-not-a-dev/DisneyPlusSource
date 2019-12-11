package kotlin.reflect.jvm.internal;

import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo31007d2 = {"signature", "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, mo31008k = 2, mo31009mv = {1, 1, 15})
/* compiled from: RuntimeTypeMapper.kt */
public final class RuntimeTypeMapperKt {
    /* access modifiers changed from: private */
    public static final String getSignature(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append(method.getName());
        Class[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkReturnedValueIsNotNull((Object) parameterTypes, "parameterTypes");
        sb.append(C13174k.m40371a(parameterTypes, "", "(", ")", 0, null, RuntimeTypeMapperKt$signature$1.INSTANCE, 24, null));
        Class returnType = method.getReturnType();
        Intrinsics.checkReturnedValueIsNotNull((Object) returnType, "returnType");
        sb.append(ReflectClassUtilKt.getDesc(returnType));
        return sb.toString();
    }
}
