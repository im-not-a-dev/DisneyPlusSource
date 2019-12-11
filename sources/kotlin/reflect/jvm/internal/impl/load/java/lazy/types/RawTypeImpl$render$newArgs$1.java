package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$newArgs$1 extends C12881k implements Function1<String, String> {
    public static final RawTypeImpl$render$newArgs$1 INSTANCE = new RawTypeImpl$render$newArgs$1();

    RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    public final String invoke(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("(raw) ");
        sb.append(str);
        return sb.toString();
    }
}
