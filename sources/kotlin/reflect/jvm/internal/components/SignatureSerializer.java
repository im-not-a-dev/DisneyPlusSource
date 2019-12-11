package kotlin.reflect.jvm.internal.components;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C12880j;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/components/SignatureSerializer;", "", "()V", "constructorDesc", "", "constructor", "Ljava/lang/reflect/Constructor;", "fieldDesc", "field", "Ljava/lang/reflect/Field;", "methodDesc", "method", "Ljava/lang/reflect/Method;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectKotlinClass.kt */
final class SignatureSerializer {
    public static final SignatureSerializer INSTANCE = new SignatureSerializer();

    private SignatureSerializer() {
    }

    public final String constructorDesc(Constructor<?> constructor) {
        Class[] parameterTypes;
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : constructor.getParameterTypes()) {
            C12880j.m40222a((Object) cls, "parameterType");
            sb.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb.append(")V");
        String sb2 = sb.toString();
        C12880j.m40222a((Object) sb2, "sb.toString()");
        return sb2;
    }

    public final String fieldDesc(Field field) {
        Class type = field.getType();
        C12880j.m40222a((Object) type, "field.type");
        return ReflectClassUtilKt.getDesc(type);
    }

    public final String methodDesc(Method method) {
        Class[] parameterTypes;
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (Class cls : method.getParameterTypes()) {
            C12880j.m40222a((Object) cls, "parameterType");
            sb.append(ReflectClassUtilKt.getDesc(cls));
        }
        sb.append(")");
        Class returnType = method.getReturnType();
        C12880j.m40222a((Object) returnType, "method.returnType");
        sb.append(ReflectClassUtilKt.getDesc(returnType));
        String sb2 = sb.toString();
        C12880j.m40222a((Object) sb2, "sb.toString()");
        return sb2;
    }
}
