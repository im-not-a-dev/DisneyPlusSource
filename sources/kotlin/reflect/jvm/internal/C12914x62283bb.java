package kotlin.reflect.jvm.internal;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, mo31007d2 = {"<anonymous>", "", "first", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "kotlin.jvm.PlatformType", "second", "compare"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* renamed from: kotlin.reflect.jvm.internal.KDeclarationContainerImpl$findPropertyDescriptor$mostVisibleProperties$2 */
/* compiled from: KDeclarationContainerImpl.kt */
final class C12914x62283bb<T> implements Comparator<Visibility> {
    public static final C12914x62283bb INSTANCE = new C12914x62283bb();

    C12914x62283bb() {
    }

    public final int compare(Visibility visibility, Visibility visibility2) {
        Integer compare = Visibilities.compare(visibility, visibility2);
        if (compare != null) {
            return compare.intValue();
        }
        return 0;
    }
}
