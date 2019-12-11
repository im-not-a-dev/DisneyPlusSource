package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* compiled from: LazyJavaScope.kt */
final class LazyJavaScope$resolveProperty$1 extends C12881k implements Function0<ConstantValue<?>> {
    final /* synthetic */ JavaField $field;
    final /* synthetic */ PropertyDescriptorImpl $propertyDescriptor;
    final /* synthetic */ LazyJavaScope this$0;

    LazyJavaScope$resolveProperty$1(LazyJavaScope lazyJavaScope, JavaField javaField, PropertyDescriptorImpl propertyDescriptorImpl) {
        this.this$0 = lazyJavaScope;
        this.$field = javaField;
        this.$propertyDescriptor = propertyDescriptorImpl;
        super(0);
    }

    public final ConstantValue<?> invoke() {
        return this.this$0.getC().getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(this.$field, this.$propertyDescriptor);
    }
}
