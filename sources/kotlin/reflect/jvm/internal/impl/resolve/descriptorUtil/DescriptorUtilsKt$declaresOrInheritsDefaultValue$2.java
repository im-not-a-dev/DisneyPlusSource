package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12879i;
import kotlin.jvm.internal.C12895y;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;

/* compiled from: DescriptorUtils.kt */
final /* synthetic */ class DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 extends C12879i implements Function1<ValueParameterDescriptor, Boolean> {
    public static final DescriptorUtilsKt$declaresOrInheritsDefaultValue$2 INSTANCE = new DescriptorUtilsKt$declaresOrInheritsDefaultValue$2();

    DescriptorUtilsKt$declaresOrInheritsDefaultValue$2() {
        super(1);
    }

    public final String getName() {
        return "declaresDefaultValue";
    }

    public final KDeclarationContainer getOwner() {
        return C12895y.m40230a(ValueParameterDescriptor.class);
    }

    public final String getSignature() {
        return "declaresDefaultValue()Z";
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(invoke((ValueParameterDescriptor) obj));
    }

    public final boolean invoke(ValueParameterDescriptor valueParameterDescriptor) {
        return valueParameterDescriptor.declaresDefaultValue();
    }
}
