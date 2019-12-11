package kotlin.reflect.jvm.internal.structure;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: ReflectJavaClass.kt */
final class ReflectJavaClass$innerClassNames$2 extends C12881k implements Function1<Class<?>, Name> {
    public static final ReflectJavaClass$innerClassNames$2 INSTANCE = new ReflectJavaClass$innerClassNames$2();

    ReflectJavaClass$innerClassNames$2() {
        super(1);
    }

    public final Name invoke(Class<?> cls) {
        Intrinsics.checkReturnedValueIsNotNull((Object) cls, "it");
        String simpleName = cls.getSimpleName();
        if (!Name.isValidIdentifier(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return Name.identifier(simpleName);
        }
        return null;
    }
}
