package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;

/* compiled from: RawType.kt */
final class RawTypeImpl$render$1 extends C12881k implements Function2<String, String, Boolean> {
    public static final RawTypeImpl$render$1 INSTANCE = new RawTypeImpl$render$1();

    RawTypeImpl$render$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(invoke((String) obj, (String) obj2));
    }

    public final boolean invoke(String str, String str2) {
        return Intrinsics.areEqual((Object) str, (Object) C12833x.m40137a(str2, (CharSequence) "out ")) || Intrinsics.areEqual((Object) str2, (Object) "*");
    }
}
