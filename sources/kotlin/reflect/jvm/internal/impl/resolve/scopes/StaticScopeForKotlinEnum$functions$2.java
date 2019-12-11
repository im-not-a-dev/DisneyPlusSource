package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;

/* compiled from: StaticScopeForKotlinEnum.kt */
final class StaticScopeForKotlinEnum$functions$2 extends C12881k implements Function0<List<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ StaticScopeForKotlinEnum this$0;

    StaticScopeForKotlinEnum$functions$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        this.this$0 = staticScopeForKotlinEnum;
        super(0);
    }

    public final List<SimpleFunctionDescriptor> invoke() {
        return C13185o.m40520c(DescriptorFactory.createEnumValueOfMethod(this.this$0.containingClass), DescriptorFactory.createEnumValuesMethod(this.this$0.containingClass));
    }
}
