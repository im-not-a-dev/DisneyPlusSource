package kotlin.reflect.jvm.internal.structure;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.structure.ReflectJavaType.Factory;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, mo31007d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaArrayType;", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaArrayType;", "reflectType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "componentType", "getComponentType", "()Lkotlin/reflect/jvm/internal/structure/ReflectJavaType;", "getReflectType", "()Ljava/lang/reflect/Type;", "descriptors.runtime"}, mo31008k = 1, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaArrayType.kt */
public final class ReflectJavaArrayType extends ReflectJavaType implements JavaArrayType {
    private final ReflectJavaType componentType;
    private final Type reflectType;

    public ReflectJavaArrayType(Type type) {
        ReflectJavaType reflectJavaType;
        this.reflectType = type;
        Type reflectType2 = getReflectType();
        if (reflectType2 instanceof GenericArrayType) {
            Factory factory = ReflectJavaType.Factory;
            Type genericComponentType = ((GenericArrayType) reflectType2).getGenericComponentType();
            Intrinsics.checkReturnedValueIsNotNull((Object) genericComponentType, "genericComponentType");
            reflectJavaType = factory.create(genericComponentType);
        } else {
            if (reflectType2 instanceof Class) {
                Class cls = (Class) reflectType2;
                if (cls.isArray()) {
                    Factory factory2 = ReflectJavaType.Factory;
                    Class componentType2 = cls.getComponentType();
                    Intrinsics.checkReturnedValueIsNotNull((Object) componentType2, "getComponentType()");
                    reflectJavaType = factory2.create(componentType2);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Not an array type (");
            sb.append(getReflectType().getClass());
            sb.append("): ");
            sb.append(getReflectType());
            throw new IllegalArgumentException(sb.toString());
        }
        this.componentType = reflectJavaType;
    }

    /* access modifiers changed from: protected */
    public Type getReflectType() {
        return this.reflectType;
    }

    public ReflectJavaType getComponentType() {
        return this.componentType;
    }
}
