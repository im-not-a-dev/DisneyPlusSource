package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12881k;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$3 extends C12881k implements Function2<String, String, String> {
    public static final RawTypeImpl$render$3 INSTANCE = new RawTypeImpl$render$3();

    RawTypeImpl$render$3() {
        super(2);
    }

    public final String invoke(String str, String str2) {
        if (!C12833x.m40151a((CharSequence) str, '<', false, 2, (Object) null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C12833x.m40174c(str, '<', (String) null, 2, (Object) null));
        sb.append('<');
        sb.append(str2);
        sb.append('>');
        sb.append(C12833x.m40161b(str, '>', (String) null, 2, (Object) null));
        return sb.toString();
    }
}
