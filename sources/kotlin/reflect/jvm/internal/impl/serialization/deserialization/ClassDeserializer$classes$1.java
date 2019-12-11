package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;

/* compiled from: ClassDeserializer.kt */
final class ClassDeserializer$classes$1 extends C12881k implements Function1<ClassKey, ClassDescriptor> {
    final /* synthetic */ ClassDeserializer this$0;

    ClassDeserializer$classes$1(ClassDeserializer classDeserializer) {
        this.this$0 = classDeserializer;
        super(1);
    }

    public final ClassDescriptor invoke(ClassKey classKey) {
        return this.this$0.createClass(classKey);
    }
}
