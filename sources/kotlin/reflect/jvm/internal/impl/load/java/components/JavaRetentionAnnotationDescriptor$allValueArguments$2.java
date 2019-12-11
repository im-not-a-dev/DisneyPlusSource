package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.C12907r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12881k;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;

/* compiled from: JavaAnnotationMapper.kt */
final class JavaRetentionAnnotationDescriptor$allValueArguments$2 extends C12881k implements Function0<Map<Name, ? extends ConstantValue<?>>> {
    final /* synthetic */ JavaRetentionAnnotationDescriptor this$0;

    JavaRetentionAnnotationDescriptor$allValueArguments$2(JavaRetentionAnnotationDescriptor javaRetentionAnnotationDescriptor) {
        this.this$0 = javaRetentionAnnotationDescriptor;
        super(0);
    }

    public final Map<Name, ConstantValue<?>> invoke() {
        ConstantValue mapJavaRetentionArgument$descriptors_jvm = JavaAnnotationTargetMapper.INSTANCE.mapJavaRetentionArgument$descriptors_jvm(this.this$0.getFirstArgument());
        Map<Name, ConstantValue<?>> a = mapJavaRetentionArgument$descriptors_jvm != null ? C13170i0.m40332a(C12907r.m40244a(JavaAnnotationMapper.INSTANCE.getRETENTION_ANNOTATION_VALUE$descriptors_jvm(), mapJavaRetentionArgument$descriptors_jvm)) : null;
        return a != null ? a : C13173j0.m40350a();
    }
}
