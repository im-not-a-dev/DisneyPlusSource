package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl.WithDestructuringDeclaration;

/* compiled from: ValueParameterDescriptorImpl.kt */
final class ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1 extends C12881k implements Function0<List<? extends VariableDescriptor>> {
    final /* synthetic */ WithDestructuringDeclaration this$0;

    ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1(WithDestructuringDeclaration withDestructuringDeclaration) {
        this.this$0 = withDestructuringDeclaration;
        super(0);
    }

    public final List<VariableDescriptor> invoke() {
        return this.this$0.getDestructuringVariables();
    }
}
