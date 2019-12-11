package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.p583f0.C12740b;
import kotlin.reflect.KProperty;

/* compiled from: Delegates.kt */
public final class DescriptorRendererOptionsImpl$property$$inlined$vetoable$1 extends C12740b<T> {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ DescriptorRendererOptionsImpl this$0;

    public DescriptorRendererOptionsImpl$property$$inlined$vetoable$1(Object obj, Object obj2, DescriptorRendererOptionsImpl descriptorRendererOptionsImpl) {
        this.$initialValue = obj;
        this.this$0 = descriptorRendererOptionsImpl;
        super(obj2);
    }

    /* access modifiers changed from: protected */
    public boolean beforeChange(KProperty<?> kProperty, T t, T t2) {
        if (!this.this$0.isLocked()) {
            return true;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }
}
