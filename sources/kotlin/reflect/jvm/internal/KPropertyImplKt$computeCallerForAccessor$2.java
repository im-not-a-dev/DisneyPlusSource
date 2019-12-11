package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KPropertyImpl.Accessor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo31007d2 = {"isNotNullProperty", "", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImplKt$computeCallerForAccessor$2 extends C12881k implements Function0<Boolean> {
    final /* synthetic */ Accessor $this_computeCallerForAccessor;

    KPropertyImplKt$computeCallerForAccessor$2(Accessor accessor) {
        this.$this_computeCallerForAccessor = accessor;
        super(0);
    }

    public final boolean invoke() {
        return !TypeUtils.isNullableType(this.$this_computeCallerForAccessor.getProperty().getDescriptor().getType());
    }
}
