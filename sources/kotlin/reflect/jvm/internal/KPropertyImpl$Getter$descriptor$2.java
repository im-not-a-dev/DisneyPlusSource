package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.KPropertyImpl.Getter;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

@Metadata(mo31005bv = {1, 0, 3}, mo31006d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001\"\u0006\b\u0001\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, mo31007d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyGetterDescriptor;", "R", "invoke"}, mo31008k = 3, mo31009mv = {1, 1, 15})
/* compiled from: KPropertyImpl.kt */
final class KPropertyImpl$Getter$descriptor$2 extends C12881k implements Function0<PropertyGetterDescriptor> {
    final /* synthetic */ Getter this$0;

    KPropertyImpl$Getter$descriptor$2(Getter getter) {
        this.this$0 = getter;
        super(0);
    }

    public final PropertyGetterDescriptor invoke() {
        PropertyGetterDescriptor getter = this.this$0.getProperty().getDescriptor().getGetter();
        return getter != null ? getter : DescriptorFactory.createDefaultGetter(this.this$0.getProperty().getDescriptor(), Annotations.Companion.getEMPTY());
    }
}
