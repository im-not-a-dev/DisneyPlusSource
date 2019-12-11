package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* compiled from: ConstantValueFactory.kt */
public final class ConstantValueFactory {
    public static final ConstantValueFactory INSTANCE = new ConstantValueFactory();

    private ConstantValueFactory() {
    }

    public final ArrayValue createArrayValue(List<? extends ConstantValue<?>> list, KotlinType kotlinType) {
        return new ArrayValue(list, new ConstantValueFactory$createArrayValue$1(kotlinType));
    }

    public final ConstantValue<?> createConstantValue(Object obj) {
        if (obj instanceof Byte) {
            return new ByteValue(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new ShortValue(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new IntValue(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new LongValue(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new CharValue(((Character) obj).charValue());
        }
        if (obj instanceof Float) {
            return new FloatValue(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new DoubleValue(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new BooleanValue(((Boolean) obj).booleanValue());
        }
        if (obj instanceof String) {
            return new StringValue((String) obj);
        }
        if (obj instanceof byte[]) {
            return createArrayValue(C13174k.m40373a((byte[]) obj), PrimitiveType.BYTE);
        }
        if (obj instanceof short[]) {
            return createArrayValue(C13174k.m40378a((short[]) obj), PrimitiveType.SHORT);
        }
        if (obj instanceof int[]) {
            return createArrayValue(C13174k.m40399c((int[]) obj), PrimitiveType.INT);
        }
        if (obj instanceof long[]) {
            return createArrayValue(C13174k.m40375a((long[]) obj), PrimitiveType.LONG);
        }
        if (obj instanceof char[]) {
            return createArrayValue(C13174k.m40386b((char[]) obj), PrimitiveType.CHAR);
        }
        if (obj instanceof float[]) {
            return createArrayValue(C13174k.m40388b((float[]) obj), PrimitiveType.FLOAT);
        }
        if (obj instanceof double[]) {
            return createArrayValue(C13174k.m40374a((double[]) obj), PrimitiveType.DOUBLE);
        }
        if (obj instanceof boolean[]) {
            return createArrayValue(C13174k.m40379a((boolean[]) obj), PrimitiveType.BOOLEAN);
        }
        if (obj == null) {
            return new NullValue();
        }
        return null;
    }

    private final ArrayValue createArrayValue(List<?> list, PrimitiveType primitiveType) {
        List<Object> q = C13199w.m40606q(list);
        ArrayList arrayList = new ArrayList();
        for (Object createConstantValue : q) {
            ConstantValue createConstantValue2 = createConstantValue(createConstantValue);
            if (createConstantValue2 != null) {
                arrayList.add(createConstantValue2);
            }
        }
        return new ArrayValue(arrayList, new ConstantValueFactory$createArrayValue$3(primitiveType));
    }
}
