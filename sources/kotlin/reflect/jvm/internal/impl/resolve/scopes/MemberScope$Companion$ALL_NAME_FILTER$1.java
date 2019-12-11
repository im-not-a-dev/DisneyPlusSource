package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* compiled from: MemberScope.kt */
final class MemberScope$Companion$ALL_NAME_FILTER$1 extends C12881k implements Function1<Name, Boolean> {
    public static final MemberScope$Companion$ALL_NAME_FILTER$1 INSTANCE = new MemberScope$Companion$ALL_NAME_FILTER$1();

    MemberScope$Companion$ALL_NAME_FILTER$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((Name) obj));
    }

    public final boolean invoke(Name name) {
        return true;
    }
}
